Feature: As a user, I should be able to use functions on
  Company Structure under Employee menu.

  Background: Login in.
    * Go to "UserURL".


  Scenario: HR user types should be able to display company structure.
    * Valid username "HRMail", password "Password" information is entered and the sign In button is clicked.
    When user clicks Employees button from Configure Menu
    And verify that user is in the Company Structure Page
    Then verify Add Department option is visible


  Scenario: Helpdesk user types should be able to display company structure.
    * Valid username "HelpdeskMail", password "Password" information is entered and the sign In button is clicked.
    When user clicks Employees button from Configure Menu
    Then verify that HR user is in the Company Structure Page



  Scenario: Marketing user types should be able to display company structure.
    * Valid username "MarketingMail", password "Password" information is entered and the sign In button is clicked.
    When user clicks Employees button from Configure Menu
    Then verify that Marketing user is in the Company Structure Page


  Scenario: HR user should be able to add a department from the company structure.
    * Valid username "HRMail", password "Password" information is entered and the sign In button is clicked.
    Given user clicks Employees button from Configure Menu
    When HR user clicks Add Department button
    When user enter a Department Name
    Then user clicks Add button


  Scenario: HR user should be able to select a parent department from the department dropdown.
    * Valid username "HRMail", password "Password" information is entered and the sign In button is clicked.
    Given user clicks Employees button from Configure Menu
    When HR user clicks Add Department button
    When user selects an option from Parent dropdown
    Then user clicks Add button


  Scenario: HR user should be able to close add department pop-up at any time.
    * Valid username "HRMail", password "Password" information is entered and the sign In button is clicked.
    Given user clicks Employees button from Configure Menu
    When HR user clicks Add Department button
    And user clicks Close button


  Scenario: Helpdesk users can not change company structure.
    * Valid username "HelpdeskMail", password "Password" information is entered and the sign In button is clicked.
    Given user clicks Employees button from Configure Menu
    When user is in the Company Structure page
    Then verify that there is not a clickable Add Department button


  Scenario: Marketing users can not change company structure.
    * Valid username "MarketingMail", password "Password" information is entered and the sign In button is clicked.
    Given user clicks Employees button from Configure Menu
    When user is in the Company Structure page
    Then verify that there is not a clickable Add Department button


  Scenario: HR user should be able to select a Supervisor
    * Valid username "HRMail", password "Password" information is entered and the sign In button is clicked.
    Given user clicks Employees button from Configure Menu
    When verify that user opens Add Department pop-up
    When user selects Supervisor from Recent by clicking Select from structure button
    When user selects Supervisor from Company by clicking Select from structure button
    When user selects Supervisor from Search by clicking Select from structure button
    Then user clicks Add button















