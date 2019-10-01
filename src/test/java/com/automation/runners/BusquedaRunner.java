package com.automation.runners;

import org.junit.runner.RunWith;

import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.CucumberOptions;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/busqueda.feature", glue ="com.automation.stepdefinitions", snippets =  SnippetType.CAMELCASE)
public class BusquedaRunner {
	
}