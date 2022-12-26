package util.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import uteis.Log;

public class DBUTIL {

	public DB2Connect db;
	public DB2ConnectCDI dbCDI;
	public DB2ConnectPCR db2Pcr;
	public DBConnectPCRSQL db2PCRSQL;


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
	
	public void updateBancoDispositivo(String codigo) {
		dbCDI = new DB2ConnectCDI();
		dbCDI.conectar();
		dbCDI.update("UPDATE cdi.DISPOSITIVOESTACAO SET BOLLIBERACAODISPO = 1, IDCANALLIBERACAO = 6, BOLDISPOSITIVOATIVO = 1, DATALIBERACAODISPO = '2022-12-01 19:05:10'"
				+ "WHERE NUMLIBERACAO = "+codigo +";");
	}
	
	public void updateBancoAdesaoChequeEspecial() {
		db2Pcr = new DB2ConnectPCR();
		db2Pcr.conectar();
		Log.info("Fazendo Update no Posição Limite Tomador");
		db2Pcr.update("UPDATE CLS.POSICAOLIMITETOMADOR SET VALORUTILIZADO = 0, VALORUTILIZADOCREDAUTOMATICO = 0, VALORMARGEMCREDAUTOMATICO = 5000000.00, VALORMARGEM = 999999999 "
				+ "WHERE idlimitetomador = 40013865;");
		
		Log.info("Fazendo Update no Registro Operacao");
		db2Pcr.update("UPDATE CLS.REGISTROOPERACAO SET IDTIPOREGISTROOPERACAO = 32, BOLATIVO = 0 "
				+ "WHERE idlimitetomador = 40013865 AND BOLATIVO = 1;");
	}
	
	public void deleteBancoAdesaoChequeEspecialsQL() {
		db2PCRSQL = new DBConnectPCRSQL();
		db2PCRSQL.conectar();
		Log.info("Fazendo Delete no Limite de Credito da conta");
		db2PCRSQL.delet("delete from LimiteCredito where numcontacorrente = 897450");
		
	}
	
	public String getIdPropostaCreditoRural(String telefone) {
		return selectColum("SELECT * FROM cda.prepropostaoperacaorural WHERE NUMTELEFONE = "+"'"+telefone+"'",
				"IDPREPROPOSTAOPERACAORURAL");
	}
	public void deleteSimulcaoCreditoRural(String telefone, String id) {
		db.delete("DELETE cda.DOCUMENTOCDAPREPROPOSTA WHERE IDPREPROPOSTAOPERACAORURAL = "+"'"+id+"'");
		db.delete("DELETE cda.SIMULACAOPROSPECCAO s  WHERE IDPREPROPOSTAOPERACAORURAL ="+"'"+id+"'");
		db.delete("DELETE cda.prepropostaoperacaorural WHERE NUMTELEFONE = "+"'"+telefone+"'");
		
	}
}
