package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PgoSimulacaoCreditoRural extends PgoGeneric{
	
	
	@AndroidFindBy(xpath  ="//android.widget.ImageButton[@content-desc='Sicoob']")
	public MobileElement BOTAO_MENU;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='br.com.sicoobnet.homol:id/search']")
	public MobileElement CAMPO_BUSCAR;
	
	@AndroidFindBy(xpath  ="(//android.widget.TextView[@resource-id=\"br.com.sicoobnet.homol:id/titulo\"])[2]")
	public MobileElement CAMPO_RURAL_SIMULACAO;
	
	@AndroidFindBy(xpath  ="//android.view.View[@resource-id=\"div-header\"]/android.widget.TextView")
	public MobileElement CAMPO_LINDOMAR;
	
	@AndroidFindBy(id =  "br.com.sicoobnet.homol:id/menu")
	public MobileElement BTN_SCROLL;
	
	@AndroidFindBy(xpath = "//android.view.View[@text=\"Estado\"]/../android.view.View[2]")
	public MobileElement COMBO_ESTADO;
	
	@AndroidFindBy(xpath = "//android.view.View[@text=\"Município\"]/../android.view.View[2]")
	public MobileElement COMBO_MUNICIPIO;
	
	@AndroidFindBy(xpath = "//android.view.View[@text=\"Finalidade\"]/../android.view.View[2]")
	public MobileElement COMBO_FINALIDADE;
	
	@AndroidFindBy(xpath = "//android.view.View[@text=\"Programa\"]/../android.view.View[2]")
	public MobileElement COMBO_PROGRAMA;
	
	@AndroidFindBy(xpath = "//android.view.View[@text=\"Principal produto\"]/../android.view.View[2]")
	public MobileElement COMBO_PRINCIPAL_PRODUTO;
	
	@AndroidFindBy(xpath = "//android.view.View[@text=\"Atividade\"]/../android.view.View[2]")
	public MobileElement COMBO_ATIVIDADE;
	
	@AndroidFindBy(xpath = "//android.view.View[@text=\"Consórcio\"]/../android.view.View[2]")
	public MobileElement COMBO_CONSORCIO;
	
	@AndroidFindBy(xpath = "//android.view.View[@text=\"Cesta/Safra\"]/../android.view.View[2]")
	public MobileElement COMBO_CESTA_SAFRA;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"formContratacaoCreditoRural:valorFinanciamento\"]")
	public MobileElement CAMPO_VALOR_FIN;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"formContratacaoCreditoRural:telefone\"]")
	public MobileElement CAMPO_TELEFONE;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"formContratacaoCreditoRural:j_id_jsp_152983717_58\"]")
	public MobileElement BOTAO_SOLICITAR_FINACIMENTO;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"confirmacaoIntencaoCreditoRural:j_id_jsp_575627668_11\"]")
	public MobileElement BOTAO_SIMULAR_PARCELAS;
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"confirmacaoIntencaoCreditoRural\"]/android.widget.TextView[1]")
	public MobileElement CAMPO_REGISTADO;
	
	@AndroidFindBy(xpath = "//android.widget.GridView[@resource-id=\"listaParcelasIntencaoRural:listaParcelasIntencao\"]/android.view.View[1]")
	public MobileElement BOTAO_PARCELA;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"parcelaDetalhadaIntencaoRural:registrar\"]")
	public MobileElement BOTAO_REGISTRAR;
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"inicioIntencaoContratacao\"]/android.widget.TextView[1]")
	public MobileElement CAMPO_SOLICITAÇÃO_REGISTRADA;
}
