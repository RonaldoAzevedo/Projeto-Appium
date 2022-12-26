package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import entity.Usuario;
import helper.HlpLoginSisbr;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import manager.driver.DriverManagerFactory;
import uteis.Log;

@Listeners({ reporter.ReportListener.class })
@Epic("Outros")
@Feature("Credito Consignado Simulacao")
@Severity(SeverityLevel.BLOCKER)
@Test(groups = { "Impeditivo" })
public class LoginSisbr extends DriverManagerFactory {

	HlpLoginSisbr HlpSimulacao;
	Usuario user;
	String tempo;
	
	private void acessaAplicacao(Usuario user) {
		HlpSimulacao.acessaContaSimulacao(user.getAmbiente(), user.getLogin(), user.getPassword());
	}


	@BeforeClass
	public void init() {

		HlpSimulacao = new HlpLoginSisbr();
		user = HlpSimulacao.usr.buscarUsuarioPorPerfil("automacao");
		acessaAplicacao(user);

	}

	@Test(groups = { "Fluxo b�sico" })
	public void CEN01_SiumulacaoConsignado() {
//		for (JSONObject dp : HlpSimula�ao.getDp().getListTestCases()) {
//			HlpSimula�ao
//			.preencheUsuario(dp.get("ambiente").toString())
//			.clicaComboAmbiente()
//			.preencheComboAmbiente()
//			.clicaBotaoConfirmar()
//			.limpaCampoUsuario();
//
//			HlpSimula�ao
//			.preencheUsuario(dp.get("usuario").toString())
//			.preencheSenha(dp.get("senha").toString())
//			.clicaBotaoLogin();
//		}
		Log.info("Login efetuado");
		
	}

}
