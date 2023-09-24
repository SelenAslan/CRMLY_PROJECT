package com.crmly.step_def;

import com.crmly.pages.US_02_PortalPage;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class US_02_Siml_Upload_Step_Def {
    US_02_PortalPage US02PortalPage = new US_02_PortalPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("User clicks message button")
    public void user_clicks_message_button() {
        wait.until(ExpectedConditions.elementToBeClickable(US02PortalPage.spanSendMessage));
        US02PortalPage.spanSendMessage.click();

    }

    @And("User clicks upload files button")
    public void user_clicks_upload_files_button() {
        wait.until(ExpectedConditions.elementToBeClickable(US02PortalPage.spanUploadfileBlogPostForm));
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
