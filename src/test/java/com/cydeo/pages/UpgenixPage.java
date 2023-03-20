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

    @FindBy (xpath = "//input[@id='password']")
    public WebElement PasswordInputBox;


    // locate login button
@FindBy (xpath = "//button[.='Log in']")
    public WebElement LoginButtton;


// Locate logout button
@FindBy (xpath = "//a[.='Log out']")
public WebElement LogoutButton;




}