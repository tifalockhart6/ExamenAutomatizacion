package com.automation.stepdefinitions;


import static org.junit.Assert.assertTrue;

import com.automation.steps.BusquedaSteps;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class BusquedaStepdefinitions {
	@Steps
	BusquedaSteps stepsbusqueda; 
	
	@Dado("^que estoy en la pagina de inicio de El Empleo$")
	public void queEstoyEnLaPaginaDeInicioDeElEmpleo() {
		stepsbusqueda.abrirUrl();
		
	}

	@Cuando("^ingreso los datos de cargo, profesion o empresa (.*) y (.*)")
	public void ingresoLosDatosDeCargoProfesionOEmpresaContYBogotá(String cargo, String ciudad) {
		stepsbusqueda.ingresardatos(cargo, ciudad);
	}

	@Entonces("^puedo realizar la busqueda de trabajo$")
	public void puedoRealizarLaBusquedaDeTrabajo() {
		assertTrue(stepsbusqueda.validaringreso("Empleos Contador"));
	}
}
