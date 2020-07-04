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
,plugin={"pretty","json:target/cucumber.json","html:target/cucumber.html"}
,tags="@C"
)
public class CucumberTest{

}
