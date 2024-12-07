Feature: feature to test login functionality.

@smoketest
  Scenario: check if login is successful with valid credentials.
    Given user is on login page
    When the user enters username and password
    And clicks on login button
    Then user must be logged in

     Scenario: check if login is successful with valid credentials.
    Given user is on login page
    When the user enters username and password
    And clicks on login button
    Then user must be logged in