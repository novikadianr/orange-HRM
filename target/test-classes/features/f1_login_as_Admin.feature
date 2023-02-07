Feature: Login
  Scenario: User successfully login with valid account
    Given user is on login pages
    And user has active account
    When user input username
    And user input password
    And user click login button
    Then user verify sucess login
