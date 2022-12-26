package pageObjects;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PgoLoginSisbr extends PgoGeneric{
	
	
	public MobileElement BOTAO_VOLTAR_PDF;
	
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"ext-element-149\"]")
	public MobileElement CAMPO_USUARIO;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"ext-element-155\"]")
	public MobileElement CAMPO_SENHA;
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"loginButton\"]")
	public MobileElement BOTAO_LOGIN;
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"ext-element-290\"]")
	public MobileElement COMBO_AMBIENTE;
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"ext-element-320\"]")
	public MobileElement CAMPO_HOMOLOGACAO;
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"ext-container-18\"]")
	public MobileElement BOTAO_DONE;
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"ext-element-287\"]")
	public MobileElement BOTAO_CONFIRMAR_AMBIENTE;
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"ext-element-151\"]")
	public MobileElement BOTAO_LIMPA_USUARIO;

}
