package com.automation.pages;

//import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.elempleo.com/co/")
public class BusquedaPage extends PageObject {
	@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/div/div[1]/div/span[1]/input[2]")
	WebElementFacade txtCargo;
	
	@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/div/div[2]/div/span[1]/input[2]")
	WebElementFacade txtCiudad;
	
	@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/div/div[3]/span/button")
	WebElementFacade btnBuscar;
	
	@FindBy(xpath = "//*[@id=\"politics_cookieCO\"]/div/div[2]/a[2]")
	WebElementFacade btnCookies;
	
	public void iniciarbusqueda(String cargo, String ciudad) {
		btnCookies.click();
		txtCargo.sendKeys(cargo);
		//Select sel =new Select (txtCargo);
		//sel.selectByVisibleText("Contador");
		txtCiudad.sendKeys(ciudad);
		//Select selc =new Select (txtCiudad);
		//selc.selectByValue("Bogotá");
		btnBuscar.click();


	}
}
