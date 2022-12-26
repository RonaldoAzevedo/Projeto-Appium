package helper;


import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.MobileElement;
import pageObjects.PgoSimulacaoFinanciamento;
import support.MobileBank;
import uteis.Datapool;
import uteis.Log;
import util.db.DBUTIL;
public class HlpCreditoFinanciamento extends MobileBank<HlpCreditoFinanciamento> {

	public PgoSimulacaoFinanciamento pgoSimulacaoFinanciamento;
	public Datapool datapool;
	String dpArq = "creditoFinanciamento.json";
	public DBUTIL DBUTIL;

	public HlpCreditoFinanciamento() {
		pgoSimulacaoFinanciamento = new PgoSimulacaoFinanciamento();
	}

	public Datapool getDp() {
		return new Datapool(dpArq);
	}
	
    /** Acessa o menu da aplicação**/
	public HlpCreditoFinanciamento acessarMenu() {
		aguardarLoadSistema();
		click(pgoSimulacaoFinanciamento.BOTAO_MENU);
		return this;
	}

	/**
	 * Pesquisa Financiamento de Veiculo no campo de busca
	 * @param busca
	 * @return
	 */
	public HlpCreditoFinanciamento pequisarFinaciamentoCarro(Object busca) {
		preencheCampo(pgoSimulacaoFinanciamento.CAMPO_BUSCAR, busca);
		click(pgoSimulacaoFinanciamento.ACESSAR_FINCIAMENTO_DE_VEICULO);
		return this;
	}
    
	/**
	 * clica no botao simulação 
	 * @return
	 */
	public HlpCreditoFinanciamento acessarSimulacao() {
		click(pgoSimulacaoFinanciamento.ACESSAR_SIMULACAO);
		return this;
	}

    /**
     * preenche o combo de quilometragem
     * @param opcao
     * @return
     */
	public HlpCreditoFinanciamento prencherComboZeroKm(Object opcao) {
		aguardarLoadSistema();
		preencherComboFiscalizacao(pgoSimulacaoFinanciamento.COMBO_ZERO_KM, opcao);
		return this;
	}
    
	/**
	 * preenche o combo com o tipo de veiculo
	 * @param opcao
	 * @return
	 */
	public HlpCreditoFinanciamento preencherComboTipoVeiculo(Object opcao) {
		aguardarLoadSistema();
		preencherComboFiscalizacao(pgoSimulacaoFinanciamento.COMBO_TIPO_VEICULO, opcao);
		return this;
	}
    
    /**
     * preenche o campo Ano do carro 
     * @param ano
     * @return
     */
	public HlpCreditoFinanciamento preencherCampoAnoCarro(Object ano) {
		click(pgoSimulacaoFinanciamento.CAMPO_ANO_CARRO);
		preencheCampo(pgoSimulacaoFinanciamento.CAMPO_ANO_CARRO, ano);
		return this;
	}
    
	/**
	 * preenche o campo valor veiculo 
	 * @param valor
	 * @return
	 */
	public HlpCreditoFinanciamento preencherCampoValorCarro(Object valor) {
		swipe(ScrollDirection.DOWN, pgoSimulacaoFinanciamento.BOTAO_SIMULAR, pgoSimulacaoFinanciamento.BTN_SCROLL_GERAL);
		click(pgoSimulacaoFinanciamento.CAMPO_VALOR_CARRO);
		preencheCampo(pgoSimulacaoFinanciamento.CAMPO_VALOR_CARRO, valor);
		return this;
	}
    
	/**
	 * preenche o campo valor do financimento
	 * @param valor
	 * @return
	 */
	public HlpCreditoFinanciamento preencherCampoFinanciamentoCarro(Object valor) {
		click(pgoSimulacaoFinanciamento.CAMPO_VALOR_FINANCIAMENTO);
		preencheCampo(pgoSimulacaoFinanciamento.CAMPO_VALOR_FINANCIAMENTO, valor);
		return this;
	}
    
	/**
	 * preenche o campo telefone 
	 * @param telefone
	 * @return
	 */
	public HlpCreditoFinanciamento preencherCampoTelefone(Object telefone) {
		click(pgoSimulacaoFinanciamento.CAMPO_TELEFONE);
		preencheCampo(pgoSimulacaoFinanciamento.CAMPO_TELEFONE, telefone);
		return this;
	}
	
    /**
     * clica no botão simular 
     * @return
     */
	public HlpCreditoFinanciamento clicaBotaoSimular() {
		click(pgoSimulacaoFinanciamento.BOTAO_SIMULAR);
		return this;
	}
    
	/**
	 * clica no botão selecionar 
	 * @return
	 */
	public HlpCreditoFinanciamento clicarBotaoSelecionar() {
		click(pgoSimulacaoFinanciamento.BOTAO_SELECIONAR);
		return this;
	}
    
	/**
	 * valida se o preço de entrada esta correto
	 * @param msg
	 * @return
	 */
	public HlpCreditoFinanciamento validarPrecoCarroEntrada(String msg) {
		aguardarLoadSistema();
		pontoVerificacaoGeneric(
				pgoSimulacaoFinanciamento.MSG_PRECO_CARRO_FINAN.getText().contains(msg),
				"Verificar se content-desc  contem (" + msg + ")",
				pgoSimulacaoFinanciamento.MSG_PRECO_CARRO_FINAN.getText(), msg);
		return this;
	}
    
	/**
	 * clica no botão avançar com a proposta
	 * @return
	 */
	public HlpCreditoFinanciamento clicaBotaoAvancarProposta() {
		click(pgoSimulacaoFinanciamento.BOTAO_AVANCAR_PROPOSTA);
		return this;
	}
    
	/**
	 *faz um scrool até o botão entendi e depoi clica nele  
	 * @return
	 */
	public HlpCreditoFinanciamento procuraEntendiOrientacao() {
		swipe(ScrollDirection.DOWN, pgoSimulacaoFinanciamento.BOTAO_ENTENDI_PROPOSTA_EVIADO,
				pgoSimulacaoFinanciamento.BTN_SCROLL_GERAL);
//		TouchActions action = new TouchActions(getDriver());
//		action.scroll( 10, 100);
//		action.perform();
		return this;
	}
	
	public HlpCreditoFinanciamento clickEntendiOrientacao() {
		clickDimensionado(pgoSimulacaoFinanciamento.BOTAO_ENTENDI2, 450);
		return this;
	}
	
	public HlpCreditoFinanciamento validarOrientacao(Object msg) {
		aguardarLoadSistema();
		pontoVerificacaoGeneric(pgoSimulacaoFinanciamento.MSG_ORIENTACAO.getText().contains((String)msg),
				"Verificar se content-desc  contem (" + msg + ")",
				pgoSimulacaoFinanciamento.MSG_ORIENTACAO.getText(), msg);
		return this;
	}
    
	/**
	 * preenche o comobo tipo de Carro com a opcao
	 * @param opcao
	 * @return
	 */
	public HlpCreditoFinanciamento preencherCombotipoCarro(Object opcao) {
		aguardarLoadSistema();
		swipe(ScrollDirection.DOWN, pgoSimulacaoFinanciamento.COMBO_TIPO_CARRO, pgoSimulacaoFinanciamento.BTN_SCROLL_GERAL);
		aguardaElemento(pgoSimulacaoFinanciamento.COMBO_TIPO_CARRO);
		preencherComboFiscalizacao(pgoSimulacaoFinanciamento.COMBO_TIPO_CARRO, opcao);
		return this;
	}

    /**
     * preenche o combo com o modelo do carro 
     * @param opcao
     * @return
     */
	public HlpCreditoFinanciamento preencherComboModeloCarro(Object opcao) {
		aguardarLoadSistema();
        preencherComboFiscalizacao(pgoSimulacaoFinanciamento.COMBO_MODELO_CARRO, opcao);
		return this;
	}

    /**
     * preenche o combo ano do modelo 
     * @param opcao
     * @return
     */
	public HlpCreditoFinanciamento preencherComboAnoModelo(Object opcao) {
		aguardarLoadSistema();
		preencherComboFiscalizacao(pgoSimulacaoFinanciamento.COMBO_ANO_MODELO, opcao);
		return this;
	}

    /**
     * preenche o combo UF
     * @param opcao
     * @return
     */
	public HlpCreditoFinanciamento preencherComboUF(Object opcao) {
		preencherComboFiscalizacao(pgoSimulacaoFinanciamento.COMBO_UF, opcao);
		return this;
	}
    
    /**
     * preenche o campo nome do vendedor
     * @param nome
     * @return
     */
	public HlpCreditoFinanciamento preencherCampoNomeVendedor(Object nome) {
		clickContextoWeb(pgoSimulacaoFinanciamento.CAMPO_NOME_VEDENDOR);
		preencheCampoContextoWeb(pgoSimulacaoFinanciamento.CAMPO_NOME_VEDENDOR, nome);
		return this;
	}
    
	/**
	 * preenche o campo CPF/CNPJ do vendedor
	 * @param cpfcnpj
	 * @return
	 */
	public HlpCreditoFinanciamento preencherCPFCNPJVendedor(Object cpfcnpj) {
		preencheCampoContextoWeb(pgoSimulacaoFinanciamento.CAMPO_VENDEDOR_CPF_CNPJ, cpfcnpj);
		return this;
	}
    
	/**
	 * preenche campo do codigo do banco
	 * @param codBanco
	 * @return
	 */
	public HlpCreditoFinanciamento preencherCodBanco(Object codBanco) {
		preencheCampoContextoWeb(pgoSimulacaoFinanciamento.CAMPO_VENDEDOR_COD_BANCO, codBanco);
		return this;
	}
    
	/**
	 * preenche o campo agencia do vendedor 
	 * @param agencia
	 * @return
	 */
	public HlpCreditoFinanciamento preencherAgenciaVendedor(Object agencia) {
		preencheCampoContextoWeb(pgoSimulacaoFinanciamento.CAMPO_VENDEDOR_AGENCIA_VEDENDOR, agencia);
		return this;
	}
    
	/**
	 * preenche o campo conta com a conta do vendedor
	 * @param conta
	 * @return
	 */
	public HlpCreditoFinanciamento preencherContaVendedor(Object conta) {
		preencheCampoContextoWeb(pgoSimulacaoFinanciamento.CAMPO_VENDEDOR_CONTA_CORRENTE, conta);
		return this;
	}
    
	/**
	 * preenche o campo telefone do vendedor 
	 * @param telefone
	 * @return
	 */
	public HlpCreditoFinanciamento preencherTelefoneVendedor(Object telefone) {
		preencheCampoContextoWeb(pgoSimulacaoFinanciamento.CAMPO_VENDEDOR_TELEFONE, telefone);
		return this;
	}
    
	/**
	 * preenche o campo email do vendedor 
	 * @param email
	 * @return
	 */
	public HlpCreditoFinanciamento preencherEmailVendedor(Object email) {
		preencheCampoContextoWeb(pgoSimulacaoFinanciamento.CAMPO_VENDEDOR_EMAIL, email);
		return this;
	}

	/**
	 * clica no botão continuar com a proposta  
	 * @return
	 */
	public HlpCreditoFinanciamento clicaBotaoContinuarProposta() {
		clickContextoWeb(pgoSimulacaoFinanciamento.BOTAO_CONTINUAR_PROPOSTA);
		return this;
	}
    
	/**
	 * clica na cheakBox Concordancia
	 * @return
	 */
	public HlpCreditoFinanciamento checkboxConcordancia() {
		aguardarLoadSistema();
		click(pgoSimulacaoFinanciamento.CHECKBOX_CONCORDANCIA);
		return this;
	}
    
	/**
	 * clica no botão enviar proposta
	 * @return
	 */
	public HlpCreditoFinanciamento clicaBotaoEnviarProposta() {
		swipe(ScrollDirection.DOWN, pgoSimulacaoFinanciamento.BOTAO_ENVIAR_PRPOSTA,
				pgoSimulacaoFinanciamento.BTN_SCROLL_GERAL);
		click(pgoSimulacaoFinanciamento.BOTAO_ENVIAR_PRPOSTA);
		return this;
	}
    
	/**
	 * verifica se a mensagem condiz com a massa 
	 * @param msg
	 * @return
	 */
	public HlpCreditoFinanciamento verifacaMsgEviado(String msg) {
		aguardarLoadSistema();
		pontoVerificacaoGeneric(pgoSimulacaoFinanciamento.MSG_PROSTA_ENVIADA.getText().contains(msg),
				"Verificar se content-desc  contem (" + msg + ")",
				pgoSimulacaoFinanciamento.MSG_PROSTA_ENVIADA.getText(), msg);
		return this;
	}
    
	/**
	 * clica no botão entendi 
	 */
	public HlpCreditoFinanciamento clicaBotaoEtendi() {
		click(pgoSimulacaoFinanciamento.BOTAO_ENTENDI);
		return this;
	}

	/** pega o tempo de execução **/
	public String getDataHora() {
		Calendar c = new GregorianCalendar(); 
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		c.add(Calendar.MINUTE, -2); 
		c.add(Calendar.HOUR, -1); 
        String tempo = sd.format(c.getTime());
		Log.info("Pegando tempo na hora do click = " + tempo);
		return tempo;

	}

	/**
	 * ele espera a proposta aparecer no Banco de
	 * dados(cre.simulacaoplanopagamento), depois pega o IDNSUPLANOPAGAMENTO
	 **/
	public String getIDsimulacaopag(String idPessoa, String idIsnt, String tempo) {
		aguardarLoadSistema();
		esperarAparecerNoBancoSimulção(idPessoa, idIsnt, tempo);
		String idSimulacaoPag = new DBUTIL().getIDSimPlanoPagamento(idPessoa, idIsnt, tempo);
		Log.info("Obtendo o id da simulação pagamento: " + idSimulacaoPag);
		return idSimulacaoPag;
	}

	/**
	 * Valida se a Proposta chegou no banco de dados na tabela
	 * cre.simulacaoplanopagamento, ele faz isso a cada 5 segundos dentro de 60s,
	 * quando ele acha a proposta na tabela ele sai do looping
	 **/
	public void esperarAparecerNoBancoSimulção(String idPessoa, String idIsnt, String tempo) {
		LocalDateTime tempoInicial = LocalDateTime.now();
		Long diffTempoSeg = Duration.between(tempoInicial, LocalDateTime.now()).getSeconds();
		String busca = null;

		while (diffTempoSeg <= 60) {

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

	/**
	 * Valida se a Proposta chegou no banco de dados na tabela
	 * CRE.HISTGRAVACAOOPERACAOCREDITO, ele faz isso a cada 5 segundos dentro de
	 * 60s, quando ele acha a proposta na tabela ele sai do looping
	 **/
	public void validarPropostaChegouNoBancoDeDados(String idpagamento) {
		LocalDateTime tempoInicial = LocalDateTime.now();
		Long diffTempoSeg = Duration.between(tempoInicial, LocalDateTime.now()).getSeconds();
		String busca = null;

		while (diffTempoSeg <= 120) {

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

	/**
	 * Valida se há erro na coluna DESCERROOPERAÇÃO da tabela
	 * CRE.HISTGRAVACAOOPERACAOCREDITO e retorna esse erro
	 **/
	public HlpCreditoFinanciamento validarSePropostaEstaComErro(String idpagamento) {
		String descErro = new DBUTIL().validarSimulcaoPassou(idpagamento);
		String erroesperado = null;
		Log.info("Situação encontrada na base: " + descErro + " / Situacao esperada: " + erroesperado);
		boolean assertion = (descErro == null) ? true : false;
		pontoVerificacaoGeneric(assertion, "Verificar se ha erro na coluna DESCERROOPERACAO: " + erroesperado, descErro,
				erroesperado);
		return this;
	}

	/**
	 * Valida se a proposta foi pra mesa de operação. Ele pega o idoperacaocredito
	 * na tabela cre.simulacaoplanopagamento e valida se ele esta na tabela de
	 * cre.operacaocreditodigitalconsignado
	 **/
	public HlpCreditoFinanciamento validarPropostaEstaNaMesaOprecao(String parcela, String idpagamento) {
		String idoperacaocredito = new DBUTIL().getIdOperacao(parcela, idpagamento);
		String idoperacaoEstudo = new DBUTIL().getidoperacaoEstudo(idoperacaocredito);
		Log.info("Situacao encontrada na base: " + idoperacaoEstudo + " / Situacao esperada: " + idoperacaocredito);
		pontoVerificacaoGeneric(!idoperacaoEstudo.isEmpty(), "Verificar se contem: " + idoperacaocredito,
				idoperacaoEstudo, idoperacaocredito);
		return this;
	}
//	public HlpCreditoFinanciamento clicaComboZeroKm2(Object prazo) {
//		aguardarLoadSistema();
//		click(pgoSimulacaoFinanciamento.COMBO_ZERO_KM.findElement(By.xpath("//android.widget.ListView")));
//		
//		
//		selecionarCombo(pgoSimulacaoFinanciamento.COMBO_ZERO_KM.findElement(By.xpath("//android.widget.ListView")), new ByXPath("//android.view.View[@content-desc='" + prazo + "']"));
//		return this;
//	}
	
	public String obterDataAno() {

		Calendar c = new GregorianCalendar();
		String tempo = new SimpleDateFormat("yyyy").format(c.getTime());
		return tempo;
	}
	
	protected void clickContextoWeb(WebElement elemento) {
		Log.info("Realizando clique no elemento: " + getReferenceNameElement(elemento));
		try {
			aguardaElemento(elemento).click();		
		} catch (Exception e) {
			new Actions(getDriver()).click(aguardaElemento(elemento)).perform();;
		}
	}
	
	protected void preencheCampoContextoWeb(WebElement elemento, Object valor) {
		Log.info("Realizando clique no elemento: " + getReferenceNameElement(elemento) + " com o valor: " + valor);
		try {
			aguardaElemento(elemento).sendKeys((String) valor);			
		} catch (Exception e) {
			new Actions(getDriver()).sendKeys(aguardaElemento(elemento), (String) valor).perform();	
		}
	}

}
