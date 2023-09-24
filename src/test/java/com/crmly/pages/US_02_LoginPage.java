package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_02_LoginPage {
    public US_02_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /*
    @FindBy(xpath = "//input[@type='text']")
    public WebElement inputUser;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement inputUserPassword;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement inputLog;
   */

    @FindBy(xpath = "//*[@name='USER_LOGIN']")
    public WebElement userMailTextBox;

    @FindBy(xpath = "//*[@name='USER_PASSWORD']")
    public WebElement userPassTextBox;

    @FindBy(xpath = "//*[@class='login-btn']")
    public WebElement userLoginButton;

}
