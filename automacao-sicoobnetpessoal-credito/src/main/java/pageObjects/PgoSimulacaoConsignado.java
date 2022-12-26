package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PgoSimulacaoConsignado extends PgoGeneric{
	
	
	@AndroidFindBy(xpath  ="//android.widget.ImageButton[@content-desc='Sicoob']")
	public MobileElement BOTAO_MENU;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='br.com.sicoobnet.homol:id/search']")
	public MobileElement CAMPO_BUSCAR;
	
	@AndroidFindBy(xpath  ="//android.view.View[@resource-id=\"div-header\"]/android.widget.TextView")
	public MobileElement CAMPO_LINDOMAR;
	
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@resource-id=\"br.com.sicoobnet.homol:id/titulo\" and @text=\"Acesso rápido\"]")
	public MobileElement MENU_ACESSO_RAPIDO;
	
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@resource-id=\"br.com.sicoobnet.homol:id/titulo\" and @text=\"Crédito\"]")
	public MobileElement MENU_CREDITO;
	
	@AndroidFindBy(id =  "br.com.sicoobnet.homol:id/menu")
	public MobileElement BTN_SCROLL;
	
	
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@resource-id=\"br.com.sicoobnet.homol:id/titulo\" and @text=\"Consignado\"]")
	public MobileElement MENU_CONSIGNADO;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Simulação/Contratação']")
	public MobileElement BOTAO_COMECAR_SIMULACAO;
	
	@AndroidFindBy(xpath = "//android.view.View[@text=\"Convênio\"]/../android.view.View[2]")
	public MobileElement COMBO_CONVENIO;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='EMPRESA CONSIGNADO AUTOMACAO']")
	public MobileElement COMBO_CONVENIO_CONSIGNADO;
	
	@AndroidFindBy(xpath  = "//android.widget.EditText[@resource-id=\"formConsignado:valorSolicitado\"]")
	public MobileElement CAMPO_VALOR_CONSIG;
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"formConsignado\"]//android.view.View/android.widget.EditText[@resource-id=\"formConsignado:telefone\"]")
	public MobileElement CAMPO_CEL_CONSIGNADO;
	//android.widget.Button[@text='Simular']
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"formConsignado:j_id_jsp_729900265_30\"]")
	public MobileElement BOTAO_SIMULAR;
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='dadosSimulacao:tableFinanciamento:0:linkDetalharFormaPagamento']")
	public MobileElement BOTAO_PARCELA;
	
	@AndroidFindBy(xpath = "//android.view.View[@text='Continuar com a proposta']")
	public MobileElement BOTAO_CONTINUAR_PROPOSTA;
	
	@AndroidFindBy(xpath = "//android.webkit.WebView[@content-desc=\"SicoobNet Celular\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View")
	public MobileElement BTN_SCROLL_DOCUMENTACAO;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"06. FOTO 3X4\"]")
	public MobileElement CLICAR_FOTO;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=' Anexar imagem']")
	public MobileElement CLICAR_ANEXAR_FOTO;
	
	@AndroidFindBy(id = "br.com.sicoobnet.homol:id/lytCameraPick")
	public MobileElement ACESSAR_FOTO;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Shutter']")
	public MobileElement TIRAR_FOTO;
	
	@AndroidFindBy(id = "com.android.camera2:id/done_button")
	public MobileElement CLICAR_CONFIRMAR_FOTO;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='br.com.sicoobnet.homol:id/layout_aspect_ratio']/	\r\n"
			+ "android.widget.FrameLayout[2]")
	public MobileElement CLICAR_3POR4;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Cortar']")
	public MobileElement EDITAR_FOTO;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Salvar']")
	public MobileElement BOTAO_SALVAR;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Voltar']")
	public MobileElement BOTAO_VOLTAR;
	
	@AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='checkConcordanciaAutorizacaoDescontoFolha']")
	public MobileElement CHECKBOX_DESCONTO;
	
	@AndroidFindBy(xpath = "//android.webkit.WebView[@content-desc='SicoobNet Celular']")
	public MobileElement BTN_SCROLL_ASSINATURA;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Exportar contrato']")
	public MobileElement BOTAO_EXPORTAR_CONTRATO;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Sua proposta de crédito está em processamento. Favor aguarde!']")
	public MobileElement MSG_CREDITO_PRECESSAMENTO;//VALIDAR
	
	@AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='checkConcordancia']")
	public MobileElement CHECKBOX_CONCORDANCIA;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='contratoConsignado:j_id_jsp_1744702448_31']")
	public MobileElement CAMPO_SENHA;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='contratoConsignado:j_id_jsp_1744702448_33']")
	public MobileElement BOTAO_SENHA;
	
	@AndroidFindBy (xpath = "//android.view.View[@text=\"Contrato enviado\"]")
	public MobileElement VERIFIICA_CONTRATO_CORRETO;
	
	@AndroidFindBy (xpath = "//android.view.View[@text=\"Exportar contrato\"]/../..")
	public MobileElement BOTAO_EXPORTA_CONTRATO;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text=\"Drive PDF Viewer\"]")
	public MobileElement ICON_PDF;
	
	@AndroidFindBy (xpath = "//android.view.ViewGroup[@resource-id=\"com.google.android.apps.docs:id/projector_toolbar\"]/android.widget.ImageButton")
	public MobileElement BOTAO_VOLTAR_PDF;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id=\"com.google.android.apps.docs:id/pdf_view\"]/android.view.ViewGroup[2]")
	public MobileElement MSG_PDF;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"ORIENTAÇÕES PARA CONTINUAR COM SUA SIMULAÇÃO\"]")
	public MobileElement MSG_ORIENTACAO;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"dadosSimulacao:tableFinanciamento:0:qtdParcelas\"]")
	public MobileElement QUANTIDADE_PARCELA;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Bem vindo(a), LINDOMAR\"]")
	public MobileElement NOME_LINDOMAR;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Anexar imagem\"]")
	public MobileElement BOTAO_ANEXAR;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Show roots\"]")
	public MobileElement MENU_ARQUIVOS;
	
	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id=\"com.android.documentsui:id/roots_list\"]/android.widget.LinearLayout[1]")
	public MobileElement BOTAO_IMAGENS;
	
	@AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id=\"com.android.documentsui:id/dir_list\"]/android.widget.LinearLayout[1]")
	public MobileElement BOTAO_CAMERA;
	
	@AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id=\"com.android.documentsui:id/dir_list\"]/android.widget.LinearLayout[1]")
	public MobileElement CAMPO_IMAGEM;
	
	//---------Web------------------------
	
	@FindBy(xpath = "//*[@id=\"contratoConsignado:j_id_jsp_1744702448_31\"]")
	public MobileElement CAMPO_SENHA_WEB;
	
	@FindBy(xpath = "//*[@id=\"contratoConsignado:j_id_jsp_1744702448_33\"]")
	public MobileElement BOTAO_SENHA_WEB;
	
	@FindBy(xpath = "//*[@id=\"content\"]")
	public MobileElement BTN_GERAL_WEB;
}
