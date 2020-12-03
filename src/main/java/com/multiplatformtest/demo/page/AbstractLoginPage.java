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

    public void fillEmailInput(String email) {
        waitForElementBecomesVisible(emailInput());
        emailInput().click();
        emailInput().clear();
        emailInput().sendKeys(email);
        driver.hideKeyboard();
    }

    public void fillPasswordInput(String password) {
        waitForElementBecomesVisible(passwordInput());
        passwordInput().sendKeys(password);
    }

    public String getText() {
        return emailInput().getText();
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
}
