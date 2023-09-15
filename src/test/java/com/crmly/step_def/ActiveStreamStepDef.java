package com.crmly.step_def;

import com.crmly.pages.ActiveStreamPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ActiveStreamStepDef {

    ActiveStreamPage activeStreamPage = new ActiveStreamPage();
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

}
