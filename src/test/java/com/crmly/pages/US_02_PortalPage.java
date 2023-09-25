package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_02_PortalPage {

    public US_02_PortalPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='feed-add-post-micro-title']")
    public WebElement spanSendMessage;

    @FindBy(xpath = "//*[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement spanUploadfileBlogPostForm;

    @FindBy(css = "input[name='bxu_files[]']")
    public WebElement inputFiles;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[1]/span[1]/span[1]")
    public WebElement spanClickInsertFile1;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[4]/div[1]/div[2]/table/tbody/tr[2]/td[1]/span[1]/span[1]")
    public WebElement spanClickInsertFile2;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[4]/div[1]/div[2]/table/tbody/tr[3]/td[1]/span[1]/span[1]")
    public WebElement spanClickInsertFile3;

    @FindBy(xpath = "//span[@class='insert-btn-text']")
    public WebElement insertFiles;

    @FindBy(xpath = "//span[@class='insert-btn-text']")
    public WebElement insertedInText;

    @FindBy(xpath = "//span[@bx-bound='Y']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//span[@class='files-name-edit-btn']")
    public WebElement renameBtn;

    @FindBy(xpath = "//input[contains(@value, 'Ekran')]")
    public WebElement renameBox;







}
