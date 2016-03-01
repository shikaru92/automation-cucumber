package com.selenium.cucumber.pageobject;

import com.selenium.cucumber.factory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by tcbinh on 2/3/2016.
 */
public class LoginPage{
    @FindBy(id = "Email")
    private WebElement emailField;

    @FindBy(id = "next")
    private WebElement nextButton;

    @FindBy(id = "Passwd")
    private WebElement passwordField;

    @FindBy(id = "signIn")
    private WebElement signInButton;

    @FindBy(id = "errormsg_0_Email")
    private WebElement errorMessgaeEmail;

    @FindBy(id = "PersistentCookie")
    private WebElement staySignIn;

    @FindBy(id = "errormsg_0_Passwd")
    private WebElement errorMessagePassword;

    public WebElement getErrorMessageEmail()
    {
        return errorMessgaeEmail;
    }

    public WebElement getStaySignIn()
    {
        return staySignIn;
    }

    public WebElement getErrorMessagePassword()
    {
        return errorMessagePassword;
    }

    public LoginPage() throws Exception {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public LoginPage enterEmail(String email)
    {
        emailField.sendKeys(email);
        return this;
    }

    public LoginPage clickNext()
    {
        nextButton.click();
        return this;
    }

    public LoginPage enterPassword(String password) throws Exception {
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage clickSignIn()
    {
        signInButton.click();
        return this;
    }

    public LoginPage uncheckStaySignIn()
    {
        if (staySignIn.isSelected())
        {
            staySignIn.click();
        }
        return this;
    }

    public LoginPage checkStaySignIn()
    {
        if (!staySignIn.isSelected())
        {
            staySignIn.click();
        }
        return this;
    }

}
