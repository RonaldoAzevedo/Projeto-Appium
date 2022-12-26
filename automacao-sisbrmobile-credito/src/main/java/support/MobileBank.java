package support;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import exception.AutomacaoBusinessException;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import manager.expectedConditionsCustom.ExpectedConditionsCustom;
import manager.ui.ActionUi;
import manager.ui.Mobile;
import pageObjects.PgoLogin;
import pageObjects.PgoMenu;
import pageObjects.PgoPropostaDeCredito;
import uteis.Datapool;
import uteis.DateUtilities;
import uteis.Log;
import uteis.ManipuladorConexaoMongoDB;

public class MobileBank<T> extends Mobile {

	protected PgoLogin login;
	protected PgoMenu menu;
	protected PgoPropostaDeCredito pgoPropostaDeCredito;
	protected Datapool usuario;
	protected String casoTeste;
	protected String saldoConta;

	/**
	 * Construtor do Projeto.
	 * 
	 * @param mobileDriver
	 */
	public MobileBank() {
		Locale.setDefault(new Locale("pt", "BR"));
		usuario = new Datapool("usuariosSAD.json");
		login = new PgoLogin();
		menu = new PgoMenu();
	}

	@Override
	protected void defineTelaInicial() {
		try {
			click(login.BOTAO_JASOUSICOOB);
		} catch (Exception e2) {
			try {
				login.CAMPO_COOPERATIVA.isDisplayed();
			} catch (Exception e4) {
				restartApp();
				defineTelaInicial();
			}
		}
	}

	/**
	 * M�todo para manipula��o dos menus da aplica��o
	 * 
	 * @param mn - Informar texto apresentado no dispositivo
	 */

	@SuppressWarnings("unchecked")
	@Deprecated
	public T acessaMenu(String mn) {
		aguardarLoadSistema();
		trataErrosPadrao();
		if (mn.equalsIgnoreCase("Atendimento Pessoal")) {
			defineTelaInicial();
		} else if (mn.equalsIgnoreCase("Externo - Localize o Sicoob")) {
			click(menu.BOTAO_LOCALIZE_SICOOB);

		} else if (mn.equalsIgnoreCase("Externo - Fale conosco")) {
			click(menu.BOTAO_FALE_CONOSCO);

		} else if (mn.equalsIgnoreCase("Saldo de conta corrente")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Extrato de tarifas")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Extrato de conta corrente")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Informe de imposto de renda")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Informe de contribui��es")) {
			buscaFuncionalidadeParcial("informe de contribui", mn, 1);

		} else if (mn.equals("Informe de rendimentos")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Pacote de servi�os")) {
			buscaFuncionalidadeParcial("pacote de servi", mn, 1);

		} else if (mn.equalsIgnoreCase("Conv�nios (�gua, luz, telefone, g�s e outros)")) {
			buscaFuncionalidadeParcial("Conv", mn, 1);

		} else if (mn.equalsIgnoreCase("T�tulos (boletos banc�rios)")) {
			buscaFuncionalidadeParcial("boletos", mn, 1);

		} else if (mn.equalsIgnoreCase("T�tulos")) {
			buscaFuncionalidadeParcial("tulos", mn, 1);

		} else if (mn.equalsIgnoreCase("Conv�nios e Tributos")) {
			buscaFuncionalidadeParcial("Conv", mn, 1);

		} else if (mn.equalsIgnoreCase("Favorecidos - Transfer�ncias")) {
			buscaFuncionalidadeParcial("Favorecidos - Transf", mn, 1);

		} else if (mn.equalsIgnoreCase("Favorecidos - Pagamentos")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Entre contas correntes")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Conta corrente para poupan�a")) {
			buscaFuncionalidadeParcial("Conta corrente para poup", mn, 1);

		} else if (mn.equalsIgnoreCase("C. corrente para Conta Yoou")) {
			buscaFuncionalidadeParcial("C. corrente para Conta Y", mn, 1);

		} else if (mn.equalsIgnoreCase("Poupan�a para conta corrente")) {
			buscaFuncionalidadeParcial("para conta corrente", mn, 1);

		} else if (mn.equalsIgnoreCase("DOC")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("TED")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Limite Pr�-Aprovado")) {
			buscaFuncionalidadeParcial("Limite Pr", mn, 1);

		} else if (mn.equalsIgnoreCase("Limites de Cr�dito Pr�-Aprovado")) {
			buscaFuncionalidadeParcial("Limites de Cr", mn, 1);

		} else if (mn.equalsIgnoreCase("Inclus�o")) {
			buscaFuncionalidadeParcial("Inclus", mn, 1);

		} else if (mn.equalsIgnoreCase("Extrato Conta PP")) {
			buscaFuncionalidadeSwipe("Extrato", 2);

		} else if (mn.equalsIgnoreCase("Aplica��o - Poupan�a")) {
			buscaFuncionalidadeParcial("Aplica", "Aplica��o", 2);

		} else if (mn.equalsIgnoreCase("Consulta")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Financiamento de ve�culo")) {
			buscaFuncionalidadeParcial("Financiamento de ve", mn, 1);

		} else if (mn.equalsIgnoreCase("Cancelamento")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Cadastro API")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Compra e venda")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Resgate - Poupan�a")) {
			buscaFuncionalidade("Resgate", 2);

		} else if (mn.equalsIgnoreCase("Consultar Termo de Ades�o")) {
			buscaFuncionalidadeParcial("Consultar Termo", mn, 1);

		} else if (mn.equalsIgnoreCase("Computadores Cadastrados")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Consulta API")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Consulta Rateio de Sobras")) {
			buscaFuncionalidade("Rateio de sobras", 1);

		} else if (mn.equalsIgnoreCase("Celulares Cadastrados")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Altera��o de senha de acesso")) {
			buscaFuncionalidadeParcial("de senha de acesso", mn, 1);

		} else if (mn.equalsIgnoreCase("Taxas de Cr�dito Pr�-Aprovado")) {
			buscaFuncionalidadeParcial("Taxas de Cr", mn, 1);

		} else if (mn.equalsIgnoreCase("Ades�o/Cancelamento")) {
			buscaFuncionalidadeParcial("o/Cancelamento", mn, 1);

		} else if (mn.equalsIgnoreCase("Comprovante de Ades�o/Cancelamento")) {
			buscaFuncionalidadeParcial("Comprovante de Ades", mn, 1);

		} else if (mn.equalsIgnoreCase("Gerar c�digo de seguran�a")) {
			buscaFuncionalidadeParcial("digo de seguran", mn, 1);

		} else if (mn.equalsIgnoreCase("Recarga telef")) {
			buscaFuncionalidadeParcial("Recarga telef", "Recarga telef�nica", 2);

		} else if (mn.equalsIgnoreCase("Cancelar ades�o dep�sito cheque")) {
			buscaFuncionalidadeParcial("Cancelar ades", mn, 1);

		} else if (mn.equalsIgnoreCase("Efetiva��o em dois passos")) {
			buscaFuncionalidadeParcial("dois passos", mn, 1);

		} else if (mn.equalsIgnoreCase("Comprovantes - Recarga telef�nica")) {
			buscaFuncionalidadeParcial("Recarga telef", "Recarga telef�nica", 3);

		} else if (mn.equalsIgnoreCase("DARF")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Notifica��es")) {
			buscaFuncionalidadeParcial("Notifica", mn, 1);

		} else if (mn.equalsIgnoreCase("Leitor c�digo de barras")) {
			buscaFuncionalidadeParcial("Leitor c", mn, 1);

		} else if (mn.equalsIgnoreCase("Leitor com QR Code")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Sacar")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Ades�o ao DDA")) {
			buscaFuncionalidadeParcial("ao DDA", mn, 1);

		} else if (mn.equalsIgnoreCase("Cancelamento de ades�o ao DDA")) {
			buscaFuncionalidadeParcial("Cancelamento de Ade", mn, 1);

		} else if (mn.equalsIgnoreCase("Consulta de boletos a pagar")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Extrato Consolidado de Encargos")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Extrato de conta capital")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Identifica��o Positiva do ATM")) {
			buscaFuncionalidadeParcial("Identific", mn, 1);

		} else if (mn.equalsIgnoreCase("FGTS")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Suspens�o de fatura impressa")) {
			buscaFuncionalidade("Fatura Digital", 1);

		} else if (mn.equalsIgnoreCase("Resumo da fatura")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("DAS")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("GARE")) {
			buscaFuncionalidadeParcial("GARE", "GARE (DR, ICMS, ITCMD)", 1);

		} else if (mn.equalsIgnoreCase("Limite dispon�vel")) {
			buscaFuncionalidadeParcial("Limite dispon", mn, 1);

		} else if (mn.equalsIgnoreCase("Registrar")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Dados b�sicos")) {
			buscaFuncionalidadeParcial("Dados b", mn, 1);

		} else if (mn.equalsIgnoreCase("Dados complementares")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Saldo Previd�ncia")) {
			buscaFuncionalidadeParcial("Saldo", "Saldo", 2);

		} else if (mn.equalsIgnoreCase("Extrato de Contribui��es")) {
			buscaFuncionalidadeParcial("Extrato de Contribui", "Extrato de contribui��es", 1);

		} else if (mn.equalsIgnoreCase("Extrato de rentabilidade")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equals("Informe de Rendimentos - Outras op��es")) {
			buscaFuncionalidade("Informe de Rendimentos", 3);

		} else if (mn.equalsIgnoreCase("GPS")) {
			buscaFuncionalidadeParcial("GPS", "GPS - Guia da Previd�ncia Social", 1);

		} else if (mn.equalsIgnoreCase("Contracheque")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Recibo de f�rias")) {
			buscaFuncionalidadeParcial("Recibo de f", mn, 1);

		} else if (mn.equalsIgnoreCase("Extrato Detalhado")) {
			buscaFuncionalidade("Extrato detalhado", 1);

		} else if (mn.equalsIgnoreCase("Cancelar T�tulos Agendados")) {
			buscaFuncionalidadeParcial("tulos agendados", "T�tulos agendados", 1);

		} else if (mn.equalsIgnoreCase("Extrato - Investimento")) {
			buscaFuncionalidade("Extrato", 1);

		} else if (mn.equalsIgnoreCase("Renegocie sua d�vida")) {
			buscaFuncionalidadeParcial("Renegocie sua", mn, 1);

		} else if (mn.equalsIgnoreCase("Comprovante - Transfer�ncia")) {
			buscaFuncionalidadeParcial("ncias", "Transfer�ncias", 1);

		} else if (mn.equalsIgnoreCase("Transfer�ncias entre contas")) {
			buscaFuncionalidadeParcial("ncias entre contas", "Transfer�ncias entre contas", 1);

		} else if (mn.equalsIgnoreCase("Transfer�ncia digital")) {
			buscaFuncionalidadeParcial("ncia digital", mn, 1);

		} else if (mn.equalsIgnoreCase("Cancelar Transfer�ncias agendados")) {
			buscaFuncionalidadeParcial("ncias agendados", "Transfer�ncias agendados", 1);

		} else if (mn.equalsIgnoreCase("Lan�amentos futuros")) {
			buscaFuncionalidadeParcial("amentos futuros", mn, 1);

		} else if (mn.equalsIgnoreCase("Conv�nios e Tributos agendados")) {
			buscaFuncionalidadeParcial("nios e Tributos agendados", mn, 1);

		} else if (mn.equalsIgnoreCase("Atualiza��o Cadastral - Contato")) {
			buscaFuncionalidade("Contato", 1);

		} else if (mn.equalsIgnoreCase("Atualiza��o Cadastral - Renda")) {
			buscaFuncionalidade("Renda", 1);

		} else if (mn.equalsIgnoreCase("Atualiza��o Cadastral - Endere�o")) {
			buscaFuncionalidadeParcial("Endere", "Endere�o", 1);

		} else if (mn.equalsIgnoreCase("Aplica��o - Fundo de Investimento")) {
			buscaFuncionalidadeParcial("Aplica", "Aplica��o", 3);

		} else if (mn.equalsIgnoreCase("Empr�stimos - Extrato")) {
			buscaFuncionalidadeParcial("Empr", "Empr�stimos", 2);

		} else if (mn.equalsIgnoreCase("Libera��o de celular")) {
			buscaFuncionalidadeParcial("o de celular", mn, 1);

		} else if (mn.equalsIgnoreCase("Libera��o de computador")) {
			buscaFuncionalidadeParcial("o de computador", mn, 1);

		} else if (mn.equalsIgnoreCase("Cancelamento de Aplica��o - Poupan�a")) {
			buscaFuncionalidadeParcial("Cancelamento de Aplica", "Cancelamento de aplica��o", 2);

		} else if (mn.equalsIgnoreCase("Extrato - Fundo de Investimento")) {
			buscaFuncionalidadeSwipe("Extrato", 3);

		} else if (mn.equalsIgnoreCase("Consulta Posi��o do Cotista")) {
			buscaFuncionalidadeParcial("Consulta Posi", mn, 1);

		} else if (mn.equalsIgnoreCase("Resgate - Fundo de investimento")) {
			buscaFuncionalidade("Resgate", 3);

		} else if (mn.equalsIgnoreCase("Emiss�o de comprovantes - Poupan�a")) {
			buscaFuncionalidadeParcial("o de comprovantes", "Emiss�o de comprovantes", 2);

		} else if (mn.equalsIgnoreCase("Desbloqueio de cheque em domic�lio")) {
			buscaFuncionalidadeParcial("Desbloqueio de cheque", mn, 1);

		} else if (mn.equalsIgnoreCase("Baixa de cheque inutilizado")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Comprovantes DDA")) {
			buscaFuncionalidade("Comprovantes", 2);

		} else if (mn.equalsIgnoreCase("Saldo Poupan�a")) {
			buscaFuncionalidade("Saldo", 1);

		} else if (mn.equalsIgnoreCase("Termo de Ades�o do Cr�dito Pr�-Aprovado")) {
			buscaFuncionalidadeParcial("Termo de Ades", mn, 1);

		} else if (mn.equals("IPVA e taxas do DETRAN")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equals("Simula��o")) {
			buscaFuncionalidadeParcial("Simula", mn, 1);

		} else if (mn.equals("Empr�stimo - Contrata��o")) {
			buscaFuncionalidadeParcial("contrat", "Contrata��o", 1);

		} else if (mn.equals("Consultar Comprovantes")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Cancelamento de Aplica��o - Fundo de Investimento")) {
			buscaFuncionalidadeParcial("Cancelamento de Aplica", "Cancelamento de Aplica��o", 1);

		} else if (mn.equalsIgnoreCase("Cancelamento de Resgate - Poupan�a")) {
			buscaFuncionalidade("Cancelamento de resgate", 1);

		} else if (mn.equalsIgnoreCase("Cancelamento de Resgate")) {
			buscaFuncionalidade("Cancelamento de Resgate", 1);

		} else if (mn.equalsIgnoreCase("Extrato de apropria��o di�ria")) {
			buscaFuncionalidadeParcial("Extrato de apropria", mn, 1);

		} else if (mn.equalsIgnoreCase("Emiss�o de Comprovantes - Renda Fixa")) {
			buscaFuncionalidadeParcial("o de comprovantes", "Emiss�o de comprovantes", 1);

		} else if (mn.equalsIgnoreCase("Aplica��o - Renda Fixa")) {
			buscaFuncionalidadeParcial("Aplica", "Aplica��o", 1);

		} else if (mn.equalsIgnoreCase("Cancelamento de Aplica��o - Renda Fixa")) {
			buscaFuncionalidadeParcial("Cancelamento de Aplica", "Cancelamento de aplica��o", 1);

		} else if (mn.equalsIgnoreCase("Resgate - RDC")) {
			buscaFuncionalidade("Resgate", 1);

		} else if (mn.equals("Solicitar")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equalsIgnoreCase("Comprovantes Empr�stimo")) {
			buscaFuncionalidade("Comprovantes", 1);

		} else if (mn.equalsIgnoreCase("Sipag Vendas")) {
			buscaFuncionalidade("Vendas", 1);

		} else if (mn.equalsIgnoreCase("Sipag Antecipa��o")) {
			buscaFuncionalidadeParcial("Antecipa", "Antecipa��o", 1);

		} else if (mn.equalsIgnoreCase("Sipag Ordem de Servi�o")) {
			buscaFuncionalidadeParcial("Ordem de servi", "Ordem de servi�o", 1);

		} else if (mn.equalsIgnoreCase("Seguro de Vida - Consultar")) {
			buscaFuncionalidadeParcial("consultar", "Consultar", 1);

		} else if (mn.equalsIgnoreCase("Seguro de Vida - Contratacao")) {
			buscaFuncionalidadeParcial("Contrata", "Contrata��o", 2);

		} else if (mn.equalsIgnoreCase("Seguro Residencial Contrata��o")) {
			buscaFuncionalidadeParcial("Contrata", "Contrata��o", 3);

		} else if (mn.equalsIgnoreCase("In�cio")) {
			if (SO.equalsIgnoreCase("IOS")) {
				anexaDescricao("Buscando menu: In�cio");
				click(menu.BOTAO_MENU);
				click(menu.MENU_INICIO);
				aguardarLoadSistema();
			} else {
				buscaFuncionalidadeParcial("cio", "In�cio", 1);
			}

		} else if (mn.equalsIgnoreCase("Nova Conta Poupan�a")) {
			buscaFuncionalidadeParcial("Nova Conta", "Nova Conta Poupan�a", 1);

		} else if (mn.equals("Certificado de participante")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equals("Integraliza��o de capital")) {
			buscaFuncionalidadeParcial("Integraliza", "Integraliza��o de capital", 1);

		} else if (mn.equals("Cancelamento de integraliza��o")) {
			buscaFuncionalidadeParcial("Cancelamento", "Cancelamento", 1);

		} else if (mn.equals("Apolices")) {
			buscaFuncionalidadeParcial("lices", "Ap�lices", 1);

		} else if (mn.equals("Recusa de d�bito autom�tico agendado")) {
			buscaFuncionalidadeParcial("Recusa", "Recusa de d�bito autom�tico agendado", 1);

		} else if (mn.equals("D�bito automatico")) {
			buscaFuncionalidadeParcial("Debito automatico", mn, 1);

		} else if (mn.equals("Dep�sito de cheques")) {
			buscaFuncionalidadeParcial("Dep", mn, 1);

		} else if (mn.equals("Informe de Rendimentos - Investimentos")) {
			buscaFuncionalidade("Informe de Rendimentos", 1);

		} else if (mn.equals("Consulta de cheques devolvidos")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equals("Copia de imagem de cheques")) {
			buscaFuncionalidadeParcial("Imagem de cheques", "C�pia de Imagem de Cheques", 1);

		} else if (mn.equals("Susta��o de Cheque")) {
			buscaFuncionalidadeParcial("Susta", "Susta��o de cheque", 1);

		} else if (mn.equals("Extrato da fatura")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equals("Faturas parceladas")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equals("Fa�a Parte - Indica��o")) {
			buscaFuncionalidadeParcial("Indica", "Indica��o", 1);

		} else if (mn.equals("Parcelamento de fatura")) {
			buscaFuncionalidade(mn, 1);

		} else if (mn.equals("Fatura do cart�o de cr�dito")) {
			buscaFuncionalidadeParcial("Fatura do cart", "Fatura do cart�o de cr�dito", 3);

		} else if (mn.equals("Fatura do cart�o de cr�dito - Conta corrente")) {
			buscaFuncionalidadeParcial("Fatura do cart", "Fatura do cart�o de cr�dito", 2);

		} else if (mn.equals("Cart�o Virtual")) {
			buscaFuncionalidadeParcial("Virtual", "Cart�o Virtual", 1);

		} else if (mn.equals("Portabilidade")) {
			buscaFuncionalidade(mn, 1);
		} else if (mn.equals("Portabilidade Conta Sal�rio")) {
			buscaFuncionalidadeParcial("Portabilidade Conta Sal", "Portabilidade Conta Sal�rio", 1);
		} else if (mn.equals("Consorcio - Extrato")) {
			buscaFuncionalidade("Extrato", 4);
		} else if (mn.equals("Valores a receber")) {
			buscaFuncionalidade(mn, 1);
		} else if (mn.equals("Consorcio")) {
			buscaFuncionalidadeParcial("Consorcio", "Cons�rcio", 1);
		} else if (mn.equals("Contrata��o")) {
			buscaFuncionalidadeParcial("Contrata", "Contrata��o", 2);
		} else if (mn.equals("Opera��es")) {
			buscaFuncionalidadeParcial("Opera", "Opera��es", 1);
		} else if (mn.equals("Seguro Vida")) {
			buscaFuncionalidadeParcial("Contrata", "Contrata��o", 2);
		} else if (mn.equalsIgnoreCase("Extrato Consolidado")) {
			buscaFuncionalidade("Extrato consolidado", 1);
		} else if (mn.equals("alteracao contrato op.")) {
			buscaFuncionalidadeParcial("alteracao contrato op.", "Altera��o contrato op. cr�dito (COVID-19)", 1);
		} else if (mn.equals("Previd�ncia - Ades�o")) {
			buscaFuncionalidadeParcial("Adesao", "Ades�o", 2);
		} else if (mn.equals("Acompanhar Proposta")) {
			buscaFuncionalidade(mn, 1);
		} else if (mn.equals("Cr�dito Rural - Contrata��o")) {
			buscaFuncionalidadeParcial("Contrata", "Contrata��o ", 1);
		} else if (mn.equals("Pagamento opera��es cr�dito")) {
			buscaFuncionalidadeParcial("Opera", "Opera��es de cr�dito", 1);
		} else if (mn.equals("Gerenciamento de Chaves")) {
			buscaFuncionalidade(mn, 1);
		} else if (mn.equals("Reivindica��es")) {
			buscaFuncionalidadeParcial("Reivindica", "Reivindica��es", 1);
		} else if (mn.equals("Pagar com Chave/Manual")) {
			buscaFuncionalidade(mn, 1);
		} else if (mn.equalsIgnoreCase("Proposta de cr�dito")) {
			buscaFuncionalidadeParcial("Proposta de cr", mn, 1);
		} else if (mn.equalsIgnoreCase("Limite de transfer�ncia")) {
			buscaFuncionalidadeParcial("Limite de transfer", mn, 1);
		} else if (mn.equalsIgnoreCase("Requisi��o de dados pessoais (LGPD)")) {
			buscaFuncionalidadeParcial("LGPD", mn, 1);
		} else if (mn.equals("Pix Saque/Troco")) {
			buscaFuncionalidade(mn, 1);
		}
		if (SO.equalsIgnoreCase("IOS") && !mn.equalsIgnoreCase("Atendimento Pessoal")
				&& !mn.equalsIgnoreCase("Sacar")) {
			changeDriverContextToWeb();
		}
		aguardarLoadSistema();
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T acessarMenuPorHierarquia(String menuPai, String submenu, String opcao) {
		anexaDescricao("Buscando menu: \"" + menuPai + "\" submenu: \"" + submenu + "\"" + "Op��o:" + opcao + "");
		String xpathMenu = "//android.widget.RelativeLayout[./*[@" + atributo + "='" + menuPai + "']]";
		String xpathOpcao = "//android.widget.RelativeLayout[./*[@" + atributo + "='" + submenu
				+ "']]/following-sibling::*[android.widget.TextView[@" + atributo + "='" + opcao + "']]";
		aguardarLoadSistema();
		trataErrosPadrao();
		click(menu.BOTAO_MENU);

		try {
			swipe(ScrollDirection.DOWN, new By.ByXPath(xpathMenu), menu.LISTA_MENU);
			click(getDriverMobile().findElementByXPath(xpathMenu));
			swipe(ScrollDirection.DOWN, new By.ByXPath(xpathOpcao), menu.LISTA_MENU);
			click(getDriverMobile().findElementByXPath(xpathOpcao));
		} catch (Exception e) {
			throw new AutomacaoBusinessException();
		}

		return (T) this;
	}

	private void limpaMenuAnterior() {
		try {
			if (menu.BOTAO_RESET.isDisplayed()) {
				click(menu.BOTAO_RESET);
			}
		} catch (Exception e) {
			limpaCampo(menu.CAMPO_CONSULTA_MENU);
		}
	}

	/**
	 * M�todo para finalizar a conex�o com o Driver
	 */
	public void fecharAplica��o() {
		anexaDescricao("Fechando Aplica��o");
		getDriverMobile().closeApp();
		getDriverMobile().quit();
	}

	public void restartApp() {
		anexaDescricao("Reiniciando Aplica��o");
		getDriverMobile().launchApp();
	}

	/**
	 * M�todo para realizar logoff do Mobile Bank
	 */
	@Override
	public void logoff() {
		anexaDescricao("Logoff de Aplica��o");
		if (SO.equalsIgnoreCase("IOS")) {
			click(login.BOTAO_CONTAS);
		} else {
			aguardarLoadSistema();
			click(login.BOTAO_CONTAS);
			try {
				login.BOTAO_NAO.isDisplayed();
				click(login.BOTAO_NAO);
			} catch (Exception e) {
			}
		}
	}

	/**
	 * M�todo para buscar funcionalidades
	 * 
	 * @param referencia
	 */
	private void buscaFuncionalidade(String mn, int posicao) {
		anexaDescricao("Buscando menu: \"" + mn + "\" Posi��o: \"" + posicao + "\"");
		aguardaElemento(menu.BOTAO_MENU);
		click(menu.BOTAO_MENU);
		aguardaElemento(menu.CAMPO_CONSULTA_MENU);
		limpaMenuAnterior();
		preencheCampo(menu.CAMPO_CONSULTA_MENU, mn);
		if (SO.equalsIgnoreCase("IOS")) {
			click(getDriverMobile()
					.findElement(By.xpath("//XCUIElementTypeStaticText[@name='" + mn + "'][" + posicao + "]")));
		} else {
			click(getDriverMobile()
					.findElement(By.xpath("//android.widget.TextView[@text='" + mn + "'][" + posicao + "]")));
			aguardarLoadSistema();
		}
	}

	/**
	 * M�todo para buscar funcionalidades
	 * 
	 * @param referencia
	 */
	private void buscaFuncionalidadeSwipe(String mn, int posicao) {
		anexaDescricao("Buscando menu: \"" + mn + "\" Posi��o: \"" + posicao + "\"");
		click(menu.BOTAO_MENU);
		limpaMenuAnterior();
		preencheCampo(menu.CAMPO_CONSULTA_MENU, mn);
		if (SO.equalsIgnoreCase("IOS")) {
			click(getDriverMobile()
					.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='" + mn + "'])[" + posicao + "]")));
		} else {
			try {
				getDriverMobile()
						.findElement(By.xpath("(//android.widget.TextView[@text='" + mn + "'])[" + posicao + "]"))
						.isDisplayed();
			} catch (Exception e) {
				swipe(ScrollDirection.DOWN,
						By.xpath("(//android.widget.TextView[@text='" + mn + "'])[" + posicao + "]"), login.TELA_MENU);
			}
			click(getDriverMobile()
					.findElement(By.xpath("(//android.widget.TextView[@text='" + mn + "'])[" + posicao + "]")));
			aguardarLoadSistema();
		}

	}

	/**
	 * M�todo para buscar funcionalidades com nome parcial
	 * 
	 * @param relativo
	 * @param menu
	 */
	private void buscaFuncionalidadeParcial(String relativo, String mn, int posicao) {
		anexaDescricao("Buscando menu Parcial: \"" + relativo + "\" menu: \"" + mn + "\" Posi��o: \"" + posicao + "\"");
		aguardaElemento(menu.BOTAO_MENU);
		click(menu.BOTAO_MENU);
		aguardaElemento(menu.CAMPO_CONSULTA_MENU);
		limpaMenuAnterior();
		preencheCampo(menu.CAMPO_CONSULTA_MENU, relativo);
		if (SO.equalsIgnoreCase("IOS")) {
			click(getDriverMobile()
					.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='" + mn + "'])[" + posicao + "]")));
		} else {
			click(getDriverMobile()
					.findElement(By.xpath("(//android.widget.TextView[@text='" + mn + "'])[" + posicao + "]")));
			aguardarLoadSistema();
		}
	}

	/**
	 * M�todo manipulador do componente Calend�rio Os campos devem ser informados no
	 * formato abaixo:
	 * 
	 * @data - formato dd/MM/yyyy
	 */
	public void selecionaCalendario(MobileElement el, String data) {
		anexaDescricao("Buscando Data: \"" + data + "\"");
		String dia, mes, ano;
		String[] dta = data.split("/");
		dia = dta[0];
		mes = dta[1];
		ano = dta[2];

		if (SO.equals("Android")) {
			click(el);
			Android_Calendario(dia, mes, ano);
		} else {
			preencheCampo(el, ano + "-" + mes + "-" + dia);
		}
	}

	private void Android_Calendario(String dia, String mes, String ano) {
		MobileElement calendarAno = (MobileElement) wait.until(ExpectedConditions.visibilityOf(menu.CAMPO_ANO));
		if (!ano.equals(calendarAno.getText())) {
			click(calendarAno);
			MobileElement anoElement = null, dimensionador = null;
			int ySup, yInf;

			for (int i = 1; i <= 100; i++) {
				anoElement = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(menu.TEXTO_ANO));
				dimensionador = (MobileElement) wait
						.until(ExpectedConditions.elementToBeClickable(menu.TEXTO_ANO_ANTERIOR));
				ySup = dimensionador.getLocation().getY();
				yInf = ySup + dimensionador.getSize().getHeight();

				if (anoElement.getText().equals(ano)) {
					anoElement.click();
					break;
				}

				if (Integer.parseInt(ano) > Integer.parseInt(anoElement.getText())) {
					swipe(300, yInf, 300, ySup);
				} else {
					swipe(300, ySup, 300, yInf);
				}
			}
		}

		MobileElement calendarDia = (MobileElement) wait.until(ExpectedConditions.visibilityOf(menu.CAMPO_DIA));
		Locale loc = new Locale("pt", "BR");

		DateFormat df = new SimpleDateFormat("dd MMM yyyy", loc);
		Date dt;
		try {
			dt = df.parse(calendarDia.getAttribute("contentDescription"));
			df = new SimpleDateFormat("MM", loc);
			int deltaMes = Integer.parseInt(mes) - Integer.parseInt(df.format(dt));

			if (deltaMes > 0) {
				for (int i = 0; i < deltaMes; i++) {
					click(menu.BOTAO_PROXIMO_MES);
				}
			} else {
				for (int i = 0; i < deltaMes * -1; i++) {
					click(menu.BOTAO_MES_ANTERIOR);
				}
			}
			click(getDriverMobile().findElement(By.xpath(
					"//android.widget.ViewAnimator/android.view.ViewGroup/com.android.internal.widget.ViewPager/android.view.View/android.view.View["
							+ dia + "]")));
			click(menu.BOTAO_DEFINIR_DATA);

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metodo para compartilhar LINK
	 * 
	 * @param casoTeste
	 */
	public void compartilharLink() {
		aguardaElemento(menu.BOTAO_COMPARTILHAR);
		click(menu.BOTAO_COMPARTILHAR);
		aguardaElemento(menu.BOTAO_LINK);
		click(menu.BOTAO_LINK);
		try {
			aguardarLoadSistema();
			menu.LABEL_ESCOLHA_APLICATIVO.isDisplayed();
			pontoVerificacao(menu.LABEL_ESCOLHA_APLICATIVO, "enabled", "true");
		} catch (Exception e) {
			pontoVerificacao(menu.TEXTO_PREVISUALIZACAO, "enabled", "true");
		}
		anexaEvidencia(casoTeste);
		pressionaVoltar();
		if (SO.equalsIgnoreCase("IOS")) {
			changeDriverContextToWeb();
		}
	}

	/**
	 * Metodo para compartilhar LINK
	 * 
	 * @param casoTeste
	 */
	public void compartilharImagem() {
		aguardaElemento(menu.BOTAO_COMPARTILHAR);
		click(menu.BOTAO_COMPARTILHAR);
		aguardaElemento(menu.BOTAO_IMG);
		click(menu.BOTAO_IMG);
		try {
			aguardarLoadSistema();
			menu.LABEL_ESCOLHA_APLICATIVO.isDisplayed();
			pontoVerificacao(menu.LABEL_ESCOLHA_APLICATIVO, "enabled", "true");
		} catch (Exception e) {
			pontoVerificacao(menu.LABEL_ESCOLHA_APLICATIVO, "enabled", "true");
		}
		anexaEvidencia(casoTeste);
		pressionaVoltar();
		if (SO.equalsIgnoreCase("IOS")) {
			changeDriverContextToWeb();
		}
	}


	@SuppressWarnings("unchecked")
	public T acessaMenu(Menu menu, Submenu submenu) {
		aguardarLoadSistema();
		trataErrosPadrao();
		List<String> menuOpcao = Menu.getMenu(menu, submenu);
		String opcao = menuOpcao.get(3);
		String posicao = menuOpcao.get(4);
		By byOpcao = new By.ByXPath("(//*[@resource-id='br.com.sicoobnet.homol:id/titulo' and @text='" + opcao
				+ "'])[" + posicao + "]");
		click(this.menu.BOTAO_MENU);
		limpaMenuAnterior();
		preencheCampo(this.menu.CAMPO_CONSULTA_MENU, Submenu.getSubmenu(submenu).get(0));
		if (!menu.equals(Menu.ACESSO_RAPIDO)) {
			try {
				this.menu.OPCAO_ACESSORAPIDO.isDisplayed();
				click(this.menu.OPCAO_ACESSORAPIDO);
				swipe(ScrollDirection.DOWN, byOpcao, this.menu.CONTENT_LISTAMENU);
				click(getDriverMobile().findElement(byOpcao));
			} catch (Exception e) {
				swipe(ScrollDirection.DOWN, byOpcao, this.menu.CONTENT_LISTAMENU);
				click(getDriverMobile().findElement(byOpcao));
			}
		} else {
			swipe(ScrollDirection.DOWN, byOpcao, this.menu.CONTENT_LISTAMENU);
			click(getDriverMobile().findElement(byOpcao));
		}
		return (T) this;
	}

	/**
	 * M�todo para recuperar o texto de um elemento
	 * 
	 * @param object
	 * @return
	 */

	public String pegarTextoElemento(MobileElement object) {
		return object.getText().toLowerCase();
	}

	/**
	 * Metodo para exportar PDF
	 * 
	 * @param casoTeste
	 * @param elemento
	 */
	public void exportarPDF() {
		aguardarLoadSistema();
		trataErrosPadrao();
//		swipe(ScrollDirection.DOWN, login.BOTAO_EXPORTAR, login.TELA_PADRAO);
//		click(login.BOTAO_EXPORTAR);
//      aguardarLoadSistema();
//		try {
//			menu.LABEL_EXPORTARPREVISUALIZACAO.isDisplayed();
//			pontoVerificacao(menu.LABEL_EXPORTARPREVISUALIZACAO, "enabled", "true");
//
//		} catch (NoSuchElementException e1) {
//			pontoVerificacao(menu.LABEL_EXPORTARPREVISUALIZACAO, "enabled", "true");
//		}
//		click(menu.BOTAO_COMPARTILHAR);
//		aguardarLoadSistema();
//		click(login.BOTAO_PDF);
		try {
			swipe(ScrollDirection.DOWN, login.BOTAO_EXPORTAR, login.TELA_PADRAO);
			click(login.BOTAO_EXPORTAR);
			click(login.BOTAO_PDF);
			aguardarLoadSistema();
			menu.LABEL_ESCOLHA_APLICATIVO.isDisplayed();
			aguardaElemento(menu.LABEL_ESCOLHA_APLICATIVO);
			pontoVerificacao(menu.LABEL_ESCOLHA_APLICATIVO, "enabled", "true");
		} catch (NoSuchElementException e1) {
			aguardaElemento(menu.LABEL_ESCOLHA_APLICATIVO);
			pontoVerificacao(menu.LABEL_ESCOLHA_APLICATIVO, "enabled", "true");
		}
		anexaEvidencia(getCasoTeste());
		pressionaVoltar();
//		click(menu.BOTAO_VOLTAR_SUPERIOR);
	}

	public void exportarPDF(Object baseline) {
		aguardarLoadSistema();
		trataErrosPadrao();
		swipe(ScrollDirection.DOWN, login.BOTAO_EXPORTAR, login.TELA_PADRAO);
		click(login.BOTAO_EXPORTAR);
		aguardarLoadSistema();
		pontoVerificacao(baseline);
		click(login.BOTAO_COMPARTILHAR);
		aguardaElemento(login.BOTAO_PDF_PREVISUALIZACAO);
		pontoVerificacao(login.BOTAO_PDF_PREVISUALIZACAO, "clickable", "true");
		pontoVerificacao(login.BOTAO_PNG_PREVISUALIZACAO, "clickable", "true");
		click(login.BOTAO_PDF_PREVISUALIZACAO);
		pontoVerificacao(login.BOTAO_GMAIL, "clickable", "true");
		pontoVerificacao(login.BOTAO_SALVARDRIVE, "clickable", "true");
		anexaEvidencia(getCasoTeste());
		pressionaVoltar();
		pressionaVoltar();
	}

	/**
	 * Metodo para exportar imagem
	 * 
	 * @param casoTeste
	 * @param elemento
	 */
	public void exportarImagem() {
		aguardarLoadSistema();
		trataErrosPadrao();
//		swipe(ScrollDirection.DOWN, login.BOTAO_EXPORTAR, login.TELA_PADRAO);
//		click(menu.BOTAO_EXPORTAR);
//		aguardarLoadSistema();
//		try {
//			menu.LABEL_EXPORTARPREVISUALIZACAO.isDisplayed();
//			pontoVerificacao(menu.LABEL_EXPORTARPREVISUALIZACAO, "enabled", "true");
//		} catch (Exception e) {
//			pontoVerificacao(menu.LABEL_EXPORTARPREVISUALIZACAO, "enabled", "true");
//		}
//		click(menu.BOTAO_COMPARTILHAR);
//		click(menu.BOTAO_IMG);
//		aguardarLoadSistema();
		try {
			swipe(ScrollDirection.DOWN, login.BOTAO_EXPORTAR, login.TELA_PADRAO);
			click(menu.BOTAO_EXPORTAR);
			click(menu.BOTAO_IMG);
			aguardarLoadSistema();
			menu.LABEL_ESCOLHA_APLICATIVO.isDisplayed();
			pontoVerificacao(menu.LABEL_ESCOLHA_APLICATIVO, "enabled", "true");
		} catch (Exception e) {
			pontoVerificacao(menu.LABEL_ESCOLHA_APLICATIVO, "enabled", "true");
		}
		anexaEvidencia(getCasoTeste());
		pressionaVoltar();
//		click(menu.BOTAO_VOLTAR_SUPERIOR);
	}

	/**
	 * Metodo para exportar imagem
	 * 
	 * @param casoTeste
	 * @param elemento
	 */
	public void exportarImagem(Object baseline) {
		aguardarLoadSistema();
		trataErrosPadrao();
		swipe(ScrollDirection.DOWN, login.BOTAO_EXPORTAR, login.TELA_PADRAO);
		click(menu.BOTAO_EXPORTAR);
		aguardarLoadSistema();
		pontoVerificacao(baseline);
		click(login.BOTAO_COMPARTILHAR);
		aguardaElemento(login.BOTAO_PDF_PREVISUALIZACAO);
		pontoVerificacao(login.BOTAO_PDF_PREVISUALIZACAO, "clickable", "true");
		pontoVerificacao(login.BOTAO_PNG_PREVISUALIZACAO, "clickable", "true");
		click(login.BOTAO_PNG_PREVISUALIZACAO);
		pontoVerificacao(login.BOTAO_GMAIL, "clickable", "true");
		pontoVerificacao(login.BOTAO_SALVARDRIVE, "clickable", "true");
		anexaEvidencia(getCasoTeste());
		pressionaVoltar();
		pressionaVoltar();
	}

	/**
	 * Metodo para imprimir
	 * 
	 * @param Caso     de Teste
	 * @param elemento
	 */
	public void imprimir() {
		aguardarLoadSistema();
		trataErrosPadrao();
		try {
			login.TELA_PADRAO.isDisplayed();
			swipe(ScrollDirection.DOWN, menu.BOTAO_IMPRIMIR, menu.TELA_PADRAO);
			pontoVerificacao(menu.BOTAO_IMPRIMIR, "enabled", "true");
		} catch (Exception e) {
		}
		anexaEvidencia(getCasoTeste());
	}

	public void imprimir(String args) {
		aguardarLoadSistema();
		trataErrosPadrao();
		try {
			login.TELA_PADRAO.isDisplayed();
			swipe(ScrollDirection.DOWN, menu.BOTAO_IMPRIMIR, menu.TELA_PADRAO);
			pontoVerificacao(menu.BOTAO_IMPRIMIR, "enabled", "true");
		} catch (Exception e) {
		}
		anexaEvidencia(getCasoTeste());
	}

	public String geraStringRandomica(int tamanho) {
		String[] chars = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		Random random = new Random();
		StringBuilder randomString = new StringBuilder();
		for (int i = tamanho; i > 0; i--) {
			int randomInt = random.nextInt(chars.length - 1);
			randomString.append(chars[randomInt]);
		}
		return randomString.toString();
	}

	private void trataErrosPadrao() {
		try {
			menu.MENSAGEM_ERRO_EXECUCAO.isDisplayed();
			throw new SkipException("Erro de execu��o na transa��o...");
		} catch (NoSuchElementException e1) {
			try {
				menu.MENSAGEM_ERRO_CONEXAO_SERVIDOR.isDisplayed();
				throw new SkipException("Erro de conex�o com o servidor...");
			} catch (NoSuchElementException e2) {
				try {
					menu.MENSAGEM_SESSAO_EXPIRADA.isDisplayed();
					throw new SkipException("Sess�o expirada...");
				} catch (NoSuchElementException e3) {
					try {
						menu.MENSAGEM_SICOOB_PAROU.isDisplayed();
						throw new SkipException("Aplicativo parou...");
					} catch (NoSuchElementException e4) {
					}
				}
			}
		}
	}

	protected ManipuladorConexaoMongoDB getMongoMobileBank(String bancoDados) {
		ManipuladorConexaoMongoDB mongo = new ManipuladorConexaoMongoDB(
				"mongodb://usr_atendimento:HmLA5t3nd1Mento49@mdbh104:27017,mdbh105:27017,mdbh106:27017/sicoobatendimento?authMechanism=SCRAM-SHA-1&authSource=admin&replicaSet=MongoDBHml4",
				bancoDados);
		return mongo;
	}

	protected ExpectedCondition<Boolean> elementListSizeToBe(List<MobileElement> listaElementos, int size) {
		return new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver ignored) {
				if (listaElementos.size() >= size) {
					return true;
				} else {
					return false;
				}
			}
		};

	}

	@SuppressWarnings("unchecked")
	public T clicarAvancar() {
		swipe(ScrollDirection.DOWN, menu.BOTAO_AVANCAR, menu.TELA_PADRAO);
		click(menu.BOTAO_AVANCAR);
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T clicarVoltar() {
		swipe(ScrollDirection.DOWN, menu.BOTAO_VOLTAR, menu.TELA_PADRAO);
		click(menu.BOTAO_VOLTAR);
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T clicarConfirmar() {
		swipe(ScrollDirection.DOWN, menu.BOTAO_CONFIRMAR, menu.TELA_PADRAO);
		click(menu.BOTAO_CONFIRMAR);
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T clicarContinuar() {
		swipe(ScrollDirection.DOWN, menu.BOTAO_CONTINUAR, menu.TELA_PADRAO);
		click(menu.BOTAO_CONTINUAR);
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T clicarConsultar() {
		swipe(ScrollDirection.DOWN, menu.BOTAO_CONSULTAR, menu.TELA_PADRAO);
		click(menu.BOTAO_CONSULTAR);
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T clicarNao() {
		swipe(ScrollDirection.DOWN, menu.BOTAO_NAO, menu.TELA_PADRAO);
		click(menu.BOTAO_NAO);
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T preencherSenha(String senha) {
		swipe(ScrollDirection.DOWN, menu.CAMPO_SENHA, menu.TELA_PADRAO);
		preencheCampo(menu.CAMPO_SENHA, senha);
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T selecionarData(String data, MobileElement campoData) {
		if (!data.isEmpty()) {
			swipe(ScrollDirection.DOWN, campoData, login.TELA_PADRAO);
			int dtIncrementada = Integer.parseInt(data);
			if (dtIncrementada < 0) {
				dtIncrementada = dtIncrementada * -1;
				selecionaCalendario(campoData, DateUtilities.getDiaAnterior("dd/MM/yyyy", dtIncrementada));
			} else {
				selecionaCalendario(campoData, DateUtilities.proximoDiaUtilIncrementado("dd/MM/yyyy", dtIncrementada));
			}

		}
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T acionarBotaoVoltarSuperior() {
		click(menu.BOTAO_VOLTAR_SUPERIOR);
		return (T) this;
	}

	public String geraValorTransacao() {
		String valor = new DecimalFormat("0.00").format(Math.random() * 10.0).replaceAll("\\.", "\\,");
		return valor;
	}

	public void aguardaListaElementos(List<WebElement> elementos) {
		wait.until(ExpectedConditions.visibilityOfAllElements(elementos));
	}

	@SuppressWarnings("unchecked")
	public T setCasoTeste(String casoTeste) {
		this.casoTeste = casoTeste;

		return (T) this;
	}

	public String getCasoTeste() {
		return this.casoTeste;
	}

	public String getSaldoContaTelaInicial() {
		aguardarLoadSistema();
		click(menu.BOTAO_EXIBESALDOEMCONTA);
		click(menu.BOTAO_EXIBESALDOEMCONTA);
		String texto = menu.CAMPO_SALDOEMCONTA.getText();
		return texto;
	}

	@Override
	protected void acessaMenu(Enum<?> menu) {
		// TODO Auto-generated method stub
	}
	
	protected void preencherComboFiscalizacao(WebElement elemento, Object opcao) {
		click(elemento);
		selecionarCombo(elemento.findElement(By.xpath("//android.widget.ListView")),
				new ByXPath("//android.view.View[@content-desc=" +"'"+ opcao +"'"+"]"));
	}
	
	
	protected void preencherComboSisbr(WebElement elemento,MobileElement bloco, Object opcao) {
		click(elemento);
		selecionarCombo(bloco, 
				new ByXPath("//android.widget.TextView[contains(@text,"+"'"+opcao+"'"+")]"));
	}
	
	protected void preencherComboSisbrGarantia(WebElement elemento,MobileElement bloco, Object opcao) {
		click(elemento);
		selecionarComboByXpath(bloco, //android.widget.TextView[contains(@text,"GARANTIA FIDEJUSS�RIA")]
				new ByXPath("(//android.widget.RadioButton[contains(@text,"+'"'+opcao+'"'+")])[1]"));
	}
	//android.widget.RadioButton[contains(@text,"AVALISTA - PF")])[1]
	protected void preencherComboSisbrSemSwipe(WebElement elemento,MobileElement bloco, Object opcao) {
		click(elemento);
		selecionarComboByXpath(bloco, 
				new ByXPath("//android.widget.TextView[@resource-id="+'"'+opcao +'"'+"]"));
	}
	public void aguardaTempo(int time) {
		try {
			Log.info("Aguardando por: " + time/1000 + " segundos...");
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void aguardaElementoSumirTeste(WebElement el) {
		try {
			Log.info("Aguardando Mensagens sumir: " + el.getText());
			aguardaElemento(ExpectedConditionsCustom.stalenessOf(el));
		} catch (NoSuchElementException e) {
			Log.info("Nenhum elemento encontrado");
		} catch (Exception e) {
			Log.info("Nenhum elemento encontrado");
		}
	}
	
	/**
	 * Metodo para aguardar enquanto o loader estiver sendo apresentado
	 */
	
	
	
	
	public void aguardaElementoSerVisivel(MobileElement el) {
        try {
        	WebDriverWait mWait = new WebDriverWait(ActionUi.getDriverMobile(), 45000);
        	Log.info("Aguardando elemento ser vis�vel: " +el+" - "+ mWait.until(ExpectedConditions.visibilityOf(el)));
        } catch (Exception e) {
            throw new AutomacaoBusinessException("N�o foi encontrado o MobileElement :" + getReferenceNameElement(el));
        }
    }

	@Override
	protected void aguardarLoadSistema() {
		WebDriverWait wait = new WebDriverWait(ActionUi.getDriver(), 5000);
		Log.info("Aguardando Loader...");
		try {
			wait.until(ExpectedConditions
					.refreshed((ExpectedCondition<?>) ExpectedConditionsCustom.stalenessOf(pgoPropostaDeCredito.IMG_LOAD)));
		} catch (Exception e) {
			throw new AutomacaoBusinessException("Elemento nao encontrado: "
					+ (ExpectedCondition<?>) ExpectedConditionsCustom.stalenessOf(pgoPropostaDeCredito.IMG_LOAD), e);
		}
		
	}
	
	protected void clickDimensionado(int x, int y) {
//		MobileElement d = pgoPropostaDeCredito.BOTAO_HOME;
//		Point p = d.getLocation();
//		int x = p.getX();
//		int y = p.getY();
//		System.out.println(x+","+y);
		Log.info("Realizando clique nas coordenads: " + x+" e "+ y);
		TouchAction touchAction= new TouchAction((PerformsTouchActions) getDriver());
		touchAction.tap(PointOption.point(x,y)).perform();
	}
	
	protected void clickDimensionadoPress(int x, int y) {
//		MobileElement d = pgoPropostaDeCredito.BOTAO_HOME;
//		Point p = d.getLocation();
//		int x = p.getX();
//		int y = p.getY();
//		System.out.println(x+","+y);
		Log.info("Realizando clique nas coordenads: " + x+" e "+ y);
		TouchAction touchAction= new TouchAction((PerformsTouchActions) getDriver());
		touchAction.longPress(PointOption.point(x,y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).release().perform();
	}
	

}