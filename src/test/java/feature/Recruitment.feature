Feature: Recruitment

  @Recruitment
  Scenario: To validate user is able to add job vacancy
    Given User launches the application
    When User is on login page
    When User Enter valid data
    Then User click on login btn
       And User mousover to recruitment
    And User click on job vacancies
    And User enterinto the frame
    And User click on add button
    And User select the jobtitle
    And User enters the "Suresh" and "testing"
    And User select the check box and click on save btn
