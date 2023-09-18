Feature: As a user, I should be able to use functions on
  Company Structure under Employee menu.

  Scenario: HR user types should be able to display company structure.
    Given user logins as HR user
    When user clicks Employees button from Configure Menu
    And verify that user is in the Company Structure Page
    Then verify Add Department option is visible


  Scenario: Helpdesk user types should be able to display company structure.
    Given user logins as Helpdesk user
    When user clicks Employees button from Configure Menu
    Then verify that HR user is in the Company Structure Page



  Scenario: Marketing user types should be able to display company structure.
    Given user logins as Marketing user
    When user clicks Employees button from Configure Menu
    Then verify that Marketing user is in the Company Structure Page



  Scenario: HR user should be able to add a department from the company structure.
    Given HR user clicks Add Department button
    When user enter a Department Name
    And verify that entry displayed on the tab
    Then user clicks Add button


  Scenario: HR user should be able to select a parent department from the department dropdown.
    Given HR user clicks Add Department button
    When user selects an option from Parent dropdown
    And verify that option displayed on the tab
    Then user clicks Add button


  Scenario: HR user should be able to close add department pop-up at any time.
    Given HR user clicks Add Department button
    And user clicks Close button
    Then verify that Add Department pop-up is closed


  Scenario: Helpdesk and marketing users can not change company structure.
    Given user is in the Company Structure page
    Then verify that there is not a clickable Add Department button


  Scenario: HR user should be able to select a Supervisor
    Given verify that user opens Add Department pop-up
    When user selects Supervisor by clicking Select from structure button
    And verify that selected option seen on the tab
    Then user clicks Add button















