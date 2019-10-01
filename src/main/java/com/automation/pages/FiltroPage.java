package com.automation.pages;

import org.openqa.selenium.JavascriptExecutor;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class FiltroPage extends PageObject {


	@FindBy(css = "#salary3")
	WebElementFacade chkSalario;
	
	@FindBy(css = "#publishDate2")
	WebElementFacade chkFchPublicacion;
	
	public void iniciarfiltro() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		chkSalario.click();
		//js.executeScript ("window.scrollBy (0,1300)");
		js.executeScript ("window.scrollTo (0, document.body.scrollHeight)");	
		chkFchPublicacion.click();
	}
}
