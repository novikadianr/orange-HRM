Feature: Add Employe from PIM menu
  Scenario: User failed add employe with no fullname
    Given user is on homepages
    When user click menu PIM
    And user click Add button
    And user input 