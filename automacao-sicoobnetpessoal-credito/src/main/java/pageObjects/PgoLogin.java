package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PgoLogin extends PgoGeneric {

	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/cooperativaTextInputlayout']//*[@resource-id='br.com.sicoobnet.homol:id/textinput_error']")
	@iOSXCUITFindBy(xpath="//*[@name='BOTAO_login_pessoal']")
	public MobileElement TEXTO_COOPERATIVA_CAMPO_OBRIGATORIO;

	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/apelidoTextInputLayout']//android.widget.EditText")
	@iOSXCUITFindBy(xpath="//*[@value='Apelido da conta']")
	public MobileElement CAMPO_APELIDO;

	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/cooperativaTextInputlayout']//android.widget.EditText")
	@iOSXCUITFindBy(accessibility="text_pessoal_cooperativa")
	public MobileElement CAMPO_COOPERATIVA;

	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/contaTextInputLayout']//*[@resource-id='br.com.sicoobnet.homol:id/textinput_error']")
	public MobileElement TEXTO_CONTA_CORRENTE_CAMPO_OBRIGATORIO;

	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/contaTextInputLayout']//android.widget.EditText")
	@iOSXCUITFindBy(accessibility="text_pessoal_conta_corrente")
	public MobileElement CAMPO_CONTA_CORRENTE;

	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/senhaEditText']/../..//*[@resource-id='br.com.sicoobnet.homol:id/textinput_error']")
	public MobileElement TEXTO_SENHA_CAMPO_OBRIGATORIO;

	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/senhaEditText']")
	@iOSXCUITFindBy(accessibility="text_pessoal_password")
	public MobileElement CAMPO_SENHA_CONTA;

	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/menu_entrar']")
	@iOSXCUITFindBy(accessibility="barbutton_pessoal_entrar")
	public MobileElement BOTAO_ENTRAR;

	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/simButton']")
	public MobileElement BOTAO_SIM;

	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/MENSAGEMTextview']")
	public MobileElement TEXTO_MENSAGEM_LOGOFF;

	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/bt_contas']")
	@iOSXCUITFindBy(accessibility="Sair")
	public MobileElement BOTAO_CONTAS;

	@AndroidFindBy(xpath="//*[@text = 'Escolha sua conta']")
	public MobileElement TEXTO_ESCOLHA_CONTA;

	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Navegar para cima']")
	public MobileElement ICONE_VOLTAR;

	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/alertaImageView']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[@name='Sicoob']")
	public MobileElement ICONE_ERROR;

	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/voltarButton']")
	@iOSXCUITFindBy(accessibility="Ok")
	public MobileElement BOTAO_VOLTAR_MENSAGEM;
	
	@AndroidFindBy(xpath="//*[@resource-id='img-modal']")	
	public MobileElement TEXTO_MENSAGEM_IMPORTANTE;
	
	@AndroidFindBy(xpath="//*[@text = 'Ok, estou ciente']")	
	public MobileElement BOTAO_OK_ESTOU_CIENTE;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text = 'CADASTRAR CHAVE']")	
	public MobileElement BOTAO_TUTORIAL_CADASTRAR_CHAVE;
	
	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/lembrarContaSwitch']")
	@iOSXCUITFindBy(accessibility="switch_pessoal_lembrar")
	public MobileElement CHECK_LEMBRAR_CONTA;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeSwitch[@name='Touch ID']")
	public MobileElement CHECK_TOUCH_ID;

	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/img_novidade']")
	public MobileElement IMAGEM_NOVIDADE;

	@AndroidFindBy(xpath="//*[@resource-id='br.com.sicoobnet.homol:id/mi_button_next']")
	public MobileElement BOTAO_NEXT;
	
	//@AndroidFindBy(uiAutomator = "resourceId(\"br.com.sicoobnet.homol:id/loadingpix\")")
	@AndroidFindBy(xpath="//android.widget.Image[@text='intro-01']")
	public MobileElement IMAGEM_LOADER;
	
	@AndroidFindBy(xpath="//*[@text='Já sou Sicoob']")
	public MobileElement BOTAO_JASOUSICOOB;
	
	@AndroidFindBy(xpath="//*[@text='ESQUECI A SENHA']")
	public MobileElement BOTAO_ESQUECISENHA;
	

}
