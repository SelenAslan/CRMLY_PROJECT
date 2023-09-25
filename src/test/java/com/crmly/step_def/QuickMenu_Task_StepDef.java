package com.crmly.step_def;

import com.crmly.pages.QuickMenu_Task_Page;
import com.crmly.pages.Base;
import com.crmly.pages.LoginPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuickMenu_Task_StepDef extends Base {

    QuickMenu_Task_Page activityStreamTaskPage = new QuickMenu_Task_Page();
    LoginPage loginPage = new LoginPage();


    //User Story:
    //As a user, I should be able to assign tasks under the Quick Navigate Menu.
    //
    //Acceptance Criteria:
    //1. HR User should be able to create "High priority" tasks with the mandatory fields.
    //2. HR User should be able to assign a task to more than one user (Test with adding 3 users max.)
    //3. Checklist should be able to be added while creating a task.
    //4. Deadline should be able to be added while creating a task.


    @Given("HR user lands on Activity stream page")
    public void hr_user_lands_on_activity_stream_page() {

        String expectedURL = "stream";

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains(expectedURL));

        String actualURL   = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualURL.contains(expectedURL));
    }

    @Given("HR User clicks TASK link under the Quick Navigation Menu")
    public void hr_user_clicks_task_link_under_the_quick_navigation_menu() {
        activityStreamTaskPage.taskButton.click();
        BrowserUtils.waitForVisibility(activityStreamTaskPage.taskName, 10);
    }

    @Given("Task name and Responsible person is mandatory")
    public void Task_Name_And_Responsible_Person_Is_Mandatory() {

        activityStreamTaskPage.taskName.sendKeys("TESTING WITHOUT A TASK NAME");
        BrowserUtils.waitFor(1);
        activityStreamTaskPage.taskName.clear();

        activityStreamTaskPage.sendButton.click();
        String expectedTaskNameError = "The task name is not specified.";
        String actualTaskNameError = activityStreamTaskPage.taskErrorMessage.getText();
        Assert.assertEquals(expectedTaskNameError, actualTaskNameError);

        BrowserUtils.waitFor(1);
        activityStreamTaskPage.taskName.sendKeys("TESTING WITHOUT RESPONSIBLE PERSON");
        activityStreamTaskPage.deleteResponsiblePerson.click();
        activityStreamTaskPage.sendButton.click();

        String expectedNoneResponsiblePersonMessage = "A user specified in the field \"Responsible Person\" was not " +
                "found.";
        String actualNoneResponsiblePersonMessage   = activityStreamTaskPage.taskErrorMessage.getText();
        Assert.assertEquals(expectedNoneResponsiblePersonMessage, actualNoneResponsiblePersonMessage);

    }

    @Given("HR user types a Task name")
    public void hr_user_types_a_task_name() {

        BrowserUtils.waitFor(1);
        activityStreamTaskPage.taskName.clear();
        activityStreamTaskPage.taskName.sendKeys("TESTING WITH MANDATORY FIELDS");
    }

    @Given("HR user clicks and checks the High Priority check box")
    public void hr_user_clicks_and_checks_the_high_priority_check_box() {
        activityStreamTaskPage.highPriority.click();
    }

    @Given("HR user clicks Add button to add {int} responsible person")
    public void hr_user_clicks_add_button_to_add_responsible_person(int quantity) {

        activityStreamTaskPage.addButton.click();
        BrowserUtils.waitForVisibility(activeStreamPage.employeesAndDepartmentsLink, 10);
        activeStreamPage.employeesAndDepartmentsLink.click();
        BrowserUtils.sleep(1);

        activeStreamPage.randomPerson(quantity);

        activityStreamTaskPage.taskButton.click();
    }

    @Given("HR user clicks Add more button to add {int} responsible person")
    public void hr_user_clicks_add_more_button_to_add_responsible_person(int quantity) {

        BrowserUtils.waitForClickablility(activityStreamTaskPage.addMoreButton, 10);
        activityStreamTaskPage.addMoreButton.click();
        BrowserUtils.waitForClickablility(activeStreamPage.employeesAndDepartmentsLink, 10);
        activeStreamPage.employeesAndDepartmentsLink.click();
        BrowserUtils.sleep(1);

        activeStreamPage.randomPerson(quantity);

        activityStreamTaskPage.taskButton.click();
    }

    @Given("HR user clicks the Send button")
    public void hr_user_clicks_the_send_button() {
          activityStreamTaskPage.sendButton.click();
          BrowserUtils.waitForVisibility(activityStreamTaskPage.taskCreatedPopup, 10);
    }

    @Given("Task should be created successfully")
    public void task_should_be_created_successfully() {
        activityStreamTaskPage.taskCreatedPopup.isDisplayed();
        BrowserUtils.waitFor(2);
    }

    @Given("HR User clicks Checklist link")
    public void hr_user_clicks_checklist_link() {
        activityStreamTaskPage.checklistButton.click();
    }

    @Given("HR user enters some text into Things to do field and confirm")
    public void hr_user_enters_some_text_into_things_to_do_field_and_confirm() {
        activityStreamTaskPage.checklistInputArea.sendKeys("DO THIS FIRST");
        activityStreamTaskPage.checklistConfirm.click();
        activityStreamTaskPage.checklistInputArea.sendKeys("DO THAT SECOND");
        activityStreamTaskPage.checklistConfirm.click();
    }

    @Given("HR User clicks the calendar to select 11_21_2023 as a deadline")
    public void hr_user_clicks_the_calendar_to_select_11_21_2023_as_a_deadline() {
        BrowserUtils.waitForClickablility(activityStreamTaskPage.deadlineArea, 10);
        activityStreamTaskPage.deadlineArea.click();
        BrowserUtils.waitForClickablility(activityStreamTaskPage.currentMount, 10);
        activityStreamTaskPage.currentMount.click();
        BrowserUtils.waitForClickablility(activityStreamTaskPage.mounth, 10);
        activityStreamTaskPage.mounth.click();
        BrowserUtils.waitForClickablility(activityStreamTaskPage.currentYear, 10);
        activityStreamTaskPage.currentYear.click();
        BrowserUtils.waitForClickablility(activityStreamTaskPage.year, 10);
        activityStreamTaskPage.year.click();
        BrowserUtils.waitForClickablility(activityStreamTaskPage.day, 10);
        activityStreamTaskPage.day.click();
        BrowserUtils.waitForClickablility(activityStreamTaskPage.hour, 10);
        activityStreamTaskPage.hour.sendKeys("03");
        BrowserUtils.waitForClickablility(activityStreamTaskPage.minute, 10);
        activityStreamTaskPage.minute.sendKeys("59");
        BrowserUtils.waitForClickablility(activityStreamTaskPage.sendButton, 10);
        activityStreamTaskPage.selectButton.click();
    }


    @Given("HR user enters a description for the task")
    public void HR_user_enters_A_Description_For_The_Task() {

        Driver.getDriver().switchTo().frame(activityStreamTaskPage.taskDescription);

        String description = "Sometimes, there is a need to find\n" +
                        "stories, issues, bugs, etc that were included in a sprint that has\n" +
                        "already been completed.";
        //activityStreamTaskPage.taskDescription.sendKeys(description);
        new Actions(Driver.getDriver()).sendKeys(Driver.getDriver().findElement(By.xpath("//body")), description).perform();

        Driver.getDriver().switchTo().parentFrame();
    }


}
