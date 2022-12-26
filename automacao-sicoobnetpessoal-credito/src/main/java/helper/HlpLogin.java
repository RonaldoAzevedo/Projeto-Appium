package helper;

import java.util.List;
import java.util.Map;
import io.qameta.allure.Allure;
import pageObjects.PgoLogin;
import support.ConexoesDB2;
import support.ConexoesSQL;
import support.MobileBank;
import uteis.Cas;
import uteis.Datapool;
import uteis.DateUtilities;

public class HlpLogin extends MobileBank<HlpLogin> {

	public PgoLogin pg;
	private String apelidoDispositivo = "AUTOMACAO" + DateUtilities.getData("ddMMHHmmss");
	public Datapool datapool;
	private final Map<String, String> mensagens, scripts;
	public Datapool usr;

	public HlpLogin() {
		pg = new PgoLogin();
		datapool = new Datapool("login.json");
		mensagens = datapool.getMap("MENSAGENS");
		scripts = datapool.getMap("SCRIPTS");
		usr = new Datapool("usuarios.json");

	}
	public  String gerarTicket(String conta, String password, String cooperativa ) {
		return new Cas(conta, password, cooperativa ).obterST_Token_V3();
	}

	public String getScripts(String value) {
		return scripts.get(value);
	}

	/**
	 * Metodo as mensagens de bloqueio, e de login bloqueado
	 * 
	 * @param value
	 * @return
	 */
	public String[] getMensagem(String value) {
		return mensagens.get(value).split(";");
	}

	public void checkLembrarConta(boolean check) {
		try {
			if (!pg.CHECK_LEMBRAR_CONTA.getAttribute("checked").equalsIgnoreCase(String.valueOf(check))) {
				click(pg.CHECK_LEMBRAR_CONTA);
			}
		} catch (Exception e) {
			if (!pg.CHECK_LEMBRAR_CONTA.getAttribute("value").equalsIgnoreCase(String.valueOf((check)))) {
				click(pg.CHECK_LEMBRAR_CONTA);
			}
		}
	}

	public void preencheApelido(String apelido) {
		click(pg.CAMPO_APELIDO);
		preencheCampo(pg.CAMPO_APELIDO, apelido);
	}

	public void preencheCooperativa(Object valor) {
		preencheCampo(pg.CAMPO_COOPERATIVA, valor);
	}

	public void preencheContaCorrente(Object valor) {
		preencheCampoSendKeys(pg.CAMPO_CONTA_CORRENTE, valor.toString());
	}

	public void preencheSenha(Object valor) {
		preencheCampo(pg.CAMPO_SENHA_CONTA, valor);
	}

	public void preencheCooperativaClick(String valor) {
		click(pg.CAMPO_COOPERATIVA);
		preencheCampo(pg.CAMPO_COOPERATIVA, valor);
	}

	public void preencheContaCorrenteClick(String valor) {
		click(pg.CAMPO_CONTA_CORRENTE);
		preencheCampoSendKeys(pg.CAMPO_CONTA_CORRENTE, valor);
	}

	public void preencheSenhaClick(String valor) {
		click(pg.CAMPO_SENHA_CONTA);
		preencheCampo(pg.CAMPO_SENHA_CONTA, valor);
	}

	public void pressionarBotaoEntrar() {
		click(pg.BOTAO_ENTRAR);
	}

	public void pressionarBotaoVoltar() {
		click(pg.BOTAO_VOLTAR_MENSAGEM);
	}

	public void pressionarVoltar() {
		click(pg.ICONE_VOLTAR);
	}

	public void pressionaBotaoAcessarComSenhaMSG() {
		click(pg.BOTAO_ACESSAR_COM_SENHA);
	}

	public void verificarCamposObrigatorios(Object baseline) {
		aguardarLoadSistema();
		pontoVerificacao(baseline);
		anexaEvidencia(casoTeste);
	}

	public void verificarSenhaMenorOitoCarac(Object baseline) {
		pontoVerificacao(baseline);
		anexaEvidencia(casoTeste);
	}

	public void validaMensagens(Object baseline) {
		aguardarLoadSistema();
		pontoVerificacao(baseline);
		anexaEvidencia(casoTeste);
	}

	public void validaLoginSucesso() {
		aguardarLoadSistema();
		aguardaElemento(pg.BOTAO_MENU);
		anexaEvidencia(casoTeste);
	}

	/**
	 * Método para realizar login no APP
	 * 
	 * @param coop
	 * @param conta
	 * @param senha
	 */
	public void acessaConta(Object coop, Object conta, Object senha) {
		defineTelaInicial();
		Allure.addAttachment("Cooperativa: ", coop.toString());
		Allure.addAttachment("Conta Corrente: ", conta.toString());
		preencheCooperativa(coop.toString());
		preencheContaCorrente(conta.toString());
		checkLembrarConta(false);
		preencheSenha(senha.toString());
		pressionarBotaoEntrar();
		if (SO.equalsIgnoreCase("IOS")) {
			pg.TEXTO_MIGALHA.isDisplayed();
		} else {
			descartaCampanha();
			aguardaElemento(pg.TEXTO_MIGALHA);
		}

	}

	public void acessaContaSimulacao(Object coop, Object conta, Object senha) {
		defineTelaInicial();
		Allure.addAttachment("Cooperativa: ", coop.toString());
		Allure.addAttachment("Conta Corrente: ", conta.toString());
		preencheCooperativa(coop.toString());
		preencheContaCorrente(conta.toString());
		checkLembrarConta(false);
		preencheSenha(senha.toString());
		pressionarBotaoEntrar();

	}

	/**
	 * Método para realizar login no APP e manter a conta salva
	 * 
	 * @param coop
	 * @param conta
	 * @param senha
	 */
	public void acessaContaELembrar(String coop, String conta, String senha) {
		defineTelaInicial();
		Allure.addAttachment("COOP: ", coop.toString());
		Allure.addAttachment("CONTA: ", conta.toString());
		preencheCooperativa(coop);
		preencheContaCorrente(conta);
		checkLembrarConta(true);
		preencheSenha(senha);
		pressionarBotaoEntrar();
		solicitaRecusaNotificacoes();
		if (SO.equalsIgnoreCase("IOS")) {
			pg.TEXTO_MIGALHA.isDisplayed();
		} else {
			descartaCampanha();
			aguardaElemento(pg.TEXTO_MIGALHA);
		}
	}

	/*
	 * //TO DO - Melhorar esse método
	 */

	public void descartaCampanha() {
		aguardarLoadSistema();
		try {
			login.BOTAO_OK_ESTOU_CIENTE.isDisplayed();
			click(login.BOTAO_OK_ESTOU_CIENTE);
		} catch (Exception e4) {
			// TODO: handle exception
		}
		try {
			menu.BOTAO_NAO.isDisplayed();
			click(pg.BOTAO_NAO);
		} catch (Exception e) {

		}

	}

	public void solicitaRecusaNotificacoes() {
		aguardarLoadSistema();
		try {
			aguardaElemento(pg.MODAL_NOTIFICACOES_TRANSACOES);
			click(pg.BOTAO_NAO);
		} catch (Exception e) {
			aguardaElemento(pg.TEXTO_MIGALHA);
		}
	}

	public void acessaContaBloqueada(Object coop, Object conta, Object senha) {
		defineTelaInicial();
		preencheCooperativa(coop);
		preencheContaCorrente(conta);
		preencheSenha(senha);
		pressionarBotaoEntrar();
	}

	public void pressionaBotaoCancelarMSG() {
		aguardaElemento(pg.BOTAO_CANCELAR);
		click(pg.BOTAO_CANCELAR);
	}

	public void validaSenhaBloqueada(String casoTeste, String cooperativa, String conta, String senha) {
		anexaDescricao(casoTeste);
		acessaContaBloqueada(cooperativa, conta, senha);
		validaMensagens(mensagens.get("LOGIN_BLOQUEADO"));
		pontoVerificacaoGeneric(pg.BOTAO_ESQUECISENHA.isEnabled(), "Valida botão ESQUECI A SENHA",
				String.valueOf(pg.BOTAO_ESQUECISENHA.isEnabled()), "true");
		click(pg.BOTAO_VOLTAR);
	}

	public void resetaSenhaBloqueada(String cooperativa, String conta) {
		update(montaConexaoSQL("BDAutenticacaoHomol", ConexoesSQL.SQLHI),
				String.format(scripts.get("liberaSenhaBloqueada"), cooperativa, conta));
	}

	public void liberacaoDispositivo(String cooperativa, String conta) {
		update(montaConexaoSQL("BDAutenticacaoHomol", ConexoesSQL.SQLHI),
				String.format(scripts.get("liberaCadastroDispositivo"), cooperativa, conta));
	}

	public String recuperaIdInstituicaoPorCooperativa(String cooperativa) {
		return select(ConexoesDB2.fromEnum(ConexoesDB2.CDM_TBP),
				String.format(scripts.get("recuperaIdInstituicao"), cooperativa)).get(0);
	}

	public String recuperaBaseSqlPorCooperativa(Object cooperativa) {
		return select(montaConexaoSQL("BDSRTB", ConexoesSQL.SQLH),
				String.format(scripts.get("recuperaNomeBaseDadosSQL"), cooperativa)).get(0);
	}

	public String recuperarContaFavorecido(String cooperativa) {
		return select(montaConexaoSQL(cooperativa, ConexoesSQL.SQLH), scripts.get("consultarContaFavorecido")).get(0);
	}

	public String recuperaDiaUtil(String cooperativa, String data) {
		String query = scripts.get("recuperaDiaUtil");
		return select(montaConexaoSQL(cooperativa, ConexoesSQL.SQLH), String.format(query, data)).get(0);
	}

	public List<String> recuperaDadosParticipanteconta(String cooperativa, String numcco) {
		String query = scripts.get("recuperaDadosParticipanteCCO");
		return select(montaConexaoSQL(cooperativa, ConexoesSQL.SQLH), String.format(query, numcco));
	}

	public String recuperaDataProduto(String cooperativa, String idProduto, String dias) {
		String query = scripts.get("retornaDataProduto");
		return select(montaConexaoSQL(cooperativa, ConexoesSQL.SQLH), String.format(query, dias, idProduto)).get(0);
	}

	public String recuperaCpfCnpj(String cooperativa, String conta) {
		if (cooperativa.contains("BDHOMOL_0001")) {
			return select(montaConexaoSQL(cooperativa, ConexoesSQL.SQLH),
					String.format(scripts.get("recuperaCpfCnpjPorConta"), conta)).get(0);
		} else {
			return select(montaConexaoSQL(cooperativa, ConexoesSQL.SQLH),
					String.format(scripts.get("recuperaCpfCnpjPorConta"), conta)).get(0);
		}
	}

	public String recuperaIdPessoa(String base, String conta) {
		String cpf = recuperaCpfCnpj(base, conta);
		return select(String.format(ConexoesDB2.fromEnum(ConexoesDB2.CLI_TBP),
				String.format(scripts.get("recuperaIdPessoaDB2"), cpf))).get(0);
	}

	public void deletaTransferenciasPorConta(String cooperativa, String ncco) {
		// TRANSFERENCIA CCO
		delete(montaConexaoSQL(cooperativa, ConexoesSQL.SQLH), String.format(scripts.get("deletaTransfCCO"), ncco));
		delete(montaConexaoSQL(cooperativa, ConexoesSQL.SQLH), String.format(scripts.get("deletaTransfPoup"), ncco));
		delete(montaConexaoSQL(cooperativa, ConexoesSQL.SQLH), String.format(scripts.get("deletaTransfTED"), ncco));
		delete(montaConexaoSQL(cooperativa, ConexoesSQL.SQLH), String.format(scripts.get("deletaTransfDOC"), ncco));
	}

	public void deletaLancamentosDb2(String numContaCorrente) {
		delete(ConexoesDB2.fromEnum(ConexoesDB2.CON_TBP),
				String.format(scripts.get("deletaLancamentosCCODB2"), numContaCorrente));
	}

	public void deletaLancamentosSql(String cooperativa, String numContaCorrente) {
		delete(montaConexaoSQL(cooperativa, ConexoesSQL.SQLH),
				String.format(scripts.get("deletaLancamentosCCOSQL"), numContaCorrente));
	}

	public String recuperaContaPoupanca(String contaCorrente, String cooperativa) {
		String idInstituicao = recuperaIdInstituicaoPorCooperativa(cooperativa);
		return select(ConexoesDB2.fromEnum(ConexoesDB2.INV_TBP),
				String.format(getScripts("recuperaContaPoupanca"), contaCorrente.toString(), idInstituicao.toString()))
				.get(0);
	}

	/**
	 * 
	 * @param dadosConexao
	 * @param contaCorrente
	 * @return Metodo que retorna o saldo da conta corrente
	 */
	public String consultaSaldoContaCorrente(String cooperativa, String contaCorrente) {
		String result = select(montaConexaoSQL(cooperativa, ConexoesSQL.SQLH),
				String.format(scripts.get("consultarSaldoCCO"), contaCorrente)).get(0);
		return String.format("%.2f", Double.parseDouble(result));
	}

	/**
	 * 
	 * @param dadosConexao
	 * @param contaCorrente
	 * @param valorLancamento
	 * @param transacao       - Operacao a ser realizada Saque ou DEPOSITO Metodo
	 *                        que realiza a operacao de SAQUE e DEPOSITO em Conta
	 *                        Corrente
	 */
	public void realizaOperacaoSaqueDeposito(String cooperativa, String contaCorrente, String valorLancamento,
			String transacao) {
		int operacao = 0;
		if (transacao.equalsIgnoreCase("SAQUE")) {
			operacao = 2;
		} else if (transacao.equalsIgnoreCase("DEPOSITO")) {
			operacao = 1;
		}
		insert(montaConexaoSQL(cooperativa, ConexoesSQL.SQLH), String.format(scripts.get("realizaOperacaoCCO"),
				contaCorrente, valorLancamento.replace(",", "."), String.valueOf(operacao)));
	}

	public void ajustaDataHoraProdutoCaixa(String cooperativa) {
		update(montaConexaoSQL(cooperativa, ConexoesSQL.SQLH), scripts.get("ajustaDataHoraCaixa"));
	}

	public void ajustaDataHoraProdutoCCOeCAP(String cooperativa) {
		update(montaConexaoSQL(cooperativa, ConexoesSQL.SQLH), scripts.get("ajustaDataHoraCCOCAP"));
	}

	/**
	 * Scripts utilizados para o Sicoob Auth
	 */

	public void solicitaCadastroDispositivoSicoobAuth(String cooperativa, String conta) {
		update(montaConexaoSQL(cooperativa, ConexoesSQL.SQLH),
				String.format(scripts.get("solicitaCadastroDispositivoSicoobAuth"), cooperativa, conta));
	}

	public void liberaDispositivoSicoobAuth(String coop, String conta) {
		String query = String.format(scripts.get("liberaDispositivoSicoobAuth"), coop + conta, apelidoDispositivo);
		update(montaConexaoSQL(coop, ConexoesSQL.SQLH),
				query.replace(apelidoDispositivo, "%" + apelidoDispositivo + "%"));
	}

	public String montaConexaoSQL(String cooperativa, ConexoesSQL tipoConexao) {
		String retorno = "";
		String baseSql = "";
		if (!cooperativa.matches("\\d.*")) {
			baseSql = cooperativa;
		} else {
			baseSql = select(String.format(ConexoesSQL.fromEnum(ConexoesSQL.SQLH), "BDSRTB"),
					String.format(scripts.get("recuperaNomeBaseDadosSQL"), cooperativa)).get(0);
		}
		switch (tipoConexao) {
		case SQLH:
			retorno = String.format(ConexoesSQL.fromEnum(ConexoesSQL.SQLH), baseSql);
			break;
		case SQLHI:
			retorno = String.format(ConexoesSQL.fromEnum(ConexoesSQL.SQLHI), baseSql);
			break;
		default:
			break;
		}
		return retorno;
	}

	public HlpLogin acessarMenu() {
//		aguardaElemento(login.ICONE_LOADER);

//     	aguardaElemento(pgoSimulaçãoConsignado.BOTAO_MENU);
		click(pg.BOTAO_MENU);
		return this;
	}

}
