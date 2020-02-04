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

public class PesquisaTest {
	
	static NavegadorUtil navegador  = new NavegadorUtil();
	TecladoAction teclado = new TecladoAction();
	MouseAction mouse = new MouseAction();
	ValidaAction valida = new ValidaAction();
	TempoAction esperar = new TempoAction();
	
//	@Before
//	public void setUp() throws Exception {
//		navegador.abrirUrl("https://www.amazon.com.br/");
//	}
	
	@Test
	public void teste2() {
		teclado.escrever(HomePage.TXT_CAIXA_DE_BUSCA, "samsung s9 plus");
		mouse.clicar(HomePage.BTN_BUSCAR);
		mouse.clicar(ResultadoPesquisaPage.PRODUTO);
		valida.validacao("Smartphone Desbloqueado Galaxy S9 Plus, Samsung, SM-G9650ZKKZTO, 128 GB, 6.2, Preto",ProdutoPage.LABEL_PRODUTO_SELECIONADO);
		mouse.clicar(ProdutoPage.NOVO_E_USADO);
		valida.validacao("Smartphone Desbloqueado Galaxy S9 Plus, Samsung, SM-G9650ZKKZTO, 128 GB, 6.2, Preto", ListaDeOfertasPage.LABEL_PRODUTO_OFERTAS);
	}
	
//	@AfterClass
//	public static void tearDown() throws Exception {
//		NavegadorUtil.fecharNavegador();
		
	}


