package com.crmly.step_def;

import com.crmly.pages.US_02_PortalPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class US_02_Insert_Step_Def {


    US_02_PortalPage US02PortalPage = new US_02_PortalPage();

    @Then("User can inserts files or image into the text")
    public void user_can_inserts_files_or_image_into_the_text() {

        US02PortalPage.insertFiles.click();

        Assert.assertTrue(US02PortalPage.insertedInText.isDisplayed());

    }
}
