package helper;

import pageObjects.PgoAdesaoChequeEspecial;
import pageObjects.PgoAntecipacao;
import support.MobileBank;
import uteis.Datapool;
import uteis.Log;
import util.db.DBUTIL;

public class HlpAdesaoChequeEspecial extends MobileBank<HlpAdesaoChequeEspecial> {

	public PgoAdesaoChequeEspecial pgoAdesaoChequeEspecial;
	public Datapool datapool;
	String dpArq = "adesaoChequeEspecial.json";
	public DBUTIL DBUTIL;
	Object casoTeste;

	public HlpAdesaoChequeEspecial() {
		pgoAdesaoChequeEspecial = new PgoAdesaoChequeEspecial();
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
	public HlpAdesaoChequeEspecial acessarMenu() {
		aguardarLoadSistema();
		click(pgoAdesaoChequeEspecial.BOTAO_MENU);
		return this;
	}
	
	/** Primeiro ele pesquisa Consignado e depois clica em Consignado **/
	public HlpAdesaoChequeEspecial acessarMenuPix(Object busca) {
		preencheCampo(pgoAdesaoChequeEspecial.CAMPO_BUSCAR, busca);
		aguardaElementoSerVisivel(pgoAdesaoChequeEspecial.BOTAO_PIX);
		click(pgoAdesaoChequeEspecial.BOTAO_PIX);
		return this;
	}
	
	
	/**
	 * busca o param e clica no campo buscado
	 * @param busca
	 * @return
	 */
	public HlpAdesaoChequeEspecial acessarMenuAdesaoChequeEspecial(Object busca) {
		preencheCampo(pgoAdesaoChequeEspecial.CAMPO_BUSCAR, busca);
		aguardaElementoSerVisivel(pgoAdesaoChequeEspecial.BOTAO_ADESAO_CHEQUE_ESPECIAL);
		click(pgoAdesaoChequeEspecial.BOTAO_ADESAO_CHEQUE_ESPECIAL);
		return this;
	}
    
	/**
	 * busca o param e fecha abas e depois clica no campo buscado
	 * @param busca
	 * @return
	 */
	public HlpAdesaoChequeEspecial acessarMenuConsulta(Object busca) {
		preencheCampo(pgoAdesaoChequeEspecial.CAMPO_BUSCAR, busca);
		click(pgoAdesaoChequeEspecial.CAMPO_CONTACORRENTE);
		click(pgoAdesaoChequeEspecial.CAMPO_PIX);
		click(pgoAdesaoChequeEspecial.CAMPO_CAPITAL);
		click(pgoAdesaoChequeEspecial.CAMPO_INVESTIMENTOS);
		click(pgoAdesaoChequeEspecial.CAMPO_CONSULTA_ANTECIPACAO);
		return this;
	}
    
	/**
	 * limpa e preenche o campo valor antecipação do cheque 
	 * @param valor
	 * @return
	 */
	public HlpAdesaoChequeEspecial preencherCampoValorAntecipacaoCheque(Object valor) {
		aguardarLoadSistema();
		limpaCampo(pgoAdesaoChequeEspecial.CAMPO_ANTECIPACAO_CHEQUE);
		preencheCampo(pgoAdesaoChequeEspecial.CAMPO_ANTECIPACAO_CHEQUE, valor);
		return this;
	}
	
	/**
	 * clica no botão continuar
	 * @return
	 */
	public HlpAdesaoChequeEspecial clicaBotaoContinuar() {
		aguardarLoadSistema();
		swipe(ScrollDirection.DOWN, pgoAdesaoChequeEspecial.BOTAO_CONTINUAR, pgoAdesaoChequeEspecial.BTN_SCROLL_GERAL);
		click(pgoAdesaoChequeEspecial.BOTAO_CONTINUAR);
		return this;
	}
	
	/**
	 * preenche o campo senha com o parâmetro 
	 * @param senha
	 * @return
	 */
	public HlpAdesaoChequeEspecial preencheCampoSenha(Object senha) {
		preencheCampoContextoWeb(pgoAdesaoChequeEspecial.CAMPO_SENHA, senha);
		return this;
	}
	
	/**
	 * clica no botão contratar
	 * @return
	 */
	public HlpAdesaoChequeEspecial clicaCheckBox() {
		clickContextoWeb(pgoAdesaoChequeEspecial.CHECK_BOX);
		return this;
	}
    
	/**
	 * valida a mensagem esta condizente com aqui está na massa
	 * @param msg
	 * @return
	 */
	public HlpAdesaoChequeEspecial validarMensagemRemessaAprovada(String msg) {
		aguardarLoadSistema();
		pontoVerificacaoGeneric(
				pgoAdesaoChequeEspecial.MSG_REMESSA_ENVIADA.getAttribute("content-desc").contains(msg),
				"Verificar se content-desc  contem (" + msg + ")",
				pgoAdesaoChequeEspecial.MSG_REMESSA_ENVIADA.getAttribute("content-desc"), msg);
		return this;
	}
	
	
	/**
	 * preenche o combo status 
	 * @param combo
	 * @return
	 */
	public HlpAdesaoChequeEspecial preencheComboStatus(Object combo) {
		aguardarLoadSistema();
		preencherComboFiscalizacao(pgoAdesaoChequeEspecial.COMBO_STATUS, combo);
		return this;
	}
	
	/**
	 * clica no botão mão 
	 * @return
	 */
	public HlpAdesaoChequeEspecial clicabotaoMao() {
		aguardarLoadSistema();
		click(pgoAdesaoChequeEspecial.BOTAO_MAO);
		return this;
	}
	
	/**
	 * clica na remessa 
	 * @return
	 */
	public HlpAdesaoChequeEspecial clicaRemessa() {
		aguardarLoadSistema();
		click(pgoAdesaoChequeEspecial.BOTAO_REMESSA);
		return this;
	}
	
	/**
	 * valida se a antecipação aparece como aprovada 
	 * @param msg
	 * @return
	 */
	public HlpAdesaoChequeEspecial validarMensagemRemessaAprovadaConsulta(String msg) {
		aguardaElemento(pgoAdesaoChequeEspecial.MSG_JAFOIENVIADA);
		pontoVerificacaoGeneric(
				pgoAdesaoChequeEspecial.MSG_JAFOIENVIADA.getAttribute("content-desc").contains(msg),
				"Verificar se content-desc  contem (" + msg + ")",
				pgoAdesaoChequeEspecial.MSG_JAFOIENVIADA.getAttribute("content-desc"), msg);
		return this;
	}
	
	/**
	 * valida se a mensagem está condizente com a massa
	 * @param msg
	 * @return
	 */
	public HlpAdesaoChequeEspecial validarMensagemRemessaEnviada(String msg) {
		pontoVerificacaoGeneric(
				pgoAdesaoChequeEspecial.MSG_JAFOIENVIADA_REMESSA.getAttribute("content-desc").contains(msg),
				"Verificar se content-desc  contem (" + msg + ")",
				pgoAdesaoChequeEspecial.MSG_JAFOIENVIADA_REMESSA.getAttribute("content-desc"), msg);
		return this;
	}
    
	/**
	 * clica no botão Contratar
	 * @return
	 */
	public HlpAdesaoChequeEspecial clicaBotaoContratar() {
		clickContextoWeb(pgoAdesaoChequeEspecial.BOTAO_CONTRATAR);
		return this;
	}
	
	/**
	 * valida se o pdf tem o valor condizente com a antecipação 
	 * @param msg
	 * @return
	 */
	public HlpAdesaoChequeEspecial validarMensagemParabens(String msg) {
		aguardarLoadSistema();
		pontoVerificacaoGeneric(
				pgoAdesaoChequeEspecial.MSG_PARABENS.getText().contains(msg),
				"Verificar se content-desc  contem (" + msg + ")",
				pgoAdesaoChequeEspecial.MSG_PARABENS.getText(), msg);
		return this;
	}
	
	/**
	 * clica botão Filtro
	 * @return
	 */
	public HlpAdesaoChequeEspecial clickBotaoFiltroRecebiveis() {
		click(pgoAdesaoChequeEspecial.BOTAO_FILTAR_RECEBIVEIS);
		return this;
	}
	
	/**
	 * preenche o cheque
	 * @return
	 */
	public HlpAdesaoChequeEspecial preencheCheque() {
		aguardarLoadSistema();
		click(pgoAdesaoChequeEspecial.BOTAO_EXPANDIR_CHEQUES);
		click(pgoAdesaoChequeEspecial.BOTAO_CHECK_BOX_CHEQUE);
		return this;
	}
	
	public HlpAdesaoChequeEspecial updateBancoDb2() {
		Log.info("Atualizando Banco de Dados PCR" );
		new DBUTIL().updateBancoAdesaoChequeEspecial();
		return this;
	}
	
	public HlpAdesaoChequeEspecial updateBancosql() {
		Log.info("Atualizando Banco de Dados PCR SQL" );
		new DBUTIL().deleteBancoAdesaoChequeEspecialsQL();
		return this;
	}

}
