package util.db;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectPCRSQL {

	public DBConnectPCRSQL() {

	}

	String url = "jdbc:jtds:sqlserver://sqlh112:1433/BDHOMOL_3330";// BDHOMOL_5014
	String user = "usrgecoq";
	String password = "2016*Gecoq*03";
	Connection con;
	Statement stmt;
	ResultSet rs;

	public void conectar() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			this.con = DriverManager.getConnection(url, user, password);
			this.stmt = con.createStatement();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void closeConnection() {
		try {
			this.con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(String query) {
		try {

			this.stmt.executeUpdate(query);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delet(String query) {
		try {

			this.stmt.execute(query);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public String selectColum(String sql, String coluna) {

		String resultado = "";

		try {

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				resultado = rs.getString(coluna);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado;

	}

}
