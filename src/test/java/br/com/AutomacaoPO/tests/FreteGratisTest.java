package br.com.AutomacaoPO.tests;

import org.junit.Before;
import org.junit.Test;

import br.com.AutomacaoPO.action.MouseAction;
import br.com.AutomacaoPO.action.TecladoAction;
import br.com.AutomacaoPO.action.TempoAction;
import br.com.AutomacaoPO.action.ValidaAction;
import br.com.AutomacaoPO.page.HomePage;
import br.com.AutomacaoPO.page.ListaDeOfertasPage;
import br.com.AutomacaoPO.page.ProdutoPage;
import br.com.AutomacaoPO.page.ResultadoPesquisaPage;
import br.com.AutomacaoPO.util.NavegadorUtil;

public class FreteGratisTest {

	static NavegadorUtil navegador = new NavegadorUtil();
	TecladoAction teclado = new TecladoAction();
	MouseAction mouse = new MouseAction();
	ValidaAction valida = new ValidaAction();
	TempoAction esperar = new TempoAction();

//	@Before
//	public void setUp() throws Exception {
//		navegador.abrirUrl("https://www.amazon.com.br/");
//	}

	@Test
	public void teste3() {
		mouse.clicar(ListaDeOfertasPage.CHECKBOX_FRETEGRATIS);
		valida.validacao("No momento, não há ofertas de produto dentro destas condições. Tente outra opção de filtro.",
				ListaDeOfertasPage.MSG_NAO_POSSUI_FRETEGRATIS);
		esperar.espera2Segundos();
		mouse.clicar(ListaDeOfertasPage.CHECKBOX_FRETEGRATIS);
		valida.validacao("Preço + Frete", ListaDeOfertasPage.INFO_PRECOFRETE);
	}

//	 @AfterClass public static void tearDown() throws Exception {
//	 NavegadorUtil.fecharNavegador();


}
