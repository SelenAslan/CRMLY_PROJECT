Feature: As a user, I should be able to add link, insert video, mention, quote, add tag in message.

  Background: Log in
    * Go to "UserURL".
    * Valid username "MarketingMail", password "Password" information is entered and the sign In button is clicked.

    @Smoke
  Scenario: User should be able to add mentions
    * Click on the Message button
    * Message is written and the send button is clicked
    * Verifying that the message was sent
    * User closes page.

    @Smoke
  Scenario:  User should be able to attach a link to the specified text.
    * Click on the Link button in the message section
    * Link is added and saved
    * Click on the send button
    * Verified ability to add a link to specified text
    * User closes page.

  Scenario:  User should be able to insert YouTube and Vimeo videos.
    * Click on the Message button
    * Click on the Insert video button in the message section
    * Add any youtube URL and click on the Save button
    * Verifying that the video has been added
    * User closes page.


  Scenario: User should be able to cancel links and videos before sending the message
    * Click on the Link button in the message section
    * Link is added and saved
    * The added link is deleted
    * Click on the Insert video button in the message section
    * Add any youtube URL and click on the Save button
    * Added video is deleted
    * Click on the send button
    * User closes page.

  Scenario: User should be able to add quotes.
    *  Clicks on the message button and then clicks on the double Quote text button below it
    *  User writes and sends the quote
    *  Verify that the requested connection is working
    *  User closes page.


  Scenario: User should be able to add tags to messages.
    * The message button the user clicks on the add tag button below it The tag message is added
    * The person to whom it will be is added
    * The added tag is sent
    * Verify that the requested connection is working
    * User closes page.

  Scenario: User should be able to remove tags before sending the message
    * The message button the user clicks on the add tag button below it The tag message is added
    * The person to whom it will be is added
    * The tags are verified to be deleted before the message is sent
    * The added tag is sent
    * User closes page.

