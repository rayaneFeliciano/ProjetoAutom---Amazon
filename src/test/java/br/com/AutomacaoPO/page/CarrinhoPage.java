package br.com.AutomacaoPO.page;

import org.openqa.selenium.By;

public class CarrinhoPage {
 

    // TÍTULO/TEXTO DA PÁGINA DO CARRINHO DE COMPRAS
   public static By TXT_CARRINHO_PAGE = By.xpath("//*[@id=\"sc-active-cart\"]/div/div/h2");

   // VALIDAR BOTÃO FECHAR PEDIDO COM PRODUTO
   public static By BUTTON_FECHAR_PEDIDO = By.xpath("//*[@id=\"sc-buy-box-ptc-button-announce\"]/div[1]");

 }
