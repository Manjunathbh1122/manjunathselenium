Feature: Login

  Scenario: Login with valid credentials
    Given user is on login page
    When user enter valid username and password
    And clicked on login button
    Then Home page should display
