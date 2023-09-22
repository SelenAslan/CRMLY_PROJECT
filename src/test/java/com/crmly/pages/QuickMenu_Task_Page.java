package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickMenu_Task_Page extends Base {

    public QuickMenu_Task_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-tasks\"]/span")
    public WebElement taskButton;

    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement taskName;

    @FindBy(xpath = "//div[@class='task-message-label error']")
    public WebElement taskErrorMessage;

    @FindBy(xpath = "(//*[@class='bx-editor-iframe'])[2]")
    public WebElement taskDescription;

    @FindBy(xpath = "//input[@id=\"tasks-task-priority-cb\"]")
    public WebElement highPriority;

    @FindBy(xpath = "(//span[starts-with(@title, 'Cancel selection')])[1]")
    public WebElement deleteResponsiblePerson;

    @FindBy(xpath = "//div[@id='bx-component-scope-lifefeed_task_form-responsible']//a[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-filled task-form-field-link add'][normalize-space()='Add more']")
    public WebElement addMoreButton;

    @FindBy(xpath = "//div[@id='bx-component-scope-bitrix_tasks_task_1-responsible']//a[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-empty task-form-field-link add'][normalize-space()='Add']")
    public WebElement addButton;

    @FindBy(xpath = "//*[@id=\"destDepartmentTab_-719571256\"]")
    public WebElement employeesAndDepartmentsButton;

    @FindBy(xpath = "//span[@data-bx-id='dateplanmanager-deadline']//input[@type='text']")
    public WebElement deadlineArea;

    @FindBy(xpath = "//a[@class='bx-calendar-top-month']")
    public WebElement currentMount;

    @FindBy(xpath = "(//div[@class='bx-calendar-month-content']//span)[11]")
    public WebElement mounth;

    @FindBy(xpath = "//a[@class='bx-calendar-top-year']")
    public WebElement currentYear;

    @FindBy(xpath = "(//div[@id='bx-calendar-year-content']/span)[4]")
    public WebElement year;

    @FindBy(xpath = "((//div[@class='bx-calendar-range'])[4]//a)[3]")
    public WebElement day;

    @FindBy(xpath = "(//input[@class='bx-calendar-form-input'])[1]")
    public WebElement hour;

    @FindBy(xpath = "(//input[@class='bx-calendar-form-input'])[2]")
    public WebElement minute;

    @FindBy(xpath = "//span[.='Select']")
    public WebElement selectButton;

    @FindBy(xpath = "//span[@class='tasks-task-mpf-link']")
    public WebElement checklistButton;

    @FindBy(xpath = "//input[@class='js-id-checklist-is-form-title task-checklist-field-add']")
    public  WebElement checklistInputArea;

    @FindBy(xpath = "(//span[@class='task-checklist-form-vpadding']//span)[1]")
    public  WebElement checklistConfirm;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']" )
    public  WebElement sendButton;

    @FindBy(xpath = "//div[@class='feed-create-task-popup-title']")
    public WebElement taskCreatedPopup;


    /////////////////////// FOR LATER USE /////////////////////


    @FindBy(css = "span[class='task-checklist-form-vpadding']>span")
    public  WebElement checklistXSign;

    @FindBy(xpath = "(//div[@id='bx-component-scope-lifefeed_task_form-checklist']/div)[2]")
    public WebElement checklistEntered;

    @FindBy(xpath = "//div[@id=\"blogPostEditCreateTaskPopup\"]")
    public WebElement pupUpView;  // the whole window

    @FindBy(xpath = "(//*[@id=\"blogPostEditCreateTaskPopup\"]//div)[4]")
    public WebElement pupUpViewNote1;  // Task has been created

    @FindBy(xpath = "(//*[@id=\"blogPostEditCreateTaskPopup\"]//div)[5]")
    public WebElement pupUpViewNote2;  // You can now view and edit the task.

    @FindBy(xpath = "(//*[@id=\"blogPostEditCreateTaskPopup\"]//span)[2]")
    public WebElement pupUpViewNote3;  // VIEW TASK

    @FindBy(xpath = "((//div[@class='task-options-item-more']/span)[2]/span)[1]")
    public WebElement timePlanningButton;

    @FindBy(xpath = "(//input[@data-bx-id='datepicker-display'])[2]")
    public WebElement startTaskOnArea;

    @FindBy(xpath = "((//div[@class='bx-calendar-range'])[2]//a)[2]")
    public WebElement day8May;

    @FindBy(xpath = "//input[@data-bx-id='dateplanmanager-duration']")
    public WebElement duration;

    @FindBy(xpath = "(//input[@data-bx-id='datepicker-display'])[3]")
    public WebElement finishArea;







}