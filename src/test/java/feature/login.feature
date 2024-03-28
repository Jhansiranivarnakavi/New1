Feature: login
  @Login
  Scenario: verify login
    Given User launches the application
    When User is on login page
    When User Enter valid data
    Then User click on login btn
