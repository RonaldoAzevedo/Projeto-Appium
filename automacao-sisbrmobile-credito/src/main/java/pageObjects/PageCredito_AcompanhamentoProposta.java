package pageObjects;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageCredito_AcompanhamentoProposta extends PgoGeneric{

	@AndroidFindBy (xpath="//android.widget.Button[contains(@text,'Cr�dito Rural')]")
	public MobileElement BOTAO_LISTA_CREDITO_RURAL;

	@AndroidFindBy (xpath="//android.widget.GridView[@resource-id='table-desc-propostas']/android.view.View/android.view.View[string-length(@text) > 0]")
	public List<MobileElement> LISTA_CREDITO;
	
	@AndroidFindBy (xpath="//android.widget.Button[contains(@text,'Proposta em an�lise ')]")
	public List<MobileElement> BOTAO_PROPOSTA_ANALISE;
	
	@AndroidFindBy (xpath="//android.widget.Button[contains(@text,'Documenta��o em an�lise ')]")
	public List<MobileElement> BOTAO_DOCUMENTACAO_ANALISE;
	
	@AndroidFindBy (xpath="//android.widget.Button[contains(@text,'Proposta em estudo ')]")
	public List<MobileElement> BOTAO_PROPOSTA_ESTUDO;
	
	@AndroidFindBy (xpath="//android.widget.Button[contains(@text,'Aguardando formaliza��o ')]")
	public List<MobileElement> BOTAO_AGUARDANDO_FORMALIZACAO;
	
	@AndroidFindBy (xpath="//android.widget.Button[contains(@text,'Libera��o de cr�dito ')]")
	public List<MobileElement> BOTAO_LIBERACAO_CREDITO;
	
	@AndroidFindBy (xpath="//android.widget.Button[contains(@text,'Cr�dito liberado ')]")
	public List<MobileElement> BOTAO_CREDITO_LIBERADO;

}