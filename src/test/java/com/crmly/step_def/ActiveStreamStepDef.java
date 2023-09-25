package com.crmly.step_def;

import com.crmly.pages.ActiveStreamPage;
import com.crmly.pages.Base;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import com.github.javafaker.Faker;
import com.google.common.base.Verify;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.hc.core5.http.Message;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ActiveStreamStepDef extends Base {


    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("Click the Poll tab under Active Stream.")
    public void click_the_poll_tab_under_active_stream() {
        activeStreamPage.pollTab.click();
        BrowserUtils.sleep(2);
    }

    @Given("User closes page.")
    public void user_closes_page() {
        Driver.closeDriver();
    }

    @Given("The addition of new users is verified.")
    public void the_addition_of_new_users_is_verified() {
        Assert.assertTrue(activeStreamPage.listOfAdditions.size() > 1);
    }

    @Given("Enter questions title, questions and answer information. Send button is clicked.")
    public void new_questions_are_entered_and_the_save_button_is_clicked() {

        Driver.getDriver().switchTo().frame(activeStreamPage.ASPFrameElement);
        activeStreamPage.ASPQuestionsTitleTextBox.sendKeys(faker.lorem().word());
        Driver.getDriver().switchTo().parentFrame();
        activeStreamPage.ASPQuestionsTextBox.sendKeys(faker.lorem().sentence());
        activeStreamPage.ASPAnswerTextBox.sendKeys(faker.lorem().sentence());
        activeStreamPage.ASPSendButton.click();
    }

    @Given("Verifies that new questions have been added")
    public void verifies_that_new_questions_have_been_added() {
        Assert.assertTrue(activeStreamPage.ASPStopButton.isDisplayed());
    }

    @Given("Adds multiple answers to the question.")
    public void the_user_adds_more_than_one_answer_to_the_questions_and_clicks_the_save_button() {
        Driver.getDriver().switchTo().frame(activeStreamPage.ASPFrameElement);
        activeStreamPage.ASPQuestionsTitleTextBox.sendKeys(faker.lorem().word());
        Driver.getDriver().switchTo().parentFrame();
        activeStreamPage.ASPQuestionsTextBox.sendKeys(faker.lorem().sentence());
        activeStreamPage.ASPAnswerTextBox.sendKeys(faker.lorem().sentence());
        activeStreamPage.ASPAnswer2TextBox.sendKeys(faker.lorem().sentence());
        activeStreamPage.ASPAnswer3TextBox.sendKeys(faker.lorem().sentence());
        activeStreamPage.ASPSendButton.click();
    }

    @Given("Verifies that multiple answers are attached to questions")
    public void verifies_that_multiple_answers_are_attached_to_questions() {
        Assert.assertTrue(activeStreamPage.ASPAnswerList.size() > 3);
    }

    @Given("Click the delete button next to the desired question.")
    public void click_the_delete_button_next_to_the_desired_question() {

        activeStreamPage.APSMoreLinkDeleteTab.click();
        BrowserUtils.sleep(1);

        Driver.getDriver().switchTo().alert().accept();
        BrowserUtils.sleep(1);


    }

    @Given("Verify that the requested issue has been deleted.")
    public void verify_that_the_requested_issue_has_been_deleted() {
        Assert.assertTrue(activeStreamPage.APSSuccessDeletedText.isDisplayed());
    }

    @Given("Click the more link.")
    public void click_the_delete_button_next_to_the_desired_replies() {
        BrowserUtils.sleep(2);
        activeStreamPage.APSMoreLink.click();
        BrowserUtils.sleep(1);

    }

    @Given("Click edit link and delete multiple answers.")
    public void click_edit_link_and_delete_multiple_answers() {
        activeStreamPage.APSMoreLinkEditTab.click();
        js.executeScript("window.scrollBy(0, 500);");
        BrowserUtils.sleep(2);

        activeStreamPage.APSEditAnswerDel();
        activeStreamPage.APSEditAnswerDel();

        activeStreamPage.APSEditAnswerSendButton.click();
        BrowserUtils.sleep(2);

    }

    @Given("Verify that the requested replies has been deleted.")
    public void verify_that_the_requested_replies_has_been_deleted() {
        Assert.assertTrue(activeStreamPage.ASPAnswerList.size() < 2);
    }

    @Given("The allow multiple selection checkbox appears and is verified as active.")
    public void the_allow_multiple_selection_checkbox_appears_and_is_verified_as_active() {
        Assert.assertTrue(activeStreamPage.ASPAllowMultipleChoiceCheckbox.isDisplayed());
        Assert.assertTrue(activeStreamPage.ASPAllowMultipleChoiceCheckbox.isEnabled());
    }

    @Given("Verify that there are mandatory fields in the questionnaire.")
    public void it_is_verified_that_there_are_mandatory_fields_in_the_survey() {

        activeStreamPage.ASPQuestionsTextBox.sendKeys(faker.lorem().sentence());
        activeStreamPage.ASPAnswerTextBox.sendKeys(faker.lorem().sentence());
        activeStreamPage.ASPSendButton.click();
        BrowserUtils.sleep(2);

        Assert.assertTrue(activeStreamPage.ASPRequiredFieldTextAlert.isDisplayed());
    }

    @Given("Click the addMore button.")
    public void click_the_add_more_button() {
        activeStreamPage.activeStreamPageAddMoreButton.click();
        BrowserUtils.sleep(1);
    }

    @Given("Click the Employees and Departments link.")
    public void click_the_employees_and_departments_link() {
        activeStreamPage.employeesAndDepartmentsLink.click();
        BrowserUtils.sleep(2);
    }

    @Given("Click multiple selections {int}.")
    public void click_multiple_selections(int quantity) {
        for (int i = 0; i < quantity; i++) {
            activeStreamPage.randomPerson();
        }


    }

    @Given("Click on the Message button")
    public void click_on_the_button() {
        activeStreamPage.ASPMessageButton.click();
        BrowserUtils.sleep(2);

    }

    @Given("Message is written and the send button is clicked")
    public void Message_is_written_and_the_send_button_is_clicked() {
        Driver.getDriver().switchTo().frame(activeStreamPage.ASPMessageIframeElement);
        BrowserUtils.sleep(2);
        activeStreamPage.ASPMessageText.sendKeys("hey Team");
        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.sleep(2);
        activeStreamPage.ASPMessageSendButton.click();
        BrowserUtils.sleep(2);
    }


    @Given("Click on the Link button in the message section")
    public void click_on_the_Link_button_in_the_message_section() {
        activeStreamPage.ASPMessageButton.click();
        BrowserUtils.sleep(2);

    }

    @Given("Link is added and saved")
    public void Link_is_added_and_saved() {
        activeStreamPage.ASPLinkButton.click();
        BrowserUtils.sleep(2);
        activeStreamPage.ASPMessageAlertLinkUrl.sendKeys("google.com");
        activeStreamPage.ASPMessageAlertSaveButton.click();
        BrowserUtils.sleep(2);

    }

    @Given("Click on the send button")
    public void Click_on_the_send_button() {
        activeStreamPage.ASPMessageSendButton.click();
        BrowserUtils.sleep(2);
    }

    @Given("Click on the Insert video button in the message section")
    public void Click_on_the_Insert_video_button_in_the_message_section() {
        activeStreamPage.ASPVideoButton.click();
        BrowserUtils.sleep(2);

    }

    @Given("Add any youtube URL and click on the Save button")
    public void Add_any_youtube_URL_and_click_on_the_Save_button() {
        activeStreamPage.ASPVideoUrl.sendKeys("https://www.youtube.com/watch?v=qlr7eQp6eQE");
        BrowserUtils.sleep(2);
        activeStreamPage.ASPMessageAlertSaveButton.click();
        BrowserUtils.sleep(1);

    }

    @Given("Verifying that the video has been added")
    public void Verifying_that_the_video_has_been_added() {
        Assert.assertTrue(activeStreamPage.ASPSuccessAddedText.isDisplayed()); //görünüyorsa
        BrowserUtils.sleep(2);
    }

    @Given("The user writes a message and adds the link by clicking the link button at the bottom of the message")
    public void The_user_writes_a_message_and_adds_the_link_by_clicking_the_link_button_at_the_bottom_of_the_message() {
        activeStreamPage.ASPMessageButton.click();
        BrowserUtils.sleep(1);
        Driver.getDriver().switchTo().frame(activeStreamPage.ASPMessageIframeElement);
        BrowserUtils.sleep(2);
        activeStreamPage.ASPMessageText.sendKeys("hey Team");
        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.sleep(2);
        activeStreamPage.ASPLinkButton.click();
        activeStreamPage.ASPMessageAlertLinkUrl.sendKeys("google.com");
        BrowserUtils.sleep(1);
        activeStreamPage.ASPMessageAlertSaveButton.click();
        BrowserUtils.sleep(2);


    }

    @Given("Deletes the link and clicks the send button before sending the message")
    public void Deletes_the_link_and_clicks_the_send_button_before_sending_the_message() {
        activeStreamPage.ASPMessageSendAndDeletes.click();
        BrowserUtils.sleep(2);
    }



    @Given("Clicks on the message button and then clicks on the double Quote text button below it")
    public void Clicks_on_the_message_button_and_then_clicks_on_the_double_Quote_text_button_below_it() {
        activeStreamPage.ASPMessageButton.click();
        BrowserUtils.sleep(2);
        activeStreamPage.ASPQuoteText.click();
        BrowserUtils.sleep(2);

    }

    @Given("User writes and sends the quote")
    public void User_writes_and_sends_the_quote() {
        Driver.getDriver().switchTo().frame(activeStreamPage.ASPMessageIframeElement);
        BrowserUtils.sleep(2);
        activeStreamPage.ASPMessageAlertQuoteText.sendKeys("Steve Jobs: The only way to do great work is to love what you do. If you haven't found it yet, keep looking. Don't settle.");
        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().parentFrame();
        activeStreamPage.ASPSendQuote.click();
        BrowserUtils.sleep(2);
    }
    @Given("The message button the user clicks on the add tag button below it The tag message is added")
    public void The_message_button_the_user_clicks_on_the_add_tag_button_below_it_The_tag_message_is_added() {
        activeStreamPage.ASPMessageButton.click();
        BrowserUtils.sleep(2);
        activeStreamPage.ASPAddTag.click();
        BrowserUtils.sleep(2);
        activeStreamPage.ASPMessageAlertAddTags.sendKeys("#important");
        BrowserUtils.sleep(2);
        activeStreamPage.ASPMessageAlertAdd.click();
        BrowserUtils.sleep(1);


    }
    @Given("The person to whom it will be is added")
    public void The_person_to_whom_it_will_be_sent_is_added() {
        activeStreamPage.ASPMessagePeople1.click();
        BrowserUtils.sleep(1);
        activeStreamPage.ASPMessageTagAddLink.click();
       // activeStreamPage.ASPMessageToAdded.sendKeys("marketing1@cybertekschool.com");
        BrowserUtils.sleep(3);

        Driver.getDriver().switchTo().frame(activeStreamPage.ASPMessageIframeElement);
        BrowserUtils.sleep(2);
        activeStreamPage.ASPMessageText.sendKeys("hey Team");
        Driver.getDriver().switchTo().parentFrame();
            }
    @Given("Verify that the requested connection is working")
   public void Verify_that_the_requested_connection_is_working() {
        Assert.assertTrue(activeStreamPage.ASPMessageAlertLink1.isDisplayed());
    }


    @Given("Clicks the add tag button in the message section and adds the tag")
    public void Clicks_the_add_tag_button_in_the_message_section_and_adds_the_tag(){
        activeStreamPage.ASPAddTag.click();
        BrowserUtils.sleep(2);
    }
    @Given("The tags are verified to be deleted before the message is sent")
    public void The_tags_are_verified_to_be_deleted_before_the_message_is_sent () {
        activeStreamPage.ASPMessageToCloseX.click();
        BrowserUtils.sleep(1);
        activeStreamPage.ASPMessageToCloseX.click();
        BrowserUtils.sleep(2);

    }
    @Given("Verifying that the message was sent")
    public void verifying_that_the_message_was_sent() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(activeStreamPage.ASPMessageTextElement.isDisplayed());
    }
    @Given("Verified ability to add a link to specified text")
    public void verified_ability_to_add_a_link_to_specified_text() {
        Assert.assertTrue(activeStreamPage.ASPMessageAlertLinkVerify.isDisplayed());

    }
    @Given("The added link is deleted")
    public void the_added_link_is_deleted() {
        Driver.getDriver().switchTo().frame(activeStreamPage.ASPMessageIframeElement);
        BrowserUtils.sleep(2);
        activeStreamPage.ASPDeletedLinkText.clear();
        BrowserUtils.sleep(2);
        System.out.println("Input field cleared..!");
        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.sleep(3);


      //  for (int i = 0; i <= 10; i++) {
       //     activeStreamPage.ASPDeletedLinkText.sendKeys(Keys.BACK_SPACE);
        }


    @Given("Added video is deleted")
    public void added_video_is_deleted() {

    }

    @Given("Message is written")
    public void  Message_is_written(){
        Driver.getDriver().switchTo().frame(activeStreamPage.ASPMessageIframeElement);
        BrowserUtils.sleep(2);
        activeStreamPage.ASPMessageText.sendKeys("Hi Team");
        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.sleep(2);
    }

    @Given("The added tag is sent")
    public void  The_added_tag_is_sent(){
        activeStreamPage.ASPSendQuote.click();
        BrowserUtils.sleep(2);

        try {
            Assert.assertFalse(activeStreamPage.ASPMessageToCloseX.isDisplayed());
        } catch (Exception e) {
            System.out.println("Successfully");
        }
    }

}


