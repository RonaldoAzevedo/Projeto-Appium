package helper;



import pageObjects.PgoSimulacaoConsignado;
import support.MobileBank;
import uteis.Datapool;
import uteis.Log;
import util.db.DBUTIL;

public class HlpDispositivo extends MobileBank<HlpDispositivo> {

	public PgoSimulacaoConsignado pgoSimulacaoConsignado;
	public Datapool datapool;
	String dpArq = "dispositivo.json";
	public DBUTIL DBUTIL;

	public HlpDispositivo() {
		pgoSimulacaoConsignado = new PgoSimulacaoConsignado();
		DBUTIL = new DBUTIL();
	}

	public Datapool getDp() {
		return new Datapool(dpArq);
	}
	
    /** Entra no menu do app **/
	public HlpDispositivo acessarMenu() {
		aguardarLoadSistema();
		click(pgoSimulacaoConsignado.BOTAO_MENU);
		return this;
	}
    /** Primeiro ele pesquisa Pix e depois clica em Pix **/
	public HlpDispositivo acessarMenuPix(Object busca) {
		aguardaElementoSerVisivel(pgoSimulacaoConsignado.CAMPO_LINDOMAR);
		preencheCampo(pgoSimulacaoConsignado.CAMPO_BUSCAR, busca);
		click(pgoSimulacaoConsignado.BOTAO_PIX);
		return this;
	}
	/** Preenche o campo senha com a senha   **/
	public HlpDispositivo preencherCampoSenha(Object senha) {
		swipe(ScrollDirection.DOWN, pgoSimulacaoConsignado.CAMPO_SENHA_DISPOSITIVO, pgoSimulacaoConsignado.BTN_SCROLL_GERAL);
		click(pgoSimulacaoConsignado.CAMPO_SENHA_DISPOSITIVO);
		preencheCampo(pgoSimulacaoConsignado.CAMPO_SENHA_DISPOSITIVO, senha);
		return this;
	}
	public HlpDispositivo preencheCampoApelido() {
		aguardarLoadSistema();
	
		preencheCampo(pgoSimulacaoConsignado.CAMPO_APELIDO, gerarStringAleatoria());
		return this;
	}
	
	public HlpDispositivo clicaBotaoConfirmar() {
		click(pgoSimulacaoConsignado.BOTAO_CONFIRMAR_DISPOSITIVO);
		return this;
	}
	
	public HlpDispositivo clicaBotaoNaCooperativar() {
		aguardarLoadSistema();
		click(pgoSimulacaoConsignado.BOTAO_NACOOPERATIVA);
		return this;
	}
	
	public String getTextoCodigoCoop() {
		String i = pegarTextoElemento(pgoSimulacaoConsignado.CAMPO_TEXTO_COOP);
		Log.info("Codigo Cooperativa: "+i);
		return i;
	}
	
	public HlpDispositivo updateBancoDispositivo( String codigo) {
		DBUTIL.updateBancoDispositivo( codigo);
		Log.info("Atualizando Banco de Dados" );
		return this;
	}
	
	

}
