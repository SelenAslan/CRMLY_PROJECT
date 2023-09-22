package com.crmly.pages;

import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ActiveStreamPage extends Base {

    Actions actions = new Actions(Driver.getDriver());
    Random random = new Random();
    @FindBy(xpath = "//*[text()='Poll']")
    public WebElement pollTab;
    @FindBy(xpath = "//*[text()='Add more']")
    public WebElement activeStreamPageAddMoreButton;
    @FindBy(xpath = "//*[text()='Employees and departments']")
    public WebElement employeesAndDepartmentsLink;
    @FindBy(xpath = "//*[@class='bx-finder-company-department-employee-info']")
    public List<WebElement> employeesAndDepartmenList;
    @FindBy(xpath = "//*[@data-type='users']")
    public List<WebElement> listOfAdditions;
    @FindBy(xpath = "//*[@class='bx-editor-iframe']")
    public WebElement ASPFrameElement;
    @FindBy(xpath = "//*[@style='min-height: 184px;']")
    public WebElement ASPQuestionsTitleTextBox;
    @FindBy(xpath = "//*[@id='question_0']")
    public WebElement ASPQuestionsTextBox;
    @FindBy(xpath = "//*[@id='answer_0__0_']")
    public WebElement ASPAnswerTextBox;
    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    public WebElement ASPSendButton;
    @FindBy(xpath = "//*[text()='Stop']")
    public WebElement ASPStopButton;
    @FindBy(xpath = "//*[@id='answer_0__1_']")
    public WebElement ASPAnswer2TextBox;
    @FindBy(xpath = "//*[@id='answer_0__2_']")
    public WebElement ASPAnswer3TextBox;
    @FindBy(xpath = "//*[@class='bx-vote-bar']")
    public List<WebElement> ASPAnswerList;
    @FindBy(linkText = "More")
    public WebElement APSMoreLink;
    @FindBy(xpath = "(//*[@class='menu-popup-item menu-popup-no-icon '])[7]")
    public WebElement APSMoreLinkDeleteTab;
    @FindBy(xpath = "(//*[@class='menu-popup-item menu-popup-no-icon '])[5]")
    public WebElement APSMoreLinkEditTab;
    @FindBy(xpath = "//*[text()='The post has been deleted.']")
    public WebElement APSSuccessDeletedText;
    @FindBy(xpath = "//label[@class='vote-block-close dela']")
    public List<WebElement> APSEditAnswerIconList;
    @FindBy(xpath = "//*[@class='vote-block-inp-wrap']")
    public List<WebElement> APSEditAnswerTextBox;
    @FindBy(xpath = "(//*[text()='Send'])[2]")
    public WebElement APSEditAnswerSendButton;
    @FindBy(xpath = "//*[text()='Allow multiple choice']")
    public WebElement ASPAllowMultipleChoiceCheckbox;
    @FindBy(xpath = "//*[text()='The message title is not specified']")
    public WebElement ASPRequiredFieldTextAlert;

    public void randomPerson() {

        List<String> empAndDepartList = new ArrayList<>();

        for (WebElement eachPerson : employeesAndDepartmenList) {
            empAndDepartList.add(eachPerson.getText());
        }

        int randomIndex = random.nextInt(empAndDepartList.size());

        String randomPerson = empAndDepartList.get(randomIndex);

        for (WebElement person : employeesAndDepartmenList) {

            if (person.getText().equals(randomPerson)) {

                actions.moveToElement(person).perform();
                actions.click(person).perform();
                BrowserUtils.sleep(2);

            }
        }
    }

    public void APSEditAnswerDel() {
        APSEditAnswerTextBox.get(0).click();
        APSEditAnswerIconList.get(0).click();
        Driver.getDriver().switchTo().alert().accept();
        BrowserUtils.sleep(2);
    }

    //....
    @FindBy(xpath = "//*[text()='Message']")
    public WebElement ASPMessageButton;

    @FindBy(xpath = "//*[@style='min-height: 184px;']")
    public WebElement ASPMessageText;

    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    public WebElement ASPMessageSendButton;

    @FindBy(xpath = "//*[@class= 'bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement ASPLinkButton;

    @FindBy(xpath = "//*[@class='adm-btn-save']")
    public WebElement ASPLinkSaveButton;

    @FindBy(xpath = "//*[@title='Insert video']")
    public WebElement ASPVideoButton;


    @FindBy(xpath = "//*[@class ='template-bitrix24 no-paddings start-page bitrix24-default-theme']")
    public WebElement ASPVideoAdded;

    @FindBy(xpath = "//*[@style='minwait-height: 164px;']")
    public WebElement ASPSuccessAddedText;


    @FindBy(xpath = "//*[@class='adm-btn-save']")
    public WebElement ASPLinkSave;

    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    public WebElement ASPMessageSendAndDeletes;

    @FindBy(xpath = "//*[@class='bxhtmled-top-bar-btn bxhtmled-button-quote']")
    public WebElement ASPQuoteText;

    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    public WebElement ASPSendQuote;

    @FindBy(xpath = "//*[@class = 'feed-add-post-form-but feed-add-tag' ]")
    public WebElement ASPAddTag;



    @FindBy(xpath = "//*[@class='bx-editor-iframe']")
    public WebElement ASPMessageIframeElement;

    @FindBy(xpath = "//*[@id='blog_post_body_790']")
    public WebElement ASPMessageTextElement;

    @FindBy(xpath = "//*[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement ASPMessageAlertLinkUrl;

    @FindBy(xpath = "//*[@id='undefined']")
    public WebElement ASPMessageAlertSaveButton;

    @FindBy(xpath = "//*[@id='feed-post-contentview-BLOG_POST-794']")
    public WebElement ASPMessageAlertLinkVerify;

    @FindBy(xpath = "//*[@class='bxhtmled-90-input']")
    public WebElement ASPVideoUrl;

    @FindBy(xpath = "(//*[@class='blogquote'])[1]")
    public WebElement ASPMessageAlertLink1;

    @FindBy(xpath = "//*[@class='bxhtmled-quote']")
    public WebElement ASPMessageAlertQuoteText;

    @FindBy(xpath = "//*[@id='TAGS_blogPostForm67abSn']")
    public WebElement ASPMessageAlertAddTags;

    @FindBy(xpath = "//*[@class='popup-window-button']")
    public WebElement ASPMessageAlertAdd;

    @FindBy(xpath = "//*[text()='google.com']")
    public WebElement ASPDeletedLinkText;

    @FindBy(xpath = "//*[@id='feed-add-post-destination-input']")
    public WebElement ASPMessageToAdded;


    @FindBy(xpath = "//*[@class='feed-add-post-destination-text']")
    public WebElement ASPMessagePeople1;

    @FindBy(xpath = "//*[@class='feed-add-post-del-but'][2]")
    public WebElement ASPTagAddClose;

    @FindBy(xpath = "//*[@class='feed-add-post-tags']")
    public WebElement ASPTagAdd;







}





