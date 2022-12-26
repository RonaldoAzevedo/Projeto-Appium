
package support;

public enum ConexoesDB2 {
	SPI_TBP("DB2H301:50001/SPI_TBP"), CDI_TBP("DB2H303:50001/CDI_TBP"), INV_TBP("DB2H305:50001/INV_TBP"),
	CDM_TBP("DB2H302:50001/CDM_TBP"), CON_TBP("DB2H303:50001/CON_TBP"), COB_TBP("DB2H302:50001/COB_TBP"),
	CLI_TBP("DB2H303:50001/CLI_TBP"), BAT_TBP("DB2H301:50001/BAT_TBP"), CNT_TBP("DB2H302:50001/CNT_TBP"),
	COIN_TBP("DB2H302:50001/COIN_TBP"),FAP_TBP("DB2H303:50001/FAP_TBP"),PRC_TBP("DB2PRCH:50001/PRC_TBP"),
	OBR_TBP("DB2H302:50001/OBR_TBP");

	private String text;

	ConexoesDB2(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public static String fromEnum(ConexoesDB2 conexao) {

		for (ConexoesDB2 m : ConexoesDB2.values()) {
			if (m.equals(conexao)) {
				return m.getText();
			}
		}
		return "";
	}
}
