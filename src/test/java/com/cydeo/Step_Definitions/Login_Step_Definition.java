package com.cydeo.Step_Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Step_Definition {


    @When("user goes to the login page")
    public void user_goes_to_the_login_page() {

    }
    @When("user enters valid {string} and {string}")
    public void user_enters_valid_and(String string, String string2) {

    }
    @Then("user clicks on login button or press  enter")
    public void user_clicks_on_login_button_or_press_enter() {

    }

    @When("user enters invalid email {string} and valid password {string}")
    public void user_enters_invalid_email_and_valid_password(String string, String string2) {

    }
    @When("user enters valid email {string} and invalid password {string}")
    public void user_enters_valid_email_and_invalid_password(String string, String string2) {

    }
    @Then("user should see error message Wrong login/password")
    public void user_should_see_error_message_wrong_login_password() {

    }


}
