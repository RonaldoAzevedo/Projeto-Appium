package util.db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUTIL {

	public DB2Connect db;

	public ResultSet utilRs;

	public DBUTIL() {
		db = new DB2Connect();
		db.conectar();
	}

	public String getIDSimPlanoPagamento(String idInst, String idPessoa, String tempo) {
		return selectColum("SELECT * FROM cre.simulacaoplanopagamento spp  where idinstituicao ="+" "+ idInst + " "+"and idpessoa ="+" "+ idPessoa+" "+" and spp.DATAHORASIMULACAO >= " + "'"
				+ tempo + "'", "IDNSUPLANOPAGAMENTO");
	}

	public String validarSimulcaoPassou(String idNSUPLANOPAGAMENTO) {
		return selectColum("select * from CRE.HISTGRAVACAOOPERACAOCREDITO where IDNSUPLANOPAGAMENTO = "+"'"+idNSUPLANOPAGAMENTO+"'", 
				"DESCERROGRAVACAO" );
	}
	public String validarProstaEstaNoBDS(String idNSUPLANOPAGAMENTO) {
		return selectColum("select * from CRE.HISTGRAVACAOOPERACAOCREDITO where IDNSUPLANOPAGAMENTO = "+"'"+idNSUPLANOPAGAMENTO+"'", 
				"IDNSUPLANOPAGAMENTO" );
	}
	
	public String getIdOperacao(String parcela, String id) {
		return selectColum("select * from cre.simulacaoplanopagamento where QTDPARCELASIMULACAO ="
				+"'" +parcela+ "'"+" "+ "and IDNSUPLANOPAGAMENTO ="  +"'"+id+"'"
				,"IDOPERACAOCREDITO");
	}
	
	public String getidoperacaoEstudo(String idoperacaocredito) {
		return selectColum("select * from cre.operacaocreditodigitalconsignado where IDOPERACAOCREDITO ="+"'"+idoperacaocredito+"'", "IDOPERACAOCREDITO");
	}

	private String selectColum(String sql, String coluna) {
		String aux = "";
		try {
			db.rs = db.stmt.executeQuery(sql);
			while (db.rs.next()) {
				aux = db.rs.getString(coluna);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aux;
	}
}
