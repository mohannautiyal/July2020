Feature: Verify application Launch

  @LaunchApp
  Scenario Outline: Verify user is able to launch the application
    Given user opens the application "url"
    Then application home page should display "Your Store"
    And the application navigation bar displays category "<Category>"

    Examples: 
      | Category   |
      | Desktops   |
      | Components |
      | Tablets    |
      | Softwar    |
