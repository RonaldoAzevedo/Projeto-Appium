package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngularBinding.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PgoSimulacaoFinanciamento extends PgoGeneric{
	
	@AndroidFindBy(xpath  ="//android.widget.ImageButton[@content-desc='Sicoob']")
	public MobileElement BOTAO_MENU;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='br.com.sicoobnet.homol:id/search']")
	public MobileElement CAMPO_BUSCAR;
	
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@resource-id='br.com.sicoobnet.homol:id/titulo' and @text='Financiamento de veículo']")
	public MobileElement ACESSAR_FINCIAMENTO_DE_VEICULO;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Simulação']")
	public MobileElement ACESSAR_SIMULACAO;
	
	@AndroidFindBy(xpath ="//android.view.View[@text=\"Veículo zero km\"]/../android.view.View[2]" )
	public MobileElement COMBO_ZERO_KM;
	
	@AndroidFindBy(xpath ="//android.widget.ListView[@content-desc=\"Selecione Sim Não\"]" )
	public MobileElement COMBO_ZERO_KM_TESTE;
	
	@AndroidFindBy(xpath = "//android.view.View[@text=\"Tipo de veículo\"]/../android.view.View[2]")
	public MobileElement COMBO_TIPO_VEICULO;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Motos']")
	public MobileElement COMBO_TIPO_VEICULO_MOTO;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Carros']")
	public MobileElement COMBO_TIPO_VEICULO_CARRO;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='financiamentoVeiculo:anoFabricacao']")
	public MobileElement CAMPO_ANO_CARRO;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='financiamentoVeiculo:valorVeiculo']")
	public MobileElement CAMPO_VALOR_CARRO;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='financiamentoVeiculo:valorFinanciamento']")
	public MobileElement CAMPO_VALOR_FINANCIAMENTO;
	
	@AndroidFindBy(xpath   = "//android.widget.EditText[@resource-id='financiamentoVeiculo:telefone']")
	public MobileElement CAMPO_TELEFONE;
	
	@AndroidFindBy(xpath = "//android.view.View[@text='Simular']" )
	public MobileElement BOTAO_SIMULAR;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Selecionar\"]" )
	public MobileElement BOTAO_SELECIONAR;
	
	@AndroidFindBy(xpath = "//android.view.View[@text='R$ 99.900,00']" )
	public MobileElement MSG_PRECO_CARRO_FINAN;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Avançar com a proposta']")
	public MobileElement BOTAO_AVANCAR_PROPOSTA;
	
	@AndroidFindBy(id  = "br.com.sicoobnet.homol:id/container_fragment" )
	public MobileElement BTN_SCROLL_ORIENTACAO;
	
	@AndroidFindBy(xpath ="//android.view.View[@content-desc=\"Entendi\"]" )
	public MobileElement BOTAO_ENTENDI;
	
	@AndroidFindBy(xpath ="//android.view.View[@resource-id='linkEntendi']/.." )
	public MobileElement BOTAO_ENTENDI_PROPOSTA_EVIADO;
	
	@AndroidFindBy(xpath ="//android.view.View[@resource-id='linkEntendi']" )
	public MobileElement BOTAO_ENTENDI2;
	
	@org.openqa.selenium.support.FindBy(xpath ="//*[@id=\"linkEntendi\"]" )
	public MobileElement BOTAO_ENTENDI_WEB;
	
	@AndroidFindBy(xpath = "//android.view.View[@text='Marca do veículo']/../android.view.View[2]" )
	public MobileElement COMBO_TIPO_CARRO;
	
	@AndroidFindBy(xpath = "//android.view.View[@text=\"Marca do veículo\"]/../android.view.View[2]/android.widget.ListView")
	public MobileElement BTN_SCROLL_COMBO_TIPO_VEICULO;
	
	@AndroidFindBy(xpath = "//android.view.View[@text='Modelo']/../android.view.View[2]")
	public MobileElement COMBO_MODELO_CARRO;
	
	@AndroidFindBy(xpath = "//android.view.View[@text='Modelo']/../android.view.View[2]")
	public MobileElement BTN_SCROLL_COMBO_MODELO_CARRO;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='MARRUÁ AM 200 2.8 CS TDI Diesel']")
	public MobileElement CAMPO_MARRUA;
	
	@AndroidFindBy(xpath = "//android.view.View[@text='Ano modelo']/../android.view.View[2]")
	public MobileElement COMBO_ANO_MODELO;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Zero KM']")
	public MobileElement CAMPO_ZERO_KM;
	
	@AndroidFindBy(xpath = "//android.view.View[@text='UF de licenciamento']/../android.view.View[2]")
	public MobileElement COMBO_UF;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"DF\"]")
	public MobileElement CAMPO_DF;
	
	@org.openqa.selenium.support.FindBy(xpath = "//*[@id=\"veiculo:tabContent_2\"]")
	public MobileElement BTN_SCROLL_VENDEDOR;
	
	@org.openqa.selenium.support.FindBy(xpath  = "//*[@id=\"veiculo:nomeVendedor\"]")
	public WebElement CAMPO_NOME_VEDENDOR;
	//android.widget.EditText[@resource-id=\"veiculo:nomeVendedor\"]
	
	@org.openqa.selenium.support.FindBy(xpath  = "//*[@id=\"veiculo:cpfcnpjVendedor\"]")
	public MobileElement CAMPO_VENDEDOR_CPF_CNPJ;
	
	@org.openqa.selenium.support.FindBy(xpath = "//*[@id='veiculo:campoCodBanco']")
	public MobileElement CAMPO_VENDEDOR_COD_BANCO;
	
	@org.openqa.selenium.support.FindBy(xpath = "//*[@id='veiculo:numAgenciaVendedor']")
	public MobileElement CAMPO_VENDEDOR_AGENCIA_VEDENDOR;
	
	@org.openqa.selenium.support.FindBy(xpath = "//*[@id='veiculo:numContaCorrenteVendedor']")
	public MobileElement CAMPO_VENDEDOR_CONTA_CORRENTE;
	
	@org.openqa.selenium.support.FindBy(xpath  = "//*[@id='veiculo:telefone']")
	public MobileElement CAMPO_VENDEDOR_TELEFONE;
	
	@org.openqa.selenium.support.FindBy(xpath = "//*[@id='veiculo:emailVendedor']")
	public MobileElement CAMPO_VENDEDOR_EMAIL;
	
	@org.openqa.selenium.support.FindBy(xpath = "//*[@id=\"veiculo:j_id_jsp_1898229414_98\"]/span")
	public MobileElement BOTAO_CONTINUAR_PROPOSTA;
	
	@AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='checkConcordancia']")
	public MobileElement CHECKBOX_CONCORDANCIA;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='dadosSimulacao:btnEnviarProposta']")
	public MobileElement BOTAO_ENVIAR_PRPOSTA;
	
	@AndroidFindBy(xpath ="//android.webkit.WebView[@content-desc=\"SicoobNet Celular\"]")
	public MobileElement BTN_BOTAO_ENVIAR_PROPOSTA;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Proposta enviada!']")
	public MobileElement MSG_PROSTA_ENVIADA;
	
	@AndroidFindBy(xpath = "//android.widget.EditText")
	public List<MobileElement> LISTA ;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"1. Dados do veículo\"]")
	public MobileElement MSG_ORIENTACAO;
	
	
}
