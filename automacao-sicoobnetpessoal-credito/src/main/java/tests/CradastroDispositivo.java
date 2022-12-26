package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import entity.Usuario;
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
public class CradastroDispositivo extends DriverManagerFactory {

	helper.HlpDispositivo HlpDispositivo;
	Usuario user;
	String tempo;
	String codigoCoop;
	


	@BeforeClass
	public void init() {

		HlpDispositivo = new helper.HlpDispositivo();

	}

	@Test(groups = { "Fluxo básico" })
	public void CEN01_CadastroDispositivo() {
		for (JSONObject dp : HlpDispositivo.getDp().getListTestCases()) {
			
			
			
			HlpDispositivo
			.acessarMenu()
			.acessarMenuPix(dp.get("busca"));
			
			HlpDispositivo
			.preencheCampoApelido()
			.preencherCampoSenha(dp.get("senha"));
			
			
			HlpDispositivo
			.clicaBotaoConfirmar()
			.clicaBotaoNaCooperativar();
			
			codigoCoop = HlpDispositivo.getTextoCodigoCoop();
			
			
			HlpDispositivo
			.updateBancoDispositivo(codigoCoop);
		}
		
	}

}
