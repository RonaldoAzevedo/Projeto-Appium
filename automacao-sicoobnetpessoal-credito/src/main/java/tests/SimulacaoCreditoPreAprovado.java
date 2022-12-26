package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import entity.Usuario;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import manager.driver.DriverManagerFactory;

@Listeners({ reporter.ReportListener.class })
@Epic("Outros")
@Feature("Adesao Cheque Especial")
@Severity(SeverityLevel.BLOCKER)
@Test(groups = { "Impeditivo" })
public class SimulacaoCreditoPreAprovado extends DriverManagerFactory {

	helper.HlpSimulacaoCreditoPreAprovado hlpSimulacaoCreditoPreAprovado;
	Usuario user;
	String tempo;
	
	@Parameters("perfil")
	@BeforeClass
	public void init() {

		hlpSimulacaoCreditoPreAprovado = new helper.HlpSimulacaoCreditoPreAprovado();


	}

	@Test(groups = { "Fluxo básico" })
	public void CEN01_SimulacaoCreditoPreAprovado5014() {
		for (JSONObject dp : hlpSimulacaoCreditoPreAprovado.getDp().getListTestCases()) {
			hlpSimulacaoCreditoPreAprovado.setCasoTeste(dp.get("CT"));
			hlpSimulacaoCreditoPreAprovado.anexaDescricao(hlpSimulacaoCreditoPreAprovado.getCasoTeste());
			
			
			hlpSimulacaoCreditoPreAprovado
			.acessarMenu()
			.buscaMenu(dp.get("busca"))
			.acessarSimulacao()
			.acessarPreAprovado5014()
			.preencherValorSolicitado(dp.get("valorSolicitado"))
			.selecionaOpcaoCarenciaPrimeiraParela(dp.get("parcela"))
			.clicarBotaoSimular();
			
		}	
  }
	
	@Test(groups = { "Fluxo básico" })
	public void CEN01_SimulacaoCreditoPreAprovado5014II() {
		for (JSONObject dp : hlpSimulacaoCreditoPreAprovado.getDp().getListTestCases()) {
			hlpSimulacaoCreditoPreAprovado.setCasoTeste(dp.get("CT"));
			hlpSimulacaoCreditoPreAprovado.anexaDescricao(hlpSimulacaoCreditoPreAprovado.getCasoTeste());
			
			
			hlpSimulacaoCreditoPreAprovado
			.acessarMenu()
			.buscaMenu(dp.get("busca"))
			.acessarSimulacao()
			.acessarPreAprovado5014II()
			.preencherValorSolicitado(dp.get("valorSolicitado"))
			.selecionaOpcaoCarenciaPrimeiraParela(dp.get("parcela"))
			.clicarBotaoSimular();
			
		}	
  }
}	
	
