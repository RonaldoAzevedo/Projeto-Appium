package tests;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import entity.Usuario;
import helper.HlpCreditoFinanciamento;
import helper.HlpLogin;
import io.qameta.allure.Allure;
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
public class CreditoFinanciamento extends DriverManagerFactory {
	
	HlpLogin helperLogin;
	HlpCreditoFinanciamento HlpFinanciamento;
	Usuario user;
	String tempo;
	
	@BeforeClass
	public void init() {
		helperLogin = new HlpLogin();
		HlpFinanciamento = new HlpCreditoFinanciamento();
		user = helperLogin.usr.buscarUsuarioPorPerfil("Lindomar");

	}
	
	@Test(groups = { "Fluxo básico" })
	public void CEN01_FinanciamentoDeVeiculo() {
		for (JSONObject dp : HlpFinanciamento.getDp().getListTestCases()) {
			
			String ano = HlpFinanciamento.obterDataAno();
			
			HlpFinanciamento
			.acessarMenu()
			.pequisarFinaciamentoCarro(dp.get("busca"));
			tempo = HlpFinanciamento.getDataHora();
			HlpFinanciamento
			.acessarSimulacao()
			.prencherComboZeroKm(dp.get("sim"))
			.preencherComboTipoVeiculo(dp.get("carro"))
			.preencherCampoAnoCarro(ano)
			.preencherCampoValorCarro(dp.get("valorcarro"))
			.preencherCampoFinanciamentoCarro(dp.get("valorfinanciamento"));
			
		
			
			HlpFinanciamento
			.preencherCampoTelefone(dp.get("celular"));
			
			
			HlpFinanciamento
			.clicaBotaoSimular();
			String IDsimulacaopag = HlpFinanciamento.getIDsimulacaopag(dp.get("idinstituicao").toString(),dp.get("idpessoa").toString(),tempo);
			
			HlpFinanciamento
			.clicarBotaoSelecionar();
			
			HlpFinanciamento
			.validarPrecoCarroEntrada(dp.get("entrada").toString())
			.clicaBotaoAvancarProposta();
			
			HlpFinanciamento
			.validarOrientacao(dp.get("msg"))
			.procuraEntendiOrientacao();
			
			
			HlpFinanciamento
			.clickEntendiOrientacao();

			
			HlpFinanciamento
			.preencherCombotipoCarro(dp.get("marca"))
			.preencherComboModeloCarro(dp.get("modelo"))
			.preencherComboAnoModelo(dp.get("anoKm"))
			.preencherComboUF(dp.get("uf"));
			
			HlpFinanciamento
			.changeDriverContextToWeb();
			
			HlpFinanciamento
			.preencherCampoNomeVendedor(dp.get("nome"))
			.preencherCPFCNPJVendedor(dp.get("cpf"))
			.preencherCodBanco(dp.get("codbanco"))
			.preencherAgenciaVendedor(dp.get("agencia"))
			.preencherContaVendedor(dp.get("conta"))
			.preencherTelefoneVendedor(dp.get("telefone"))
			.preencherEmailVendedor(dp.get("email"))
			.clicaBotaoContinuarProposta();
			
			HlpFinanciamento
			.changeDriverContextToNative();
			
			HlpFinanciamento
			.checkboxConcordancia();
			
			HlpFinanciamento
			.clicaBotaoEnviarProposta();
			
			HlpFinanciamento
			.validarPropostaChegouNoBancoDeDados(IDsimulacaopag);
			HlpFinanciamento.validarSePropostaEstaComErro(IDsimulacaopag);
			
			HlpFinanciamento
			.verifacaMsgEviado(dp.get("msgProposta").toString());
		}
	}
}
