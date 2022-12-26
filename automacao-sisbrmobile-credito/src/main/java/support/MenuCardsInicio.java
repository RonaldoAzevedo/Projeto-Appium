package support;

public enum MenuCardsInicio {
	
	TRANSFERENCIAS(0),
	PAGAMENTOS(1),
	PIX(2),
	CARTOES(3),
	SERVICOS_DIGITAIS(4),
	EXTRATO(5);
	
	private int index;
	
	MenuCardsInicio(int index) {
		this.index = index;
	}
	
	public static int getMenuCard(MenuCardsInicio menu) {
		for (MenuCardsInicio m : MenuCardsInicio.values()) {
			if (m.equals(menu)) {
				return m.index;
			}
		}
		return -1;
	}

}
