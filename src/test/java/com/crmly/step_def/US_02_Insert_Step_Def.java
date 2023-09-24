package com.crmly.step_def;

import com.crmly.pages.US_02_PortalPage;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class US_02_Insert_Step_Def {

    US_02_PortalPage US02PortalPage = new US_02_PortalPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @Then("User can inserts files or image into the text")
    public void user_can_inserts_files_or_image_into_the_text() {
        wait.until(ExpectedConditions.elementToBeClickable(US02PortalPage.insertFiles));

        US02PortalPage.insertFiles.click();

        Assert.assertTrue(US02PortalPage.insertedInText.isDisplayed());

    }
}
