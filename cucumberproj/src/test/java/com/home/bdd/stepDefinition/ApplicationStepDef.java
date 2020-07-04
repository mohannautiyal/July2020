package com.home.bdd.stepDefinition;

import java.util.List;
import java.util.Map;

import org.testng.asserts.SoftAssert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class ApplicationStepDef {
 
	SoftAssert softassert = new SoftAssert();
	
	
  @Given("user launches the application")
	public void user_launches_the_application() {
	    System.out.println("Application has been launched");
	 //   assertTrue(false);
	    softassert.assertTrue(false, "Step 1 application not launched");
	}
  
  
  
  @And("enters {string} and {string}")
  public void enters_and(String username, String password) {
      System.out.println("User has entered username as "+username + " and password is "+password);
	   // assertTrue(true);
	    softassert.assertTrue(false, "Step 2 invalid credentials");
  }
  
  @And("user verifies the output")
  public void afterScenario() {
	  softassert.assertAll();  
}
  
  
	/*
	 * @And("enters username and password") public void
	 * enters_username_and_password() { System.out.println("Data Tables example"); }
	 */
  
  
  @Given("enters username and password")
  public void enters_username_and_password(DataTable userCredentials) {
	List<List<String>> cells=  userCredentials.cells();
	System.out.println("============= DATATABLE AS CELL ===================");
	cells.stream().forEach(x -> System.out.println(x));
	
	System.out.println("============= DATATABLE AS MAP===================");

	List<Map<String,String>> userCred = userCredentials.asMaps();
	userCred.stream().forEach(x -> System.out.println(x));
	
	  
  }
  
  
}
