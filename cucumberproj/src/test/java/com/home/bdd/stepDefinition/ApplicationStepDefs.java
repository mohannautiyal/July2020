package com.home.bdd.stepDefinition;

import static org.testng.Assert.assertTrue;

import java.util.List;

import com.home.base.actions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ApplicationStepDefs {

	public actions actions;

	public ApplicationStepDefs(actions actions) {
		this.actions = actions;

	}

	@Given("user opens the application {string}")
	public void user_opens_the_application(String url) {
		System.out.println("Launching application...");
		boolean Status = actions.launchapplication();

		assertTrue(Status, "Application launch failed");

	}

	@Then("application home page should display {string}")
	public void application_home_page_should_display(String text) {
		System.out.println("Verifying the page title");
		String PageTitle = actions.getTitle();
		assertTrue(PageTitle.equals("Your Store"), "Appliation title incorrect");

	}

	@And("the application navigation bar displays category {string}")
	public void verifyNavigationbarcategory(String categoryName) {
		System.out.println("Verifying category " + categoryName);
		boolean categoryPresent = actions.verifyCategory(categoryName);
		assertTrue(categoryPresent, categoryName + " category is not present");

	}

	@And("the application navigation bar displays categories")
	public void verifyNavigationbarcategories(List<String> categoryName) {
		categoryName.stream().forEach(x -> {
			System.out.println("Verifying category " + x);
			boolean categoryPresent = actions.verifyCategory(x);
			assertTrue(categoryPresent, x + " category is not present");
		});

	}

	@After
	public void after() {
		actions.driver.quit();
	}

}
