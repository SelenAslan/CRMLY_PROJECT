package com.crmly.step_def;

import com.crmly.pages.SearchAndFilterPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchAndFilterStepDef {

    SearchAndFilterPage searchAndFilterPage = new SearchAndFilterPage();


    @When("user clicks on the search-filter box")
    public void user_clicks_on_the_search_filter_box() {
        searchAndFilterPage.filterAndSearchButton.click();
        BrowserUtils.sleep(2);
    }

    @Then("user should see these options")
    public void user_should_see_these_options(List<String> menu) {
        Assert.assertTrue(searchAndFilterPage.work.isEnabled());
        Assert.assertTrue(searchAndFilterPage.myActivity.isEnabled());
        Assert.assertTrue(searchAndFilterPage.announcements.isEnabled());
        Assert.assertTrue(searchAndFilterPage.workFlows.isEnabled());
        Assert.assertTrue(searchAndFilterPage.favorites.isEnabled());
    }


    @When("user clicks on the add field button")
    public void user_clicks_on_the_add_field_button() {
        searchAndFilterPage.restoreDefaultFields.click();
        searchAndFilterPage.addField.click();
    }

    @When("select Favorites field")
    public void select_field() {
        searchAndFilterPage.favoritesField.click();
    }

    @Then("verify Favorites field selected")
    public void verify_field_selected() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(searchAndFilterPage.newField.isEnabled());
    }

    @Then("unselect Favorites field")
    public void unselect_field() {
        searchAndFilterPage.favoritesField.click();
    }

    @Then("verify Favorites field unselected")
    public void verify_field_unselected() {
        Assert.assertFalse(searchAndFilterPage.favoritesField.isSelected());
    }

    @When("user clicks date dropdown")
    public void user_clicks_date_dropdown() {
        searchAndFilterPage.dateBox.click();
    }

    @When("select Yesterday option")
    public void select_option() {
        BrowserUtils.sleep(1);
        searchAndFilterPage.yesterday.click();

    }

    @When("user clicks search button")
    public void user_clicks_search_button() {
        BrowserUtils.waitForVisibility(searchAndFilterPage.searchButton, 5);
        searchAndFilterPage.searchButton.click();
    }

    @Then("click Save Filter button")
    public void click_save_filter_button() {
        searchAndFilterPage.saveFilterButton.click();
    }

    @Then("write filter name {string}")
    public void write_filter_name(String name) {
        searchAndFilterPage.filterName.sendKeys(name);
    }

    @Then("click Save button")
    public void click_save_button() {
        searchAndFilterPage.saveButton.click();
    }

    @Then("verify user can add new filter")
    public void verify_user_can_add_new_filter() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(searchAndFilterPage.newFilter.isEnabled());
    }

    @Then("click Reset to default button")
    public void click_reset_to_default_button() {
        searchAndFilterPage.resetToDefaultButton.click();
        searchAndFilterPage.continueButton.click();
    }

    @Then("verify NEW filter is not display")
    public void verify_NEW_filter_is_not_display() {
        BrowserUtils.sleep(2);
        BrowserUtils.verifyElementNotDisplayed(searchAndFilterPage.newFilter);
    }

    @When("user clicks type box")
    public void user_clicks_type_box() {
        BrowserUtils.waitForVisibility(searchAndFilterPage.typeBox, 5);
        searchAndFilterPage.typeBox.click();
    }


    @Then("select Announcements and Polls as multiple options")
    public void user_select_option() {
        BrowserUtils.sleep(1);
        searchAndFilterPage.announcementsCheckBox.click();
        BrowserUtils.sleep(1);
        searchAndFilterPage.pollsCheckBox.click();
    }


    @Then("user clicks restore default fields")
    public void user_clicks_restore_default_fields() {
        searchAndFilterPage.restoreDefaultFields.click();
    }

    @Then("verify Date, Type, Author, To are displayed")
    public void verify_only_date_type_author_to_favorites_are_displayed() {
        Assert.assertTrue(searchAndFilterPage.dateBox.isEnabled());
        Assert.assertTrue(searchAndFilterPage.typeBox.isEnabled());
        Assert.assertTrue(searchAndFilterPage.authorBox.isEnabled());
        Assert.assertTrue(searchAndFilterPage.toBox.isEnabled());

    }

    @And("select Posts option")
    public void selectPostsOption() {
        searchAndFilterPage.postsCheckBox.click();

    }

    @Then("verify after clicks search button {string} appears on filter and search inbox")
    public void verifyAfterClicksSearchButtonAppearsOnFilterAndSearchInbox(String date) {
        BrowserUtils.waitForVisibility(searchAndFilterPage.verifyDate, 10);
        System.out.println(searchAndFilterPage.verifyDate.getText());

    }

    @Then("verify Favorites, Tag, Extranet fields unchecked as default")
    public void verifyFavoritesTagExtranetFieldsUncheckedAsDefault() {

        Assert.assertFalse(searchAndFilterPage.favoritesField.isSelected());
        Assert.assertFalse(searchAndFilterPage.extranetField.isSelected());
        Assert.assertFalse(searchAndFilterPage.tagField.isSelected());
    }

    @Given("click edit and delete button")
    public void clickEditAndDeleteButton() {
        searchAndFilterPage.editFilterButton.click();
        searchAndFilterPage.deleteFiltersButton.click();

    }

    @Given("user clicks reset button")
    public void userClicksResetButton() {
        searchAndFilterPage.resetButton.click();

    }
}
