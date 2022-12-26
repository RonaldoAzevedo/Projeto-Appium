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
	HlpSimulacaoCreditoRural HlpSimulaçao;
	Usuario user;
	String tempo;

	@BeforeClass
	public void init() {

		helperLogin = new HlpLogin();
		HlpSimulaçao = new HlpSimulacaoCreditoRural();
		user = helperLogin.usr.buscarUsuarioPorPerfil("Lindomar");

	}

	@Test(groups = { "Fluxo básico" })
	public void CEN01_SiumulacaoConsignado() {
		for (JSONObject dp : HlpSimulaçao.getDp().getListTestCases()) {
			
			
			HlpSimulaçao
			.deletaPropostanoBanco(dp.get("tel"))
			.acessarMenu()
			.acessarMenuCreditoRural(dp.get("busca"));
			
			HlpSimulaçao
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
			
			HlpSimulaçao
			.validarMSGSimulacao(dp.get("registrado"))
			.clicaBotaoSimularParcelas();
			
			HlpSimulaçao
			.clicaParcela()
			.clicaBotaoRegistrar()
			.validarMSGSimulacaoRegistrada(dp.get("solicitacao"));
			
			
			
		}
		
	}

}
