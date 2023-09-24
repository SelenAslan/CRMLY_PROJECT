package com.crmly.step_def;

import com.crmly.pages.US_02_PortalPage;
import io.cucumber.java.en.Given;

public class US_02_Rem_FilesOrImg_Step_Def {

    US_02_PortalPage US02PortalPage = new US_02_PortalPage();

    @Given("User can remove file after upload and before sending.")
    public void user_can_remove_file_after_upload_and_before_sending() throws InterruptedException {
        Thread.sleep(1500);
        US02PortalPage.deleteBtn.click();
    }

}
