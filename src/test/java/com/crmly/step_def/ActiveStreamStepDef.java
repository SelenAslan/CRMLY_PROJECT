package com.crmly.step_def;

import com.crmly.pages.ActivityStreamPage;
import io.cucumber.java.en.Given;

public class ActiveStreamStepDef {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @Given("Click the Poll tab under Active Stream.")
    public void click_the_poll_tab_under_active_stream() {
        try {
            activityStreamPage.pollTab.click();
        } catch (Exception e) {
            throw new RuntimeException("There is no \"poll\" tab under Active Stream !");
        }
    }

    @Given("Click the new record.")
    public void click_the_new_record() {

    }

    @Given("More than one person is selected from the contact lists of the employees and the Department and the add button is clicked.")
    public void more_than_one_person_is_selected_from_the_contact_lists_of_the_employees_and_the_department_and_the_add_button_is_clicked() {

    }

    @Given("User closes page.")
    public void user_closes_page() {

    }

    @Given("The addition of new users is verified.")
    public void the_addition_of_new_users_is_verified() {

    }

    @Given("New questions are entered and the save button is clicked.")
    public void new_questions_are_entered_and_the_save_button_is_clicked() {

    }

    @Given("Verifies that new questions have been added")
    public void verifies_that_new_questions_have_been_added() {

    }

    @Given("The user adds more than one answer to the questions and clicks the save button.")
    public void the_user_adds_more_than_one_answer_to_the_questions_and_clicks_the_save_button() {

    }

    @Given("Verifies that multiple answers are attached to questions")
    public void verifies_that_multiple_answers_are_attached_to_questions() {

    }

    @Given("Click the delete button next to the desired question.")
    public void click_the_delete_button_next_to_the_desired_question() {

    }

    @Given("Verify that the requested issue has been deleted.")
    public void verify_that_the_requested_issue_has_been_deleted() {

    }

    @Given("Click the delete button next to the desired replies.")
    public void click_the_delete_button_next_to_the_desired_replies() {


    }

    @Given("Verify that the requested replies has been deleted.")
    public void verify_that_the_requested_replies_has_been_deleted() {

    }

    @Given("The allow multiple selection checkbox appears and is verified as active.")
    public void the_allow_multiple_selection_checkbox_appears_and_is_verified_as_active() {

    }

    @Given("It is verified that there are mandatory fields in the survey.")
    public void it_is_verified_that_there_are_mandatory_fields_in_the_survey() {

    }

}
