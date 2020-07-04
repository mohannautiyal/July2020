$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/home/bdd/Features/Login.feature");
formatter.feature({
  "name": "Login to the Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "C_Login to Application with Valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@C"
    }
  ]
});
formatter.step({
  "name": "user launches the application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.home.bdd.stepDefinition.ApplicationStepDef.user_launches_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters username and password",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.home.bdd.stepDefinition.ApplicationStepDef.enters_username_and_password(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the output",
  "keyword": "And "
});
formatter.match({
  "location": "com.home.bdd.stepDefinition.ApplicationStepDef.afterScenario()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\tStep 1 application not launched expected [true] but found [false]\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:47)\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:31)\r\n\tat com.home.bdd.stepDefinition.ApplicationStepDef.afterScenario(ApplicationStepDef.java:35)\r\n\tat ✽.user verifies the output(file:///E:/July2020/cucumberproj/src/test/resources/com/home/bdd/Features/Login.feature:27)\r\n",
  "status": "failed"
});
});