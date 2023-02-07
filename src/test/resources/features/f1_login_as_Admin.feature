Feature: Login
  Scenario: User successfully login with valid account
    Given user is on login pages
    When user input valid username
    And user input valid password
    And user click login button
    Then user verify sucess login

  Scenario: User failed login with no password
    Given user is on login pages
    When user input valid username
    And user click login button
    Then user verify failed login with no password

  Scenario: User failed login with no username
    Given user is on login pages
    When user input valid password
    And user click login button
    Then user verify failed login with no username

  Scenario: User failed login with no password and no username
    Given user is on login pages
    When user click login button
    Then user verify failed login

  Scenario: User failed login with wrong Password
    Given user is on login pages
    When user input valid username
    And user input wrong password
    And user click login button
    Then user verify failed login with wrong password

  Scenario: User failed login with wrong username
    Given user is on login pages
    When user input wrong username
    And user input valid password
    And user click login button
    Then user verify failed login with wrong username
