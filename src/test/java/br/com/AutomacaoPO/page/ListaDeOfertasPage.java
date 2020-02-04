package br.com.AutomacaoPO.page;

import org.openqa.selenium.By;

public class ListaDeOfertasPage {

// NOME DO PRODUTO NA PÁGINA LISTA DE OFERTAS
	public static By LABEL_PRODUTO_OFERTAS = By.xpath("//h1[@class='a-size-large a-spacing-none']");

// SELECIONAR FRETE GRÁTIS
	public static By CHECKBOX_FRETEGRATIS = By.name("olpCheckbox_freeShipping");

// MSG 'No momento, não há ofertas de produto dentro destas condições. Tente outra opção de filtro.'
	public static By MSG_NAO_POSSUI_FRETEGRATIS = By.xpath("//p[@class='a-size-medium']");

// PREÇO+FRETE
	public static By INFO_PRECOFRETE = By.xpath("//span[contains(text(),'Preço + Frete')]");

// ADICIONAR CARRINHO
	public static By BUTTON_ADDCARRINHO = By.xpath("//span[@id='a-autoid-4']//input[@name='submit.addToCart']");
	
// CONTADOR DO AVATAR DO CARRINHO
   public static By TXT_QUANTIDADE_ITENS_ICONE_CARRINHO = By.xpath("//span[@id='nav-cart-count']");	

// ACESSAR PÁGINA CARRINHO
	public static By AVATAR_CARRINHO = By.xpath("//a[@id='nav-cart']");

// FECHAR O PEDIDO
	public static By BUTTON_FECHARPEDIDO = By.className("proceedToRetailCheckout");

}