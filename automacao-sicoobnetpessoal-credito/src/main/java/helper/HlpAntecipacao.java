package helper;

import pageObjects.PgoAntecipacao;
import support.MobileBank;
import uteis.Datapool;
import util.db.DBUTIL;

public class HlpAntecipacao extends MobileBank<HlpAntecipacao> {

	public PgoAntecipacao pgoAntecipacao;
	public Datapool datapool;
	String dpArq = "antecipaçãodeCredito.json";
	public DBUTIL DBUTIL;
	Object casoTeste;

	public HlpAntecipacao() {
		pgoAntecipacao = new PgoAntecipacao();
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
	public HlpAntecipacao acessarMenu() {
		aguardarLoadSistema();
		click(pgoAntecipacao.BOTAO_MENU);
		return this;
	}
	
	/**
	 * preenche o campo busca com o param e depois clica no campo buscado 
	 * @param busca
	 * @return
	 */
	public HlpAntecipacao acessarMenuAntecipacaoCredito(Object busca) {
		aguardarLoadSistema();
		preencheCampo(pgoAntecipacao.CAMPO_BUSCAR, busca);
		click(pgoAntecipacao.BOTAO_CONTRATACAO);
		return this;
	}
	
	/**
	 * busca o param e clica no campo buscado
	 * @param busca
	 * @return
	 */
	public HlpAntecipacao acessarMenuPix(Object busca) {
		preencheCampo(pgoAntecipacao.CAMPO_BUSCAR, busca);
		click(pgoAntecipacao.BOTAO_PIX);
		return this;
	}
    
	/**
	 * busca o param e fecha abas e depois clica no campo buscado
	 * @param busca
	 * @return
	 */
	public HlpAntecipacao acessarMenuConsulta(Object busca) {
		preencheCampo(pgoAntecipacao.CAMPO_BUSCAR, busca);
		click(pgoAntecipacao.CAMPO_CONTACORRENTE);
		click(pgoAntecipacao.CAMPO_PIX);
		click(pgoAntecipacao.CAMPO_CAPITAL);
		click(pgoAntecipacao.CAMPO_INVESTIMENTOS);
		click(pgoAntecipacao.CAMPO_CONSULTA_ANTECIPACAO);
		return this;
	}
    
	/**
	 * limpa e preenche o campo valor antecipação do cheque 
	 * @param valor
	 * @return
	 */
	public HlpAntecipacao preencherCampoValorAntecipacaoCheque(Object valor) {
		aguardarLoadSistema();
		limpaCampo(pgoAntecipacao.CAMPO_ANTECIPACAO_CHEQUE);
		preencheCampo(pgoAntecipacao.CAMPO_ANTECIPACAO_CHEQUE, valor);
		return this;
	}
	
	/**
	 * clica no botão simular 
	 * @return
	 */
	public HlpAntecipacao clicaBotaoSimular() {
		swipe(ScrollDirection.DOWN, pgoAntecipacao.BOTAO_SIMULAR, pgoAntecipacao.BTN_SCROLL_GERAL);
		click(pgoAntecipacao.BOTAO_SIMULAR);
		return this;
	}
	
	/**
	 * clica no botão continuar
	 * @return
	 */
	public HlpAntecipacao clicaBotaoContinuar() {
		aguardarLoadSistema();
		click(pgoAntecipacao.BOTAO_CONTINUAR);
		return this;
	}
	
	/**
	 * preenche o campo senha com o parâmetro 
	 * @param senha
	 * @return
	 */
	public HlpAntecipacao preencheCampoSenha(Object senha) {
		aguardarLoadSistema();
		click(pgoAntecipacao.CAMPO_SENHA);
		preencheCampo(pgoAntecipacao.CAMPO_SENHA, senha);
		return this;
	}
	
	/**
	 * clica no botão contratar
	 * @return
	 */
	public HlpAntecipacao clicaBotaoContratar() {
		click(pgoAntecipacao.BOTAO_CONTRATAR);
		return this;
	}
    
	/**
	 * valida a mensagem esta condizente com aqui está na massa
	 * @param msg
	 * @return
	 */
	public HlpAntecipacao validarMensagemRemessaAprovada(String msg) {
		aguardarLoadSistema();
		pontoVerificacaoGeneric(
				pgoAntecipacao.MSG_REMESSA_ENVIADA.getText().contains(msg),
				"Verificar se content-desc  contem (" + msg + ")",
				pgoAntecipacao.MSG_REMESSA_ENVIADA.getText(), msg);
		return this;
	}
	
	/**
	 * exporata contrato e valida se o valor da antecipação esta condizente com o teste 
	 * @param msg
	 * @return
	 */
	public HlpAntecipacao exportaContrato(String msg) {
		click(pgoAntecipacao.BOTAO_EXPORTAR);
		click(pgoAntecipacao.ICON_PDF);
		validarMensagempdf(msg);
		click(pgoAntecipacao.BOTAO_VOLTAR_PDF);
		return this;
	}
	
	/**
	 * preenche o combo status 
	 * @param combo
	 * @return
	 */
	public HlpAntecipacao preencheComboStatus(Object combo) {
		aguardarLoadSistema();
		preencherComboFiscalizacao(pgoAntecipacao.COMBO_STATUS, combo);
		return this;
	}
	
	/**
	 * clica no botão mão 
	 * @return
	 */
	public HlpAntecipacao clicabotaoMao() {
		aguardarLoadSistema();
		click(pgoAntecipacao.BOTAO_MAO);
		return this;
	}
	
	/**
	 * clica na remessa 
	 * @return
	 */
	public HlpAntecipacao clicaRemessa() {
		aguardarLoadSistema();
		click(pgoAntecipacao.BOTAO_REMESSA);
		return this;
	}
	
	/**
	 * valida se a antecipação aparece como aprovada 
	 * @param msg
	 * @return
	 */
	public HlpAntecipacao validarMensagemRemessaAprovadaConsulta(String msg) {
		aguardaElemento(pgoAntecipacao.MSG_JAFOIENVIADA);
		pontoVerificacaoGeneric(
				pgoAntecipacao.MSG_JAFOIENVIADA.getAttribute("content-desc").contains(msg),
				"Verificar se content-desc  contem (" + msg + ")",
				pgoAntecipacao.MSG_JAFOIENVIADA.getAttribute("content-desc"), msg);
		return this;
	}
	
	/**
	 * valida se a mensagem está condizente com a massa
	 * @param msg
	 * @return
	 */
	public HlpAntecipacao validarMensagemRemessaEnviada(String msg) {
		pontoVerificacaoGeneric(
				pgoAntecipacao.MSG_JAFOIENVIADA_REMESSA.getText().contains(msg),
				"Verificar se content-desc  contem (" + msg + ")",
				pgoAntecipacao.MSG_JAFOIENVIADA_REMESSA.getText(), msg);
		return this;
	}
    
	/**
	 * clica no botão consultar
	 * @return
	 */
	public HlpAntecipacao clicaBotaoConsultar() {
		click(pgoAntecipacao.BOTAO_CONSULTAR);
		return this;
	}
	
	/**
	 * valida se o pdf tem o valor condizente com a antecipação 
	 * @param msg
	 * @return
	 */
	public HlpAntecipacao validarMensagempdf(String msg) {
		aguardarLoadSistema();
		pontoVerificacaoGeneric(
				pgoAntecipacao.MSG_PDF.getAttribute("content-desc").contains(msg),
				"Verificar se content-desc  contem (" + msg + ")",
				pgoAntecipacao.MSG_PDF.getAttribute("content-desc"), msg);
		return this;
	}
	
	/**
	 * clica botão Filtro
	 * @return
	 */
	public HlpAntecipacao clickBotaoFiltroRecebiveis() {
		click(pgoAntecipacao.BOTAO_FILTAR_RECEBIVEIS);
		return this;
	}
	
	/**
	 * preenche o cheque
	 * @return
	 */
	public HlpAntecipacao preencheCheque() {
		aguardarLoadSistema();
		click(pgoAntecipacao.BOTAO_EXPANDIR_CHEQUES);
		click(pgoAntecipacao.BOTAO_CHECK_BOX_CHEQUE);
		return this;
	}

}
