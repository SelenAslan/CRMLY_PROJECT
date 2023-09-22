Feature: Logout functionality test

  Scenario: Logout successfully
    Given browser is open
    And user is on login page
    And user enters username and password
    And user clicks on login
    When user clicks profile menu
    And user logout button
    Then user should navigate back to login page