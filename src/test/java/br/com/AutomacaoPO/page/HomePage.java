package br.com.AutomacaoPO.page;

import org.openqa.selenium.By;

public class HomePage {
    
    //CAIXA DE BUSCA
    public static By TXT_CAIXA_DE_BUSCA = By.id("twotabsearchtextbox");
    public static By BTN_BUSCAR = By.xpath("//input[@value='Ir']");
    
    //VALIDAR CEP
    public static By ICON_CEP = By.id("nav-packard-glow-loc-icon");
    public static By TXT_CEP = By.xpath("//*[@id=\"GLUXZipUpdateInput_0\"]");
    public static By BTN_CONFIRMAR_CEP = By.xpath("//*[@id=\"GLUXZipUpdate\"]/span/input");
    public static By VALIDAR_CEP = By.xpath("//*[@id=\"glow-ingress-line2\"]");
    
    
    //CARRINHO
    public static By BTN_CARRINHO = By.xpath("//a[@id='nav-cart']");
            
}