package tests;



import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import entity.Usuario;
import helper.HlpPropostaDeCredito;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import manager.driver.DriverManagerFactory;


@Listeners({reporter.ReportListener.class})
@Epic("Outros")
@Feature("Credito Financiamento Simulacao")
@Severity(SeverityLevel.BLOCKER)
@Test (groups = {"Impeditivo"})
public class PropostaDeCredito extends DriverManagerFactory {
	
	HlpPropostaDeCredito hlpPropostaDeCredito;
	Usuario user;
	String tempo;
	
	@BeforeClass
	public void init() {
		hlpPropostaDeCredito = new HlpPropostaDeCredito();

	}
	
	@Test(groups = { "Fluxo b�sico" })
	public void CEN01_SiumulacaoConsignado() {
		for (JSONObject dp : hlpPropostaDeCredito.getDp().getListTestCases()) {
			
			
			hlpPropostaDeCredito
			.clickHome()
			.clickPlataformaCredito()
			.clickSimularProposta();
			
			hlpPropostaDeCredito
			.preencheLinhaCredito(dp.get("linha"))
			.clickPesquisar()
			.clickCheckBoxLinha()
			.clickBotaoProsseguir();
			
			hlpPropostaDeCredito
			.preencheCPFCNPJ(dp.get("cpf"))
			.clickPesquisar()
			.preencheValorProposta(dp.get("valor"))
			.preencheParcela(dp.get("parcela"))
			.prosseguir()
			.clickBotaoProsseguir();
			
			hlpPropostaDeCredito
			.preencheComboTipoTaxa(dp.get("opcao"))
			.clickBotaoProsseguir();
			
			hlpPropostaDeCredito
//			.preencheComboTipoSeguro(dp.get("seguro"))
			.preencheCampoDescricaoBem(dp.get("texto"))
			.prosseguir()
			.clickBotaoProsseguir();
			
			hlpPropostaDeCredito
			.clickBotaoContaCliente()
			.clickCheckBoxContaCliente()
			.clickAdcionarCriterioCredito()
			.selecionaContaCredito()
			.clicaBotaoIncluir()
			.selecinarContaPrincipal()
			.adicionarValorLiberacao(dp.get("valor"))
			.clicaBotaoFinalizar()
			.clickAdcionarCriterioDebito()
			.selecionaContaCredito()
			.clicaBotaoIncluir()
			.clicaBotaoFinalizar()
			.clickBotaoCaucular()
			.clickBotaoX();
			
//			hlpPropostaDeCredito
//			.changeDriverContextToWeb();
			
//			hlpPropostaDeCredito
//			.aguardarLoadSistema();
			
			hlpPropostaDeCredito
			.clickBotaoAcoes()
			.clickBotaoGravar()
			.clickBotaoX()
			.clickBotaoAcoes()
			.clickBotaoEncaminhar();
			
//			hlpPropostaDeCredito
//			.changeDriverContextToNative();
			
			hlpPropostaDeCredito
			.clickBotaoAdicionarArquivo()
			.preencheCampoNomeDocumento(dp.get("texto"))
			.clickBotaoAnexarArquivo()
			.clickBotaoMenuArquivo()
			.clickBotaoDownloads()
			.clickArquivoPdf()
			.clickBotaoAnexar();
			
			hlpPropostaDeCredito			
			.clickBotaoX()
			.clickBotaoAcoes()
			.clickBotaoLiberarParaGarantia()
			.clickBotaoX();
			
//			hlpPropostaDeCredito
//			.clickBotaoAddGarantia()
//			.preencheComboTipoGarantia(dp.get("tipoGarantiaGARANTIAFIDEJUSSÓRIA"))
//			.preencheComboGrupoGarantia(dp.get("grupoGarantiaAVALISTA-PF"))
//			.preencheComboEnquadramento(dp.get("enquadramentoAVALISTA-PF"))
//			.preencheCampoCpfAvalista(dp.get("cpfAvalista"))
//			.clickPesquisar()
//			.preencheComboResponsabilidade(dp.get("resonsabilidade"))
//			.clickBotaoGravarResponsabilidade();
			
//			hlpPropostaDeCredito
//			.clickBotaoAddGarantia()
//			.preencheComboTipoGarantia(dp.get("tipoGarantia2"))
//			.preencheComboGrupoGarantia(dp.get("grupoGarantia2"))
//			.preencheComboEnquadramento(dp.get("enquadramento2"))
//			.preencheComBoTipoOrigem(dp.get("tipoOrigem"));
//			hlpPropostaDeCredito
//			.clickDimensionado()
//			.checkBoxAplicacao()
//			.clickBotaoAssociar()
//			.preencheCampoValorUtil(dp.get("valor"))
//			.preencheCampoDescGarantia(dp.get("texto"))
//			.clickBotaoGravarResponsabilidade();
			
//			hlpPropostaDeCredito
//			.clickBotaoAddGarantia()
//			.preencheComboTipoGarantia(dp.get("tipoGarantia3"))
//			.preencheComboGrupoGarantia(dp.get("grupoGarantia3"))
//			.preencheComboEnquadramento(dp.get("enquadramento3"))
//			.preencheComBoTipoOrigem(dp.get("tipoOrigem"))
//			.preencheComboResposabilidadeAlienacao(dp.get("responsabilidadeAlienacao2"))
//			.preencheCampoCpfAlienacao(dp.get("cpfAvalista"))
//			.clickPesquisar()
//			.preencheCampoValorImovel(dp.get("valorImovel"))
//			.preencheComboCartorio(dp.get("cartorio"))
//			.preencheCampoDescAlienacao(dp.get("texto"))
//			.procurarBotaoGravar()
//			.clickUltimaAvaliacao();
			
			hlpPropostaDeCredito
//			.clickBotaoOk()
			.clickBotaoAcoes()
			.clickBotaoLiberaParaEstudo();
//			.clickBotaoSim();
			
			hlpPropostaDeCredito
			.clickBotaoX()
			.clickBotaoAcoes()
			.clickBotaoChecklist()
			.clickBotaoX()
		    .clickBotaoAcoes()
			.clickBotaoSubmeter()
			.preencheCampoParecerNegocial(dp.get("texto"))
			.clickBotaoAcoes()
			.clickBotaoSubmeter()
			.clickBotaoX();
			
			hlpPropostaDeCredito
			.aguardarLoadSistema();
			
			hlpPropostaDeCredito
			.clickBotaoAcoes()
			.clickBotaoChecklist()
			.clickBotaoX();
			
			hlpPropostaDeCredito
//			.clickBotaoResultadoCheckList()
			.clickBotaoParecer()
//			.clickBotaoApontamento()
//			.clickBotaoVOLTAR()
			.preencheCampoParecerNegocialAnaliseTecnica(dp.get("texto"))
			.preencheComboParecerTecnico(dp.get("parecer"));
			
			
			hlpPropostaDeCredito
			.clickBotaoAcoes()
			.clickBotaoSubmeter();
			
			hlpPropostaDeCredito
			.preencheCampoParecerAprovacao(dp.get("texto"))
			.preencheComboAcao(dp.get("acao"))
			.clickBotaoConfirmar();
			
//			hlpPropostaDeCredito
//			.preencheComboIstrumentoDeCredito(dp.get("instrumento"));
			
			hlpPropostaDeCredito
			.aguardarLoadSistema();
			
			hlpPropostaDeCredito
			.getNumProposta()
			.preencheComboIstrumentoDeCredito(dp.get("instrumento"))
			.clickBotaoAcoes()
			.clickBotaoImprimirInstrumento()
			.aguardaMsgDocumentoPrecessando()
//			.clickBotaoVisualizarInstrumento();
//			.exportaInstrumento()
			.preencheCampoFechoDoInstrumento(dp.get("texto"))
			.preencheComboAssinatura(dp.get("assinatura"))
			.clickBotaoAcoes()
			.clickBotaoEncamiarLiberacao()
			.clickBotaoX()
			.clickBotaoAcoes()
			.clickBotaoLiberar()
			.clickBotaoSim()
			.aguardarLoadSistema();
		}
		
	}
	
	

}
