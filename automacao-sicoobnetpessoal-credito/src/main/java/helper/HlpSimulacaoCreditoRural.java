package helper;


import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;

import pageObjects.PgoSimulacaoCreditoRural;
import support.MobileBank;
import uteis.Datapool;
import uteis.Log;
import util.db.DBUTIL;

public class HlpSimulacaoCreditoRural extends MobileBank<HlpSimulacaoCreditoRural> {

	public PgoSimulacaoCreditoRural pgoSimulacaoCreditoRural;
	public Datapool datapool;
	String dpArq = "creditoRural.json";
	public DBUTIL DBUTIL;

	public HlpSimulacaoCreditoRural() {
		pgoSimulacaoCreditoRural = new PgoSimulacaoCreditoRural();
		DBUTIL = new DBUTIL();
	}

	public Datapool getDp() {
		return new Datapool(dpArq);
	}
	
	/** Entra no menu do app **/
	public HlpSimulacaoCreditoRural acessarMenu() {
		aguardarLoadSistema();
		aguardaElemento(pgoSimulacaoCreditoRural.CAMPO_LINDOMAR);
		click(pgoSimulacaoCreditoRural.BOTAO_MENU);
		return this;
	}
    /** Primeiro ele pesquisa Consignado e depois clica em Consignado **/
	public HlpSimulacaoCreditoRural acessarMenuCreditoRural(Object busca) {
		preencheCampo(pgoSimulacaoCreditoRural.CAMPO_BUSCAR, busca);
		click(pgoSimulacaoCreditoRural.CAMPO_RURAL_SIMULACAO);
		return this;
	}
	
	public HlpSimulacaoCreditoRural preencherComboEstado(Object opcao) {
		aguardarLoadSistema();
		preencherComboFiscalizacao(pgoSimulacaoCreditoRural.COMBO_ESTADO, opcao);
		return this;
	}
	
	public HlpSimulacaoCreditoRural preencherComboMunicipio(Object opcao) {
		aguardarLoadSistema();
		preencherComboFiscalizacao(pgoSimulacaoCreditoRural.COMBO_MUNICIPIO, opcao);
		return this;
	}
	
	public HlpSimulacaoCreditoRural preencherComboFinalidade(Object opcao) {
		preencherComboFiscalizacao(pgoSimulacaoCreditoRural.COMBO_FINALIDADE, opcao);
		return this;
	}
	
	public HlpSimulacaoCreditoRural preencherComboPrograma(Object opcao) {
		aguardarLoadSistema();
		preencherComboFiscalizacao(pgoSimulacaoCreditoRural.COMBO_PROGRAMA, opcao);
		return this;
	}
	
	public HlpSimulacaoCreditoRural preencherComboPrincipalProduto(Object opcao) {
		aguardarLoadSistema();
		preencherComboFiscalizacao(pgoSimulacaoCreditoRural.COMBO_PRINCIPAL_PRODUTO, opcao);
		return this;
	}
	
	public HlpSimulacaoCreditoRural preencherComboAtividade(Object opcao) {
		aguardarLoadSistema();
		preencherComboFiscalizacao(pgoSimulacaoCreditoRural.COMBO_ATIVIDADE, opcao);
		return this;
	}
	
	public HlpSimulacaoCreditoRural preencheCampoValorFinciado(Object opcao) {
		aguardarLoadSistema();
		preencheCampo(pgoSimulacaoCreditoRural.CAMPO_VALOR_FIN, opcao);
		return this;
	}
	
	public HlpSimulacaoCreditoRural preencheCampoTelefone(Object opcao) {
		aguardarLoadSistema();
		preencheCampo(pgoSimulacaoCreditoRural.CAMPO_TELEFONE, opcao);
		return this;
	}
	
	public HlpSimulacaoCreditoRural preencherComboConsorcio(Object opcao) {
		swipe(ScrollDirection.DOWN, pgoSimulacaoCreditoRural.COMBO_CONSORCIO, pgoSimulacaoCreditoRural.BTN_SCROLL_GERAL);
		preencherComboFiscalizacao(pgoSimulacaoCreditoRural.COMBO_CONSORCIO, opcao);
		return this;
	}
	
	public HlpSimulacaoCreditoRural preencherComboCestaSafra(Object opcao) {
		aguardarLoadSistema();
		swipe(ScrollDirection.DOWN, pgoSimulacaoCreditoRural.COMBO_CESTA_SAFRA, pgoSimulacaoCreditoRural.BTN_SCROLL_GERAL);
		preencherComboFiscalizacao(pgoSimulacaoCreditoRural.COMBO_CESTA_SAFRA, opcao);
		return this;
	}
	
	public HlpSimulacaoCreditoRural clicaBotaoSolicitarFinanciamento() {
		swipe(ScrollDirection.DOWN, pgoSimulacaoCreditoRural.BOTAO_SOLICITAR_FINACIMENTO, pgoSimulacaoCreditoRural.BTN_SCROLL_GERAL);
		click(pgoSimulacaoCreditoRural.BOTAO_SOLICITAR_FINACIMENTO);
		return this;
	}
	
	public HlpSimulacaoCreditoRural deletaPropostanoBanco(Object tel) {
		String id = DBUTIL.getIdPropostaCreditoRural(tel.toString());
		DBUTIL.deleteSimulcaoCreditoRural(tel.toString(), id);
		return this;
	}
	
	public HlpSimulacaoCreditoRural validarMSGSimulacao(Object msg) {
		aguardarLoadSistema();
		pontoVerificacao(pgoSimulacaoCreditoRural.CAMPO_REGISTADO, msg);
		return this;
	}
	
	public HlpSimulacaoCreditoRural clicaBotaoSimularParcelas() {
		click(pgoSimulacaoCreditoRural.BOTAO_SIMULAR_PARCELAS);
		return this;
	}
	
	public HlpSimulacaoCreditoRural clicaParcela() {
		aguardarLoadSistema();
		click(pgoSimulacaoCreditoRural.BOTAO_PARCELA);
		return this;
	}
	
	public HlpSimulacaoCreditoRural clicaBotaoRegistrar() {
		aguardarLoadSistema();
		click(pgoSimulacaoCreditoRural.BOTAO_REGISTRAR);
		return this;
	}
	
	public HlpSimulacaoCreditoRural validarMSGSimulacaoRegistrada(Object msg) {
		aguardarLoadSistema();
		pontoVerificacao(pgoSimulacaoCreditoRural.CAMPO_SOLICITAÇÃO_REGISTRADA, msg);
		return this;
	}
	
	
	
	
   
	

}
