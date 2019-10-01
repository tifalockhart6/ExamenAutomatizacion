package com.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ResultadoPage extends PageObject {
	@FindBy(xpath ="/html/body/div[8]/div[2]/h1")
	WebElementFacade lblMensaje;
	
	public boolean validar(String mensajeEsperado) {
		boolean salida = false;
		String textoObtenido = lblMensaje.getText();
				if(textoObtenido.equals(mensajeEsperado))
				{
					salida= true;
				}
		return salida;
	}
}
