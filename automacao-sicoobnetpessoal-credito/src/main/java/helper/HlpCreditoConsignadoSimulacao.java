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

import pageObjects.PgoSimulacaoConsignado;
import support.MobileBank;
import uteis.Datapool;
import uteis.Log;
import util.db.DBUTIL;

public class HlpCreditoConsignadoSimulacao extends MobileBank<HlpCreditoConsignadoSimulacao> {

	public PgoSimulacaoConsignado pgoSimulacaoConsignado;
	public Datapool datapool;
	String dpArq = "creditoConsignadoSimulaçao.json";
	public DBUTIL DBUTIL;

	public HlpCreditoConsignadoSimulacao() {
		pgoSimulacaoConsignado = new PgoSimulacaoConsignado();
	}

	public Datapool getDp() {
		return new Datapool(dpArq);
	}
	
    /** Entra no menu do app **/
	public HlpCreditoConsignadoSimulacao acessarMenu() {
		aguardarLoadSistema();
		click(pgoSimulacaoConsignado.BOTAO_MENU);
		return this;
	}
    /** Primeiro ele pesquisa Consignado e depois clica em Consignado **/
	public HlpCreditoConsignadoSimulacao acessarMenuCreditoConsignado(Object busca) {
		preencheCampo(pgoSimulacaoConsignado.CAMPO_BUSCAR, busca);
		click(pgoSimulacaoConsignado.MENU_CONSIGNADO);
		return this;
	}
	/** Clicar em Simulação **/
	public HlpCreditoConsignadoSimulacao clicarSimulacaoConsignado() {
		click(pgoSimulacaoConsignado.BOTAO_COMECAR_SIMULACAO);
		return this;
	}
	/** Preenche os dados da simulação 
	 * @param opcao **/
	public HlpCreditoConsignadoSimulacao preencherComboConvenio(Object opcao) {
		aguardarLoadSistema();
        preencherComboFiscalizacao(pgoSimulacaoConsignado.COMBO_CONVENIO, opcao);
		return this;
	}
	public HlpCreditoConsignadoSimulacao preencherCampoValorConsignado(Object valor) {
		aguardarLoadSistema();
		click(pgoSimulacaoConsignado.CAMPO_VALOR_CONSIG);
		preencheCampo(pgoSimulacaoConsignado.CAMPO_VALOR_CONSIG, valor);
		return this;
	}
	public HlpCreditoConsignadoSimulacao preencherCampoValorCelular(Object celular) {
		click(pgoSimulacaoConsignado.CAMPO_CEL_CONSIGNADO);
		preencheCampo(pgoSimulacaoConsignado.CAMPO_CEL_CONSIGNADO, celular);
		return this;
	}
	/** Clica no botão Simular **/
	public HlpCreditoConsignadoSimulacao clicarSimular() {
		click(pgoSimulacaoConsignado.BOTAO_SIMULAR);
		return this;
	}
	/** ele espera a proposta aparecer no Banco de dados(cre.simulacaoplanopagamento),
	 *  depois pega o IDNSUPLANOPAGAMENTO**/
	public String getIDsimulacaopag(String idPessoa, String idIsnt, String tempo) {
		esperarAparecerNoBancoSimulção(idPessoa, idIsnt, tempo);
		String idSimulacaoPag = new DBUTIL().getIDSimPlanoPagamento(idPessoa, idIsnt, tempo);
	    Log.info("Obtendo o id da simulação pagamento: "+ idSimulacaoPag);
		return idSimulacaoPag;
	}
    /**Clica na quantidade de parcelas **/
	public HlpCreditoConsignadoSimulacao escolherParcela() {
		click(pgoSimulacaoConsignado.BOTAO_PARCELA);
		return this;
	}
	
	
    /** Clica no botão continuar Proposta **/
	public HlpCreditoConsignadoSimulacao clicarBotaoContinuarComProposta() {
		aguardarLoadSistema();
		click(pgoSimulacaoConsignado.BOTAO_CONTINUAR_PROPOSTA);
		return this;
	}
    /** Clica em continuar a proposta na tela de orientação **/
	public HlpCreditoConsignadoSimulacao OrientacaoConTinuarComAProposta() {
		swipe(ScrollDirection.DOWN, pgoSimulacaoConsignado.BOTAO_CONTINUAR_PROPOSTA,
				pgoSimulacaoConsignado.BTN_SCROLL_GERAL);
		return this;
	}
	
	public HlpCreditoConsignadoSimulacao validarOrientacaoConTinuarComAProposta(Object msg) {
		aguardarLoadSistema();
		aguardaElementoSerVisivel(pgoSimulacaoConsignado.MSG_ORIENTACAO);
		pontoVerificacaoGeneric(pgoSimulacaoConsignado.MSG_ORIENTACAO.getText().contains((CharSequence) msg),
				"Verificar se content-desc  contem (" + msg + ")",
				pgoSimulacaoConsignado.MSG_ORIENTACAO.getText(), msg);
		return this;
	}
	/** Clica na opcão foto, depois na anexar foto, ai escolhe a opção tirar foto,
	 *  ai sim ele tira a foto e confirma a foto**/
	public HlpCreditoConsignadoSimulacao clicafoto() {
		aguardarLoadSistema();
		click(pgoSimulacaoConsignado.CLICAR_FOTO);
		return this;
	}
	public HlpCreditoConsignadoSimulacao clicaEmAnexarFoto() {
		click(pgoSimulacaoConsignado.CLICAR_ANEXAR_FOTO);
		return this;
	}
	public HlpCreditoConsignadoSimulacao clicaNaFoto() {
		click(pgoSimulacaoConsignado.ACESSAR_FOTO);
		return this;
	}
	public HlpCreditoConsignadoSimulacao tirarFoto() {
		click(pgoSimulacaoConsignado.TIRAR_FOTO);
		return this;
	}
	public HlpCreditoConsignadoSimulacao botaoConfirmarFoto() {
		click(pgoSimulacaoConsignado.BOTAO_CONFIRMAR_FOTO);
		return this;
	}
	/** Escolhe a opção 3 por 4 e salva a foto **/
	public HlpCreditoConsignadoSimulacao Clica3por4() {
		click(pgoSimulacaoConsignado.CLICAR_3POR4);
		return this;
	}
	public HlpCreditoConsignadoSimulacao clicaEditarfoto() {
		click(pgoSimulacaoConsignado.EDITAR_FOTO);
		return this;
	}
	/** Clica na botão salvar **/
	public HlpCreditoConsignadoSimulacao clicarbotaoSalvar() {
		aguardaElementoSerVisivel(pgoSimulacaoConsignado.BOTAO_SALVAR);
		click(pgoSimulacaoConsignado.BOTAO_SALVAR);
		return this;
	}
	/** Clica na cheackBox desconto **/
	public HlpCreditoConsignadoSimulacao confirmarCheckBoxDesconto() {
		aguardarLoadSistema();
		click(pgoSimulacaoConsignado.CHECKBOX_DESCONTO);
		return this;
	}
	/** Faz scroll até o botão assinar e depois clica na cheackbox Concordância **/
	public HlpCreditoConsignadoSimulacao confirmarCheckBoxConcordancia() {
		swipe(ScrollDirection.DOWN, pgoSimulacaoConsignado.CHECKBOX_CONCORDANCIA, pgoSimulacaoConsignado.BTN_SCROLL_GERAL);
		click(pgoSimulacaoConsignado.CHECKBOX_CONCORDANCIA);
		return this;
	}
	/** Preenche o campo senha com a senha   **/
	public HlpCreditoConsignadoSimulacao preencherCampoSenha(Object senha) {
		swipe(ScrollDirection.DOWN, pgoSimulacaoConsignado.BOTAO_SENHA, pgoSimulacaoConsignado.BTN_SCROLL_GERAL);
		click(pgoSimulacaoConsignado.CAMPO_SENHA);
		preencheCampo(pgoSimulacaoConsignado.CAMPO_SENHA, senha);
		return this;
	}
	/** Clica no botão assinar  **/
	public HlpCreditoConsignadoSimulacao clicarBotaoAssinar() {
		click(pgoSimulacaoConsignado.BOTAO_SENHA);
		return this;
	}
	/** valida se a mensagem "Contrato Enviado" aparece na tela   **/
	public HlpCreditoConsignadoSimulacao verificarContratoEnviado(String msg) {
		aguardarLoadSistema();
		pontoVerificacaoGeneric(
				pgoSimulacaoConsignado.VERIFIICA_CONTRATO_CORRETO.getText().contains(msg),
				"Verificar se content-desc  contem (" + msg + ")",
				pgoSimulacaoConsignado.VERIFIICA_CONTRATO_CORRETO.getText(), msg);
		return this;
	}
	/** pega o tempo de execução  **/
	public String getDataHora() {
		Calendar c = new GregorianCalendar(); 
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		c.add(Calendar.MINUTE, -2); 
		c.add(Calendar.HOUR, -1); 
        String tempo = sd.format(c.getTime());
//        c.add(Calendar.MINUTE, -1); 
//        String tempo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime());
		Log.info("Pegando tempo na hora do click = " + tempo);
		return tempo;

	}
	/** Valida se há erro na coluna DESCERROOPERAÇÃO da tabela CRE.HISTGRAVACAOOPERACAOCREDITO e retorna esse erro  **/
	public HlpCreditoConsignadoSimulacao validarSePropostaEstaComErro(String idpagamento) {
		String descErro = new DBUTIL().validarSimulcaoPassou(idpagamento);
		String erroesperado = null;
		Log.info("Situação encontrada na base: " + descErro + " / Situacao esperada: " + erroesperado);
		boolean assertion = (descErro == null) ? true : false;
		pontoVerificacaoGeneric(assertion, "Verificar se ha erro na coluna DESCERROOPERACAO: " + erroesperado, descErro,
				erroesperado);
		return this;
	}
	/** Valida se a proposta foi pra mesa de operação.
	 * Ele pega o idoperacaocredito na tabela cre.simulacaoplanopagamento e 
	 * valida se ele esta na tabela de cre.operacaocreditodigitalconsignado  **/
	public HlpCreditoConsignadoSimulacao validarPropostaEstaNaMesaOprecao(String parcela, String idpagamento) {
		String idoperacaocredito = new DBUTIL().getIdOperacao(parcela, idpagamento);
		String idoperacaoEstudo = new DBUTIL().getidoperacaoEstudo(idoperacaocredito);
		Log.info("Situacao encontrada na base: " + idoperacaoEstudo + " / Situacao esperada: " + idoperacaocredito);
		pontoVerificacaoGeneric(!idoperacaoEstudo.isEmpty(), "Verificar se contem: " + idoperacaocredito,
				idoperacaoEstudo, idoperacaocredito);
		return this;
	}
	/** Valida se a Proposta chegou no banco de dados na tabela CRE.HISTGRAVACAOOPERACAOCREDITO, ele faz isso a cada 5 segundos dentro de 60s, 
	 * quando ele acha a proposta na tabela ele sai do looping 
	 *   **/
	public void validarPropostaChegouNoBancoDeDados(String idpagamento) {
		LocalDateTime tempoInicial = LocalDateTime.now();
		Long diffTempoSeg = Duration.between(tempoInicial, LocalDateTime.now()).getSeconds();
		String busca = null;

		while (diffTempoSeg <= 180) {

			diffTempoSeg = Duration.between(tempoInicial, LocalDateTime.now()).getSeconds();
			if (diffTempoSeg % 5 == 0) {
				busca = new DBUTIL().validarProstaEstaNoBDS(idpagamento);
				Log.info(" Esperando busca aparecer: " + busca);
			}

			if (!busca.isEmpty()) {
				break;
			}

		}

	}
	/** Valida se a Proposta chegou no banco de dados na tabela cre.simulacaoplanopagamento, ele faz isso a cada 5 segundos dentro de 60s, 
	 * quando ele acha a proposta na tabela ele sai do looping   **/
	public void esperarAparecerNoBancoSimulção(String idPessoa, String idIsnt, String tempo) {
		LocalDateTime tempoInicial = LocalDateTime.now();
		Long diffTempoSeg = Duration.between(tempoInicial, LocalDateTime.now()).getSeconds();
		String busca = null;

		while (diffTempoSeg <= 120) {

			diffTempoSeg = Duration.between(tempoInicial, LocalDateTime.now()).getSeconds();
			if (diffTempoSeg % 5 == 0) {
				busca = new DBUTIL().getIDSimPlanoPagamento(idPessoa, idIsnt, tempo);
				Log.info(" Esperando busca aparecer: " + busca);
			}

			if (!busca.isEmpty()) {
				break;
			}

		}

	}
	
	public HlpCreditoConsignadoSimulacao exportaContrato(String msg) {
		swipe(ScrollDirection.DOWN, pgoSimulacaoConsignado.BOTAO_EXPORTA_CONTRATO,  pgoSimulacaoConsignado.BTN_SCROLL_GERAL);
		click(pgoSimulacaoConsignado.BOTAO_EXPORTA_CONTRATO);
		aguardarLoadSistema();
		click(pgoSimulacaoConsignado.ICON_PDF);
//		validarPDF(msg);
		click(pgoSimulacaoConsignado.BOTAO_VOLTAR_PDF);
		return this;
	}
	
	public HlpCreditoConsignadoSimulacao preencheCampoApelido() {
		aguardarLoadSistema();
		preencheCampo(pgoSimulacaoConsignado.CAMPO_APELIDO, gerarStringAleatoria());
		return this;
	}
	
	public HlpCreditoConsignadoSimulacao clicaBotaoConfirmar() {
		click(pgoSimulacaoConsignado.BOTAO_CONFIRMAR_DISPOSITIVO);
		return this;
	}
	
	public HlpCreditoConsignadoSimulacao clicaBotaoNaCooperativar() {
		aguardarLoadSistema();
		click(pgoSimulacaoConsignado.BOTAO_NACOOPERATIVA);
		return this;
	}
	
	public String pegarTextoCodigoCoop() {
		String i = pegarTextoElementoPorAtributo(pgoSimulacaoConsignado.CAMPO_TEXTO_COOP, "text");
		return i;
	}
	
	public HlpCreditoConsignadoSimulacao validarPDF(String msg) {
		pontoVerificacaoGeneric(
				pgoSimulacaoConsignado.MSG_PDF.getAttribute("content-desc").contains(msg),
				"Verificar se content-desc  contem (" + msg + ")",
				pgoSimulacaoConsignado.MSG_PDF.getAttribute("content-desc"), msg);
		return this;
	}
	
	public String getQuantidadeDeParcelas() {
		aguardarLoadSistema();
		String parcelas = pegarTextoElemento(pgoSimulacaoConsignado.QUANTIDADE_PARCELA);
		Log.info("Quantidade de parcelas: "+parcelas);
		return parcelas;
	}
	
	public HlpCreditoConsignadoSimulacao botaoAnexar() {
		aguardarLoadSistema();
		click(pgoSimulacaoConsignado.BOTAO_ANEXAR);
		return this;
	}
	
	public HlpCreditoConsignadoSimulacao acessarMenuArquivos() {
		aguardaElementoSerVisivel(pgoSimulacaoConsignado.MENU_ARQUIVOS);
		click(pgoSimulacaoConsignado.MENU_ARQUIVOS);
		return this;
	}
	
	public HlpCreditoConsignadoSimulacao acessarMenuImagens() {
		aguardaElementoSerVisivel(pgoSimulacaoConsignado.BOTAO_IMAGENS);
		click(pgoSimulacaoConsignado.BOTAO_IMAGENS);
		return this;
	}
	
	public HlpCreditoConsignadoSimulacao acessarCamera() {
		aguardaElementoSerVisivel(pgoSimulacaoConsignado.BOTAO_CAMERA);
		click(pgoSimulacaoConsignado.BOTAO_CAMERA);
		return this;
	}
	
	public HlpCreditoConsignadoSimulacao clicarFoto() {
		aguardaElementoSerVisivel(pgoSimulacaoConsignado.CAMPO_IMAGEM);
		click(pgoSimulacaoConsignado.CAMPO_IMAGEM);
		return this;
	}
	
	

}
