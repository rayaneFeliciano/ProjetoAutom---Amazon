package br.com.AutomacaoPO.util;

import org.openqa.selenium.WebDriver;

public class NavegadorUtil extends DriverContext {
	static WebDriver driver;

	public void abrirUrl(String URL) {
		driver = DriverContext.getDriver();
		driver.get(URL);
	}

	public static void fecharNavegador() {
		driver = DriverContext.getDriver();
		driver.quit();
		driver = null;
		DriverContext.setDriver(null);
	}

	
	
	
}
