package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PgoAdesaoChequeEspecial extends PgoGeneric{
	
	
	@AndroidFindBy(xpath  ="//android.widget.ImageButton[@content-desc='Sicoob']")
	public MobileElement BOTAO_MENU;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='br.com.sicoobnet.homol:id/search']")
	public MobileElement CAMPO_BUSCAR;
	
	@AndroidFindBy(xpath = "//android.widget.ExpandableListView[@resource-id=\"br.com.sicoobnet.homol:id/menu\"]/android.widget.RelativeLayout[3]")
	public MobileElement BOTAO_CONTRATACAO;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"formAntecipacaoRecebiveisContratacao:recebiveis:1:valorCheque\"]")
	public MobileElement CAMPO_ANTECIPACAO_CHEQUE;
	
	@AndroidFindBy(xpath = "//android.view.View[@text=\"Continuar\"]/../..")
	public MobileElement BOTAO_CONTINUAR;
	
	@FindBy(xpath = "//*[@id=\"termoAdesao:senhaPoupanca\"]")
	public MobileElement CAMPO_SENHA;
	
	@FindBy(xpath = "//*[@id=\"aceite\"]/..")
	public MobileElement CHECK_BOX;
	
	@AndroidFindBy(id =  "aceite")
	public MobileElement CHECK_BOX_mob;
	
	@FindBy(xpath = "//*[@id=\"termoAdesao:j_id_jsp_1881854167_22\"]")
	public MobileElement BOTAO_CONTRATAR;
	
	@AndroidFindBy(xpath =  "//android.webkit.WebView[@content-desc=\"SicoobNet Celular\"]")
	public MobileElement BTN_SCROLL;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Simular\"]/..")
	public MobileElement BOTAO_SIMULAR;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Remessa enviada para processamento!\"]")
	public MobileElement MSG_REMESSA_ENVIADA;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Adesão\"])[1]")
	public MobileElement BOTAO_ADESAO_CHEQUE_ESPECIAL;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Exportar\"]")
	public MobileElement BOTAO_EXPORTAR;
	
	@AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"consultaAntecipacaoRecebiveis\"])[1]")
	public MobileElement BOTAO_MAO;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Conta corrente\"]")
	public MobileElement CAMPO_CONTACORRENTE;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Pix\"]")
	public MobileElement CAMPO_PIX;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Conta capital\"]")
	public MobileElement CAMPO_CAPITAL;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Investimentos\"]")
	public MobileElement CAMPO_INVESTIMENTOS;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Crédito\"]/../../android.widget.RelativeLayout[6]")
	public MobileElement CAMPO_CONSULTA_ANTECIPACAO;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Status\"]/../android.view.View[2]")
	public MobileElement COMBO_STATUS;
	
	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id=\"select-options-bef86c67-51e2-db86-4550-625d68738c7d\"]")
	public MobileElement COMBO_STATUS_BLOCO;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Remessa já enviada para antecipação.\"]")
	public MobileElement MSG_JAFOIENVIADA;
	
	@AndroidFindBy(xpath = "//android.widget.GridView[@resource-id=\"formAntecipacaoRecebiveisConsulta:remessas\"]/android.view.View[1]")
	public MobileElement BOTAO_REMESSA;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Enviada para Processamento\"]")
	public MobileElement MSG_JAFOIENVIADA_REMESSA;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id=\"com.google.android.apps.docs:id/pdf_view\"]/android.view.ViewGroup")
	public MobileElement MSG_PDF;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Cheque\"]")
	public MobileElement BOTAO_CHEQUE;
	
	@AndroidFindBy(xpath = "//android.widget.Image[@content-desc=\"icon_pix_filtro\"]")
	public MobileElement BOTAO_FILTAR_RECEBIVEIS;
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"dados-scroll\"]/android.view.View[1]")
	public MobileElement BOTAO_EXPANDIR_CHEQUES;
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"grupo-67299185008-3\"]/android.view.View[2]/android.view.View[2]")
	public MobileElement BOTAO_CHECK_BOX_CHEQUE;
	
	@AndroidFindBy(xpath = "//android.widget.Image[@text=\"ico_done\"]/../android.widget.TextView")
	public MobileElement MSG_PARABENS;

	
	
}
