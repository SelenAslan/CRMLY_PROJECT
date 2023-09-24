Feature: Tests for US 2.

  Background: Login and click Task link under the Quick Navigation Menu
    * Go to "UserURL".
    * Valid username "HR_Mail", password "Password" information is entered and the sign In button is clicked.

  @3upload
  Scenario: User should be able to upload multiple files a simultaneously (Test with max 3 files).

    Given User clicks message button
    And User clicks upload files button
    Then User upload files or images by one by and upload

  @insert
  Scenario:  User should be able to insert the files and images into text

    And User clicks message button
    And User clicks upload files button
    And User upload files or images by one by and upload
    Then User can inserts files or image into the text

  @rename
  Scenario:  User should be able to rename the file before sending.

    And User clicks message button
    And User clicks upload files button
    And User upload files or images by one by and upload
    Then User can rename files or image before send the text

  @remove
  Scenario:  The User should be able to remove files and images at any time before sending.

    And User clicks message button
    And User clicks upload files button
    And User upload files or images by one by and upload
    Then User can remove file after upload and before sending.