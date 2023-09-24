package com.crmly.step_def;

import com.crmly.pages.US_02_LoginPage;
import com.crmly.pages.US_02_PortalPage;
import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class US_02_Siml_Upload_Step_Def {
    US_02_LoginPage US02LoginPage = new US_02_LoginPage();
    US_02_PortalPage US02PortalPage = new US_02_PortalPage();


    @Given("User is on the portal page")
    public void user_is_on_the_portal_page() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "(2) Portal";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Given("User clicks message button")
    public void user_clicks_message_button() {
        US02PortalPage.spanSendMessage.click();

    }

    @Given("User clicks upload files button")
    public void user_clicks_upload_files_button() {
        US02PortalPage.spanUploadfileBlogPostForm.click();
    }

    @Then("User upload files or images by one by and upload")
    public void userUploadFilesOrImagesByOneByAndUpload() throws InterruptedException {
        String pathImg = "C:\\Users\\Taha\\Desktop\\Cydeo\\3_UI Test Automation\\SeleniumDay10\\araba.jpeg";
        String pathPdf = "C:\\Users\\Taha\\Desktop\\Cydeo\\2_Git&Github\\Github_Collaboration.pdf";
        String pathText = "C:\\Users\\Taha\\Desktop\\Cydeo\\5_API\\day2.txt";

        US02PortalPage.inputFiles.sendKeys(pathImg);
        US02PortalPage.inputFiles.sendKeys(pathPdf);
        US02PortalPage.inputFiles.sendKeys(pathText);

        Assert.assertTrue(US02PortalPage.spanClickInsertFile1.isEnabled());
        Assert.assertTrue(US02PortalPage.spanClickInsertFile2.isEnabled());
        Assert.assertTrue(US02PortalPage.spanClickInsertFile3.isEnabled());
    }

}
