package br.com.AutomacaoPO.action;

import org.openqa.selenium.By;

import br.com.AutomacaoPO.util.DriverContext;

public class TecladoAction {
	
	public void escrever(By elemento,String texto)
	{
		DriverContext.getDriver().findElement(elemento).sendKeys(texto);
	}

}
