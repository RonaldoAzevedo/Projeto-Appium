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
public class Antecipacao extends DriverManagerFactory {

	helper.HlpAntecipacao HlpAntecipacao;
	Usuario user;
	String tempo;

	@BeforeClass
	public void init() {

		HlpAntecipacao = new helper.HlpAntecipacao();


	}

	@Test(groups = { "Fluxo básico" })
	public void CEN01_Antecipacao() {
		for (JSONObject dp : HlpAntecipacao.getDp().getListTestCases()) {
			HlpAntecipacao.setCasoTeste(dp.get("CT"));
			HlpAntecipacao.anexaDescricao(HlpAntecipacao.getCasoTeste());
			
			HlpAntecipacao
			.acessarMenu()
			.acessarMenuPix(dp.get("buscaPix"))
			.acessarMenu()
			.acessarMenuAntecipacaoCredito(dp.get("busca"))
			.preencherCampoValorAntecipacaoCheque(dp.get("valor"))
			.clicaBotaoSimular();
			
			HlpAntecipacao
			.clicaBotaoContinuar()
			.preencheCampoSenha(dp.get("assinatura"))
			.clicaBotaoContratar()
			.validarMensagemRemessaAprovada(dp.get("msg").toString());
//			.exportaContrato(dp.get("pdf").toString());
			
			HlpAntecipacao
			.acessarMenu()
			.acessarMenuConsulta(dp.get("buscaConsulata"))
			.preencheComboStatus((String) dp.get("combo"))
			.clicaBotaoConsultar()
			.clicaRemessa();
//			.validarMensagemRemessaEnviada(dp.get("combo").toString());
			
		}
		
	}
	
	@Test(groups = { "Fluxo básico" })
	public void CEN02_ConsultaAntecipacao() {
		for (JSONObject dp : HlpAntecipacao.getDp().getListTestCases()) {
			HlpAntecipacao.setCasoTeste(dp.get("CT"));
			HlpAntecipacao.anexaDescricao(HlpAntecipacao.getCasoTeste());
			
			HlpAntecipacao
			.acessarMenu()
			.acessarMenuAntecipacaoCredito(dp.get("buscaContratacao"))
			.preencherCampoValorAntecipacaoCheque(dp.get("valor"))
			.clicaBotaoSimular()
			.clicaBotaoContinuar();
			
			HlpAntecipacao
			.acessarMenu()
			.acessarMenuConsulta(dp.get("busca"))
			.preencheComboStatus((String) dp.get("combo"))
			.clicaBotaoConsultar()
			.clicabotaoMao()
			.clicaBotaoContinuar()
			.preencheCampoSenha(dp.get("assinatura"))
			.clicaBotaoContratar()
			.validarMensagemRemessaAprovada(dp.get("msgConsulta").toString());
//			.exportaContrato(dp.get("pdf").toString());
			
		}
		
	}
	
	@Test(groups = { "Fluxo básico" })
	public void CEN03_FiltroRecebeveisAntecipacao() {
		for (JSONObject dp : HlpAntecipacao.getDp().getListTestCases()) {
			HlpAntecipacao.setCasoTeste(dp.get("CT"));
			HlpAntecipacao.anexaDescricao(HlpAntecipacao.getCasoTeste());
			
			HlpAntecipacao
			.acessarMenu()
			.acessarMenuAntecipacaoCredito(dp.get("buscaContratacao"));
			
			HlpAntecipacao
			.clickBotaoFiltroRecebiveis()
			.preencheCheque()
			.clicaBotaoSimular();
			
			HlpAntecipacao
			.clicaBotaoContinuar()
			.preencheCampoSenha(dp.get("assinatura"))
			.clicaBotaoContratar()
			.validarMensagemRemessaAprovada(dp.get("msg").toString());
//			.exportaContrato(dp.get("pdf").toString());
			
			HlpAntecipacao
			.acessarMenu()
			.acessarMenuConsulta(dp.get("buscaConsulata"))
			.preencheComboStatus((String) dp.get("combo"))
			.clicaBotaoConsultar()
			.clicaRemessa()
			.validarMensagemRemessaEnviada(dp.get("combo").toString());
		}
		
	}

}
