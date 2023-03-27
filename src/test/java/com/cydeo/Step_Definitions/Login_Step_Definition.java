package com.cydeo.Step_Definitions;

import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.Driver;
import com.cydeo.pages.UpgenixPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Login_Step_Definition {


    UpgenixPage upgenixPage = new UpgenixPage();

    @When("user goes to the login page")
    public void user_goes_to_the_login_page() {

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

    @Then("user is on the home page")
    public void userIsOnTheHomePage() {
       String expectedTitle = "Congratulations, your inbox is empty";
       String actualTile = upgenixPage.homepageTitle.getText();
       Assert.assertEquals(expectedTitle,actualTile);

    }




    @And("user enters invalid email {string}")
    public void userEntersInvalidEmail(String invalidEmail) {
        upgenixPage.EmailInputBox.sendKeys(invalidEmail);
    }


    @And("user enters valid password {string}")
    public void userEntersValidPassword(String validPassword) {
        upgenixPage.PasswordInputBox.sendKeys(validPassword);

    }
    @And("user enters valid email {string} and invalid password {string}")
    public void userEntersValidEmailAndInvalidPassword(String validEmail, String invalidPassowrd) {
    upgenixPage.EmailInputBox.sendKeys(validEmail);
    upgenixPage.PasswordInputBox.sendKeys(invalidPassowrd);
    }


    @Then("user sees Wrong login or password message displayed")
    public void userSeesWrongLoginOrPasswordMessageDisplayed() {
        String actualMessage = upgenixPage.wrongLoginPassword.getText();
        String expectedMessage =  "Wrong login/password";

        Assert.assertEquals(expectedMessage,actualMessage);

    }



    @And("user leaves password button empty")
    public void userLeavesPasswordButtonEmpty() {
        upgenixPage.EmailInputBox.sendKeys("salesmanager15@info.com");
        upgenixPage.PasswordInputBox.sendKeys(" ");

    }

    @And("user leaves email box empty")
    public void userLeavesEmailBoxEmpty() {
        upgenixPage.EmailInputBox.sendKeys(" ");
        upgenixPage.PasswordInputBox.sendKeys(" ");
    }


    @Then("user should see message Please fill in this field")
    public void userShouldSeeMessagePleaseFillInThisField() {
        // how to locate this

        String validationMessage = upgenixPage.PasswordInputBox.getAttribute("validationMessage");
        Assert.assertEquals(validationMessage, "Please fill in this field.");

    }



//

    @And("enters valid email{string} and password {string}")
    public void entersValidEmailAndPassword(String validemail, String validpassword) {
        upgenixPage.EmailInputBox.sendKeys(validemail);
        upgenixPage.PasswordInputBox.sendKeys(validpassword);
    }


    @And("user should see the password in bullet ****")
    public void userShouldSeeThePasswordInBullet() {

        Boolean isBulletSign = upgenixPage.PasswordInputBox.getAttribute("type").equals("password");
        Assert.assertEquals(isBulletSign,true);




    }


    @Then("user checks the enter keys works the same as login button")
    public void userChecksTheEnterKeysWorksTheSameAsLoginButton() {

        upgenixPage.PasswordInputBox.sendKeys(Keys.ENTER);

    }


    @And("user enters valid email {string}")
    public void userEntersValidEmail(String validEmail) {
        upgenixPage.EmailInputBox.sendKeys(validEmail);
    }

    @And("user enters invalid password {string}")
    public void userEntersInvalidPassword(String invalidPassword  ) {
        upgenixPage.PasswordInputBox.sendKeys(invalidPassword);
    }
}
