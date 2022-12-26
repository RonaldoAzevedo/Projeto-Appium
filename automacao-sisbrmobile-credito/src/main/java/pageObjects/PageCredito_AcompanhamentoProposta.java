package pageObjects;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageCredito_AcompanhamentoProposta extends PgoGeneric{

	@AndroidFindBy (xpath="//android.widget.Button[contains(@text,'Crédito Rural')]")
	public MobileElement BOTAO_LISTA_CREDITO_RURAL;

	@AndroidFindBy (xpath="//android.widget.GridView[@resource-id='table-desc-propostas']/android.view.View/android.view.View[string-length(@text) > 0]")
	public List<MobileElement> LISTA_CREDITO;
	
	@AndroidFindBy (xpath="//android.widget.Button[contains(@text,'Proposta em análise ')]")
	public List<MobileElement> BOTAO_PROPOSTA_ANALISE;
	
	@AndroidFindBy (xpath="//android.widget.Button[contains(@text,'Documentação em análise ')]")
	public List<MobileElement> BOTAO_DOCUMENTACAO_ANALISE;
	
	@AndroidFindBy (xpath="//android.widget.Button[contains(@text,'Proposta em estudo ')]")
	public List<MobileElement> BOTAO_PROPOSTA_ESTUDO;
	
	@AndroidFindBy (xpath="//android.widget.Button[contains(@text,'Aguardando formalização ')]")
	public List<MobileElement> BOTAO_AGUARDANDO_FORMALIZACAO;
	
	@AndroidFindBy (xpath="//android.widget.Button[contains(@text,'Liberação de crédito ')]")
	public List<MobileElement> BOTAO_LIBERACAO_CREDITO;
	
	@AndroidFindBy (xpath="//android.widget.Button[contains(@text,'Crédito liberado ')]")
	public List<MobileElement> BOTAO_CREDITO_LIBERADO;

}