Feature: Verify application Launch

@LaunchApp
Scenario: Verify user is able to launch the application
Given user opens the application "url"
Then application home page should display "Your Store"