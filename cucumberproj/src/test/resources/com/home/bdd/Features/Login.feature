Feature: Login to the Application

  @A
  Scenario: A_Login to Application with Valid credentials
    Given user launches the application
    And enters "username" and "password"
    And user verifies the output

  @B
  Scenario Outline: B_Login to Application with Valid credentials
    Given user launches the application
    And enters "<username>" and "<password>"
    And user verifies the output

    Examples: 
      | username  | password |
      | nautiyalm |     1234 |
      | mnautiyal |     2345 |

  @C
  Scenario: C_Login to Application with Valid credentials
    Given user launches the application
    And enters username and password
      | username | password |
      | userA    | pwd1234  |
      | userB    | pwd2344  |
    And user verifies the output
