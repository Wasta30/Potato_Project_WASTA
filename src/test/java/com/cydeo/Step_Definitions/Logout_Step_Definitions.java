package com.cydeo.Step_Definitions;

import com.cydeo.Utilities.Driver;
import com.cydeo.pages.UpgenixPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_Step_Definitions {

    UpgenixPage upgenixPage = new UpgenixPage();

    @When("user goes to the Login page")
    public void user_goes_to_the_login_page() {
        Driver.getDriver().get("https://qa.upgenix.net/web/login");
    }
    @When("user enters valid email {string} and valid password {string}")
    public void user_enters_valid_email_and_valid_password(String email, String password) {
    upgenixPage.EmailInputBox.sendKeys(email);
    upgenixPage.PasswordInputBox.sendKeys(password);
    }
    @When("user clicks login button or presses enter")
    public void user_clicks_login_button_or_presses_enter() {
    upgenixPage.LoginButtton.click();
    }
    @When("user is on the Home page")
    public void user_is_on_the_home_page() {
        String expectedTitle = "Congratulations, your inbox is empty";
        String actualTile = upgenixPage.homepageTitle.getText();
        Assert.assertEquals(expectedTitle,actualTile);


    }
    @Then("user clicks on the username button top right of the screen.")
    public void user_clicks_on_the_username_button_top_right_of_the_screen() {
    upgenixPage.TopUsernameButton.click();
    // i dont think this is necessary
    }
    @Then("user should be able to logout by clicking on the logout button")
    public void user_should_be_able_to_logout_by_clicking_on_the_logout_button() {
upgenixPage.LoginButtton.click();
    }


    @Then("user is on the login page")
    public void userIsOnTheLoginPage() {
        String expectedTitle = "Login";

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle) );
        
    }

    @Then("user clicks on the log out button")
    public void userClicksOnTheLogOutButton() {
        upgenixPage.LogoutButton.click();
    }

    @Then("user clicks on step back button")
    public void userClicksOnStepBackButton() {
        Driver.getDriver().navigate().back();
    }
}
