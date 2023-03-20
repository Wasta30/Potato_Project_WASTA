package com.cydeo.Step_Definitions;

import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.Driver;
import com.cydeo.pages.UpgenixPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_Step_Definition {


    UpgenixPage upgenixPage = new UpgenixPage();

    @When("user goes to the login page")
    public void user_goes_to_the_login_page() {
       // String urlName = ConfigurationReader.getProperty("url");
        Driver.getDriver().get("https://qa.upgenix.net/web/login");

    }
    @When("user enters valid {string} and {string}")
    public void user_enters_valid_and(String email, String password) {
    upgenixPage.EmailInputBox.sendKeys(email);
    upgenixPage.PasswordInputBox.sendKeys(password);


    }
    @Then("user clicks on login button or press  enter")
    public void user_clicks_on_login_button_or_press_enter() {
upgenixPage.LoginButtton.click();
    }

    @When("user enters invalid email {string} and valid password {string}")
    public void user_enters_invalid_email_and_valid_password(String invalidEmail, String validPassword) {
upgenixPage.EmailInputBox.sendKeys(invalidEmail);
upgenixPage.PasswordInputBox.sendKeys(validPassword);

    }
    @When("user enters valid email {string} and invalid password {string}")
    public void user_enters_valid_email_and_invalid_password(String validEmail, String invalidPassword) {
upgenixPage.EmailInputBox.sendKeys(validEmail);
upgenixPage.PasswordInputBox.sendKeys(invalidPassword);
    }




    @Then("user should see error message Wrong login\\/password")
    public void userShouldSeeErrorMessageWrongLoginPassword() {
        upgenixPage.LoginButtton.click();
        Assert.assertTrue(upgenixPage.wrongLoginPassword.isDisplayed());

    }
}
