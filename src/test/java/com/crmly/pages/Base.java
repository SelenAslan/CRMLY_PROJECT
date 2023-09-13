package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class Base {
    public Base(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}