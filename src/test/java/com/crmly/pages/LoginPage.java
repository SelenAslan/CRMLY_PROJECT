package com.crmly.pages;

import com.crmly.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Base{

    @FindBy(xpath = "//*[@name='USER_LOGIN']")
    public WebElement userMailTextBox;
    @FindBy(xpath = "//*[@name='USER_PASSWORD']")
    public WebElement userPassTextBox;
    @FindBy(xpath = "//*[@class='login-btn']")
    public WebElement userLoginButton;

    public void userMailTextBoxWrite(String userMail){
        userMailTextBox.isDisplayed();
        userMailTextBox.sendKeys(userMail);
        BrowserUtils.sleep(1);
    }

    public void userPassTextBoxWrite(String userPass){
        userPassTextBox.isDisplayed();
        userPassTextBox.sendKeys(userPass);
        BrowserUtils.sleep(1);
    }
    public void userClickToLoginButton(){
        userLoginButton.isDisplayed();
        userLoginButton.click();
    }
}
