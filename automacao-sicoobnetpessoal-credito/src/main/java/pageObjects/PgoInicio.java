package pageObjects;

import java.util.List;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PgoInicio extends PgoGeneric {

	@AndroidFindBy(xpath="//*[@resource-id='saldo']")
	@FindBy(css="#saldo p")
	public MobileElement TEXTO_CCO;

	@AndroidFindBy(xpath="//*[@resource-id='extLanc']")
	@FindBy(css="#lanFuturo p")
	public MobileElement TEXTO_PROJ_SALDO_PROX_30_DIAS;
	
	@AndroidFindBy(xpath = "//*[@resource-id='div-header']/android.view.View[count(./android.view.View/*) > 2]/android.view.View")
	public List<MobileElement> LISTA_CARDS_MENU;
	
	@AndroidFindBy(xpath = "//*[@resource-id='content-pix']")
	public MobileElement CONTENT_MENU_INICIO_PIX;

	@AndroidFindBy(xpath = "//*[@resource-id='content-pix']//android.view.View[string-length(@text) > 0]")
	public List<MobileElement> LISTA_MENU_INICIO_PIX;
	
}
