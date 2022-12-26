package util.db;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB2ConnectCDI {

	public DB2ConnectCDI() {

	}
	//jdbc:db2://db2h303:50001/cre_TBP
	String url = "jdbc:db2://DB2H303:50001/CDI_TBP";
	//String user = "isantos";
	//String password = "0G0KijUvKTAMzyUd";
	String user = "roneto";
	String password = "SjY1EocENH575YKe";
	Connection con;
	Statement stmt;
	ResultSet rs;

	public void conectar() {

		try {

			Class.forName("com.ibm.db2.jcc.DB2Driver");
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
