package com.crmly.pages;

import com.crmly.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public abstract class Base {
    public Base(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public static LoginPage loginPage;
    public static ActiveStreamPage activeStreamPage;
    public static Faker faker;
    public static Actions actions;
    public static Random random;

    public static void initialize(){

        loginPage = new LoginPage();
        activeStreamPage = new ActiveStreamPage();
        faker = new Faker();
        actions = new Actions(Driver.getDriver());
        random = new Random();
    }
}