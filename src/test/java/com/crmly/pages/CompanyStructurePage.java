package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class CompanyStructurePage extends Base{

    public CompanyStructurePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/company/vis_structure.php']")
    public WebElement employees;

    @FindBy(id = "pagetitle")
    public WebElement companyStructurePage;

    @FindBy(xpath = "//div[@class='pagetitle-menu pagetitle-container pagetitle-last-item-in-a-row']")
    public WebElement addDepartmentButton;

    @FindBy(xpath = "//div[@id='BXStructure']")
    public WebElement addDepartmentSection;

    @FindBy(xpath = "//span[.='Add']")
    public WebElement addButton;

    @FindBy(xpath = "//span[.='Close']")
    public WebElement closeButton;

    @FindBy(xpath = "//input[@name='NAME']")
    public WebElement departmentNameTab;

    @FindBy(id = "IBLOCK_SECTION_ID")
    public WebElement parentDepartmentOption;

    @FindBy(id = "single-user-choice")
    public WebElement selectFromStructure;

    @FindBy(xpath = "//span[.='Recent']")
    public WebElement recent;

    @FindBy(xpath = "//table[@class='finder-box-tab-columns']//td/div")
    public WebElement recentOptions;

    @FindBy(xpath = "//span[.='Company']")
    public WebElement company;

    @FindBy(xpath = "//div[@class='company-structure']/div[1]/span")
    public WebElement companyOptions;

    @FindBy(xpath = "//span[.='Search']")
    public WebElement search;

    @FindBy(xpath = "//div[@class='finder-box-search']/input")
    public WebElement searchBarSearchOption;

    @FindBy(xpath = "//div[@class='user-block']")
    public WebElement userChoices;

    @FindBy(xpath = "//a[@href='/auth/?logout=yes&backurl=%2Fcompany%2Fvis_structure.php']")
    public WebElement logOut;



    @FindBy(xpath = "//div[@class='structure-delete-icon']")
    public WebElement deleteStructure;

    @FindBy(xpath = "//div[@class='structure-edit-icon']")
    public WebElement editStructure;

    @FindBy(xpath = "//div[@class='structure-add-icon']")
    public WebElement addStructure;

    @FindBy(xpath = "//span[@class='popup-window-close-icon popup-window-titlebar-close-icon']")
    public WebElement xButton;


}
