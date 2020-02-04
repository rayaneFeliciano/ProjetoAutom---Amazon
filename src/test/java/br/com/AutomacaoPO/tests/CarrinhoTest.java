package br.com.AutomacaoPO.tests;

import org.junit.After;
import org.junit.Test;

import br.com.AutomacaoPO.action.MouseAction;
import br.com.AutomacaoPO.action.TecladoAction;
import br.com.AutomacaoPO.action.TempoAction;
import br.com.AutomacaoPO.action.ValidaAction;
import br.com.AutomacaoPO.page.CarrinhoPage;
import br.com.AutomacaoPO.page.ListaDeOfertasPage;
import br.com.AutomacaoPO.util.NavegadorUtil;

public class CarrinhoTest {

	static NavegadorUtil navegador = new NavegadorUtil();
	TecladoAction teclado = new TecladoAction();
	MouseAction mouse = new MouseAction();
	ValidaAction valida = new ValidaAction();
	TempoAction esperar = new TempoAction();


	//@BeforeClass
	//public static void setUp() throws Exception {
	//	navegador.abrirUrl("https://www.amazon.com.br/");

	//}

//	//@Test
//	public void teste1() {
//		mouse.clicar(HomePage.ICON_CEP);
//		esperar.espera2Segundos();
//		teclado.escrever(HomePage.TXT_CEP, "54735520");
//		mouse.clicar(HomePage.BTN_CONFIRMAR_CEP);
//		esperar.espera2Segundos();
//		valida.validacao("54735520‌", HomePage.VALIDAR_CEP);
//	}
//
//
//
//	@Test
//	public void teste2() {
//		teclado.escrever(HomePage.TXT_CAIXA_DE_BUSCA, "samsung s9 plus");
//		mouse.clicar(HomePage.BTN_BUSCAR);
//		mouse.clicar(ResultadoPesquisaPage.PRODUTO);
//		valida.validacao("Smartphone Desbloqueado Galaxy S9 Plus, Samsung, SM-G9650ZKKZTO, 128 GB, 6.2, Preto",
//				ProdutoPage.LABEL_PRODUTO_SELECIONADO);
//		mouse.clicar(ProdutoPage.NOVO_E_USADO);
//		valida.validacao("Smartphone Desbloqueado Galaxy S9 Plus, Samsung, SM-G9650ZKKZTO, 128 GB, 6.2, Preto",
//				ListaDeOfertasPage.LABEL_PRODUTO_OFERTAS);
//	}
//
//	@Test
//	public void teste3() {
//		esperar.espera2Segundos();
//		mouse.clicar(ListaDeOfertasPage.CHECKBOX_FRETEGRATIS);
//		valida.validacao("No momento, não há ofertas de produto dentro destas condições. Tente outra opção de filtro.",
//				ListaDeOfertasPage.MSG_NAO_POSSUI_FRETEGRATIS);
//		esperar.espera2Segundos();
//		mouse.clicar(ListaDeOfertasPage.CHECKBOX_FRETEGRATIS);
//		valida.validacao("Preço + Frete", ListaDeOfertasPage.INFO_PRECOFRETE);
//	}

	@Test
	public void teste4() {
		mouse.clicar(ListaDeOfertasPage.BUTTON_ADDCARRINHO);
		valida.validacao("1", ListaDeOfertasPage.TXT_QUANTIDADE_ITENS_ICONE_CARRINHO);
		mouse.clicar(ListaDeOfertasPage.AVATAR_CARRINHO);
		valida.validacao("Fechar pedido", CarrinhoPage.BUTTON_FECHAR_PEDIDO);


	}


	@After
	public void tearDown() throws Exception { 
	NavegadorUtil.fecharNavegador(); } 
	 

//	@AfterClass
//	public static void tearDown() throws Exception { 
//	NavegadorUtil.fecharNavegador(); } 


}
