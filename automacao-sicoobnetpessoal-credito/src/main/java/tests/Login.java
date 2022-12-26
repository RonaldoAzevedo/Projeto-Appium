	package tests;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import entity.Usuario;
import helper.HlpLogin;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import manager.driver.DriverManagerFactory;
import reporter.ReportListener;

@Listeners({ ReportListener.class })
@Epic("Login")
@Feature("Login de acesso")
@Severity(SeverityLevel.BLOCKER)
@Test(groups = { "Impeditivo" })
public class Login extends DriverManagerFactory {

	private HlpLogin login;
	Usuario user;

	@Parameters("perfil")
	@BeforeClass
	public void init(String perfil) {
		login = new HlpLogin();
		user = login.usr.buscarUsuarioPorPerfil(perfil);
		acessaAplicacao(user);
	}
	@BeforeTest
	public void teste() throws IOException {
		File file = new File("excluirSicoob.cmd"); 
		Desktop desktop = Desktop.getDesktop();
		desktop.open(file);
		System.out.println();
	}
	@Parameters("allure")
	@AfterTest
	public void teste2(String allure) throws IOException {
		if(!allure.isEmpty()) {
			File file = new File("SicoobAppAllure.cmd"); 
			Desktop desktop = Desktop.getDesktop();
			desktop.open(file);
		}
		
	}
	

	@Test(groups = { "Fluxo alternativo" })
	public void CEN01_Login() {
		
	}
	
	private void acessaAplicacao(Usuario user) {
		login.acessaContaSimulacao(user.getDados().getCooperativa(), user.getLogin(), user.getPassword());
	}

}
