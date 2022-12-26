package support;

import java.util.ArrayList;
import java.util.List;

public enum Submenu {
	// -- ACESSO RAPIDO -- //
	
	ACESSORAPIDO_INFORMERENDIMENTOS("Informe de Rendimentos","Informe de Rendimentos","1"),
	
	// -- CONTA CORRENTE -- //

	//Consultas
	SALDO_DE_CONTA_CORRENTE("Saldo de conta corrente","Saldo de conta corrente","1"),
	EXTRATO_DE_CONTA_CORRENTE("Extrato de conta corrente","Extrato de conta corrente","1"),
	EXTRATO_DE_CHEQUE_ESPECIAL("Extrato de cheque especial","Extrato de cheque especial","1"),
	EXTRATO_DE_CONTA_CAPITAL("Extrato de conta capital","Extrato de conta capital","1"),
	EXTRATO_DE_TARIFAS("Extrato de tarifas","Extrato de tarifas","1"),
	BOLETOS_A_PAGAR_DO_DDA("Boletos a pagar do DDA","Boletos a pagar do DDA","1"),
	INFORME_DE_IMPOSTO_DE_RENDA("Informe de imposto de renda","Informe de imposto de renda","1"),
	PACOTE_DE_SERVIÇOS("Pacote de servicos","Pacote de serviços","1"),

	//Pagamentos
	LEITOR_CODBARRAS("Leitor codigo de barras","Leitor código de barras","1"),
	LEITOR_QRCODE("Leitor com QR Code","Leitor com QR Code","1"),
	TITULOS("Titulos (boletos bancarios)","Títulos (boletos bancários)","1"),
	CONVENIOS("Convenios (agua, luz, telefone, gas e outros)","Convênios (água, luz, telefone, gás e outros)","1"),
	IPVA("IPVA e taxas do DETRAN","IPVA e taxas do DETRAN","1"),
	DARF("DARF","DARF","1"),
	DAS("DAS","DAS","1"),
	GPS("GPS - Guia da Previdencia Social","GPS - Guia da Previdência Social","1"),
	FATURACARTAOCREDITO("Fatura do cartao de credito","Fatura do cartão de crédito","1"),
	GARE("GARE (DR,ICMS,ITCMD)","GARE (DR,ICMS,ITCMD)","1"),
	FGTS("FGTS","FGTS","1"),
	RECARGAPREPAGA("Recarga pre paga","Recarga pré paga","1"),


	//Transferências na Rede Sicoob
	ENTRE_CONTASCORRENTES("Entre contas correntes","Entre contas correntes","1"),
	CONTACORRENTE_PARA_POUPANCA("Conta corrente para poupanca","Conta corrente para poupança","1"),
	POUPANCA_PARA_CONTACORRENTE("Poupanca para conta corrente","Poupança para conta corrente","1"),
	TRANSFERENCIA_DIGITAL("Transferencia digital","Transferência digital","1"),
	CONTACORRENTE_PARA_CONTAYOU("C. corrente para Conta Yoou","C. corrente para Conta Yoou","1"),

	//Transferências para outros bancos
	DOC("DOC","DOC","1"),
	TED("TED","TED","1"),

	//Comprovantes
	COMPROVANTE_TITULOS("Titulos","Títulos","1"),
	COMPROVANTE_CONV_TRIBUTOS("Convenios e Tributos","Convênios e Tributos","1"),
	COMPROVANTE_TRANSFERENCIA("Transferencias","Transferências","1"),
	COMPROVANTE_RECARGAPREPAGA("Recarga pre paga","Recarga pré paga","1"),
	COMPROVANTE_DEBITOAUTOMATICO("Debito automatico","Débito automático","1"),

	//Cancelamentos
	CANCELAMENTO_TITULOSAGENDADOS("Titulos agendados","Títulos agendados","1"),
	CANCELAMENTO_CONVENIOSTRIBUTOSAGENDADOS("Convenios e Tributos agendados","Convênios e Tributos agendados","1"),
	CANCELAMENTO_TRANSFERENCIAAGENDADA("Transferencias agendados","Transferências agendados","1"),

	// cheques
	CHEQUE_BAIXAINUTILIZADO("Baixa de cheque inutilizado","Baixa de cheque inutilizado","1"),
	CHEQUE_CONSULTADEVOLVIDO("Consulta de cheque devolvidos","Consulta de cheque devolvidos","1"),
	CHEQUE_SUSTACAO("Sustacao de cheque","Sustação de cheque","1"),
	CHEQUE_COPIAIMAGEM("Custodia de cheques","Custódia de cheques","1"),
	CHEQUE_DEPOSITO("Deposito de cheques","Depósito de cheques","1"),
	CHEQUE_CANCELARADESAO("Cancelar adesao deposito cheque","Cancelar adesão depósito cheque","1"),


	//Débito automático
	DEBAUTOMATICO_INCLUSAO("Inclusao","Inclusão","1"),
	DEBAUTOMATICO_CONSULTA("Consulta","Consulta","1"),
	DEBAUTOMATICO_CANCELAMENTO("Cancelamento","Cancelamento","1"),

	//consulta
	PORTABILIDADE("Portabilidade","Portabilidade","1"),


	// -- CONTA_CAPITAL -- //

	// consulta
	CCA_EXTRATOCONTACAPITAL("Extrato de conta capital","Extrato de conta capital","1"),
	CCA_INTEGRALIZACAO("Integralizacao de capital","Integralização de capital","1"),
	CCA_CANCELAMENTO_INTEGRALIZACAO("Cancelamento","Cancelamento","1"),

	//PIX

	//minhas chaves
	GERENCIAMENTO_DE_CHAVES("Gerenciamento de Chaves","Gerenciamento de Chaves","1"),
	REIVINDICACOES("Reivindicacoes","Reivindicações","1"),

	// pagamentos
	RECEBER("Receber","Receber","1"),
	PAGAR("Pagar","Pagar","1"),
	PIX_SAQUE_TROCO("Pix Saque/Troco","Pix Saque/Troco","1"),
	PAGAR_COM_CHAVE_MANUAL("Pagar com Chave/Manual","Pagar com Chave/Manual","1"),

	// consultas
	EM_ANALISE("Em analise","Em análise","1"),

	// -- INVESTIMENTOS -- //

	//poupança
	POUPANCA_APLICACAO("Aplicacao","Aplicação","2"),
	POUPANCA_RESGATE("Resgate","Resgate","2"),
	POUPANCA_SALDO("Saldo","Saldo","1"),
	POUPANCA_EXTRATO("Extrato","Extrato","2"),
	POUPANCA_CANCELAMENTO_APLICACAO("Cancelamento de aplicacao","Cancelamento de aplicação","2"),
	POUPANCA_EMISSAOCOMPROVANTE("Emissao de comprovantes","Emissão de comprovantes","2"),
	POUPANCA_NOVACONTA("Nova Conta Poupanca","Nova Conta Poupança","1"),

	//renda fixa
	RENDAFIXA_APLICACAO("Aplicacao","Aplicação","1"),
	RENDAFIXA_EXTRATO("Extrato","Extrato","1"),
	RENDAFIXA_EXTRATOCONSOLIDADO("Extrato consolidado","Extrato consolidado","1"),
	RENDAFIXA_APROPRIACAODIARIA("Extrato de apropriacao diaria","Extrato de apropriação diária","1"),
	RENDAFIXA_CANCELAMENTOAPLICACAO("Cancelamenbto de aplicacao","Cancelamenbto de aplicação","1"),
	RENDAFIXA_EMISSAOCOMPROVANTE("Emissao de comprovantes","Emissão de comprovantes","1"),

	//fundos de investimentps
	FI_APLICACAO("Aplicacao","Aplicação","1"),
	FI_CONSULTARTERMOADESAO("Consultar Termo de Adesao","Consultar Termo de Adesão","1"),
	FI_RESGATE("Resgate","Resgate","1"),
	FI_CONSULTAPOSICAOCOTISTA("Consulta Posicao do Cotista","Consulta Posição do Cotista","1"),
	FI_EXTRATO("Extrato","Extrato","1"),
	FI_CANCELAMENTOAPLICACAO("Cancelamento de Aplicacao","Cancelamento de Aplicação","1"),
	FI_CANCELMAENTORESGATE("Cancelamento de Resgate","Cancelamento de Resgate","1"),
	FI_CONSULTARCOMPROVANTES("Consultar Comprovantes","Consultar Comprovantes","1"),

	//analise de perfil de investidor (api,"1")
	API_CADASTRO("Cadastro API","Cadastro API","1"),
	API_CONSULTA("Consulta API","Consulta API","1"),

	//cdb
	CDB_SALDO("Saldo","Saldo","1"),
	CDB_EXTRATO("Extrato","Extrato","1"),

	//tesouro direto
	TD_CADASTROINVESTIDOR("Cadastro do investidor","Cadastro do investidor","1"),
	TD_APLICACAO("Aplicacao","Aplicação","1"),
	TD_RESGATE("Resgate","Resgate","1"),
	TD_CONSULTARPOSICAOINVESTIDOR("Consultar posicao do investidor","Consultar posição do investidor","1"),
	TD_CONSULTARTERMOADESAO("Consultar termo de adesao","Consultar termo de adesão","1"),
	TD_COMPROVANTES("Comprovantes","Comprovantes","1"),

	//plataforma de investimentos
	PLATAFORMAINV_VISUALIZAR("Visualizar","Visualizar","1"),


	// -- CREDITO --//

	// Credito automatico
	CREDITOAUTO_SIMULACAO("Simulacao","Simulação","1"),
	CREDITOAUTO_CONTRATACAO("Contratacao","Contratação","1"),
	CREDITOAUTO_COMPROVANTES("Comprovantes","Comprovantes","1"),
	CREDITOAUTO_TAXAS("Taxas","Taxas","1"),
	CREDITOAUTO_LIMITES("Limites","Limites","1"),
	CREDITOAUTO_TERMOADESAO("Termo de adesao","Termo de adesão","1"),

	// Cheque especial automatico
	CHQESPECIAL_ADESAO("Adesao","Adesão","1"),

	// Credito digital
	CREDITODIGITAL_FINANCIAMENTOVEICULO("Financiamento de veiculo","Financiamento de veículo","1"),
	CREDITODIGITAL_CONSIGNADO("Consignado","Consignado","1"),

	//Credito rural
	CREDITORURAL_OPERACOES("Operaçoes","Operações","1"),
	CREDITORURAL_CONTRATACOES("Contratacao","Contratações","1"),
	CREDITORURAL_RENOVACAO("Renovacao","Renovação","1"),

	//Consultas
	CONSULTAS_EMPRESTIMOS("Emprestimos","Empréstimos","1"),
	CONSULTAS_EXTRATOCONSOLIDADOENCARGOS("Extrato consolidado de encargos","Extrato consolidado de encargos","1"),

	//Pagamentos
	PAGAMENTOS_OPERACOESCREDITO("Operacoes de credito","Operações de crédito","1"),
	PAGAMENTOS_RENEGOCIESUADIVIDA("Renegocie sua divida","Renegocie sua dívida","1"),

	//Solicitacoes
	SOLICITACOES_ALTERACOESCONTRATOOPCREDITO("Alteracao contrato op. credito","Alteração contrato op. crédito (COVID-19)","1"),

	//Acompanhamento
	ACOMPANHAMENTO_PROPOSTACREDITO("Proposta de credito","Proposta de credito","1"),

	//Portabilidade de credito
	PORTABILIDADECREDITO_DOCUMENTODESCRITIVO("Documento descritivo de credito","Documento descritivo de crédito","1"),

	//Credito imobiliario
	CREDITOIMOBILIARIO_SIMULACAO("Simulacao","Simulação","1"),

	//Risco socioambiental
	RISCOSOCIOAMBIENTAL_QUESTIONARIODECLARATORIO("Questionario declaratorio","Questionário declaratório","1"),
	
	

	// -- CONSORCIO -- //

	//Consultas
	CONSORCIO_CONSULTAEXTRATO("Extrato","Extrato","1"),
	CONSORCIO_VALORSRECEBER("Valores a receber","Valores a receber","1"),
	CONSORCIO_ASSEMBLEIA("Assembleia","Assembleia","1"),
	CONSORCIO_BLOQUEIOCONTEMPLACAO("Bloqueio de contemplação","Bloqueio de contemplacao","1"),
	CONSORCIO_INFORMERENDIMENTOS("Informe de Rendimentos","Informe de Rendimentos","1"),
	CONSORCIO_TROCADEBENS("Troca de Bens","Troca de Bens","1"),
	CONSORCIO_EMISSAOBOLETOS("Emissao de boletos","Emissão de boletos","1"),

	// -- PREVIDENCIA -- //

	//Instituido e patrocinado
	PREVI_SIMULACAO("Simulacao","Simulação","1"),
	PREVI_ADESAO("Adesao","Adesão","1"),
	PREVI_ALTERACAOPERFILINVESTIDOR("Alteracao de perfil investidor","Alteração de perfil investidor","1"),
	PREVI_CONTRIBUICAOEVENTUAL("Contribuicao eventual","Contribuição eventual","1"),
	PREVI_ACOMPANHARPROPOSTA("Acompanhar Proposta","Acompanhar Proposta","1"),
	PREVI_EXTRATOCONTRIBUICOES("Extrato de contribuicoes","Extrato de contribuições","1"),
	PREVI_EXTRATOOUTRASCONTRIBUICOES("Extrato de outras contribuicoes","Extrato de outras contribuições","1"),
	PREVI_EXTRATORENTABILIDADE("Extrato de rentabilidade","Extrato de rentabilidade","1"),
	PREVI_SALDO("Saldo","Saldo","1"),
	PREVI_INFORMECONTRIBUICOES("Informe de contribuicoes","Informe de contribuições","1"),
	PREVI_CERTIFICADOPARTICIPANTE("Certificado de participante","Certificado de participante","1"),
	PREVI_DADOSBASICOS("Dados basicos","Dados basicos","1"),
	PREVI_DADOSCOMPLENTARES("Dados complementares","Dados complementares","1"),
	PREVI_GOVERNANCAEDOCUMENTOS("Governanca e outros documentos","Governança e outros documentos","1"),
	PREVI_CONTRACHEQUEPAGAMENTO("Contracheque de pagamento de beneficio","Contracheque de pagamento de benefício","1"),

	//vgbl
	VGBL_ADESAO("Adesao","Adesao","1"),
	VGBL_CONTRIBUICAOEVENTUAL("Contribuicao Eventual","Contribuicao Eventual","1"),
	VGBL_EXTRATOCONTRIBUICAO("Extrato de contribuicao","Extrato de contribuição","1"),
	VGBL_CERTIFICADOPROPOSTA("Certificado e Proposta","Certificado e Proposta","1"),

	//-- SEGUROS --//

	// seguro de vida
	SEGUROVIDA_MEUSSEGUROS("Meus Seguros","Meus Seguros","1"),
	SEGUROVIDA_SIMULAR("Simular","Simular","1"),

	// seguro de vida empresarial
	SEGUROVIDAEMPRESARIAL_MEUSSEGUROS("Meus Seguros","Meus Seguros","1"),

	// seguro residencial
	SEGURORESIDENCIAL_APOLICES("Apolices","Apólices","1"),
	SEGURORESIDENCIAL_CONTRATACAO("Contratacao","Contratação","1"),

	// seguro auto
	SEGUROEAUTO_("Apolices","Apólices","1"),


	// -- SERVICOS -- //

	// saque sem cartao
	SAQUESEMCARTAO_ADESAOCANCELAMENTO("Adesao/Cancelamento","Adesão/Cancelamento","1"),
	SAQUESEMCARTAO_COMPROVANTECANCELAMENTO("Comprovante de Adesao/Cancelamento","Comprovante de Adesão/Cancelamento","1"),
	SAQUESEMCARTAO_GERARCODIGOSEGURANCA("Gerar codigo de seguranca","Gerar código de segurança","1"),

	// provisionamento de saque
	PROVISIONAMENTOSAQUE_SOLICITAR("Solicitar","Solicitar","1"),

	// demonstrativo de pagamentos
	SERVICOSDEMONSTRATIVO_CONTRACHEQUE("Contracheque","Contracheque","1"),
	SERVICOSDEMONSTRATIVO_RECIBOFERIAS("Recibo de ferias","Recibo de férias","1"),
	SERVICOSDEMONSTRATIVO_INFORMERENDIMENTOS("Informe de Rendimentos","Informe de Rendimentos","4"),

	// atualizacao cadastral
	SERVICOSATUALIZACAOCADASTRAL_CONTATO("Contato","Contato","1"),
	SERVICOSATUALIZACAOCADASTRAL_ENDERECO("Endereco","Endereço","1"),
	SERVICOSATUALIZACAOCADASTRAL_RENDA("Renda","Renda","1"),

	// Saque digital
	SERVICOSSAQUEDIGITAL_SACAR("Sacar","Sacar","1"),
	SERVICOSSAQUEDIGITAL_REGISTRATOBC("Registrato Banco Central","Registrato Banco Central","1"),

	// -- INDIQUE O SICOOB -- //

	//indicações
	INDIQUESICOOB_INDICACOES("Indicacoes","Indicações","1"),

	// -- OUTRAS OPCOES -- //

	// seguranca
	OUTRASOPCOESSEGURANCA_ALTSENHAACESSO("Alteracao de senha de acesso","Alteração de senha de acesso","1"),
	OUTRASOPCOESSEGURANCA_LIMITETRANSFERENCIA("Limite de transferencia","Limite de transferência","1"),
	OUTRASOPCOESSEGURANCA_FAVORECIDOSTRANSFERENCIAS("Favorecidos - Transferencias","Favorecidos - Transferências","1"),
	OUTRASOPCOESSEGURANCA_FAVORECIDOSPAGAMENTOS("Favorecidos - Pagamentos","Favorecidos - Pagamentos","1"),
	OUTRASOPCOESSEGURANCA_COMPUTADORESCADASTRADOS("Computadores cadastrados","Computadores cadastrados","1"),
	OUTRASOPCOESSEGURANCA_CELULARESCADASTRADOS("Celulares cadastrados","Celulares cadastrados","1"),
	OUTRASOPCOESSEGURANCA_LIBERACAOCELULAR("Liberacao de celular","Liberação de celular","1"),
	OUTRASOPCOESSEGURANCA_IDENTIFICACAOPOSITIVAATM("Identificacao Positiva do ATM","Identificação Positiva do ATM","1"),
	OUTRASOPCOESSEGURANCA_EFETIVACAODOISPASSOS("Efetivacao em dois passos","Efetivação em dois passos","1"),
	OUTRASOPCOESSEGURANCA_REQUISICAOLGPD("Requisicao de dados pessoais (LGPD)","Requisição de dados pessoais (LGPD)","1"),


	// ocorrencias
	OUTRASOPCOESOCORRENCIAS_REGISTRAR("Registrar","Registrar","1"),

	// configuracoes
	OUTRASOPCOESCONFIGURACOES_NOTIFICACOES("Notificacoes","Notificações","1"),
	OUTRASOPCOESCONFIGURACOES_APLICATIVOS("Aplicativos","Aplicativos","1"),



	// -- CARTOES -- //

	// Consultas
	CARTOESCONSULTAS_EXTRATOFATURA("Extrato da fatura","Extrato da fatura","1"),
	CARTOESCONSULTAS_RESUMODAFATURA("Resumo da fatura","Resumo da fatura","1"),
	CARTOESCONSULTAS_LIMITEDISPONIVEL("Limite disponivel","Limite disponível","1"),
	CARTOESCONSULTAS_EXTRATOPDETALHADO("Extrato detalhado","Extrato detalhado","1"),
	CARTOESCONSULTAS_LANCAMENTOSFUTUROS("Lancamentos futuros","Lançamentos futuros","1"),

	// Pagamentos
	CARTOESPAGAMENTOS_FATURACARTAOCREDITO("Fatura do cartao de credito","Fatura do cartão de crédito","1"),

	// Solicitacoes
	CARTOSOLICITACOES_FATURADIGITAL("Fatura Digital","Fatura Digital","1"),
	CARTOSOLICITACOES_CARTAOVIRTUAL("Cartao Digital","Cartão Digital","1"),

	// -- DDA -- //

	//Sacado eletronico
	DDASACADO_ADESAODDA("Adesao ao DDA","Adesão ao DDA","1"),
	DDASACADO_CANCELAMENTODDA("Cancelamento de adesao ao DDA","Cancelamento de adesão ao DDA","1"),
	DDASACADO_COMPROVANTES("Comprovantes","Comprovantes","1"),

	//Pagamentos
	DDAPAGAMENTOS_CONSULTABOLETOPAGAR("Consulta de boletos a pagar","Consulta de boletos a pagar","1"),

	//SIPAG
	SIPAG_VENDAS("Vendas","Vendas","1"),
	SIPAG_ANTECIPACAO("Antecipacao","Antecipação","1"),
	SIPAG_ORDEMSERVICO("Ordem de servico","Ordem de serviço","1"),
	
	// -- ACESSO RAPIDO -- //
	
	//Gestão
	OPENBANKING_GESTAOOPENBANKING("Gestao Open Banking","Gestão Open Banking","1");
	
	private String lbmenu,lbcategoria,posicao;
	
	Submenu(String lbcategoria,String lbmenu, String posicao) {
		this.lbmenu = lbmenu;
		this.lbcategoria = lbcategoria;
		this.posicao = posicao;
	}
	
	public static List<String> getSubmenu(Submenu opcao) {
		List<String> submenu = new ArrayList<>();
		
		for (Submenu sm : Submenu.values()) {
			if (sm.equals(opcao)) {
				submenu.add(0,sm.lbcategoria);
				submenu.add(1,sm.lbmenu);
				submenu.add(2,sm.posicao);
			}
		}
		return submenu;
	}

}
