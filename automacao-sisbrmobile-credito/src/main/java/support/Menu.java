package support;

import java.util.ArrayList;
import java.util.List;


public enum Menu {
	
	ACESSO_RAPIDO("Acesso rápido","0"),
	CONTA_CORRENTE("Conta corrente","1"),
	PIX("Pix","2"),
	OPEN_BANKING("Open Banking","3"),
	CONTA_CAPITAL("Conta capital","4"),
	INVESTIMENTOS("Investimentos","5"),
	CREDITO("Crédito","6"),
	CONSORCIOS("Consórcios","7"),
	PREVIDENCIA("Previdência","8"),
	SEGUROS("Seguros","9"),
	CARTOES("Cartões","10"),
	DDA("DDA","11"),
	SIPAG("Sipag","12"),
	SERVICOS("Serviços","13"),
	INDIQUE_O_SICOOB("Indique o Sicoob","14"),
	OUTRAS_OPCOES("Outras opções","15");
	
	private String lbMenu;
	private String seqMenu;
	
	Menu(String lb, String seqMenu) {
		this.lbMenu = lb;
		this.seqMenu = seqMenu;
	}
	
	public static List<String> getMenu(Menu menu,Submenu submenu) {
		List<String> mn = new ArrayList<>();
		for (Menu m : Menu.values()) {
			if (m.equals(menu)) {
				mn.add(0,m.lbMenu);
				mn.add(1,m.seqMenu);
				mn.add(2,Submenu.getSubmenu(submenu).get(0));
				mn.add(3,Submenu.getSubmenu(submenu).get(1));
				mn.add(4,Submenu.getSubmenu(submenu).get(2));
			}
		}
		return mn;
	}
	
	public static int getSequenciaMenu(String labelMenu){
		int seq = -1;
		for(Menu m : Menu.values()) {
			if(m.lbMenu.contains(labelMenu)) {
				seq = Integer.parseInt(m.seqMenu);
			}
		}
		return seq;
	}
	
}
