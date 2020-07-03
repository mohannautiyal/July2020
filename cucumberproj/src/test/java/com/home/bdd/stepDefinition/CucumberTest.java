package com.home.bdd.stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false
,features="src/test/resources/"
)
public class CucumberTest{

}
