package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import entity.Usuario;
import helper.HlpCreditoConsignadoSimulacao;
import helper.HlpLogin;
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
public class CreditoConsignadoSimulacao extends DriverManagerFactory {

	HlpLogin helperLogin;
	HlpCreditoConsignadoSimulacao HlpSimula�ao;
	Usuario user;
	String tempo;

	@BeforeClass
	public void init() {

		helperLogin = new HlpLogin();
		HlpSimula�ao = new HlpCreditoConsignadoSimulacao();
		user = helperLogin.usr.buscarUsuarioPorPerfil("Lindomar");

	}

	@Test(groups = { "Fluxo b�sico" })
	public void CEN01_SiumulacaoConsignado() {
		for (JSONObject dp : HlpSimula�ao.getDp().getListTestCases()) {
			
			tempo = HlpSimula�ao.getDataHora();
			
			HlpSimula�ao
			.acessarMenu()
			.acessarMenuCreditoConsignado(dp.get("busca"))
			.clicarSimulacaoConsignado();
			
			HlpSimula�ao
			.preencherComboConvenio(dp.get("convenio"))
			.preencherCampoValorConsignado(dp.get("valor"))
			.preencherCampoValorCelular(dp.get("celular"));
			
			
			HlpSimula�ao
			.clicarSimular();
			String IDsimulacaopag = HlpSimula�ao.getIDsimulacaopag(dp.get("idinstituicao").toString(),dp.get("idpessoa").toString(),tempo);
			
			String parcela = HlpSimula�ao.getQuantidadeDeParcelas();
			
			HlpSimula�ao
			.escolherParcela();
			
			HlpSimula�ao
			.clicarBotaoContinuarComProposta()
			.validarOrientacaoConTinuarComAProposta(dp.get("msgOrientacao"))
			.OrientacaoConTinuarComAProposta()
			.clicarBotaoContinuarComProposta();
			
			HlpSimula�ao
//			.clicafoto()
//			.botaoAnexar()
//			.acessarMenuArquivos()
//			.acessarMenuImagens()
//			.acessarCamera()
//			.clicarFoto()
//			.clicaEmAnexarFoto()
//			.clicaNaFoto()
//			.tirarFoto()
//			.botaoConfirmarFoto()
//			.Clica3por4()
//			.clicaEditarfoto()
//			.clicarbotaoSalvar()
			.clicarBotaoContinuarComProposta();
			
			
			HlpSimula�ao
			.confirmarCheckBoxDesconto();
			
			HlpSimula�ao
			.validarPropostaChegouNoBancoDeDados(IDsimulacaopag); 
			HlpSimula�ao
			.validarSePropostaEstaComErro(IDsimulacaopag);
			
			HlpSimula�ao
			.exportaContrato(dp.get("msgPdf").toString())
			.confirmarCheckBoxConcordancia();
			
			HlpSimula�ao
			.preencherCampoSenha(dp.get("assinatura"))
			.clicarBotaoAssinar();
			
			HlpSimula�ao
			.validarPropostaEstaNaMesaOprecao(parcela, IDsimulacaopag )
			.verificarContratoEnviado(dp.get("msg").toString());
		}
		
	}

}
