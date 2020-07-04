$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/home/bdd/Features/Login.feature");
formatter.feature({
  "name": "Login to the Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login to Application with Valid credentials",
  "description": "",
  "keyword": "Scenario"
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
  "name": "enters \"username\" and \"password\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});