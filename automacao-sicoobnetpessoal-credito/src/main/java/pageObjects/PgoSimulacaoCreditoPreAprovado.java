package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PgoSimulacaoCreditoPreAprovado extends PgoGeneric{
	
	
	@AndroidFindBy(xpath  ="//android.widget.ImageButton[@content-desc='Sicoob']")
	public MobileElement BOTAO_MENU;
	
	@AndroidFindBy(xpath  ="//android.widget.TextView[@text='Crédito']")
	public MobileElement BOTAO_CREDITO;
	
	@AndroidFindBy(xpath  ="//android.widget.TextView[@text='Simulação']")
	public MobileElement BOTAO_SIMULACAO;
	
	@AndroidFindBy(xpath ="//android.widget.Button[@content-desc='Simular']")
	public MobileElement BOTAO_SIMULAR;
	
	@AndroidFindBy(xpath  ="//android.view.View[@resource-id='lista:listaLinhas:0:j_id_jsp_396906891_10']")
	public MobileElement OPCAO_PREAPROVADO5014;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='br.com.sicoobnet.homol:id/search']")
	public MobileElement CAMPO_BUSCAR;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@resource-id='inicioExtrato:j_id_jsp_1907472300_17']")
	public MobileElement CAMPO_VALOR_SOLICITADO;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Selecione']/..")
	public MobileElement COMBOBOX_CARENCIA_PRIMEIRA_PARCELA;

	@AndroidFindBy(xpath  ="//android.view.View[@resource-id='lista:listaLinhas:1:j_id_jsp_396906891_10']")
	public MobileElement OPCAO_PREAPROVADO5014II;
}
