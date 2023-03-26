package com.cydeo.pages;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpgenixPage {

    public UpgenixPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // locate EmailInputBox
    @FindBy(xpath = "//input[@id='login']")
    public WebElement EmailInputBox;


// Locate passwordInputBox

    @FindBy(id = "password")
    public WebElement PasswordInputBox;


    // locate login button
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement LoginButtton;


    // locate alert msg "wrong login password
    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongLoginPassword;

// home page locating

    @FindBy(xpath = "//div[.='Congratulations, your inbox is empty']")
    public WebElement homepageTitle;


    /**
     * logout fubnctionality locators
     */


    // Locate logout button
    @FindBy(xpath = "//a[.='Log out']")
    public WebElement LogoutButton;

    // Top username
    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement TopUsernameButton;




}