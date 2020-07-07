package com.home.bdd.stepDefinition;

import com.home.base.actions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ApplicationStepDefs {

	public actions actions;
	
	public ApplicationStepDefs(actions actions) {
		this.actions = actions;
		
	}
	
	
	
	@Given("user opens the application {string}")
	public void user_opens_the_application(String url) {
           actions.launchapplication();
           System.out.println("Launching application...");
          actions.getTitle();
	}

	@Then("application home page should display {string}")
	public void application_home_page_should_display(String text) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	@After
	public void after() {
		actions.driver.quit();
	}
	
}
