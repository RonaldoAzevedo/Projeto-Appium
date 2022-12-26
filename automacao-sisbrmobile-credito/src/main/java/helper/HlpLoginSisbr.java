package helper;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

import io.qameta.allure.Allure;
import pageObjects.PgoLoginSisbr;
import support.MobileBank;
import uteis.Datapool;
import uteis.Log;
import util.db.DBUTIL;

public class HlpLoginSisbr extends MobileBank<HlpLoginSisbr> {

	public PgoLoginSisbr pgoLogin;
	public Datapool datapool;
	String dpArq = "Login.json";
	public DBUTIL DBUTIL;
	public Datapool usr;

	public HlpLoginSisbr() {
		pgoLogin = new PgoLoginSisbr();
		usr = new Datapool("usuarios.json");
	}

	public Datapool getDp() {
		return new Datapool(dpArq);
	}
	
	public void acessaContaSimulacao(Object ambiente, Object usuario, Object senha) {
		Allure.addAttachment("Ambiente: ", ambiente.toString());
		Allure.addAttachment("Usuario: ", usuario.toString());
		preencheUsuario(ambiente.toString());
		clicaComboAmbiente();
		preencheComboAmbiente();
		clicaBotaoConfirmar();
		limpaCampoUsuario();
		preencheUsuario(usuario);
		preencheSenha(senha);
		clicaBotaoLogin();

	}
	
	public HlpLoginSisbr preencheUsuario(Object usuario) {
		aguardaElemento(pgoLogin.CAMPO_USUARIO);
		preencheCampo(pgoLogin.CAMPO_USUARIO, usuario);
		return this;
	}

	public HlpLoginSisbr preencheSenha(Object senha) {
		preencheCampo(pgoLogin.CAMPO_SENHA, senha);
		return this;
	}

	public HlpLoginSisbr clicaBotaoLogin() {
		click(pgoLogin.BOTAO_LOGIN);
		return this;
	}
	
	public HlpLoginSisbr clicaComboAmbiente() {
		click(pgoLogin.COMBO_AMBIENTE);
		return this;
	}
	
	public HlpLoginSisbr preencheComboAmbiente() {
		click(pgoLogin.CAMPO_HOMOLOGACAO);
		click(pgoLogin.BOTAO_DONE);
		return this;
	}
	
	public HlpLoginSisbr clicaBotaoConfirmar() {
		click(pgoLogin.BOTAO_CONFIRMAR_AMBIENTE);
		return this;
	}
	
	public HlpLoginSisbr limpaCampoUsuario() {
		pgoLogin.CAMPO_USUARIO.clear();
		return this;
	}


}
