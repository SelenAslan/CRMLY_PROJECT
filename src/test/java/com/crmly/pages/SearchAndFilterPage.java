package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchAndFilterPage extends Base {

    @FindBy(xpath = "//*[@id='LIVEFEED_search']")
    public WebElement filterAndSearchButton;

    @FindBy(xpath = "//*[@data-id='work']")
    public WebElement work;

    @FindBy(xpath = "//*[@data-id='favorites']")
    public WebElement favorites;

    @FindBy(xpath = "//*[@data-id='my']")
    public WebElement myActivity;

    @FindBy(xpath = "//*[@data-id='important']")
    public WebElement announcements;

    @FindBy(xpath = "//*[@data-id='bizproc']")
    public WebElement workFlows;

    @FindBy(css = "span[class='main-ui-filter-add-item']")
    public WebElement saveFilterButton;

    @FindBy(xpath = "//*[@data-name='DATE_CREATE_datesel']")
    public WebElement dateBox;

    @FindBy(xpath = "//*[@data-name=\"DATE_CREATE_datesel\"]/span[1]")
    public WebElement yesterday;

    @FindBy(xpath = "(//*[@data-name='EVENT_ID'])[2]")
    public WebElement typeBox;

    @FindBy(xpath = "//div[.='Polls']")
    public WebElement pollsCheckBox;


    @FindBy(xpath = "//div[.='Posts']")
    public WebElement postsCheckBox;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-label'][normalize-space()='Announcements']")
    public WebElement announcementsCheckBox;

    @FindBy(xpath = "//span[.='Add field']")
    public WebElement addField;

    @FindBy(xpath = "//span[.='Restore default fields']")
    public WebElement restoreDefaultFields;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchButton;

    @FindBy(css = "span[class='ui-btn ui-btn-light-border main-ui-filter-field-button main-ui-filter-reset']")
    public WebElement resetButton;

    @FindBy(xpath = "//*[@ data-id= 'field_FAVORITES_USER_ID']")
    public WebElement favoritesField;

    @FindBy(xpath = "//*[@class=\"main-ui-filter-sidebar-edit-control\"]")
    public WebElement filterName;

    @FindBy(css = "span[class='ui-btn ui-btn-success main-ui-filter-field-button main-ui-filter-save']")
    public WebElement saveButton;

    @FindBy(name = "CREATED_BY_ID_label")
    public WebElement authorBox;

    @FindBy(name = "TO_label")
    public WebElement toBox;

    @FindBy(xpath = "(//span[@class='main-ui-filter-sidebar-item-text-container'])[8]")
    public WebElement newFilter;

    @FindBy(xpath = "//span[.=\"Not specified\"]")
    public WebElement newField;

    @FindBy(xpath = "//*[@class=\"main-ui-filter-add-edit\"]")
    public WebElement editFilterButton;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-button-item']")
    public WebElement resetToDefaultButton;

    @FindBy(xpath = "//span[@class='popup-window-button']")
    public WebElement continueButton;

    @FindBy(xpath = "//div[@data-id='field_TAG']")
    public WebElement tagField;

    @FindBy(xpath = "//div[contains(text(),'Extranet')]")
    public WebElement extranetField;

    @FindBy(xpath = "//div[@class='main-ui-square-item']")
    public WebElement verifyDate;

    @FindBy(xpath = "(//span[@title='Delete filter'])[8]")
    public WebElement deleteFiltersButton;


}