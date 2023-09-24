package com.crmly.step_def;

import com.crmly.pages.US_02_LoginPage;
import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


;

public class US_02_Login_Step_Def {
/*
    US_02_LoginPage US02LoginPage = new US_02_LoginPage();

    @Given("user is open open browser and send url")
    public void userIsOpenOpenBrowserAndSendUrl() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @And("user enters {string} and {string}")
    public void userEntersAnd(String userName, String password) {
        US02LoginPage.userMailTextBox.sendKeys(userName);
        US02LoginPage.userPassTextBox.sendKeys(password);
    }

    @And("user clicks on login")
    public void userClicksOnLogin() {
        US02LoginPage.userLoginButton.click();
    }


 */
    @Then("user is on the portal page")
    public void userIsOnThePortalPage() {
        String expectedTitle = "(2) Portal";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }




}
