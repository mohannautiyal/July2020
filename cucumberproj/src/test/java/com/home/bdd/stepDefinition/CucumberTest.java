package com.home.bdd.stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/"
,glue="com.home.bdd.stepDefinition"
,dryRun=false
,monochrome=false
,strict=true
,tags="@LaunchApp"
,plugin={"pretty","json:target/cucumber.json"}
//,plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)
public class CucumberTest{

}
