@Task
Feature: As a user, I should be able to assign tasks under the Quick Navigate Menu.

  Background: Login and click Task link under the Quick Navigation Menu
    * Go to "UserURL".
    * Valid username "HR_Mail", password "Password" information is entered and the sign In button is clicked.
    * HR user lands on Activity stream page
    * HR User clicks TASK link under the Quick Navigation Menu


  Scenario: HR User should provide a Task name and Responsible person
    * Task name and Responsible person is mandatory
    * HR user types a Task name
    * HR user enters a description for the task
    * HR user clicks Add button to add 1 responsible person
    * HR user clicks the Send button
    * Task should be created successfully

  Scenario:  HR User should be able to create "High priority" tasks with the mandatory fields.
    * HR user types a Task name
    * HR user enters a description for the task
    * HR user clicks and checks the High Priority check box
    * HR user clicks Add more button to add 1 responsible person
    * HR user clicks the Send button
    * Task should be created successfully

  Scenario:  HR User should be able to assign a task to more than one user
    * HR user types a Task name
    * HR user enters a description for the task
    * HR user clicks and checks the High Priority check box
    * HR user clicks Add more button to add 2 responsible person
    * HR user clicks the Send button
    * Task should be created successfully

  Scenario:  Checklist should be able to be added while creating a task.
    * HR user types a Task name
    * HR user enters a description for the task
    * HR user clicks and checks the High Priority check box
    * HR User clicks Checklist link
    * HR user enters some text into Things to do field and confirm
    * HR user clicks Add more button to add 2 responsible person
    * HR user clicks the Send button
    * Task should be created successfully

  Scenario: Deadline should be able to be added while creating a task.
    * HR user types a Task name
    * HR user enters a description for the task
    * HR user clicks and checks the High Priority check box
    * HR User clicks Checklist link
    * HR user enters some text into Things to do field and confirm
    * HR User clicks the calendar to select 11_21_2023 as a deadline
    * HR user clicks Add more button to add 2 responsible person
    * HR user clicks the Send button
    * Task should be created successfully

