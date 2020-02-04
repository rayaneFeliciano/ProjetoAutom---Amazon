package br.com.AutomacaoPO.action;

public class TempoAction {

	public void espera2Segundos() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
