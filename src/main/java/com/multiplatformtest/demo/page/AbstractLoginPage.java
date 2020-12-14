package com.multiplatformtest.demo.page;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractLoginPage extends Page {

    public AbstractLoginPage(AppiumDriver driver) {
        super(driver);
    }

    protected abstract WebElement getEmailInput();

    protected abstract WebElement getBackButton();

    protected abstract WebElement getLoginButton();

    protected abstract WebElement getForgotPasswordButton();

    protected abstract WebElement getContactUsLink();

    protected abstract WebElement getPasswordInput();

    protected abstract WebElement getPasswordToggleButton();

    protected abstract WebElement getEmailErrorMessage();

    protected abstract WebElement getPasswordErrorMessage();

    protected abstract WebElement getInvalidAlertMessage();

    public AbstractLoginPage fillEmailInput(String email) {
        waitForElementBecomesVisible(getEmailInput());
        getEmailInput().click();
        getEmailInput().clear();
        getEmailInput().sendKeys(email);
        driver.hideKeyboard();
        return this;
    }

    public AbstractLoginPage fillPasswordInput(String password) {
        waitForElementBecomesVisible(getPasswordInput());
        getPasswordInput().sendKeys(password);
        driver.hideKeyboard();
        return this;
    }

    public void tapLoginInButton() {
        waitForElementBecomesVisible(getLoginButton());
        getLoginButton().click();
    }

    public void tapForgotPasswordButton() {
        waitForElementBecomesVisible(getForgotPasswordButton());
        getForgotPasswordButton().click();
    }

    public void tapContactUsLink() {
        waitForElementBecomesVisible(getContactUsLink());
        getContactUsLink().click();
    }

    public void tapTogglePasswordButton() {
        waitForElementBecomesVisible(getPasswordToggleButton());
        getPasswordToggleButton().click();
    }

    public void tapBackButton() {
        waitForElementBecomesVisible(getBackButton());
        getBackButton().click();
    }

    public boolean isEmailErrorMessageDisplayed() {
        waitForElementBecomesVisible(getEmailErrorMessage());
        return getEmailErrorMessage().isDisplayed();
    }

    public boolean isPasswordErrorMessageDisplayed() {
        waitForElementBecomesVisible(getPasswordErrorMessage());
        return getPasswordErrorMessage().isDisplayed();
    }

    public String getPassword() {
        return getPasswordInput().getText();
    }

    public boolean isInvalidLoginAlertMessageDisplayed() {
        waitForElementBecomesVisible(getInvalidAlertMessage());
        return getInvalidAlertMessage().isDisplayed();
    }

    public boolean isLogInScreen() {
        return getLoginButton().isDisplayed();
    }


}
