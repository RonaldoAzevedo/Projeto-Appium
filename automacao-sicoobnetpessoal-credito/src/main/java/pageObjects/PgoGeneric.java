package pageObjects;

import java.util.List;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITBy;
import io.appium.java_client.pagefactory.iOSXCUITFindAll;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import manager.ui.ActionUi;

public class PgoGeneric {

	public PgoGeneric() {
		PageFactory.initElements(new AppiumFieldDecorator(ActionUi.getDriverMobile()), this);
	}

	@AndroidFindBy(xpath = "//*[@resource-id='modalConfirmacao']")
	public MobileElement MODAL_CONFIRMACAO;

	@AndroidFindBy(xpath = "//*[@resource-id='modalConfirmacao']/*[2]")
	public MobileElement TEXTO_MENSAGEM_MODAL_CONFIRMACAO;

	@AndroidFindBy(xpath = "//*[@resource-id='migalha']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='SicoobNet Celular']//XCUIElementTypeStaticText)[1]")
	@FindBy(id = "migalha")
	public MobileElement TEXTO_MIGALHA;

	@AndroidFindAll({
			@AndroidBy(xpath = "//*[@text='Digite a senha de efetivação (4 dígitos) para confirmar a transação']"),
			@AndroidBy(xpath = "//*[@text='Digite sua senha de efetivação de 4 digitos']"), })
	@iOSXCUITFindBy(accessibility = "Digite sua senha de efetivação de 4 dígitos")
	@FindBy(xpath = "//*[text()='Digite a senha de efetivação (4 dígitos) para confirmar a transação']")
	public MobileElement TEXTO_SENHA;

	/** ICONES **/
	@AndroidFindBy(xpath = "//*[@text='ico_erro']")
	public MobileElement ICONE_ERRO;

	@AndroidFindBy(xpath = "//*[@text='ico_alerta']")
	@FindBy(css = ".icone")
	public MobileElement ICONE_ALERTA;

	@AndroidFindBy(xpath = "//*[@text='ico_done']")
	@FindBy(css = "[src='/inicioMobile/img/ICONE_done.png']")
	public MobileElement ICONE_DONE;

	@AndroidFindAll({ @AndroidBy(xpath = "//*[@resource-id='android:id/progress']"),
			@AndroidBy(xpath = "//*[@resource-id='br.com.sicoobnet.homol:id/loading']"),
			@AndroidBy(xpath = "//*[@resource-id='br.com.sicoobnet.homol:id/cl_container_PayLoading']") })
	@iOSXCUITFindAll({ @iOSXCUITBy(accessibility = "Carregando"), @iOSXCUITBy(accessibility = "load") })
	public MobileElement ICONE_LOADER;

	@AndroidFindBy(xpath = "//*[contains(@text,'ico_')]")
	@FindBy(css = ".icone")
	public MobileElement ICONE_ICONE;

	/** BOTÕES **/
	@AndroidFindBy(xpath = "//*[lower-case(@text)='continuar']")
	@iOSXCUITFindBy(accessibility = "Continuar")
	@FindBy(xpath = "//*[lower-case(@text)='continuar']")
	public MobileElement BOTAO_CONTINUAR;

	@AndroidFindBy(xpath = "//*[@text='Consultar']")
	@FindBy(xpath = "//*[text()='Consultar']")
	public MobileElement BOTAO_CONSULTAR;

	@AndroidFindAll({
		@AndroidBy(xpath = "//*[@text='Confirmar']/../android.widget.Button"),
		@AndroidBy(xpath = "//android.widget.Button[@text='CONFIRMAR']")})
	public MobileElement BOTAO_CONFIRMAR;

	@AndroidFindBy(xpath = "//*[@text='Contratar']")
	@FindBy(xpath = "//*[text()='Contratar']")
	public MobileElement BOTAO_CONTRATAR;

	@AndroidFindAll({ @AndroidBy(xpath = "//*[@text='Cancelar']"),
			@AndroidBy(xpath = "//*[@resource-id='br.com.sicoobnet.homol:id/bt_cancelar']"),
			@AndroidBy(xpath = "//*[@text='CANCELAR']"), @AndroidBy(xpath = "//*[@text='ACESSAR COM SENHA']") })
	@FindBy(xpath = "//*[text()='Cancelar']")
	@iOSXCUITFindBy(accessibility = "Ok")
	public MobileElement BOTAO_CANCELAR;

	@AndroidFindBy(xpath = "//*[@text='Avançar']")
	@FindBy(xpath = "//*[text()='Avançar']")
	public MobileElement BOTAO_AVANCAR;

	@AndroidFindBy(xpath = "//android.widget.Button[lower-case(@text)='salvar']")
	@FindBy(xpath = "//*[text()='Salvar']")
	public MobileElement BOTAO_SALVAR;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Alterar']")
	@FindBy(xpath = "//*[text()='Alterar']")
	public MobileElement BOTAO_ALTERAR;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Excluir']")
	@FindBy(xpath = "//*[text()='Excluir']")
	public MobileElement BOTAO_EXCLUIR;

	@AndroidFindAll({ @AndroidBy(xpath = "//*[@text='Voltar']"), @AndroidBy(xpath = "//*[@text='VOLTAR']") })
	@iOSXCUITFindAll({ @iOSXCUITBy(accessibility = "Voltar"), @iOSXCUITBy(accessibility = "Cancelar"),
			@iOSXCUITBy(accessibility = "Agora não"), @iOSXCUITBy(accessibility = "Fechar"),
			@iOSXCUITBy(accessibility = "Ok") })
	@FindBy(xpath = "//*[text()='Voltar']")
	public MobileElement BOTAO_VOLTAR;

	@AndroidFindBy(xpath = "//*[@resource-id='br.com.sicoobnet.homol:id/voltarButton']")
	@FindBy()
	public MobileElement BOTAO_ACESSAR_COM_SENHA;

	@AndroidFindBy(xpath = "//*[@resource-id='br.com.sicoobnet.homol:id/fechar']")
	@FindBy()
	public MobileElement BOTAO_FECHAR_X;

	@AndroidFindBy(xpath = "//*[@text='Pré-visualização']")
	@iOSXCUITFindBy(accessibility = "Pré-visualização")
	public MobileElement TEXTO_PREVISUALIZACAO;

	@AndroidFindBy(xpath = "//*[@text='Novo']")
	@FindBy(xpath = "//*[text()='Novo']")
	public MobileElement BOTAO_NOVO;

	@AndroidFindAll({ @AndroidBy(xpath = "//*[@resource-id='br.com.sicoobnet.homol:id/voltarInicio_button']"),
			@AndroidBy(xpath = "//*[@resource-id='br.com.sicoobnet.homol:id/button_voltar_main']"),
			@AndroidBy(xpath = "//*[@resource-id='br.com.sicoobnet.homol:id/buttonback']"),
			@AndroidBy(xpath = "//android.widget.ImageButton[@content-desc='Navegar para cima']"),
			@AndroidBy(xpath="//*[@resource-id = 'br.com.sicoobnet.homol:id/tb_default']/android.widget.ImageButton")})
	public MobileElement BOTAO_VOLTAR_SUPERIOR;

	@AndroidFindBy(xpath = "//*[@text='Limpar']")
	public MobileElement BOTAO_LIMPAR;

	@AndroidFindBy(xpath = "//android.widget.Button[lower-case(@text)='ok']")
	@iOSXCUITFindBy(accessibility = "Ok")
	@FindBy(xpath = "//button[contains(.,'OK')]")
	public MobileElement BOTAO_OK;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Autenticar']")
	public MobileElement BOTAO_AUTENTICAR;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='DEPOIS']")
	public MobileElement BOTAO_DEPOIS_ATUALIZACAO_FOTO;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Que tal aumentar a sua segurança')]")
	public MobileElement TEXTO_ATUALIZACAO_FOTO;
	
	@AndroidFindAll({ @AndroidBy(xpath = "//*[@text='CÂMERA']"), @AndroidBy(xpath = "//*[@text='Câmera']") })
	@iOSXCUITFindBy(accessibility = "Tirar Foto")
	public MobileElement BOTAO_CAMERA;

	@AndroidFindAll({ @AndroidBy(xpath = "//*[@resource-id='com.android.camera2:id/shutter_button']"),
			@AndroidBy(xpath = "//*[@resource-id='com.android.camera:id/shutter_button']"),
			@AndroidBy(xpath = "//*[@text='Obturador']"),
			@AndroidBy(xpath = "//*[@resource-id='com.motorola.camera:id/settings_rotate_layout']"),
			@AndroidBy(xpath = "//*[contains(@resource-id,'com.android.camera2:id/shutter_button')]"),
			@AndroidBy(xpath = "//android.widget.ImageView[@content-desc='Obturador']"),
			@AndroidBy(accessibility = "Obturador") })
	@iOSXCUITFindAll({ @iOSXCUITBy(accessibility = "Obturador"), @iOSXCUITBy(accessibility = "PhotoCapture") })
	public MobileElement BOTAO_TIRAR_FOTO;

	@AndroidFindAll({ @AndroidBy(xpath = "//*[@resource-id='com.android.camera2:id/done_button']"),
			@AndroidBy(xpath = "//*[@resource-id='com.android.camera:id/BOTAO_done']"),
			@AndroidBy(xpath = "//*[@resource-id='com.motorola.camera:id/review_approve']"),
			@AndroidBy(xpath = "//*[@resource-id='com.android.camera2:id/done_button']"),
			@AndroidBy(xpath = "//*[@resource-id='com.android.camera:id/btn_done']"),
			@AndroidBy(accessibility = "Revisão concluída") })
	@iOSXCUITFindBy(accessibility = "Usar Foto")
	public MobileElement BOTAO_CONFIRMAR_FOTO;
	@AndroidFindBy(xpath = "//*[@resource-id='br.com.sicoobnet.homol:id/crop_image_menu_crop']")
	@iOSXCUITFindBy(accessibility = "OK")
	public MobileElement BOTAO_RECORTAR_FOTO;

	@AndroidFindBy(xpath = "//*[@text='Data']")
	public MobileElement BOTAO_DATA;

	/** CALENDÁRIO **/
	@AndroidFindBy(xpath = "//*[@resource-id='android:id/date_picker_header_year']")
	public MobileElement CAMPO_ANO;

	@AndroidFindBy(xpath = "(//*[@resource-id='android:id/text1'])[3]")
	public MobileElement TEXTO_ANO;

	@AndroidFindBy(xpath = "(//*[@resource-id='android:id/text1'])[2]")
	public MobileElement TEXTO_ANO_ANTERIOR;

	@AndroidFindBy(xpath = "//android.widget.ViewAnimator/android.view.ViewGroup/com.android.internal.widget.ViewPager/android.view.View/android.view.View[1]")
	public MobileElement CAMPO_DIA;

	@AndroidFindBy(xpath = "//*[@resource-id='android:id/next']")
	public MobileElement BOTAO_PROXIMO_MES;

	@AndroidFindBy(xpath = "//*[@resource-id='android:id/prev']")
	public MobileElement BOTAO_MES_ANTERIOR;

	@AndroidFindBy(id = "android:id/button3")
	public MobileElement BOTAO_LIMPAR_DATA;

	@AndroidFindBy(id = "android:id/button2")
	public MobileElement BOTAO_CANCELAR_DATA;

	@AndroidFindBy(id = "android:id/button1")
	public MobileElement BOTAO_DEFINIR_DATA;

	/** EXPORTS **/
	@AndroidFindBy(xpath = "//*[@text='Exportar']")
	//@FindBy(css = "input[value='Exportar ou imprimir']")
	public MobileElement BOTAO_EXPORTAR;

	@AndroidFindAll({ 
		@AndroidBy(xpath = "//*[@text='Compartilhar']"),
		@AndroidBy(xpath = "//android.widget.TextView[@resource-id='br.com.sicoobnet.homol:id/item_compartilhar']")
	})
	public MobileElement BOTAO_COMPARTILHAR;

	@AndroidFindAll({ @AndroidBy(xpath = "//*[@text='Escolha o aplicativo']"),
			@AndroidBy(xpath = "//*[@text='Escolha um']"), @AndroidBy(xpath = "//*[@text='Abrir arquivo']"),
			@AndroidBy(xpath = "//*[@text='Toque aqui para compartilhar arquivos grandes com seus contatos.']") })
	public MobileElement LABEL_ESCOLHA_APLICATIVO;

	@AndroidFindBy(xpath = "//*[@text='PDF']")
	@iOSXCUITFindBy(accessibility = "PDF")
	public MobileElement BOTAO_PDF;

//	@AndroidFindBy(xpath = "//*[lower-case(@text)='imagem']")
//	@iOSXCUITFindBy(accessibility = "Imagem")
//	public MobileElement BOTAO_IMG;

	@AndroidFindBy(xpath = "//*[lower-case(@text)='png']")
	@iOSXCUITFindBy(accessibility = "Imagem")
	public MobileElement BOTAO_IMG;
	
	@AndroidFindBy(xpath = "//*[lower-case(@text)='link']")
	@iOSXCUITFindBy(accessibility = "Link")
	public MobileElement BOTAO_LINK;

	@AndroidFindBy(xpath = "//*[lower-case(@text)='sim']")
	@FindBy(id = "button-modal")
	public MobileElement BOTAO_SIM;

	@AndroidFindBy(xpath = "//android.widget.Button[lower-case(@text)='não']")
	@FindBy(id = "button-modal-nao")
	public MobileElement BOTAO_NAO;

	@AndroidFindBy(xpath = "//*[@text='Pagar']")
	public MobileElement BOTAO_PAGAR;

	@AndroidFindBy(xpath = "//*[@text='Imprimir']")
	@FindBy(css = "input[value='Exportar ou imprimir']")
	@iOSXCUITFindBy(accessibility = "Imprimir")
	public MobileElement BOTAO_IMPRIMIR;

	@AndroidFindBy(xpath = "//*[@resource-id='view_container']")
	@iOSXCUITFindBy(accessibility = "Opções")
	public MobileElement FORMULARIO_CLOUD_PRINT;

	@AndroidFindBy(xpath = "//*[@text='Confirmação']")
	public MobileElement BOTAO_CONFIRMACAO;

	@AndroidFindBy(id = "br.com.sicoobnet.homol:id/msgTextview")
	public MobileElement TEXTO_MENSAGEM_ALERTA;


	@AndroidFindBy(xpath = "//*[@resource-id='saldo']//android.widget.Button")
	public MobileElement TELA_INICIAL;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Abrir app novamente')]")
	public MobileElement MENSAGEM_SICOOB_PAROU;

	@AndroidFindAll(value = { @AndroidBy(xpath = "//*[contains(@text,'Sua sessão expirou.')]"),
			@AndroidBy(xpath = "//*[contains(@text,'Sua sessão irá expirar.')]"),
			@AndroidBy(xpath = "//*[contains(@text,'Sessão encerrada')]"),
			@AndroidBy(xpath = "//*[contains(@text,'SESSAO INEXISTENTE')]") })
	public MobileElement MENSAGEM_SESSAO_EXPIRADA;

	@AndroidFindBy(xpath = "//*[contains(@text,'RENOVAR SESSÃO')]")
	public MobileElement BOTAO_RENOVAR_SESSAO;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'workspace')]")
	public MobileElement TELA_INICIAL_CELULAR;

	@AndroidFindBy(xpath = "//*[contains(@text,'Não foi possível conectar ao servidor')]")
	public MobileElement ERRO_002;

	@AndroidFindBy(xpath = "//*[contains(@text,'Abrir app novamente')]")
	public MobileElement APP_PAROU;

	@AndroidFindBy(xpath = "//*[@resource-id='br.com.sicoobnet.homol:id/txt_view_titulo']")
	public MobileElement BOLETO_PAGAR;

	@AndroidFindBy(xpath = "//*[@resource-id='br.com.sicoobnet.homol:id/txt_nao_pagar']")
	public MobileElement BOLETO_PAGAR_AGORA_NAO;

	@AndroidFindBy(xpath = "//*[@text='Confirme os dados do pagamento']")
	public MobileElement LABEL_INICIAL_TELA_PAGAMENTO;

	@AndroidFindBy(uiAutomator =  "new UiSelector().className(\"android.widget.ListView\")")
	public MobileElement DOMINIO_COMBO_PADRAO;
	
	
	@AndroidFindAll(value = {
			@AndroidBy(xpath = "//*[@resource-id='content']"),
			@AndroidBy(xpath = "//*[@resource-id='android:id/content']")
	})
	public MobileElement TELA_PADRAO;

	@AndroidFindBy(xpath="//android.view.View[@resource-id='app']")
	public MobileElement TELA_PADRAO_CHROME;
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView")
	public MobileElement TELA_PADRAO_PIX;

	@AndroidFindBy(xpath = "//*[@resource-id='content']")
	public MobileElement TELA_MENU;

	@AndroidFindBy(xpath = "//*[@resource-id='br.com.sicoobnet.homol:id/tabLayout_aplicativos']")
	public MobileElement TELA_PADRAO_ADICONAR_CONTA;

	@AndroidFindBy(xpath = "//android.view.View[contains(@text,'Erro ao executar a transação.')]")
	public MobileElement MENSAGEM_ERRO_EXECUCAO;

	@AndroidFindAll(value = { @AndroidBy(xpath = "//*[contains(@text,'Não foi possível conectar ao servidor')]"),
			@AndroidBy(xpath = "//*[@text='(Cod.Erro:-15)']"),
			@AndroidBy(xpath = "//*[contains(@text,'Ocorreu uma falha de comunicação durante')]") })
	public MobileElement MENSAGEM_ERRO_CONEXAO_SERVIDOR;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RelativeLayout\").childSelector(new UiSelector().className(\"android.widget.ImageButton\"))")
	public MobileElement BOTAO_MENU;
	
	@AndroidFindBy(uiAutomator =  "new UiSelector().text(\"PDF\")")
	public MobileElement BOTAO_PDF_PREVISUALIZACAO;

	@AndroidFindBy(uiAutomator =  "new UiSelector().text(\"PNG\")")
	public MobileElement BOTAO_PNG_PREVISUALIZACAO;

	@AndroidFindBy(uiAutomator =  "new UiSelector().text(\"Cancelar\")")
	public MobileElement BOTAO_CANCELAR_PREVISUALIZACAO;
	
	@AndroidFindBy(xpath =  "//android.widget.LinearLayout[./*[@text='Gmail']]")
	public MobileElement BOTAO_GMAIL;
	
	@AndroidFindBy(xpath =  "//android.widget.LinearLayout[./*[@text='Salvar no Drive']]")
	public MobileElement BOTAO_SALVARDRIVE;

	@AndroidFindBy(uiAutomator =  "new UiSelector().resourceId(\"saldoConta\")")
	public MobileElement CAMPO_SALDOEMCONTA;

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"linkSaldoConta\")")
	public MobileElement BOTAO_EXIBESALDOEMCONTA;	
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pré-visualização\")")
	public MobileElement LABEL_EXPORTARPREVISUALIZACAO;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\"br.com.sicoobnet.homol:id/digito\\d\")")
	public List<MobileElement> CAMPO_SENHA_EFETIVACAO;
	
	/**
	 * Cadastro dispositivo
	 */

	@AndroidFindBy(xpath = "//android.view.View[@text='Apelido']/../../android.widget.EditText")
	public MobileElement DISPOSITIVO_APELIDO;

	@AndroidFindBy(xpath = "//android.view.View[@text='Validade']/../android.view.View/android.widget.EditText")
	public MobileElement LISTA_PERIODO;

	@AndroidFindBy(xpath = "//android.view.View[@text='Tempo indeterminado']")
	public MobileElement OPCAO_PERIODO;
	
	/*
	 * MODAIS DE NOTIFICACAO
	 * */
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[./android.widget.TextView[contains(@text,'Você deseja receber notificações de transações financeiras')]]")
	public MobileElement MODAL_NOTIFICACOES_TRANSACOES;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[./android.widget.TextView[contains(@text,'As notificações estão desativadas e você não será notificado')]]")
	public MobileElement MODAL_NOTIFICACOES_DESATIVADAS;
	
	@AndroidFindBy(xpath="//android.widget.Button[lower-case(@text)='voltar']")
	public MobileElement BOTAL_MODAL_VOLTAR;
	
	@AndroidFindBy(xpath="//*[contains(@text,'Confira os seus limites')]/.././android.widget.Button")
	public MobileElement BOTAO_CONFIRA_SEUS_LIMITES;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"inicioExtrato:j_id_jsp_697208341_19\"]")
	public MobileElement CAMPO_APELIDO;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Senha \"]")
	public MobileElement BOTAO_SENHA;
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"content\"]")
	public MobileElement BTN_SCROLL_GERAL;
	
	@AndroidFindBy(xpath = "//android.view.View[@text=\"Confirmar\"]")
	public MobileElement BOTAO_CONFIRMAR_DISPOSITIVO;
	
	@AndroidFindBy(xpath = "//android.view.View[@text=\"Na Cooperativa\"]")
	public MobileElement BOTAO_NACOOPERATIVA;
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"inicioExtrato\"]//android.widget.TextView[3]")
	public MobileElement CAMPO_TEXTO_COOP;
	
	@AndroidFindBy(xpath = "//android.widget.ExpandableListView[@resource-id='br.com.sicoobnet.homol:id/menu']/android.widget.RelativeLayout[2]")
	public MobileElement BOTAO_PIX;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text=\"Drive PDF Viewer\"]")
	public MobileElement ICON_PDF;
	
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	public MobileElement BOTAO_VOLTAR_PDF;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"inicioExtrato:j_id_jsp_697208341_34\"]")
	public MobileElement CAMPO_SENHA_DISPOSITIVO;

}