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
	HlpCreditoConsignadoSimulacao HlpSimulaçao;
	Usuario user;
	String tempo;

	@BeforeClass
	public void init() {

		helperLogin = new HlpLogin();
		HlpSimulaçao = new HlpCreditoConsignadoSimulacao();
		user = helperLogin.usr.buscarUsuarioPorPerfil("Lindomar");

	}

	@Test(groups = { "Fluxo básico" })
	public void CEN01_SiumulacaoConsignado() {
		for (JSONObject dp : HlpSimulaçao.getDp().getListTestCases()) {
			
			tempo = HlpSimulaçao.getDataHora();
			
			HlpSimulaçao
			.acessarMenu()
			.acessarMenuCreditoConsignado(dp.get("busca"))
			.clicarSimulacaoConsignado();
			
			HlpSimulaçao
			.preencherComboConvenio(dp.get("convenio"))
			.preencherCampoValorConsignado(dp.get("valor"))
			.preencherCampoValorCelular(dp.get("celular"));
			
			
			HlpSimulaçao
			.clicarSimular();
			String IDsimulacaopag = HlpSimulaçao.getIDsimulacaopag(dp.get("idinstituicao").toString(),dp.get("idpessoa").toString(),tempo);
			
			String parcela = HlpSimulaçao.getQuantidadeDeParcelas();
			
			HlpSimulaçao
			.escolherParcela();
			
			HlpSimulaçao
			.clicarBotaoContinuarComProposta()
			.validarOrientacaoConTinuarComAProposta(dp.get("msgOrientacao"))
			.OrientacaoConTinuarComAProposta()
			.clicarBotaoContinuarComProposta();
			
			HlpSimulaçao
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
			
			
			HlpSimulaçao
			.confirmarCheckBoxDesconto();
			
			HlpSimulaçao
			.validarPropostaChegouNoBancoDeDados(IDsimulacaopag); 
			HlpSimulaçao
			.validarSePropostaEstaComErro(IDsimulacaopag);
			
			HlpSimulaçao
			.exportaContrato(dp.get("msgPdf").toString())
			.confirmarCheckBoxConcordancia();
			
			HlpSimulaçao
			.preencherCampoSenha(dp.get("assinatura"))
			.clicarBotaoAssinar();
			
			HlpSimulaçao
			.validarPropostaEstaNaMesaOprecao(parcela, IDsimulacaopag )
			.verificarContratoEnviado(dp.get("msg").toString());
		}
		
	}

}
