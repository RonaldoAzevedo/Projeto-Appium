package helper;

import pageObjects.PgoSimulacaoCreditoPreAprovado;
import support.MobileBank;
import uteis.Datapool;
import util.db.DBUTIL;

public class HlpSimulacaoCreditoPreAprovado extends MobileBank<HlpSimulacaoCreditoPreAprovado> {

	public PgoSimulacaoCreditoPreAprovado pgoSimulacaoCreditoPreAprovado;
	public Datapool datapool;
	String dpArq = "simulacaoCredito.json";
	public DBUTIL DBUTIL;
	Object casoTeste;

	public HlpSimulacaoCreditoPreAprovado() {
		pgoSimulacaoCreditoPreAprovado = new PgoSimulacaoCreditoPreAprovado();
	}

	public Datapool getDp() {
		return new Datapool(dpArq);
	}

	public String getCasoTeste() {
		return (String) casoTeste;
	}

	public void setCasoTeste(Object casoTeste) {
		this.casoTeste = casoTeste;
	}

	/** Entra no menu do app **/
	public HlpSimulacaoCreditoPreAprovado acessarMenu() {
		aguardarLoadSistema();
		click(pgoSimulacaoCreditoPreAprovado.BOTAO_MENU);
		return this;
	}
	
	public HlpSimulacaoCreditoPreAprovado buscaMenu(Object busca) {
		preencheCampo(pgoSimulacaoCreditoPreAprovado.CAMPO_BUSCAR, busca);
		return this;
	}
	
	/** Entra na simulação do credito **/
	public HlpSimulacaoCreditoPreAprovado acessarSimulacao() {
		aguardarLoadSistema();
		click(pgoSimulacaoCreditoPreAprovado.BOTAO_SIMULACAO);
		return this;
	}

	/** Entra no pre aprovado novo associado 5014**/
	public HlpSimulacaoCreditoPreAprovado acessarPreAprovado5014() {
		aguardarLoadSistema();
		click(pgoSimulacaoCreditoPreAprovado.OPCAO_PREAPROVADO5014);
		return this;
	}

	/** Preenche o campo valor solicitado**/
	public HlpSimulacaoCreditoPreAprovado preencherValorSolicitado(Object valor) {
		aguardarLoadSistema();
		preencheCampo(pgoSimulacaoCreditoPreAprovado.CAMPO_VALOR_SOLICITADO, valor);
		return this;
	}
	
	/** Seleciona a opção da primeira parcela**/
	public HlpSimulacaoCreditoPreAprovado selecionaOpcaoCarenciaPrimeiraParela(Object opcao) {
		aguardarLoadSistema();
		preencherComboFiscalizacaoComContenDesc(pgoSimulacaoCreditoPreAprovado.COMBOBOX_CARENCIA_PRIMEIRA_PARCELA, opcao);
		return this;
	}
	
	/** Clica no botão Simular**/
	public HlpSimulacaoCreditoPreAprovado clicarBotaoSimular() {
		aguardarLoadSistema();
		click(pgoSimulacaoCreditoPreAprovado.BOTAO_SIMULAR);
		return this;
	}

	/** Entra no pre aprovado novo associado 5014**/
	public HlpSimulacaoCreditoPreAprovado acessarPreAprovado5014II() {
		aguardarLoadSistema();
		click(pgoSimulacaoCreditoPreAprovado.OPCAO_PREAPROVADO5014II);
		return this;
	}
	
	/** Primeiro ele pesquisa Consignado e depois clica em Consignado **/
	/*
	public SimulacaoCreditoPreAprovado acessarMenuPix(Object busca) {
		preencheCampo(pgoSimulacaoCreditoPreAprovado.CAMPO_BUSCAR, busca);
		aguardaElementoSerVisivel(pgoSimulacaoCreditoPreAprovado.BOTAO_PIX);
		click(pgoSimulacaoCreditoPreAprovado.BOTAO_PIX);
		return this;
	}
*/
}
