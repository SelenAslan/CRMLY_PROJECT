package com.crmly.step_def;

import com.crmly.pages.US_02_PortalPage;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US_02_Remove_FilesOrImg_Step_Def {

    US_02_PortalPage US02PortalPage = new US_02_PortalPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    @Given("User can remove file after upload and before sending.")
    public void user_can_remove_file_after_upload_and_before_sending() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(US02PortalPage.deleteBtn));

        US02PortalPage.deleteBtn.click();
    }

}
