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
	PACOTE_DE_SERVI�OS("Pacote de servicos","Pacote de servi�os","1"),

	//Pagamentos
	LEITOR_CODBARRAS("Leitor codigo de barras","Leitor c�digo de barras","1"),
	LEITOR_QRCODE("Leitor com QR Code","Leitor com QR Code","1"),
	TITULOS("Titulos (boletos bancarios)","T�tulos (boletos banc�rios)","1"),
	CONVENIOS("Convenios (agua, luz, telefone, gas e outros)","Conv�nios (�gua, luz, telefone, g�s e outros)","1"),
	IPVA("IPVA e taxas do DETRAN","IPVA e taxas do DETRAN","1"),
	DARF("DARF","DARF","1"),
	DAS("DAS","DAS","1"),
	GPS("GPS - Guia da Previdencia Social","GPS - Guia da Previd�ncia Social","1"),
	FATURACARTAOCREDITO("Fatura do cartao de credito","Fatura do cart�o de cr�dito","1"),
	GARE("GARE (DR,ICMS,ITCMD)","GARE (DR,ICMS,ITCMD)","1"),
	FGTS("FGTS","FGTS","1"),
	RECARGAPREPAGA("Recarga pre paga","Recarga pr� paga","1"),


	//Transfer�ncias na Rede Sicoob
	ENTRE_CONTASCORRENTES("Entre contas correntes","Entre contas correntes","1"),
	CONTACORRENTE_PARA_POUPANCA("Conta corrente para poupanca","Conta corrente para poupan�a","1"),
	POUPANCA_PARA_CONTACORRENTE("Poupanca para conta corrente","Poupan�a para conta corrente","1"),
	TRANSFERENCIA_DIGITAL("Transferencia digital","Transfer�ncia digital","1"),
	CONTACORRENTE_PARA_CONTAYOU("C. corrente para Conta Yoou","C. corrente para Conta Yoou","1"),

	//Transfer�ncias para outros bancos
	DOC("DOC","DOC","1"),
	TED("TED","TED","1"),

	//Comprovantes
	COMPROVANTE_TITULOS("Titulos","T�tulos","1"),
	COMPROVANTE_CONV_TRIBUTOS("Convenios e Tributos","Conv�nios e Tributos","1"),
	COMPROVANTE_TRANSFERENCIA("Transferencias","Transfer�ncias","1"),
	COMPROVANTE_RECARGAPREPAGA("Recarga pre paga","Recarga pr� paga","1"),
	COMPROVANTE_DEBITOAUTOMATICO("Debito automatico","D�bito autom�tico","1"),

	//Cancelamentos
	CANCELAMENTO_TITULOSAGENDADOS("Titulos agendados","T�tulos agendados","1"),
	CANCELAMENTO_CONVENIOSTRIBUTOSAGENDADOS("Convenios e Tributos agendados","Conv�nios e Tributos agendados","1"),
	CANCELAMENTO_TRANSFERENCIAAGENDADA("Transferencias agendados","Transfer�ncias agendados","1"),

	// cheques
	CHEQUE_BAIXAINUTILIZADO("Baixa de cheque inutilizado","Baixa de cheque inutilizado","1"),
	CHEQUE_CONSULTADEVOLVIDO("Consulta de cheque devolvidos","Consulta de cheque devolvidos","1"),
	CHEQUE_SUSTACAO("Sustacao de cheque","Susta��o de cheque","1"),
	CHEQUE_COPIAIMAGEM("Custodia de cheques","Cust�dia de cheques","1"),
	CHEQUE_DEPOSITO("Deposito de cheques","Dep�sito de cheques","1"),
	CHEQUE_CANCELARADESAO("Cancelar adesao deposito cheque","Cancelar ades�o dep�sito cheque","1"),


	//D�bito autom�tico
	DEBAUTOMATICO_INCLUSAO("Inclusao","Inclus�o","1"),
	DEBAUTOMATICO_CONSULTA("Consulta","Consulta","1"),
	DEBAUTOMATICO_CANCELAMENTO("Cancelamento","Cancelamento","1"),

	//consulta
	PORTABILIDADE("Portabilidade","Portabilidade","1"),


	// -- CONTA_CAPITAL -- //

	// consulta
	CCA_EXTRATOCONTACAPITAL("Extrato de conta capital","Extrato de conta capital","1"),
	CCA_INTEGRALIZACAO("Integralizacao de capital","Integraliza��o de capital","1"),
	CCA_CANCELAMENTO_INTEGRALIZACAO("Cancelamento","Cancelamento","1"),

	//PIX

	//minhas chaves
	GERENCIAMENTO_DE_CHAVES("Gerenciamento de Chaves","Gerenciamento de Chaves","1"),
	REIVINDICACOES("Reivindicacoes","Reivindica��es","1"),

	// pagamentos
	RECEBER("Receber","Receber","1"),
	PAGAR("Pagar","Pagar","1"),
	PIX_SAQUE_TROCO("Pix Saque/Troco","Pix Saque/Troco","1"),
	PAGAR_COM_CHAVE_MANUAL("Pagar com Chave/Manual","Pagar com Chave/Manual","1"),

	// consultas
	EM_ANALISE("Em analise","Em an�lise","1"),

	// -- INVESTIMENTOS -- //

	//poupan�a
	POUPANCA_APLICACAO("Aplicacao","Aplica��o","2"),
	POUPANCA_RESGATE("Resgate","Resgate","2"),
	POUPANCA_SALDO("Saldo","Saldo","1"),
	POUPANCA_EXTRATO("Extrato","Extrato","2"),
	POUPANCA_CANCELAMENTO_APLICACAO("Cancelamento de aplicacao","Cancelamento de aplica��o","2"),
	POUPANCA_EMISSAOCOMPROVANTE("Emissao de comprovantes","Emiss�o de comprovantes","2"),
	POUPANCA_NOVACONTA("Nova Conta Poupanca","Nova Conta Poupan�a","1"),

	//renda fixa
	RENDAFIXA_APLICACAO("Aplicacao","Aplica��o","1"),
	RENDAFIXA_EXTRATO("Extrato","Extrato","1"),
	RENDAFIXA_EXTRATOCONSOLIDADO("Extrato consolidado","Extrato consolidado","1"),
	RENDAFIXA_APROPRIACAODIARIA("Extrato de apropriacao diaria","Extrato de apropria��o di�ria","1"),
	RENDAFIXA_CANCELAMENTOAPLICACAO("Cancelamenbto de aplicacao","Cancelamenbto de aplica��o","1"),
	RENDAFIXA_EMISSAOCOMPROVANTE("Emissao de comprovantes","Emiss�o de comprovantes","1"),

	//fundos de investimentps
	FI_APLICACAO("Aplicacao","Aplica��o","1"),
	FI_CONSULTARTERMOADESAO("Consultar Termo de Adesao","Consultar Termo de Ades�o","1"),
	FI_RESGATE("Resgate","Resgate","1"),
	FI_CONSULTAPOSICAOCOTISTA("Consulta Posicao do Cotista","Consulta Posi��o do Cotista","1"),
	FI_EXTRATO("Extrato","Extrato","1"),
	FI_CANCELAMENTOAPLICACAO("Cancelamento de Aplicacao","Cancelamento de Aplica��o","1"),
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
	TD_APLICACAO("Aplicacao","Aplica��o","1"),
	TD_RESGATE("Resgate","Resgate","1"),
	TD_CONSULTARPOSICAOINVESTIDOR("Consultar posicao do investidor","Consultar posi��o do investidor","1"),
	TD_CONSULTARTERMOADESAO("Consultar termo de adesao","Consultar termo de ades�o","1"),
	TD_COMPROVANTES("Comprovantes","Comprovantes","1"),

	//plataforma de investimentos
	PLATAFORMAINV_VISUALIZAR("Visualizar","Visualizar","1"),


	// -- CREDITO --//

	// Credito automatico
	CREDITOAUTO_SIMULACAO("Simulacao","Simula��o","1"),
	CREDITOAUTO_CONTRATACAO("Contratacao","Contrata��o","1"),
	CREDITOAUTO_COMPROVANTES("Comprovantes","Comprovantes","1"),
	CREDITOAUTO_TAXAS("Taxas","Taxas","1"),
	CREDITOAUTO_LIMITES("Limites","Limites","1"),
	CREDITOAUTO_TERMOADESAO("Termo de adesao","Termo de ades�o","1"),

	// Cheque especial automatico
	CHQESPECIAL_ADESAO("Adesao","Ades�o","1"),

	// Credito digital
	CREDITODIGITAL_FINANCIAMENTOVEICULO("Financiamento de veiculo","Financiamento de ve�culo","1"),
	CREDITODIGITAL_CONSIGNADO("Consignado","Consignado","1"),

	//Credito rural
	CREDITORURAL_OPERACOES("Opera�oes","Opera��es","1"),
	CREDITORURAL_CONTRATACOES("Contratacao","Contrata��es","1"),
	CREDITORURAL_RENOVACAO("Renovacao","Renova��o","1"),

	//Consultas
	CONSULTAS_EMPRESTIMOS("Emprestimos","Empr�stimos","1"),
	CONSULTAS_EXTRATOCONSOLIDADOENCARGOS("Extrato consolidado de encargos","Extrato consolidado de encargos","1"),

	//Pagamentos
	PAGAMENTOS_OPERACOESCREDITO("Operacoes de credito","Opera��es de cr�dito","1"),
	PAGAMENTOS_RENEGOCIESUADIVIDA("Renegocie sua divida","Renegocie sua d�vida","1"),

	//Solicitacoes
	SOLICITACOES_ALTERACOESCONTRATOOPCREDITO("Alteracao contrato op. credito","Altera��o contrato op. cr�dito (COVID-19)","1"),

	//Acompanhamento
	ACOMPANHAMENTO_PROPOSTACREDITO("Proposta de credito","Proposta de credito","1"),

	//Portabilidade de credito
	PORTABILIDADECREDITO_DOCUMENTODESCRITIVO("Documento descritivo de credito","Documento descritivo de cr�dito","1"),

	//Credito imobiliario
	CREDITOIMOBILIARIO_SIMULACAO("Simulacao","Simula��o","1"),

	//Risco socioambiental
	RISCOSOCIOAMBIENTAL_QUESTIONARIODECLARATORIO("Questionario declaratorio","Question�rio declarat�rio","1"),
	
	

	// -- CONSORCIO -- //

	//Consultas
	CONSORCIO_CONSULTAEXTRATO("Extrato","Extrato","1"),
	CONSORCIO_VALORSRECEBER("Valores a receber","Valores a receber","1"),
	CONSORCIO_ASSEMBLEIA("Assembleia","Assembleia","1"),
	CONSORCIO_BLOQUEIOCONTEMPLACAO("Bloqueio de contempla��o","Bloqueio de contemplacao","1"),
	CONSORCIO_INFORMERENDIMENTOS("Informe de Rendimentos","Informe de Rendimentos","1"),
	CONSORCIO_TROCADEBENS("Troca de Bens","Troca de Bens","1"),
	CONSORCIO_EMISSAOBOLETOS("Emissao de boletos","Emiss�o de boletos","1"),

	// -- PREVIDENCIA -- //

	//Instituido e patrocinado
	PREVI_SIMULACAO("Simulacao","Simula��o","1"),
	PREVI_ADESAO("Adesao","Ades�o","1"),
	PREVI_ALTERACAOPERFILINVESTIDOR("Alteracao de perfil investidor","Altera��o de perfil investidor","1"),
	PREVI_CONTRIBUICAOEVENTUAL("Contribuicao eventual","Contribui��o eventual","1"),
	PREVI_ACOMPANHARPROPOSTA("Acompanhar Proposta","Acompanhar Proposta","1"),
	PREVI_EXTRATOCONTRIBUICOES("Extrato de contribuicoes","Extrato de contribui��es","1"),
	PREVI_EXTRATOOUTRASCONTRIBUICOES("Extrato de outras contribuicoes","Extrato de outras contribui��es","1"),
	PREVI_EXTRATORENTABILIDADE("Extrato de rentabilidade","Extrato de rentabilidade","1"),
	PREVI_SALDO("Saldo","Saldo","1"),
	PREVI_INFORMECONTRIBUICOES("Informe de contribuicoes","Informe de contribui��es","1"),
	PREVI_CERTIFICADOPARTICIPANTE("Certificado de participante","Certificado de participante","1"),
	PREVI_DADOSBASICOS("Dados basicos","Dados basicos","1"),
	PREVI_DADOSCOMPLENTARES("Dados complementares","Dados complementares","1"),
	PREVI_GOVERNANCAEDOCUMENTOS("Governanca e outros documentos","Governan�a e outros documentos","1"),
	PREVI_CONTRACHEQUEPAGAMENTO("Contracheque de pagamento de beneficio","Contracheque de pagamento de benef�cio","1"),

	//vgbl
	VGBL_ADESAO("Adesao","Adesao","1"),
	VGBL_CONTRIBUICAOEVENTUAL("Contribuicao Eventual","Contribuicao Eventual","1"),
	VGBL_EXTRATOCONTRIBUICAO("Extrato de contribuicao","Extrato de contribui��o","1"),
	VGBL_CERTIFICADOPROPOSTA("Certificado e Proposta","Certificado e Proposta","1"),

	//-- SEGUROS --//

	// seguro de vida
	SEGUROVIDA_MEUSSEGUROS("Meus Seguros","Meus Seguros","1"),
	SEGUROVIDA_SIMULAR("Simular","Simular","1"),

	// seguro de vida empresarial
	SEGUROVIDAEMPRESARIAL_MEUSSEGUROS("Meus Seguros","Meus Seguros","1"),

	// seguro residencial
	SEGURORESIDENCIAL_APOLICES("Apolices","Ap�lices","1"),
	SEGURORESIDENCIAL_CONTRATACAO("Contratacao","Contrata��o","1"),

	// seguro auto
	SEGUROEAUTO_("Apolices","Ap�lices","1"),


	// -- SERVICOS -- //

	// saque sem cartao
	SAQUESEMCARTAO_ADESAOCANCELAMENTO("Adesao/Cancelamento","Ades�o/Cancelamento","1"),
	SAQUESEMCARTAO_COMPROVANTECANCELAMENTO("Comprovante de Adesao/Cancelamento","Comprovante de Ades�o/Cancelamento","1"),
	SAQUESEMCARTAO_GERARCODIGOSEGURANCA("Gerar codigo de seguranca","Gerar c�digo de seguran�a","1"),

	// provisionamento de saque
	PROVISIONAMENTOSAQUE_SOLICITAR("Solicitar","Solicitar","1"),

	// demonstrativo de pagamentos
	SERVICOSDEMONSTRATIVO_CONTRACHEQUE("Contracheque","Contracheque","1"),
	SERVICOSDEMONSTRATIVO_RECIBOFERIAS("Recibo de ferias","Recibo de f�rias","1"),
	SERVICOSDEMONSTRATIVO_INFORMERENDIMENTOS("Informe de Rendimentos","Informe de Rendimentos","4"),

	// atualizacao cadastral
	SERVICOSATUALIZACAOCADASTRAL_CONTATO("Contato","Contato","1"),
	SERVICOSATUALIZACAOCADASTRAL_ENDERECO("Endereco","Endere�o","1"),
	SERVICOSATUALIZACAOCADASTRAL_RENDA("Renda","Renda","1"),

	// Saque digital
	SERVICOSSAQUEDIGITAL_SACAR("Sacar","Sacar","1"),
	SERVICOSSAQUEDIGITAL_REGISTRATOBC("Registrato Banco Central","Registrato Banco Central","1"),

	// -- INDIQUE O SICOOB -- //

	//indica��es
	INDIQUESICOOB_INDICACOES("Indicacoes","Indica��es","1"),

	// -- OUTRAS OPCOES -- //

	// seguranca
	OUTRASOPCOESSEGURANCA_ALTSENHAACESSO("Alteracao de senha de acesso","Altera��o de senha de acesso","1"),
	OUTRASOPCOESSEGURANCA_LIMITETRANSFERENCIA("Limite de transferencia","Limite de transfer�ncia","1"),
	OUTRASOPCOESSEGURANCA_FAVORECIDOSTRANSFERENCIAS("Favorecidos - Transferencias","Favorecidos - Transfer�ncias","1"),
	OUTRASOPCOESSEGURANCA_FAVORECIDOSPAGAMENTOS("Favorecidos - Pagamentos","Favorecidos - Pagamentos","1"),
	OUTRASOPCOESSEGURANCA_COMPUTADORESCADASTRADOS("Computadores cadastrados","Computadores cadastrados","1"),
	OUTRASOPCOESSEGURANCA_CELULARESCADASTRADOS("Celulares cadastrados","Celulares cadastrados","1"),
	OUTRASOPCOESSEGURANCA_LIBERACAOCELULAR("Liberacao de celular","Libera��o de celular","1"),
	OUTRASOPCOESSEGURANCA_IDENTIFICACAOPOSITIVAATM("Identificacao Positiva do ATM","Identifica��o Positiva do ATM","1"),
	OUTRASOPCOESSEGURANCA_EFETIVACAODOISPASSOS("Efetivacao em dois passos","Efetiva��o em dois passos","1"),
	OUTRASOPCOESSEGURANCA_REQUISICAOLGPD("Requisicao de dados pessoais (LGPD)","Requisi��o de dados pessoais (LGPD)","1"),


	// ocorrencias
	OUTRASOPCOESOCORRENCIAS_REGISTRAR("Registrar","Registrar","1"),

	// configuracoes
	OUTRASOPCOESCONFIGURACOES_NOTIFICACOES("Notificacoes","Notifica��es","1"),
	OUTRASOPCOESCONFIGURACOES_APLICATIVOS("Aplicativos","Aplicativos","1"),



	// -- CARTOES -- //

	// Consultas
	CARTOESCONSULTAS_EXTRATOFATURA("Extrato da fatura","Extrato da fatura","1"),
	CARTOESCONSULTAS_RESUMODAFATURA("Resumo da fatura","Resumo da fatura","1"),
	CARTOESCONSULTAS_LIMITEDISPONIVEL("Limite disponivel","Limite dispon�vel","1"),
	CARTOESCONSULTAS_EXTRATOPDETALHADO("Extrato detalhado","Extrato detalhado","1"),
	CARTOESCONSULTAS_LANCAMENTOSFUTUROS("Lancamentos futuros","Lan�amentos futuros","1"),

	// Pagamentos
	CARTOESPAGAMENTOS_FATURACARTAOCREDITO("Fatura do cartao de credito","Fatura do cart�o de cr�dito","1"),

	// Solicitacoes
	CARTOSOLICITACOES_FATURADIGITAL("Fatura Digital","Fatura Digital","1"),
	CARTOSOLICITACOES_CARTAOVIRTUAL("Cartao Digital","Cart�o Digital","1"),

	// -- DDA -- //

	//Sacado eletronico
	DDASACADO_ADESAODDA("Adesao ao DDA","Ades�o ao DDA","1"),
	DDASACADO_CANCELAMENTODDA("Cancelamento de adesao ao DDA","Cancelamento de ades�o ao DDA","1"),
	DDASACADO_COMPROVANTES("Comprovantes","Comprovantes","1"),

	//Pagamentos
	DDAPAGAMENTOS_CONSULTABOLETOPAGAR("Consulta de boletos a pagar","Consulta de boletos a pagar","1"),

	//SIPAG
	SIPAG_VENDAS("Vendas","Vendas","1"),
	SIPAG_ANTECIPACAO("Antecipacao","Antecipa��o","1"),
	SIPAG_ORDEMSERVICO("Ordem de servico","Ordem de servi�o","1"),
	
	// -- ACESSO RAPIDO -- //
	
	//Gest�o
	OPENBANKING_GESTAOOPENBANKING("Gestao Open Banking","Gest�o Open Banking","1");
	
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
