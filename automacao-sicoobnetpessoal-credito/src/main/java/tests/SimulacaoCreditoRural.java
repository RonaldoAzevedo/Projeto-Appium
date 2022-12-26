package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import entity.Usuario;
import helper.HlpCreditoConsignadoSimulacao;
import helper.HlpLogin;
import helper.HlpSimulacaoCreditoPreAprovado;
import helper.HlpSimulacaoCreditoRural;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import manager.driver.DriverManagerFactory;

@Listeners({ reporter.ReportListener.class })
@Epic("Outros")
@Feature("Credito Consignado Simulacao")
@Severity(SeverityLevel.BLOCKER)
@Test(groups = { "Impeditivo" })
public class SimulacaoCreditoRural extends DriverManagerFactory {

	HlpLogin helperLogin;
	HlpSimulacaoCreditoRural HlpSimula�ao;
	Usuario user;
	String tempo;

	@BeforeClass
	public void init() {

		helperLogin = new HlpLogin();
		HlpSimula�ao = new HlpSimulacaoCreditoRural();
		user = helperLogin.usr.buscarUsuarioPorPerfil("Lindomar");

	}

	@Test(groups = { "Fluxo b�sico" })
	public void CEN01_SiumulacaoConsignado() {
		for (JSONObject dp : HlpSimula�ao.getDp().getListTestCases()) {
			
			
			HlpSimula�ao
			.deletaPropostanoBanco(dp.get("tel"))
			.acessarMenu()
			.acessarMenuCreditoRural(dp.get("busca"));
			
			HlpSimula�ao
			.preencherComboEstado(dp.get("estado"))
			.preencherComboMunicipio(dp.get("municipio"))
			.preencherComboFinalidade(dp.get("finalidade"))
			.preencherComboPrograma(dp.get("programa"))
			.preencherComboPrincipalProduto(dp.get("produto"))
			.preencherComboAtividade(dp.get("atividade"))
			.preencheCampoValorFinciado(dp.get("valor"))
			.preencheCampoTelefone(dp.get("tel"))
			.preencherComboConsorcio(dp.get("consorcio"))
			.preencherComboCestaSafra(dp.get("cestaSafra"))
			.clicaBotaoSolicitarFinanciamento();
			
			HlpSimula�ao
			.validarMSGSimulacao(dp.get("registrado"))
			.clicaBotaoSimularParcelas();
			
			HlpSimula�ao
			.clicaParcela()
			.clicaBotaoRegistrar()
			.validarMSGSimulacaoRegistrada(dp.get("solicitacao"));
			
			
			
		}
		
	}

}
