package com.crmly.step_def;

import com.crmly.pages.Base;
import com.crmly.pages.LoginPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Collection;
import java.util.List;

public class LoginStepDef extends Base {


    @Given("browser is open")
    public void browser_is_open() {
        WebDriverManager.chromedriver().setup();

    }

    @And("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get("https://qa.crmly.net/");
        Driver.getDriver().manage().window().maximize();
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        WebElement loginText = Driver.getDriver().findElement(By.xpath("//input[@name='USER_LOGIN']"));
        loginText.sendKeys("hr101@cybertekschool.com" + Keys.ENTER);

        WebElement passwordText = Driver.getDriver().findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordText.sendKeys("UserUser" + Keys.ENTER);
    }

    @Then("user clicks on login")
    public void user_clicks_on_login() {
        List<WebElement> loginButton = Driver.getDriver().findElements(By.xpath("//input[@value='Log In']"));

    }

    @Given("Go to {string}.")
    public void go_to(String requestedUrl) {
        Driver.getDriver().get(ConfigurationReader.getProperty(requestedUrl));
    }
    @Given("Valid username {string}, password {string} information is entered and the sign In button is clicked.")
    public void valid_username_password_information_is_entered_and_the_sign_in_button_is_clicked(String mail, String pass) {
        loginPage.userMailTextBoxWrite(ConfigurationReader.getProperty(mail));
        loginPage.userPassTextBoxWrite(ConfigurationReader.getProperty(pass));
        loginPage.userClickToLoginButton();
        BrowserUtils.sleep(2);
    }


}
