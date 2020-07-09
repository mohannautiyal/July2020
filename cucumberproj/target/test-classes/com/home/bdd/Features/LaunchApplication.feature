Feature: Verify application Launch

  @LaunchApp1
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

   @LaunchApp
  Scenario: Verify user is able to launch the application
    Given user opens the application "url"
    Then application home page should display "Your Store"
    And the application navigation bar displays categories
      | Desktops   |
      | Components |
      | Tablets    |
      | Softwar    |