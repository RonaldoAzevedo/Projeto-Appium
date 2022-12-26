package support;

public enum ConexoesSQL {
	SQLH("SQLH112:1433/%s"),
	SQLHI("sqlh112:1440/%s");

		private String text;

		ConexoesSQL(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}

		public static String fromEnum(ConexoesSQL conexao) {

			for (ConexoesSQL m : ConexoesSQL.values()) {
				if (m.equals(conexao)) {
					return m.getText();
				}
			}
			return "";
		}

}
