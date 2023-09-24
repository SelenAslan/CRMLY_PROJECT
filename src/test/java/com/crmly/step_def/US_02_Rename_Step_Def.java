package com.crmly.step_def;

import com.crmly.pages.US_02_PortalPage;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US_02_Rename_Step_Def {

    US_02_PortalPage US02PortalPage = new US_02_PortalPage();

    @Given("User can rename files or image before send the text")
    public void user_can_rename_files_or_image_before_send_the_text() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

        wait.until(ExpectedConditions.elementToBeClickable(US02PortalPage.renameBtn));
        US02PortalPage.renameBtn.click();

        wait.until(ExpectedConditions.elementToBeClickable(US02PortalPage.renameBox));
        US02PortalPage.renameBox.click();
        US02PortalPage.renameBox.clear();
        US02PortalPage.renameBox.sendKeys("Deneme" + Keys.ENTER);

    }
}
