@us07
Feature: As a user, I should be able to create a  poll by clicking on Poll tab under Active Stream.

  Background: Login in.
    * Go to "UserURL".
    * Valid username "MarketingMail", password "Password" information is entered and the sign In button is clicked.
    * Click the Poll tab under Active Stream.


  Scenario: User should be able to add users by selecting multiple contacts from Employees and Department's contact lists.
    * More than one person is selected from the contact lists of the employees and the Department and the add button is clicked.
    * The addition of new users is verified.
    * User closes page.

  Scenario: The user should be able to add questions.
    * New questions are entered and the save button is clicked.
    * Verifies that new questions have been added
    * User closes page.

  Scenario: The user should be able to add more than one answer.
    * The user adds more than one answer to the questions and clicks the save button.
    * Verifies that multiple answers are attached to questions
    * User closes page.

  Scenario: The user should be able to delete questions.
    * Click the delete button next to the desired question.
    * Verify that the requested issue has been deleted.
    * User closes page.

  Scenario: The user should be able to delete multiple replies.
    * Click the delete button next to the desired replies.
    * Verify that the requested replies has been deleted.
    * User closes page.

  Scenario: User should be able to provide multiple choice to attendees by selecting the Allow multiple choice checkbox.
    * The allow multiple selection checkbox appears and is verified as active.
    * User closes page.

  Scenario: User should be able to create a poll with mandatory fields.
    * It is verified that there are mandatory fields in the survey.
    * User closes page.