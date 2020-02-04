package br.com.AutomacaoPO.action;

import org.openqa.selenium.By;
import br.com.AutomacaoPO.util.DriverContext;

public class MouseAction {
	
	public void clicar(By elemento)
	{
		DriverContext.getDriver().findElement(elemento).click();
	}
	
	
		
}


