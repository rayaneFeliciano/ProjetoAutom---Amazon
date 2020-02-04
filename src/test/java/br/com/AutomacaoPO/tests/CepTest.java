package br.com.AutomacaoPO.tests;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.AutomacaoPO.action.MouseAction;
import br.com.AutomacaoPO.action.TecladoAction;
import br.com.AutomacaoPO.action.TempoAction;
import br.com.AutomacaoPO.action.ValidaAction;
import br.com.AutomacaoPO.page.HomePage;
import br.com.AutomacaoPO.util.NavegadorUtil;

public class CepTest {

	static NavegadorUtil navegador = new NavegadorUtil();
	TecladoAction teclado = new TecladoAction();
	MouseAction mouse = new MouseAction();
	TempoAction esperar = new TempoAction();
	ValidaAction validarCep = new ValidaAction();

	@BeforeClass
	public static void setUp() throws Exception {
		navegador.abrirUrl("https://www.amazon.com.br/");
	}

	@Test
	public void teste1() {

		mouse.clicar(HomePage.ICON_CEP);
		esperar.espera2Segundos();
		teclado.escrever(HomePage.TXT_CEP, "54735520");
		mouse.clicar(HomePage.BTN_CONFIRMAR_CEP);
		esperar.espera2Segundos();
		validarCep.validacao("54735520‌", HomePage.VALIDAR_CEP);

	}

	
//	@AfterClass 
//	public static void tearDown() throws Exception {
//	NavegadorUtil.fecharNavegador();}
	

}
