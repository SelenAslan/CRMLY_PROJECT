
Feature: As a user, I should be able to create a  poll by clicking on Poll tab under Active Stream.

  Background: Login in.
    * Go to "UserURL".
    * Valid username "MarketingMail", password "Password" information is entered and the sign In button is clicked.
    * Click the Poll tab under Active Stream.


  Scenario: User should be able to add users by selecting multiple contacts from Employees and Department's contact lists.
    * Click the addMore button.
    * Click the Employees and Departments link.
    * Click multiple selections 3.
    * The addition of new users is verified.
    * User closes page.

  Scenario: The user should be able to add questions.
    * Enter questions title, questions and answer information. Send button is clicked.
    * Verifies that new questions have been added
    * User closes page.

  Scenario: The user should be able to add more than one answer.
    * Adds multiple answers to the question.
    * Verifies that multiple answers are attached to questions
    * User closes page.

  Scenario: The user should be able to delete questions.
    * Enter questions title, questions and answer information. Send button is clicked.
    * Click the more link.
    * Click the delete button next to the desired question.
    * Verify that the requested issue has been deleted.
    * User closes page.

  Scenario: The user should be able to delete multiple replies
    * Adds multiple answers to the question.
    * Click the more link.
    * Click edit link and delete multiple answers.
    * Verify that the requested replies has been deleted.
    * User closes page.

  Scenario: User should be able to provide multiple choice to attendees by selecting the Allow multiple choice checkbox.
    * The allow multiple selection checkbox appears and is verified as active.
    * User closes page.

  Scenario: User should be able to create a poll with mandatory fields.
    * Verify that there are mandatory fields in the questionnaire.
    * User closes page.

