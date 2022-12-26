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
@Feature("Adesao Cheque Especial")
@Severity(SeverityLevel.BLOCKER)
@Test(groups = { "Impeditivo" })
public class ApagarAdesaoChequeEspecial extends DriverManagerFactory {

	helper.HlpAdesaoChequeEspecial HlpAdesaoChequeEspecial;
	Usuario user;
	String tempo;

	@BeforeClass
	public void init() {

		HlpAdesaoChequeEspecial = new helper.HlpAdesaoChequeEspecial();


	}

	@Test(groups = { "Fluxo básico" })
	public void CEN01_AdesaoChequeEspecial() {
		for (JSONObject dp : HlpAdesaoChequeEspecial.getDp().getListTestCases()) {
			HlpAdesaoChequeEspecial.setCasoTeste(dp.get("CT"));
			HlpAdesaoChequeEspecial.anexaDescricao(HlpAdesaoChequeEspecial.getCasoTeste());
			
			HlpAdesaoChequeEspecial
			.updateBancoDb2()
			.updateBancosql();
			
			
		}	
  }
}	
	
