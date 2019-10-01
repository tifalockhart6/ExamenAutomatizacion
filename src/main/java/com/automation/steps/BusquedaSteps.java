package com.automation.steps;

import com.automation.pages.BusquedaPage;
import com.automation.pages.FiltroPage;
import com.automation.pages.ResultadoPage;

import net.thucydides.core.annotations.Step;

public class BusquedaSteps {
		BusquedaPage pageSearch;
		FiltroPage pageFilter;
		ResultadoPage pageResultado;
	
	@Step
	public void abrirUrl() {
		pageSearch.open();
	}
	
	@Step
	public void ingresardatos(String cargo, String ciudad) {
		pageSearch.iniciarbusqueda(cargo, ciudad);
		pageFilter.iniciarfiltro();
	}
	
	@Step
	public boolean validaringreso(String mensajeEsperado) {
		return pageResultado.validar(mensajeEsperado);
	}
}
