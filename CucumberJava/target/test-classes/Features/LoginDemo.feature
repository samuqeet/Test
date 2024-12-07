Feature: Test login functionality

  Scenario Outline: check login is successful with valid credentials
    Given browser is opened
    And login page is visible
    When the <username> and <password> is entered
    And user clicks on login button
    Then user is logged in to homepage

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | admin    | admin    |
