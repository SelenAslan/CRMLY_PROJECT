package com.crmly.step_def;

import com.crmly.pages.US_02_PortalPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;


public class US02_UploadAndDelete_Step_Def {

    US_02_PortalPage US02PortalPage = new US_02_PortalPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

    //---------------------------------------------------------------------------------------------
    @Given("User clicks message button")
    public void user_clicks_message_button() {
        wait.until(ExpectedConditions.elementToBeClickable(US02PortalPage.spanSendMessage));
        US02PortalPage.spanSendMessage.click();

    }

    @Given("User clicks upload files button")
    public void user_clicks_upload_files_button() {
        wait.until(ExpectedConditions.elementToBeClickable(US02PortalPage.spanUploadfileBlogPostForm));
        US02PortalPage.spanUploadfileBlogPostForm.click();
    }

    @Then("User upload files or images by one by and upload")
    public void userUploadFilesOrImagesByOneByAndUpload() throws InterruptedException {

        File uploadIMG  = new File("src/test/java/com/crmly/archive/araba.jpeg" );
        File uploadPDF  = new File("src/test/java/com/crmly/archive/Github_Collaboration.pdf" );
        File uploadTXT  = new File("src/test/java/com/crmly/archive/day2.txt" );


        US02PortalPage.inputFiles.sendKeys(uploadIMG.getAbsolutePath());
        US02PortalPage.inputFiles.sendKeys(uploadPDF.getAbsolutePath());
        US02PortalPage.inputFiles.sendKeys(uploadTXT.getAbsolutePath());

        BrowserUtils.waitFor(3);

        Assert.assertTrue(US02PortalPage.spanClickInsertFile1.isEnabled());
        Assert.assertTrue(US02PortalPage.spanClickInsertFile2.isEnabled());
        Assert.assertTrue(US02PortalPage.spanClickInsertFile3.isEnabled());
    }

//---------------------------------------------------------------------------------------------

    @Then("User can inserts files or image into the text")
    public void user_can_inserts_files_or_image_into_the_text() {
        wait.until(ExpectedConditions.elementToBeClickable(US02PortalPage.insertFiles));

        US02PortalPage.insertFiles.click();

        Assert.assertTrue(US02PortalPage.insertedInText.isDisplayed());

    }
//---------------------------------------------------------------------------------------------

    @Given("User can rename files or image before send the text")
    public void user_can_rename_files_or_image_before_send_the_text() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(US02PortalPage.renameBtn));
        US02PortalPage.renameBtn.click();

        wait.until(ExpectedConditions.elementToBeClickable(US02PortalPage.renameBox));
        US02PortalPage.renameBox.click();
        US02PortalPage.renameBox.clear();
        US02PortalPage.renameBox.sendKeys("Deneme" + Keys.ENTER);

    }

//---------------------------------------------------------------------------------------------

    @Given("User can remove file after upload and before sending.")
    public void user_can_remove_file_after_upload_and_before_sending() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(US02PortalPage.deleteBtn));

        US02PortalPage.deleteBtn.click();
    }

}
