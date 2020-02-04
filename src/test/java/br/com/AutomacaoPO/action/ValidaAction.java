package br.com.AutomacaoPO.action;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.AutomacaoPO.util.DriverContext;

public class ValidaAction {
	WebDriver driver;

	public void validacao(String texto, By element) {
		driver = DriverContext.getDriver();
		assertEquals(texto, driver.findElement(element).getText());


	}
}
