package com.multiplatformtest.demo.page;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractLoginPage extends Page {

    public AbstractLoginPage(AppiumDriver driver) {
        super(driver);
    }

    protected abstract WebElement emailInput();

    protected abstract WebElement backButton();

    protected abstract WebElement loginButton();

    protected abstract WebElement forgotPasswordButton();

    protected abstract WebElement contactUsLink();

    protected abstract WebElement passwordInput();

    protected abstract WebElement passwordToggleButton();

    protected abstract WebElement emailErrorMessage();

    protected abstract WebElement passwordErrorMessage();

    protected abstract WebElement getInvalidAlertMessage();

    public AbstractLoginPage fillEmailInput(String email) {
        waitForElementBecomesVisible(emailInput());
        emailInput().click();
        emailInput().clear();
        emailInput().sendKeys(email);
        driver.hideKeyboard();
        return this;
    }

    public AbstractLoginPage fillPasswordInput(String password) {
        waitForElementBecomesVisible(passwordInput());
        passwordInput().sendKeys(password);
        driver.hideKeyboard();
        return this;
    }

    public void tapLoginInButton() {
        waitForElementBecomesVisible(loginButton());
        loginButton().click();
    }

    public void tapForgotPasswordButton() {
        waitForElementBecomesVisible(forgotPasswordButton());
        forgotPasswordButton().click();
    }

    public void tapContactUsLink() {
        waitForElementBecomesVisible(contactUsLink());
        contactUsLink().click();
    }

    public void tapTogglePasswordButton() {
        waitForElementBecomesVisible(passwordToggleButton());
        passwordToggleButton().click();
    }

    public void tapBackButton() {
        waitForElementBecomesVisible(backButton());

        backButton().click();
    }

    public boolean isEmailErrorMessageDisplayed() {
        waitForElementBecomesVisible(emailErrorMessage());
        return emailErrorMessage().isDisplayed();
    }

    public boolean isPasswordErrorMessageDisplayed() {
        waitForElementBecomesVisible(passwordErrorMessage());
        return passwordErrorMessage().isDisplayed();
    }

    public String getPassword() {
        return passwordInput().getText();
    }
    public boolean isInvalidLoginAlertMessageDisplayed(){
        waitForElementBecomesVisible(getInvalidAlertMessage());
        return getInvalidAlertMessage().isDisplayed();
    }
    public boolean isLogInScreen(){
        return loginButton().isDisplayed();
    }


}
