package com.multiplatformtest.demo.page;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public abstract class AbstractLoginPage extends Page {

    public AbstractLoginPage(AppiumDriver driver) {
        super(driver);
    }

    public void fillEmailInput(String email) {
        wait.withMessage("There is no element " + emailInput()).until(visibilityOf(emailInput()));
        emailInput().sendKeys(email);
    }

    public void fillPasswordInput(String password) {
        passwordInput().sendKeys(password);
    }

    public void tapLoginInButton() {
        wait.withMessage("There's no the Login button").until(visibilityOf(loginButton()));
        loginButton().click();
    }

    public void tapForgotPasswordButton() {
        wait.withMessage("There's no the Forgot Password button")
                .until(visibilityOf(forgotPasswordButton()));
        forgotPasswordButton().click();
    }

    public void tapContactUsLink() {
        wait.withMessage("There's no Contact Us Link").until(visibilityOf(contactUsLink()));
        contactUsLink().click();
    }

    public void tapTogglePasswordButton() {
        wait.withMessage("There's no Toggle password button")
                .until(visibilityOf(passwordToggleButton()));
        passwordToggleButton().click();
    }

    public void tapBackButton() {
        wait.withMessage("There's no Back button").until(visibilityOf(backButton()));
        backButton().click();
    }

    protected abstract WebElement emailInput();

    protected abstract WebElement backButton();

    protected abstract WebElement loginButton();

    protected abstract WebElement forgotPasswordButton();

    protected abstract WebElement contactUsLink();

    protected abstract WebElement passwordInput();

    protected abstract WebElement passwordToggleButton();

}
