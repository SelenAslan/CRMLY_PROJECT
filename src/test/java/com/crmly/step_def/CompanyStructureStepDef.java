package com.crmly.step_def;

import com.crmly.pages.CompanyStructurePage;
import com.crmly.pages.LoginPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CompanyStructureStepDef {

    CompanyStructurePage companyStructure = new CompanyStructurePage();
    LoginPage login = new LoginPage();

    //@Given("user logins as HR user")
    public void user_logins_as_hr_user() {
       Driver.getDriver().get("https://qa.crmly.net/");
       login.userMailTextBox.sendKeys("hr1@cybertekschool.com");
       login.userPassTextBox.sendKeys("UserUser");
       login.userLoginButton.click();

    }

    @When("verify that user is in the Company Structure Page")
    public void verify_that_user_is_in_the_company_structure_page() {
        Assert.assertTrue(companyStructure.companyStructurePage.isDisplayed());

    }
    @Then("verify Add Department option is visible")
    public void verify_add_department_option_is_visible() {
        Assert.assertTrue(companyStructure.addDepartmentButton.isDisplayed());

    }


    @Given("user logins as Helpdesk user")
    public void user_logins_as_helpdesk_user() {
        Driver.getDriver().get("https://qa.crmly.net/");
        login.userMailTextBox.sendKeys("helpdesk1@cybertekschool.com");
        login.userPassTextBox.sendKeys("UserUser");
        login.userLoginButton.click();

    }
    @When("user clicks Employees button from Configure Menu")
    public void user_clicks_employees_button_from_configure_menu() {
        companyStructure.employees.click();

    }
    @Then("verify that HR user is in the Company Structure Page")
    public void verify_that_hr_user_is_in_the_company_structure_page() {
        Assert.assertTrue(companyStructure.companyStructurePage.isDisplayed());

    }


    @Given("user logins as Marketing user")
    public void userLoginsAsMarketingUser() {
        Driver.getDriver().get("https://qa.crmly.net/");
        login.userMailTextBox.sendKeys("marketing1@cybertekschool.com");
        login.userPassTextBox.sendKeys("UserUser");
        login.userLoginButton.click();
    }

    @Then("verify that Marketing user is in the Company Structure Page")
    public void verifyThatMarketingUserIsInTheCompanyStructurePage() {
        Assert.assertTrue(companyStructure.companyStructurePage.isDisplayed());
        BrowserUtils.sleep(2);

    }


    @Given("HR user clicks Add Department button")
    public void hrUserClicksAddDepartmentButton() {
        BrowserUtils.sleep(2);
        companyStructure.addDepartmentButton.click();

    }

    @When("user enter a Department Name")
    public void userEnterADepartmentName() {
        companyStructure.departmentNameTab.sendKeys("Department");

    }


    @Then("user clicks Add button")
    public void userClicksAddButton() {
        companyStructure.addButton.click();

    }


    @When("user selects an option from Parent dropdown")
    public void userSelectsAnOptionFromParentDropdown() {
        Select parentDepartmentDropdown = new Select(companyStructure.parentDepartmentOption);
        parentDepartmentDropdown.selectByValue("CyberT");

    }

    @And("user clicks Close button")
    public void userClicksCloseButton() {
        companyStructure.closeButton.click();

    }


    @Given("user is in the Company Structure page")
    public void userIsInTheCompanyStructurePage() {
        Assert.assertTrue(companyStructure.companyStructurePage.isDisplayed());

    }

    @Then("verify that there is not a clickable Add Department button")
    public void verifyThatThereIsNotAClickableAddDepartmentButton() {
        Assert.assertTrue(!companyStructure.companyStructurePage.getText().contains("Add Department"));

    }


    @Given("verify that user opens Add Department pop-up")
    public void verifyThatUserOpensAddDepartmentPopUp() {
        companyStructure.addDepartmentButton.click();

    }

    @When("user selects Supervisor from Recent by clicking Select from structure button")
    public void userSelectsSupervisorFromRecentByClickingSelectFromStructureButton() {
        companyStructure.selectFromStructure.click();
        companyStructure.recentOptions.click();
    }


    @When("user selects Supervisor from Company by clicking Select from structure button")
    public void userSelectsSupervisorFromCompanyByClickingSelectFromStructureButton() {
        companyStructure.selectFromStructure.click();
        companyStructure.companyOptions.click();
    }


    @When("user selects Supervisor from Search by clicking Select from structure button")
    public void userSelectsSupervisorFromSearchByClickingSelectFromStructureButton() {
        companyStructure.selectFromStructure.click();
        companyStructure.searchBarSearchOption.sendKeys("Gurhan");
    }

    @Then("user log out")
    public void userLogOut() {
        companyStructure.userChoices.click();
        companyStructure.logOut.click();
    }
}

