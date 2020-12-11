package com.multiplatformtest.demo.page;/* Created by user on 29.10.20 */

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.HashMap;

public abstract class AbstractSignUpPage extends Page {
    public AbstractSignUpPage(AppiumDriver driver) {
        super(driver);
    }

    protected abstract WebElement firstNameInput();

    protected abstract WebElement lastNameInput();

    protected abstract WebElement emailInput();

    protected abstract WebElement dateOfBirthInput();

    protected abstract WebElement passwordInput();

    protected abstract WebElement confirmPasswordInput();

    protected abstract WebElement signUpButton();

    protected abstract WebElement receiveNewsLetterCheckbox();

    protected abstract WebElement passwordCheckbox();

    protected abstract WebElement confirmPasswordCheckbox();

    protected abstract WebElement backButton();

    protected abstract WebElement signUpTextView();

    protected abstract WebElement datePicker();

    protected abstract WebElement datePickerOkButton();

    protected abstract WebElement passwordAlert();

    protected abstract WebElement okButtonOnThePasswordAlert();

    protected abstract WebElement firstNameErrorMessage();

    protected abstract WebElement lastNameErrorMessage();

    protected abstract WebElement emailErrorMessage();

    protected abstract WebElement dateOfBirthErrorMessage();

    protected abstract WebElement passwordErrorMessage();

    protected abstract WebElement confirmPasswordErrorMessage();

    protected abstract WebElement privacyLink();

    protected abstract WebElement closeButtonOnTheWebView();

    public AbstractSignUpPage enterName(String name) {
        firstNameInput().sendKeys(name);
        return this;
    }

    public AbstractSignUpPage enterLastName(String lastName) {
        lastNameInput().sendKeys(lastName);
        return this;
    }

    public AbstractSignUpPage enterEmail(String email) {
        emailInput().sendKeys(email);
        return this;
    }

    public AbstractSignUpPage enterPassword(String password) {
        passwordInput().sendKeys(password);
        return this;
    }

    public AbstractSignUpPage enterConfirmPassword(String confirmPassword) {
        confirmPasswordInput().sendKeys(confirmPassword);
        return this;
    }

    public AbstractSignUpPage checkTheReceiveNewsLetterCheckbox() {
        receiveNewsLetterCheckbox().click();
        return this;
    }

    public AbstractSignUpPage tapDateInput() {
        dateOfBirthInput().click();
        return this;
    }

    public AbstractSignUpPage tapPasswordInput() {
        passwordInput().click();
        return this;
    }

    public AbstractSignUpPage tapOkButtonOnThePasswordAlert() {
        wait.withMessage("Password alert isn't displayed").until(ExpectedConditions.visibilityOf(passwordAlert()));
        okButtonOnThePasswordAlert().click();
        return this;
    }

    public AbstractSignUpPage tapOkButtonOnTheDatePicker() {
        wait.withMessage("Date picker isn't displayed").until(ExpectedConditions.visibilityOf(datePicker()));
        datePickerOkButton().click();
        return this;
    }

    public AbstractSignUpPage tapConfirmPasswordInput() {
        confirmPasswordInput().click();
        return this;
    }


    public void tapSingUpButton() {
//       action.moveTo(new PointOption().withCoordinates(607,1885)).perform();
        driver.hideKeyboard();
        signUpButton().click();
    }

    public boolean isFirstNameErrorMessageDisplayed() {
        return firstNameErrorMessage().isDisplayed();
    }

    public boolean isLastNameErrorMessageDisplayed() {
        return lastNameErrorMessage().isDisplayed();
    }

    public boolean isEmailErrorMessageDisplayed() {
        return emailErrorMessage().isDisplayed();
    }

    public boolean isDateOfBirthErrorMessageDisplayed() {
        return dateOfBirthErrorMessage().isDisplayed();
    }

    public boolean isDateAlertDisplayed() {
        return datePicker().isDisplayed();
    }

    public boolean isPasswordErrorMessageDisplayed() {
        return passwordErrorMessage().isDisplayed();
    }

    public boolean isConfirmPasswordErrorMessageDisplayed() {
        return confirmPasswordErrorMessage().isDisplayed();
    }

    public boolean isPasswordAlertDisplayed() {
        return wait.withMessage("Password alert isn't displayed").until(ExpectedConditions.visibilityOf(passwordAlert()))
                .isDisplayed();
    }

    public String getPassword() {
        return passwordInput().getText();
    }

    public AbstractSignUpPage tapHideButtonOnThePasswordInput() {
        passwordCheckbox().click();
        return this;
    }

    public AbstractSignUpPage tapHideButtonOnTheConfirmPasswordInput() {
        confirmPasswordCheckbox().click();
        return this;
    }

    public String getConfirmPassword() {
        return confirmPasswordInput().getText();
    }

    public String getRandomEmail() {
        String alphaNumericString = "abcdefghijklmnopqrstuvwxyz0123456789";
        String domain = "test@mailinator.com";
        StringBuilder builder = new StringBuilder();
        int emailLength = (int) (1 + Math.random() * 60);
        while (emailLength-- != 0) {
            int character = (int) (Math.random() * alphaNumericString.length());
            builder.append(alphaNumericString.charAt(character));
        }
        return builder.append(domain).toString();

    }


}

