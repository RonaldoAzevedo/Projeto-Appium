package pageObjects;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import manager.ui.ActionUi;

public class PgoPropostaDeCredito {

	public PgoPropostaDeCredito() {
		PageFactory.initElements(new AppiumFieldDecorator(ActionUi.getDriverMobile()), this);
	}
	//android.widget.TextView
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"WHAT IS?\"]")
	public MobileElement MSG_HOME;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"ext-element-23\"]/android.widget.TextView")
	public MobileElement BOTAO_HOME;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"ext-element-373\"]")
	public MobileElement BOTAO_PLATAFORMA_DE_CREDITO;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"ext-element-9\"]")
	public MobileElement BOTAO_TESTE;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"SIMULAÇÃO / PROPOSTA\"]")
	public MobileElement BOTAO_SIMULAR_PROPOSTA;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"LINHA\"]/../android.view.View/android.widget.EditText")
	public MobileElement CAMPO_LINHA_DE_CREDITO;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"search\"]")
	public MobileElement BOTAO_PESQUISAR;

	@AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id=\"undefined\"]")
	public MobileElement CHECK_BOX_LINHA_CREDITO;
	// android.view.View[@resource-id=\"logo-microcredito\"]/../../android.view.View[3]/android.view.View"

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"\"]/../../android.view.View[2]/android.view.View[2]//android.widget.EditText")
	public MobileElement CAMPO_CPF_CNPJ;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Valor Proposta R$:\"]/../android.view.View//android.widget.EditText")
	public MobileElement CAMPO_VALOR_PROPOSTA;
	// html/body/ion-app/ion-picker-cmp/div/div[2]/div[3]
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Dia(S)\"]/../android.view.View[2]//android.widget.EditText")
	public MobileElement CAMPO_DIA;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Parcelas\"]/../android.view.View//android.widget.EditText")
	public MobileElement CAMPO_PARCELA;

	@AndroidFindBy(xpath = "//android.webkit.WebView[@text=\"Plataforma de Crédito\"]")
	public MobileElement BTN_SCROLL;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"PROSSEGUIR\"]/..")
	public MobileElement BOTAO_PROSSEGUIR;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Tipo Taxa Juros\"]/..//android.view.View[@resource-id=\"undefined\"]")
	public MobileElement CAMPO_TIPO_TAXA;
	
	@AndroidFindBy(xpath = "//android.webkit.WebView[@content-desc=\"Plataforma de Crédito\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View")
	public MobileElement COMBO_TIPO_TAXA;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Tipo\"]/../android.view.View")
	public MobileElement COMBO_TIPO_SEGURO;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Descrição Do Bem\"]/../android.view.View//android.widget.EditText")
	public MobileElement CAMPO_DESCRICAO_BEM;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"CONTA CLIENTE\"]")
	public MobileElement BOTAO_CONTA_CLIENTE;
	//*[@id=\"undefined\"])[16]/..
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"26263\"]/../android.view.View[5]/android.view.View//android.widget.CheckBox")//conta-cliente-component/div/ion-card/ion-card-content/div[1]/ion-row/ion-col[1]/ion-checkbox/button
	public MobileElement CHECKBOX_CONTA_CLIENTE;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"26263\"]")//conta-cliente-component/div/ion-card/ion-card-content/div[1]/ion-row/ion-col[1]/ion-checkbox/button
	public MobileElement CHECKBOX_CONTA_CLIENTE2;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"CRÉDITO\"]/../android.view.View[6]//android.widget.CheckBox")
	public MobileElement CHECKBOX_CONTA_CLIENTE_CREDITO;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"DÉBITO\"]/../android.view.View[6]//android.widget.CheckBox")
	public MobileElement CHECKBOX_CONTA_CLIENTE_DEBITO;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"CALCULAR\"]/..")
	public MobileElement BOTAO_CAlCULAR;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\" AÇÕES\"]")
	public MobileElement BOTAO_ACOES;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\" VOLTAR\"]")
	public MobileElement BOTAO_VOLTAR;

	@org.openqa.selenium.support.FindBy(xpath = "//span[normalize-space()=\"Gravar\"]")
	public MobileElement BOTAO_GRAVAR_WEB;

	//*[@id=\"app-nav-aux\"]/button[1]/span[normalize-space()=\"Ações\"]
	@org.openqa.selenium.support.FindBy(xpath = "//*[@id=\"app-page-title\"]/h2[normalize-space()=\"Proposta - EMPRÉSTIMO\"]/../../..//button[normalize-space()=\"Ações\"]")
	public MobileElement BOTAO_ACOES_WEB;

	//html/body/ion-app/ng-component/ion-nav/ng-component[3]/ion-header/mcc-cabecalho-concessao/div/div/div[1]/div[2]/button[1]
	@org.openqa.selenium.support.FindBy(xpath = "//*[@id=\"app-page-title\"]/h2[normalize-space()=\"Documentação\"]/../../..//button[normalize-space()=\"Ações\"]")
	public MobileElement BOTAO_ACOES_WEB_DOCUMENTACAO;

	//html/body/ion-app/ng-component/ion-nav/ng-component[4]/ion-header/mcc-cabecalho-concessao/div/div/div[1]/div[2]/button[1]
	@org.openqa.selenium.support.FindBy(xpath = "//*[@id=\"app-page-title\"]/h2[normalize-space()=\"Garantia\"]/../../..//button[normalize-space()=\"Ações\"]")
	public MobileElement BOTAO_ACOES_WEB_GARANTIA;

	//html/body/ion-app/ng-component/ion-nav/ng-component[5]/ion-header/mcc-cabecalho-concessao/div/div/div[1]/div[2]/button[1]
	@org.openqa.selenium.support.FindBy(xpath = "//*[@id=\"app-page-title\"]/h2[normalize-space()=\"Estudo\"]/../../..//button[normalize-space()=\"Ações\"]")
	public MobileElement BOTAO_ACOES_WEB_ESTUDO;

	//html/body/ion-app/ng-component/ion-nav/ng-component[6]/ion-header/mcc-cabecalho-concessao/div/div/div[1]/div[2]/button[2]
	@org.openqa.selenium.support.FindBy(xpath = "//*[@id=\"app-page-title\"]/h2[normalize-space()=\"Submeter\"]/../../..//button[normalize-space()=\"Ações\"]")
	public MobileElement BOTAO_ACOES_WEB_SUBMETER;

	//html/body/ion-app/ng-component/ion-nav/ng-component[8]/ion-header/mcc-cabecalho-concessao/div/div/div[1]/div[2]/button[1]
	@org.openqa.selenium.support.FindBy(xpath = "//*[@id=\"app-page-title\"]/h2[normalize-space()=\"Análise Técnica\"]/../../..//button[normalize-space()=\"Ações\"]")
	public MobileElement BOTAO_ACOES_WEB_ANALISE_TECNICA;

	//ng-component[10]/ion-header/mcc-cabecalho-concessao/div/div/div[1]/div[2]/button[1]
	@org.openqa.selenium.support.FindBy(xpath = "//*[@id=\"app-page-title\"]/h2[normalize-space()=\"Formalização\"]/../../..//button[normalize-space()=\"Ações\"]")
	public MobileElement BOTAO_ACOES_WEB_FORMALIZACAO;
	
	@org.openqa.selenium.support.FindBy(xpath = "//*[normalize-space()=\"Liberação\"]/..//span[normalize-space()=\"Ações\"]/..")
	public MobileElement BOTAO_ACOES_WEB_LIBERACAO;

	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"logo-microcredito\"]/../../../../../android.app.Dialog//android.widget.Image")
	public MobileElement IMG_LOAD;
	
	@org.openqa.selenium.support.FindAll({
		@org.openqa.selenium.support.FindBy(xpath = "/html/body/ion-app/ion-loading"),
		@org.openqa.selenium.support.FindBy(xpath="/html/body/ion-app/ion-loading/div"),
		@org.openqa.selenium.support.FindBy(xpath="/html/body/ion-app/ion-loading/div/div/ion-spinner"),
		@org.openqa.selenium.support.FindBy(xpath="/html/body/ion-app/ion-loading/div/div"),
	})
	public MobileElement IMG_LOAD_WEB;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"X\"]")
	public MobileElement BOTAO_X;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Cálculo realizado com sucesso!\"]")
	public MobileElement MSG_CAUCULO;

	@org.openqa.selenium.support.FindBy(xpath = "//span[normalize-space()=\"Encaminhar\"]")
	public MobileElement BOTAO_ENCAMINHAR_WEB;

	@org.openqa.selenium.support.FindBy(xpath = "/html/body/ion-app/ion-toast/div/div/button/span")
	public MobileElement BOTAO_X_WEB;

	@org.openqa.selenium.support.FindBy(xpath = "/ion-toast/div/div/comment()[1]")
	public MobileElement MSG_WEB;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Gravar'")
	public MobileElement BOTAO_GRAVAR_NATIVE;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"+\"]")
	public MobileElement BOTAO_ADICIONAR_ARQUIVO;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Nome Do Documento\"]/../android.view.View/android.widget.EditText")
	public MobileElement CAMPO_NOME_DOCUMENTO;

	@AndroidFindBy(xpath = "//android.widget.Image[@text=\"attach\"]")
	public MobileElement BOTAO_ANEXAR_DOCUMENTO;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Show roots\"]")
	public MobileElement BOTAO_MENU_ARQUIVO;

	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id=\"com.android.documentsui:id/roots_list\"]/android.widget.LinearLayout[3]//android.widget.ImageView")
	public MobileElement BOTAO_DOWNLOADS;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"extrato.pdf\"]")
	public MobileElement CAMPO_ARQUIVO;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"ANEXAR\"]")
	public MobileElement BOTAO_ANEXAR;

	@org.openqa.selenium.support.FindBy(xpath = "/html/body/ion-app/ng-component/ion-nav/insere-documento/ion-content/div[2]/div/ion-row/button/span")
	public MobileElement BOTAO_ANEXAR_WEB;

	@org.openqa.selenium.support.FindBy(xpath = "//span[normalize-space()=\"Liberar p/ Garantia\"]")
	public MobileElement BOTAO_LIBERAR_PARA_GARANTIA_WEB;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"add\"]/..")
	public MobileElement BOTAO_ADD_GARANTIA;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"TIPO DE GARANTIA\"]/..")
	public MobileElement COMBO_TIPO_GARANTIA;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"GRUPO GARANTIA\"]/..")
	public MobileElement COMBO_GRUPO_GARANTIA;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"ENQUADRAMENTO\"]/..")
	public MobileElement COMBO_ENQUADRAMENTO;

	@AndroidFindBy(xpath = "//android.webkit.WebView[@text=\"Plataforma de Crédito\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View//android.widget.RadioGroup")
	public MobileElement COMBO_BLOCO;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"RESPONSABILIDADE:\"]/../../android.view.View[2]")
	public MobileElement COMBO_RESPONSABILIDADE;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"\"]/../../android.view.View[2]/android.view.View[2]//android.widget.EditText")
	public MobileElement CAMPO_CPF_AVALISTA;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"GRAVAR\"]/..")
	public MobileElement BOTAO_GRAVAR_GARANTIA;

	@org.openqa.selenium.support.FindBy(xpath = "//span[normalize-space()=\"Liberar p/ Estudo\"]")
	public MobileElement BOTAO_LIBERAR_PARA_ESTUDO_WEB;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Liberar P/ Estudo\"]")
	public MobileElement BOTAO_LIBERAR_PARA_ESTUDO;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Sim\"]")
	public MobileElement BOTAO_SIM;

	@org.openqa.selenium.support.FindBy(xpath = "//span[normalize-space()=\"CheckList\"]")
	public MobileElement BOTAO_CHECKLIST_web;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"CheckList\"]")
	public MobileElement BOTAO_CHECKLIST;

	@org.openqa.selenium.support.FindBy(xpath = "//span[normalize-space()=\"Submeter\"]")
	public MobileElement BOTAO_SUBMETER_WEB;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Submeter\"]")
	public MobileElement BOTAO_SUBMETER;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Imprimir\"]")
	public MobileElement BOTAO_IMPRIMIR;

	@org.openqa.selenium.support.FindBy(xpath = "//ion-textarea/textarea")
	public MobileElement CAMPO_PARECER_NEGOCIAL_WEB;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PARECER NEGOCIAL\"]/..//android.widget.EditText")
	public MobileElement CAMPO_PARECER_NEGOCIAL;

	@org.openqa.selenium.support.FindBy(xpath = "//*[@id=\"toast-hdr-7\"]")
	public MobileElement MSG_SUCESSO;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PARECER\"]/..//android.widget.EditText")
	public MobileElement CAMPO_PARECER_NEGOCIAL_ANALISE_TECNICA;
	
	@AndroidFindBy(xpath = "(//android.widget.Image[@text=\"arrow forward\"])[2]")//android.widget.TextView[@text=\"RESULTADO CHECKLIST\"]
	public MobileElement BOTAO_RESULTADO_CHECKLIST;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Selecione\"]")
	public MobileElement COMBO_PARECER_TECNICO;
	
	@AndroidFindBy(xpath = "//android.widget.ToggleButton[@text=\"PARECERES\"]")
	public MobileElement BOTAO_PARECER;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"APONTAMENTOS - 1\"]")
	public MobileElement BOTAO_APONTAMENTO;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"CONFIRMAR\"]/..")
	public MobileElement BOTAO_CONFIRMAR;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"AÇÃO\"]/..")
	public MobileElement COMBO_ACAO;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"APROVAÇÃO\"]")
	public MobileElement MSG_APROVACAO;

	@AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"4279 - LINHA AUTOMACAO EMPRESTIMO\"])[2]")
	public MobileElement MSG_LINHA_DE_CREDITO;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"DPS - 141 - DECLARAÇÃO PESSOAL DE SAÚDE COMPLETA\"]")
	public MobileElement MSG_NOME_DOCUMENTO;
	
	@org.openqa.selenium.support.FindBy(xpath = "//ion-col[2]/span[normalize-space()=\"4279 - LINHA AUTOMACAO EMPRESTIMO\"]")
	public MobileElement MSG_LINHA_DE_CREDITO_WEB;

	@org.openqa.selenium.support.FindBy(xpath = "//span[normalize-space()=\"Imprimir Instrumento\"]")
	public MobileElement BOTAO_IMPRIMIR_INSTRUMENTO_WEB;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Imprimir Instrumento\"]")
	public MobileElement BOTAO_IMPRIMIR_INSTRUMENTO;
	
	@org.openqa.selenium.support.FindBy(xpath = "//span[normalize-space()=\"Encaminhar p/ Liberação\"]")
	public MobileElement BOTAO_RECAlCULAR;
	
	@org.openqa.selenium.support.FindBy(xpath = "//h1[normalize-space()=\"Proposta de Crédito\"]")
	public MobileElement MSG_PROPOSTA_DE_CREDITO_WEB;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Proposta de Crédito\"]")
	public MobileElement MSG_PROPOSTA_DE_CREDITO;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Instrumento De Crédito\"]/../android.view.View")
	public MobileElement COMBO_INSTRUMENTO_CREDITO;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Tipo De Assinatura\"]/../android.view.View")
	public MobileElement COMBO_ASSINATURA;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Fecho Do Instrumento\"]/../android.view.View[2]/android.view.View/android.view.View//android.widget.EditText")
	public MobileElement CAMPO_FECHO_DO_INSTRUMENTO;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Fecho Do Instrumento\"]/..//android.widget.EditText")
	public MobileElement CLICK_FECHO_DO_INSTRUMENTO;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"TIPO ORIGEM\"]/..")
	public MobileElement COMBO_TIPO_ORIGEM;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"49.000.000,00\"]/../../android.view.View[3]//android.widget.CheckBox")
	public MobileElement CHECKBOX_APLICACAO;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"ASSOCIAR\"]/..")
	public MobileElement BOTAO_ASSOCIAR;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"VALOR UTILIZADO\"]/..//android.widget.EditText")
	public MobileElement CAMPO_VALOR_UTIL;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"DESCRIÇÃO DA GARANTIA:\"]/..//android.widget.EditText")
	public MobileElement CAMPO_DESCRICAO_GARANTIA;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"RESPONSABILIDADE:\"]/../../android.view.View[3]")
	public MobileElement COMBO_RESPOSABILIDADE_ALIENCAO;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"\"]/../../android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText")
	public MobileElement CAMPO_CPF_ALIENACAO;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"\"]/../../android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View")
	public MobileElement CLICK_CAMPO_CPF_ALIENACAO;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"VALOR:\"]/../../android.view.View[2]//android.widget.EditText")
	public MobileElement CAMPO_VALOR_IMOVEL;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"GARANTIA SERÁ REGISTRADA EM CARTÓRIO?\"]/../../android.view.View[4]")
	public MobileElement COMBO_GARANTIA_CARTORIO;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"DESCRIÇÃO:\"]/../../android.view.View[8]//android.widget.EditText")
	public MobileElement CAMPO_DESCRICAO_ALIENACAO;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"DD/MM/YYYY\"]")
	public MobileElement CAMPO_ULTIMA_AVALIACAO;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"OK \"]")
	public MobileElement BOTAO_OK_ALERT;
	
	@org.openqa.selenium.support.FindBy(xpath = "/html/body/ion-app/ion-picker-cmp/div/div[1]/div[2]")
	public MobileElement BOTAO_OK;
	
	@org.openqa.selenium.support.FindBy(xpath = "/html/body/ion-app/ng-component/ion-nav/garantia-component/ion-content/div[2]/div[2]/ion-grid/ion-row/ion-col[2]/button/span")
	public MobileElement BOTAO_GRAVAR_GARANTIA_WEB;
	
	@org.openqa.selenium.support.FindBy(xpath = "//h1[normalize-space()=\"Documento processando...\"]")
	public MobileElement MSG_DOCUMENTO_PRECESSANDO_WEB;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='DOCUMENTO PROCESSANDO...']")
	public MobileElement MSG_DOCUMENTO_PRECESSANDO;
	
	@org.openqa.selenium.support.FindBy(xpath = "//span[normalize-space()=\"Visualizar Instrumento\"]")
	public MobileElement BOTAO_VISUALIZAR_INSTRUMENTO_WEB;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Visualizar Instrumento\"]")
	public MobileElement BOTAO_VISUALIZAR_INSTRUMENTO;
	
	@org.openqa.selenium.support.FindBy(xpath = "//span[normalize-space()=\"Encaminhar p/ Liberação\"]")
	public MobileElement BOTAO_ENCAMIAR_LIBERACAO_WEB;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Encaminhar P/ Liberação\"]")
	public MobileElement BOTAO_ENCAMIAR_LIBERACAO;
	
	@org.openqa.selenium.support.FindBy(xpath = "//*[normalize-space()=\"Proposta de Crédito\"]")
	public MobileElement MSG_PROPOSTA_CREDITO;
	
	@org.openqa.selenium.support.FindBy(xpath = "//*[normalize-space()=\"Liberar\"]")
	public MobileElement BOTAO_LIBERAR_WEB;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Liberar\"]")
	public MobileElement BOTAO_LIBERAR;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Nr. Proposta\"]/../../android.widget.TextView[1]")
	public MobileElement NUM_PROPOSTA;
	
	@org.openqa.selenium.support.FindBy(xpath = "/html/body/ion-app/ion-alert/div/div[3]/button[2]")
	public MobileElement BOTAO_SIM_WEB;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Drive PDF Viewer\"]")
	public MobileElement PDF;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	public MobileElement VOLTAR;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"CRÉDITO\"]/..//android.widget.Button")
	public MobileElement BOTAO_ADCIONAR_CREDITO;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"DÉBITO\"]/..//android.widget.Button")
	public MobileElement BOTAO_ADCIONAR_DEBITO;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"SELECIONAR:\"])[1]/../android.view.View//android.widget.CheckBox")
	public MobileElement CHECKBOX_CRITERIO_CREDITO;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"INCLUIR\"]")
	public MobileElement BOTAO_INCLUIR;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PRINCIPAL:\"]/../android.view.View//android.widget.CheckBox")
	public MobileElement CHECKBOX_CONTA_PRINCIPAL;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"VALOR:\"]/../android.view.View//android.widget.EditText")
	public MobileElement CAMPO_VALOR_LIBERACAO;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"FINALIZAR\"]")
	public MobileElement BOTAO_FINALIZAR;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Gravar\"]")
	public MobileElement BOTAO_GRAVAR;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Encaminhar\"]")
	public MobileElement BOTAO_ENCAMINHAR;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Liberar P/ Garantia\"]")
	public MobileElement BOTAO_LIBERAR_PARA_GARANTIA;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.RadioGroup/android.view.View[5]/android.view.View/android.view.View[1]/android.widget.TextView")
	public MobileElement IMPRIMIR;
	
	@AndroidFindBy(xpath = "//android.widget.RadioGroup/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.TextView")
	public MobileElement IMPRIMIR2;
	
	@AndroidFindBy(xpath = "//android.widget.RadioGroup/android.view.View/android.view.View/android.view.View[1]/android.widget.TextView")
	public MobileElement IMPRIMIR3;

}