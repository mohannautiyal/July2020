package com.home.bdd.stepDefinition;

import io.cucumber.java.en.Given;

public class ApplicationStepDef {

  @Given("user launches the application")
	public void user_launches_the_application() {
	    System.out.println("Application has been launched");
	}
}
