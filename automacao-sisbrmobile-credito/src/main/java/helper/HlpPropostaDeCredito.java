package helper;

import org.apache.commons.lang3.StringUtils;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.NoSuchElementException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.MouseButton;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import exception.AutomacaoBusinessException;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import manager.expectedConditionsCustom.ExpectedConditionsCustom;
import manager.ui.ActionUi;
import pageObjects.PgoPropostaDeCredito;
import support.MobileBank;
import uteis.Datapool;
import uteis.Log;
import util.db.DBUTIL;
public class HlpPropostaDeCredito extends MobileBank<HlpPropostaDeCredito> {

	public PgoPropostaDeCredito pgoPropostaDeCredito;
	public Datapool datapool;
	String dpArq = "propostaDeCredito.json";
	public DBUTIL DBUTIL;

	public HlpPropostaDeCredito() {
		pgoPropostaDeCredito = new PgoPropostaDeCredito();
	}

	public Datapool getDp() {
		return new Datapool(dpArq);
	}

	
	public HlpPropostaDeCredito clickHome() {
		aguardarLoadSistema();
//		aguardaElemento(pgoPropostaDeCredito.MSG_HOME);
		click(pgoPropostaDeCredito.BOTAO_HOME);
		return this;
	}

	public HlpPropostaDeCredito clickPlataformaCredito() {
		aguardarLoadSistema();
		MobileElement d = pgoPropostaDeCredito.BOTAO_TESTE;
		Point p = d.getLocation();
		int x = p.getX();
		int y = p.getY();
		System.out.println(x+","+y);
		x = x + 117;
		y = y + 320;
		System.out.println(x+","+y);
		clickDimensionado(x, y);
//		click(pgoPropostaDeCredito.BOTAO_PLATAFORMA_DE_CREDITO);
		return this;
	}
	
	public HlpPropostaDeCredito clickSimularProposta() {
		aguardarLoadSistema();
		aguardaElementoSerVisivel(pgoPropostaDeCredito.BOTAO_SIMULAR_PROPOSTA);
		click(pgoPropostaDeCredito.BOTAO_SIMULAR_PROPOSTA);
		return this;
	}
	
	public HlpPropostaDeCredito preencheLinhaCredito(Object linha) {
		preencheCampo(pgoPropostaDeCredito.CAMPO_LINHA_DE_CREDITO, linha);
		return this;
	}
	
	public HlpPropostaDeCredito clickPesquisar() {
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.BOTAO_PESQUISAR, pgoPropostaDeCredito.BTN_SCROLL);
		click(pgoPropostaDeCredito.BOTAO_PESQUISAR);
		return this;
	}
	
	public HlpPropostaDeCredito clickCheckBoxLinha() {
		aguardarLoadSistema();
		aguardaElemento(pgoPropostaDeCredito.CHECK_BOX_LINHA_CREDITO);
		click(pgoPropostaDeCredito.CHECK_BOX_LINHA_CREDITO);
		return this;
	}
	
	
	public HlpPropostaDeCredito preencheCPFCNPJ(Object cpf) {
		preencheCampo(pgoPropostaDeCredito.CAMPO_CPF_CNPJ, cpf);
		return this;
	}
	
	public HlpPropostaDeCredito preencheValorProposta(Object valor) {
		aguardarLoadSistema();
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.CAMPO_VALOR_PROPOSTA, pgoPropostaDeCredito.BTN_SCROLL);
		preencheCampo(pgoPropostaDeCredito.CAMPO_VALOR_PROPOSTA, valor);
		return this;
	}
	
	public HlpPropostaDeCredito preencheDia(Object dia) {
		preencheCampo(pgoPropostaDeCredito.CAMPO_DIA, dia);
		return this;
	}
	
	public HlpPropostaDeCredito preencheParcela(Object parcela) {
		preencheCampo(pgoPropostaDeCredito.CAMPO_PARCELA, parcela);
		return this;
	}
	
	public HlpPropostaDeCredito prosseguir() {
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.BOTAO_PROSSEGUIR, pgoPropostaDeCredito.BTN_SCROLL);
		return this;
	}
	
	
	public String diaAtual() {
		String tempo = DateTimeFormatter.ofPattern("dd").format(LocalDateTime.now());
		Log.info("Pegando dia atual = " + tempo);
		return tempo;

	}

	public HlpPropostaDeCredito clickBotaoProsseguir() {
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.BOTAO_PROSSEGUIR, pgoPropostaDeCredito.BTN_SCROLL);
		click(pgoPropostaDeCredito.BOTAO_PROSSEGUIR);
		return this;
	}
	
	public HlpPropostaDeCredito preencheComboTipoTaxa(Object opcao) {
		preencherComboSisbrSemSwipe(pgoPropostaDeCredito.CAMPO_TIPO_TAXA, pgoPropostaDeCredito.COMBO_BLOCO, opcao);
		return this;
	}
	
	public HlpPropostaDeCredito preencheComboTipoSeguro(Object opcao) {
		aguardarLoadSistema();
		preencherComboSisbr(pgoPropostaDeCredito.COMBO_TIPO_SEGURO, pgoPropostaDeCredito.COMBO_BLOCO, opcao);
		return this;
	}
	
	public HlpPropostaDeCredito preencheCampoDescricaoBem(Object texto) {
		preencheCampo(pgoPropostaDeCredito.CAMPO_DESCRICAO_BEM, texto);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoContaCliente() {
		aguardarLoadSistema();
		click(pgoPropostaDeCredito.BOTAO_CONTA_CLIENTE);
//		clickDimensionado(180, 740);
		return this;
	}
	
	public HlpPropostaDeCredito clickCheckBoxContaCliente() {
		aguardarLoadSistema();
		MobileElement d = pgoPropostaDeCredito.BOTAO_CONTA_CLIENTE;
		Point p = d.getLocation();
		int x = p.getX();
		int y = p.getY();
		System.out.println(x+","+y);
		x= x+ 50;
		y = y + 290;
		System.out.println(x+","+y);
		clickDimensionado(x, y);
//		click(pgoPropostaDeCredito.CHECKBOX_CONTA_CLIENTE);
		return this;
	}
	
	public HlpPropostaDeCredito clickAdcionarCriterioCredito() {
		click(pgoPropostaDeCredito.BOTAO_ADCIONAR_CREDITO);
		return this;
	}
	
	public HlpPropostaDeCredito selecionaContaCredito() {
		aguardarLoadSistema();
		click(pgoPropostaDeCredito.CHECKBOX_CRITERIO_CREDITO);
		return this;
	}
	
	public HlpPropostaDeCredito selecinarContaPrincipal() {
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.CHECKBOX_CONTA_PRINCIPAL, pgoPropostaDeCredito.BTN_SCROLL);
		click(pgoPropostaDeCredito.CHECKBOX_CONTA_PRINCIPAL);
		return this;
	}
	
	public HlpPropostaDeCredito adicionarValorLiberacao(Object valor) {
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.CAMPO_VALOR_LIBERACAO, pgoPropostaDeCredito.BTN_SCROLL);
		preencheCampo(pgoPropostaDeCredito.CAMPO_VALOR_LIBERACAO, valor);
		return this;
	}
	
	public HlpPropostaDeCredito clicaBotaoFinalizar() {
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.BOTAO_FINALIZAR, pgoPropostaDeCredito.BTN_SCROLL);
		click(pgoPropostaDeCredito.BOTAO_FINALIZAR);
		return this;
	}
	
	public HlpPropostaDeCredito clicaBotaoIncluir() {
		click(pgoPropostaDeCredito.BOTAO_INCLUIR);
		return this;
	}
	
	public HlpPropostaDeCredito clickAdcionarCriterioDebito() {
		click(pgoPropostaDeCredito.BOTAO_ADCIONAR_DEBITO);
		return this;
	}
	
	public HlpPropostaDeCredito selecionaContaDebito() {
		aguardarLoadSistema();
		click(pgoPropostaDeCredito.CHECKBOX_CRITERIO_CREDITO);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoCaucular() {
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.BOTAO_CAlCULAR, pgoPropostaDeCredito.BTN_SCROLL);
		click(pgoPropostaDeCredito.BOTAO_CAlCULAR);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoAcoes() {
		aguardaElementoSerVisivel(pgoPropostaDeCredito.BOTAO_ACOES);
		click(pgoPropostaDeCredito.BOTAO_ACOES);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoVOLTAR() {
		aguardaElementoSerVisivel(pgoPropostaDeCredito.BOTAO_VOLTAR);
		click(pgoPropostaDeCredito.BOTAO_VOLTAR);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoAcoesWeb() {
		aguardaElementoSerVisivel(pgoPropostaDeCredito.BOTAO_ACOES_WEB);
		click(pgoPropostaDeCredito.BOTAO_ACOES_WEB);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoGravar() {
		click(pgoPropostaDeCredito.BOTAO_GRAVAR);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoGravarWeb() {
		click(pgoPropostaDeCredito.BOTAO_GRAVAR_WEB);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoEncaminharWeb() {
		click(pgoPropostaDeCredito.BOTAO_ENCAMINHAR_WEB);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoEncaminhar() {
		click(pgoPropostaDeCredito.BOTAO_ENCAMINHAR);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoX() {
		aguardarLoadSistema();
//		WebDriverWait wait = new WebDriverWait(ActionUi.getDriver(), 1000);
//		boolean teste = ExpectedConditions.visibilityOf(pgoPropostaDeCredito.BOTAO_X) != null;
//		if (!(ExpectedConditions.visibilityOf(pgoPropostaDeCredito.BOTAO_X) != null)) {
//			Log.info("Botão não presente"); 
//		} else {
//			click(pgoPropostaDeCredito.BOTAO_X);
//
//		}
		clickX(pgoPropostaDeCredito.BOTAO_X);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoXWeb() {
		aguardarLoadSistemaWeb();
		clickX(pgoPropostaDeCredito.BOTAO_X_WEB);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoAdicionarArquivo() {
		aguardarLoadSistema();
		aguardaElemento(pgoPropostaDeCredito.BOTAO_ADICIONAR_ARQUIVO);
		click(pgoPropostaDeCredito.BOTAO_ADICIONAR_ARQUIVO);
		return this;
	}
	
	public HlpPropostaDeCredito preencheCampoNomeDocumento(Object documento) {
		preencheCampo(pgoPropostaDeCredito.CAMPO_NOME_DOCUMENTO, documento);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoAnexarArquivo() {
		click(pgoPropostaDeCredito.BOTAO_ANEXAR_DOCUMENTO);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoMenuArquivo() {
		click(pgoPropostaDeCredito.BOTAO_MENU_ARQUIVO);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoDownloads() {
		click(pgoPropostaDeCredito.BOTAO_DOWNLOADS);
		return this;
	}
	
	public HlpPropostaDeCredito clickArquivoPdf() {
		click(pgoPropostaDeCredito.CAMPO_ARQUIVO);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoAnexar() {
		aguardarLoadSistema();
		aguardaElemento(pgoPropostaDeCredito.BOTAO_ANEXAR);
		click(pgoPropostaDeCredito.BOTAO_ANEXAR);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoLiberarParaGarantiaWeb() {
		click(pgoPropostaDeCredito.BOTAO_LIBERAR_PARA_GARANTIA_WEB);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoLiberarParaGarantia() {
		click(pgoPropostaDeCredito.BOTAO_LIBERAR_PARA_GARANTIA);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoAcoesDocumentacao() {
		click(pgoPropostaDeCredito.BOTAO_ACOES_WEB_DOCUMENTACAO);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoAddGarantia() {
//		aguardarLoadSistema();
		aguardaElemento(pgoPropostaDeCredito.BOTAO_ADD_GARANTIA);
		click(pgoPropostaDeCredito.BOTAO_ADD_GARANTIA);
		return this;
	}
	
	
	public HlpPropostaDeCredito preencheComboTipoGarantia(Object opcao) {
		aguardarLoadSistema();
//		String i =pegarTextoElementoPorAtributo(pgoPropostaDeCredito.IMPRIMIR);
//		System.out.println(i);
		preencherComboSisbrGarantia(pgoPropostaDeCredito.COMBO_TIPO_GARANTIA, pgoPropostaDeCredito.COMBO_BLOCO, opcao);
//		click(pgoPropostaDeCredito.COMBO_TIPO_GARANTIA);
//		click(pgoPropostaDeCredito.IMPRIMIR);
		return this;
	}
	
	public HlpPropostaDeCredito preencheComboGrupoGarantia(Object opcao) {
		aguardarLoadSistema();
		preencherComboSisbrGarantia(pgoPropostaDeCredito.COMBO_GRUPO_GARANTIA, pgoPropostaDeCredito.COMBO_BLOCO, opcao);
//		click(pgoPropostaDeCredito.COMBO_GRUPO_GARANTIA);
//		click(pgoPropostaDeCredito.IMPRIMIR2);
		return this;
	}
	
	public HlpPropostaDeCredito preencheComboEnquadramento(Object opcao) {
		aguardarLoadSistema();
		preencherComboSisbrGarantia(pgoPropostaDeCredito.COMBO_ENQUADRAMENTO, pgoPropostaDeCredito.COMBO_BLOCO, opcao);
//		click(pgoPropostaDeCredito.COMBO_ENQUADRAMENTO);
//		click(pgoPropostaDeCredito.IMPRIMIR3);
		return this;
	}
	
	public HlpPropostaDeCredito preencheCampoCpfAvalista(Object cpfAvalista) {
		aguardarLoadSistema();
		clickDimensionado(200, 955);
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.CAMPO_CPF_AVALISTA, pgoPropostaDeCredito.BTN_SCROLL);
		preencheCampo(pgoPropostaDeCredito.CAMPO_CPF_AVALISTA, cpfAvalista);
		return this;
	}
	
	public HlpPropostaDeCredito clickDimensionado() {
		aguardarLoadSistema();
		clickDimensionado(445, 855);
		return this;
	}
	
	public HlpPropostaDeCredito preencheComboResponsabilidade(Object opcao) {
		aguardarLoadSistema();
		preencherComboSisbrGarantia(pgoPropostaDeCredito.COMBO_RESPONSABILIDADE, pgoPropostaDeCredito.COMBO_BLOCO, opcao);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoGravarResponsabilidade() {
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.BOTAO_GRAVAR_GARANTIA, pgoPropostaDeCredito.BTN_SCROLL);
		click(pgoPropostaDeCredito.BOTAO_GRAVAR_GARANTIA);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoAcoesWebGarantia() {
		click(pgoPropostaDeCredito.BOTAO_ACOES_WEB_GARANTIA);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoLiberaParaEstudo() {
		click(pgoPropostaDeCredito.BOTAO_LIBERAR_PARA_ESTUDO);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoSim() {
		aguardarLoadSistema();
		click(pgoPropostaDeCredito.BOTAO_SIM);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoAcoesWebEstudo() {
		aguardarLoadSistemaWeb();
		click(pgoPropostaDeCredito.BOTAO_ACOES_WEB_ESTUDO);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoChecklist() {
		click(pgoPropostaDeCredito.BOTAO_CHECKLIST);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoSubmeter() {
		click(pgoPropostaDeCredito.BOTAO_SUBMETER);
		return this;
	}
	
	public HlpPropostaDeCredito aguardaBotaoXWeb() {
		aguardaElemento(pgoPropostaDeCredito.BOTAO_X_WEB);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoAcoesWebSubmeter() {
		aguardarLoadSistema();
		click(pgoPropostaDeCredito.BOTAO_ACOES_WEB_SUBMETER);
		return this;
	}
	
	public HlpPropostaDeCredito preencheCampoParecerNegocial(Object texto) {
		aguardarLoadSistema();
		preencheCampo(pgoPropostaDeCredito.CAMPO_PARECER_NEGOCIAL, texto);
		return this;
	}
	
	public HlpPropostaDeCredito validarMsgSucesso(Object msg) {
		pontoVerificacao(pgoPropostaDeCredito.MSG_SUCESSO, msg);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoResultadoCheckList() {
		aguardarLoadSistema();
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.BOTAO_RESULTADO_CHECKLIST, pgoPropostaDeCredito.BTN_SCROLL);
		click(pgoPropostaDeCredito.BOTAO_RESULTADO_CHECKLIST);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoParecer() {
		aguardarLoadSistema();
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.BOTAO_PARECER, pgoPropostaDeCredito.BTN_SCROLL);
		click(pgoPropostaDeCredito.BOTAO_PARECER);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoApontamento() {
		aguardarLoadSistema();
		click(pgoPropostaDeCredito.BOTAO_APONTAMENTO);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoAcoesWebAnaliseTecnica() {
		aguardarLoadSistema();
		click(pgoPropostaDeCredito.BOTAO_ACOES_WEB_ANALISE_TECNICA);
		return this;
	}
	
	public HlpPropostaDeCredito preencheCampoParecerNegocialAnaliseTecnica(Object texto) {
		aguardarLoadSistema();
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.CAMPO_PARECER_NEGOCIAL_ANALISE_TECNICA, pgoPropostaDeCredito.BTN_SCROLL);
		preencheCampo(pgoPropostaDeCredito.CAMPO_PARECER_NEGOCIAL_ANALISE_TECNICA, texto);
		return this;
	}
	
	public HlpPropostaDeCredito preencheComboParecerTecnico(Object opcao) {
		aguardarLoadSistema();
		preencherComboSisbrGarantia(pgoPropostaDeCredito.COMBO_PARECER_TECNICO, pgoPropostaDeCredito.COMBO_BLOCO, opcao);
		return this;
	}
	
	public HlpPropostaDeCredito preencheCampoParecerAprovacao(Object texto) {
		aguardarLoadSistema();
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.BOTAO_CONFIRMAR, pgoPropostaDeCredito.BTN_SCROLL);
		preencheCampo(pgoPropostaDeCredito.CAMPO_PARECER_NEGOCIAL_ANALISE_TECNICA, texto);
		return this;
	}
	
	public HlpPropostaDeCredito preencheComboAcao(Object opcao) {
		preencherComboSisbr(pgoPropostaDeCredito.COMBO_ACAO, pgoPropostaDeCredito.COMBO_BLOCO, opcao);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoConfirmar() {
		aguardaElemento(pgoPropostaDeCredito.BOTAO_CONFIRMAR);
		click(pgoPropostaDeCredito.BOTAO_CONFIRMAR);
		return this;
	}
	
	public HlpPropostaDeCredito aguardaAprovacaoAparecer() {
		aguardaElemento(pgoPropostaDeCredito.MSG_APROVACAO);
		aguardaElemento(pgoPropostaDeCredito.MSG_LINHA_DE_CREDITO);
		return this;
	}
	
	public HlpPropostaDeCredito aguardaNomeDocumentoAparecer() {
		aguardaElemento(pgoPropostaDeCredito.MSG_NOME_DOCUMENTO);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoAcoesFormalizacao() {
		aguardarLoadSistemaWeb();
		click(pgoPropostaDeCredito.BOTAO_ACOES_WEB_FORMALIZACAO);
		return this;
	}
	
	public HlpPropostaDeCredito getNumProposta() {
		aguardaElementoSerVisivel(pgoPropostaDeCredito.NUM_PROPOSTA);
		String s =pegarTextoElemento(pgoPropostaDeCredito.NUM_PROPOSTA);
		System.out.println(s);
		return this;
	}
	
	public HlpPropostaDeCredito preencheComboIstrumentoDeCredito(Object opcao) {
		aguardarLoadSistema();
		aguardaElemento(pgoPropostaDeCredito.COMBO_INSTRUMENTO_CREDITO);
		preencherComboSisbr(pgoPropostaDeCredito.COMBO_INSTRUMENTO_CREDITO, pgoPropostaDeCredito.COMBO_BLOCO, opcao);
		return this;
	}
	
	public HlpPropostaDeCredito preencheComboAssinatura(Object opcao) {
		aguardarLoadSistema();
		aguardaElemento(pgoPropostaDeCredito.COMBO_ASSINATURA);
		preencherComboSisbr(pgoPropostaDeCredito.COMBO_ASSINATURA, pgoPropostaDeCredito.COMBO_BLOCO, opcao);
		return this;
	}
	
	public HlpPropostaDeCredito preencheCampoFechoDoInstrumento(Object texto) {
		click(pgoPropostaDeCredito.CLICK_FECHO_DO_INSTRUMENTO);
		preencheCampo(pgoPropostaDeCredito.CLICK_FECHO_DO_INSTRUMENTO, texto);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoImprimirInstrumento() {
		click(pgoPropostaDeCredito.BOTAO_IMPRIMIR_INSTRUMENTO);
		return this;
	}
	
	public HlpPropostaDeCredito aguardaMSGInstrumento() {
		aguardarLoadSistemaWeb();
		aguardaElementoSerVisivel(pgoPropostaDeCredito.MSG_PROPOSTA_DE_CREDITO);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoRecalcular() {
		click(pgoPropostaDeCredito.BOTAO_RECAlCULAR);
		return this;
	}
	
	public HlpPropostaDeCredito preencheComBoTipoOrigem(Object opcao) {
		aguardarLoadSistema();
		preencherComboSisbrGarantia(pgoPropostaDeCredito.COMBO_TIPO_ORIGEM,pgoPropostaDeCredito.COMBO_BLOCO, opcao);
		return this;
	}
	
	public HlpPropostaDeCredito checkBoxAplicacao() {
		aguardarLoadSistema();
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.CHECKBOX_APLICACAO, pgoPropostaDeCredito.BTN_SCROLL);
		click(pgoPropostaDeCredito.CHECKBOX_APLICACAO);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoAssociar() {
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.BOTAO_ASSOCIAR, pgoPropostaDeCredito.BTN_SCROLL);
		click(pgoPropostaDeCredito.BOTAO_ASSOCIAR);
		return this;
	}
	
	public HlpPropostaDeCredito preencheCampoValorUtil(Object texto) {
		preencheCampo(pgoPropostaDeCredito.CAMPO_VALOR_UTIL, texto);
		click(pgoPropostaDeCredito.CAMPO_VALOR_UTIL);
		return this;
	}
	
	public HlpPropostaDeCredito preencheCampoDescGarantia(Object texto) {
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.CAMPO_DESCRICAO_GARANTIA, pgoPropostaDeCredito.BTN_SCROLL);
		preencheCampo(pgoPropostaDeCredito.CAMPO_DESCRICAO_GARANTIA, texto);
		click(pgoPropostaDeCredito.CAMPO_DESCRICAO_GARANTIA);
		return this;
	}
	
	public HlpPropostaDeCredito preencheComboResposabilidadeAlienacao(Object opcao) {
		aguardarLoadSistema();
		preencherComboSisbr(pgoPropostaDeCredito.COMBO_RESPOSABILIDADE_ALIENCAO,pgoPropostaDeCredito.COMBO_BLOCO, opcao);
		return this;
	}
	
	public HlpPropostaDeCredito preencheCampoCpfAlienacao(Object cpf) {
		click(pgoPropostaDeCredito.CLICK_CAMPO_CPF_ALIENACAO);
		preencheCampo(pgoPropostaDeCredito.CAMPO_CPF_ALIENACAO, cpf);
		return this;
	}
	
	public HlpPropostaDeCredito preencheCampoValorImovel(Object valor) {
		aguardarLoadSistema();
		preencheCampo(pgoPropostaDeCredito.CAMPO_VALOR_IMOVEL, valor);
		return this;
	}
	
	public HlpPropostaDeCredito preencheComboCartorio(Object opcao) {
		preencherComboSisbr(pgoPropostaDeCredito.COMBO_GARANTIA_CARTORIO,pgoPropostaDeCredito.COMBO_BLOCO, opcao);
		return this;
	}
	
	public HlpPropostaDeCredito preencheCampoDescAlienacao(Object texto) {
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.CAMPO_DESCRICAO_ALIENACAO, pgoPropostaDeCredito.BTN_SCROLL);
		preencheCampo(pgoPropostaDeCredito.CAMPO_DESCRICAO_ALIENACAO, texto);
		click(pgoPropostaDeCredito.CAMPO_DESCRICAO_ALIENACAO);
		return this;
	}
	
	public HlpPropostaDeCredito clickUltimaAvaliacao() {
		click(pgoPropostaDeCredito.CAMPO_ULTIMA_AVALIACAO);
		return this;
	}
	
	public HlpPropostaDeCredito clickTela() {
		click(pgoPropostaDeCredito.BOTAO_OK_ALERT);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoOk() {
		click(pgoPropostaDeCredito.BOTAO_OK);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoGravarGarantiaWeb() {
		click(pgoPropostaDeCredito.BOTAO_GRAVAR_GARANTIA_WEB);
		return this;
	}
	
	public HlpPropostaDeCredito procurarBotaoGravar() {
		swipe(ScrollDirection.DOWN, pgoPropostaDeCredito.BOTAO_GRAVAR_GARANTIA, pgoPropostaDeCredito.BTN_SCROLL);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoVisualizarInstrumento() {
		click(pgoPropostaDeCredito.BOTAO_VISUALIZAR_INSTRUMENTO);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoEncamiarLiberacao() {
		click(pgoPropostaDeCredito.BOTAO_ENCAMIAR_LIBERACAO);
		return this;
	}
	
	public HlpPropostaDeCredito aguardaMsgDocumentoPrecessando() {
		aguardarLoadSistema();
		aguardaElementoSumirTeste(pgoPropostaDeCredito.MSG_DOCUMENTO_PRECESSANDO);
		aguardarLoadSistema();
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoImprimir() {
		click(pgoPropostaDeCredito.BOTAO_IMPRIMIR);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoLiberar() {
		click(pgoPropostaDeCredito.BOTAO_LIBERAR);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoAcoesLiberacao() {
		click(pgoPropostaDeCredito.BOTAO_ACOES_WEB_LIBERACAO);
		return this;
	}
	
	public HlpPropostaDeCredito clickBotaoSimWeb() {
		click(pgoPropostaDeCredito.BOTAO_SIM);
		return this;
	}
	
	public HlpPropostaDeCredito exportaInstrumento() {
		click(pgoPropostaDeCredito.PDF);
		click(pgoPropostaDeCredito.VOLTAR);
		return this;
	}
	
	/**
	 * Metodo para aguardar enquanto o loader estiver sendo apresentado
	 */
	public void aguardarLoadSistema() {
		WebDriverWait wait = new WebDriverWait(ActionUi.getDriver(), 5000);
		Log.info("Aguardando Loader...");
		try {
			wait.until(ExpectedConditions
					.refreshed((ExpectedCondition<?>) ExpectedConditionsCustom.stalenessOf(pgoPropostaDeCredito.IMG_LOAD)));
		} catch (Exception e) {
			throw new AutomacaoBusinessException("Elemento nao encontrado: "
					+ (ExpectedCondition<?>) ExpectedConditionsCustom.stalenessOf(pgoPropostaDeCredito.IMG_LOAD), e);
		}

	}
	
	protected void aguardarLoadSistema2() {
		Log.info(getDriverMobile().getSessionDetail("deviceName") + " | Aguardando Load...");
		aguardaElemento(ExpectedConditionsCustom.stalenessOf(pgoPropostaDeCredito.IMG_LOAD));
	}
	
	/**
	 * Metodo para aguardar enquanto o loaderWeb estiver sendo apresentado
	 */
	
	public void aguardarLoadSistemaWeb() {
		WebDriverWait wait = new WebDriverWait(ActionUi.getDriver(), 5000);
		Log.info("Aguardando Loader...");
		try {
			wait.until(ExpectedConditions
					.refreshed((ExpectedCondition<?>) ExpectedConditionsCustom.stalenessOf(pgoPropostaDeCredito.IMG_LOAD_WEB)));
		} catch (Exception e) {
			throw new AutomacaoBusinessException("Elemento nao encontrado: "
					+ (ExpectedCondition<?>) ExpectedConditionsCustom.stalenessOf(pgoPropostaDeCredito.IMG_LOAD_WEB), e);
		}

	}
	
	public void clickDimensionadoTeste(MobileElement object, int pos) {
		anexaDescricao("Clique no objeto: "
				+ getReferenceNameElement(wait.until(ExpectedConditions.elementToBeClickable(object))));
		getDriverMobile().performTouchAction(new TouchAction<>(getDriverMobile())
				.tap(PointOption.point(object.getLocation().getX() + pos, object.getLocation().getY())).release()
				.perform());
	}
	
	public String pegarTextoElementoPorAtributo(MobileElement object) {
		return object.getAttribute("resource-id");
	}
	
	
	


//	public static void action_clickOnPosition(int pointA_X, int pointA_Y) { 
//		WebDriver driver = getDriver();
//		PointerInput finger = new PointerInput(org.openqa.selenium.interactions.PointerInput.Kind.TOUCH, "finger"); 
//		org.openqa.selenium.interactions.Sequence clickPosition = new org.openqa.selenium.interactions.Sequence(finger, 1);
//		clickPosition .addAction(finger.createPointerMove(Duration.ZERO, Origin.viewport(), pointA_X,pointA_Y)) 
//		.addAction(finger.createPointerDown(MouseButton.LEFT.asArg())) 
//		.addAction(finger.createPointerUp(MouseButton.LEFT.asArg())); 
//		driver.perform(Arrays.asList(clickPosition)); }

	public Boolean contanisIgnoreAccents(String a, String b) {

    // Remove os acentos e convert para minúsculo
    String str1 = StringUtils.stripAccents(a);
    String str2 = StringUtils.stripAccents(b);
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str1.contains(str2));

    return str1.contains(str2);
}


}







//	public static void action_clickOnPosition(int pointA_X, int pointA_Y) { 
//		WebDriver driver = getDriver();
//		PointerInput finger = new PointerInput(org.openqa.selenium.interactions.PointerInput.Kind.TOUCH, "finger"); 
//		org.openqa.selenium.interactions.Sequence clickPosition = new org.openqa.selenium.interactions.Sequence(finger, 1);
//		clickPosition .addAction(finger.createPointerMove(Duration.ZERO, Origin.viewport(), pointA_X,pointA_Y)) 
//		.addAction(finger.createPointerDown(MouseButton.LEFT.asArg())) 
//		.addAction(finger.createPointerUp(MouseButton.LEFT.asArg())); 
//		driver.perform(Arrays.asList(clickPosition)); }

	


