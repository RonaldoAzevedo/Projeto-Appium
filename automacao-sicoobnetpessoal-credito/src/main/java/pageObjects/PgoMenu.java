package pageObjects;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PgoMenu extends PgoGeneric {
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Incio']")
	public MobileElement MENU_INICIO;

	
	@AndroidFindAll({
		@AndroidBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/img_add_conta']"),
		@AndroidBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/imgAddConta']"),
	})
	
	@iOSXCUITFindBy(accessibility="img_login_conta")
	public MobileElement BOTAO_ADDCONTA;
	
	@iOSXCUITFindBy(accessibility="Atendimento Pessoal")
	public MobileElement TEXTO_ATENDIMENTO_PESSOAL;

	@Deprecated
	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/seg_fator']")
	public MobileElement BOTAO_EFETIVACAO_2_PASSOS;

	@AndroidFindBy(xpath="resource-id=\"br.com.sicoobnet.homol:id/layout_localize_sicoob\"")
	public MobileElement BOTAO_LOCALIZE_SICOOB;

	@Deprecated	
	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/site']")
	public MobileElement BOTAO_SITE;

	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/layout_fale_conosco']")
	public MobileElement BOTAO_FALE_CONOSCO;

	@Deprecated	
	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/outros_app']")
	public MobileElement BOTAO_OUTROS_APP;

	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Navegar para cima']")
	public MobileElement BOTAO_BACK;

	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/bt_reset']")
	@iOSXCUITFindBy(accessibility="Limpar texto")
	public MobileElement BOTAO_RESET;

	@AndroidFindBy(uiAutomator ="new UiSelector().resourceId(\"br.com.sicoobnet.homol:id/search\")")
	@iOSXCUITFindBy(accessibility="Buscar")
	public MobileElement CAMPO_CONSULTA_MENU;
	
	@AndroidFindBy(xpath = "//*[@resource-id='br.com.sicoobnet.homol:id/search']")
	public MobileElement CMP_CONSULTA_MENU;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[android.widget.TextView[@text='Investimentos']]")
	public MobileElement PAI_MENU_INVESTIMENTOS;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[android.widget.TextView[@text='CDB']]/following-sibling::android.widget.RelativeLayout[android.widget.TextView[@text='Extrato']]")
	public MobileElement PAI_MENU_EXTRATO_CDB;
	
	@AndroidFindBy(xpath="//android.widget.ExpandableListView")
	public MobileElement LISTA_MENU;
	
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout")
	public MobileElement LST_MENU;
	
	@AndroidFindBy(id = "br.com.sicoobnet.homol:id/menu")
	public MobileElement CONTENT_LISTAMENU;
	
	@AndroidFindBy(xpath="//android.widget.RelativeLayout/android.widget.TextView[@resource-id='br.com.sicoobnet.homol:id/titulo']")
	public List<MobileElement> LISTA_OPCOES;

	@AndroidFindBy(xpath="//android.widget.RelativeLayout[./android.widget.TextView[@resource-id='br.com.sicoobnet.homol:id/titulo' and @text='Acesso rpido']]")
	public MobileElement OPCAO_ACESSORAPIDO;
}
