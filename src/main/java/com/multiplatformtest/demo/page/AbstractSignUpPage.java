package com.multiplatformtest.demo.page;/* Created by user on 29.10.20 */

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public abstract class AbstractSignUpPage extends Page {
    public AbstractSignUpPage(AppiumDriver driver) {
        super(driver);
    }

    protected abstract WebElement getFirstNameInput();

    protected abstract WebElement getLastNameInput();

    protected abstract WebElement getEmailInput();

    protected abstract WebElement getDateOfBirthInput();

    protected abstract WebElement getPasswordInput();

    protected abstract WebElement getConfirmPasswordInput();

    protected abstract WebElement getSignUpButton();

    protected abstract WebElement getReceiveNewsLetterCheckbox();

    protected abstract WebElement getPasswordCheckbox();

    protected abstract WebElement getConfirmPasswordCheckbox();

    protected abstract WebElement getBackButton();

    protected abstract WebElement getSignUpTextView();

    protected abstract WebElement getDatePicker();

    protected abstract WebElement getDatePickerOkButton();

    protected abstract WebElement getPasswordAlert();

    protected abstract WebElement getOkButtonOnThePasswordAlert();

    protected abstract WebElement getFirstNameErrorMessage();

    protected abstract WebElement getLastNameErrorMessage();

    protected abstract WebElement getEmailErrorMessage();

    protected abstract WebElement getDateOfBirthErrorMessage();

    protected abstract WebElement getPasswordErrorMessage();

    protected abstract WebElement getConfirmPasswordErrorMessage();

    protected abstract WebElement getPrivacyLink();

    protected abstract WebElement getCloseButtonOnTheWebView();

    public AbstractSignUpPage enterName(String name) {
        getFirstNameInput().sendKeys(name);
        return this;
    }

    public AbstractSignUpPage enterLastName(String lastName) {
        getLastNameInput().sendKeys(lastName);
        return this;
    }

    public AbstractSignUpPage enterEmail(String email) {
        getEmailInput().sendKeys(email);
        return this;
    }

    public AbstractSignUpPage enterPassword(String password) {
        getPasswordInput().sendKeys(password);
        return this;
    }

    public AbstractSignUpPage enterConfirmPassword(String confirmPassword) {
        getConfirmPasswordInput().sendKeys(confirmPassword);
        return this;
    }

    public AbstractSignUpPage checkTheReceiveNewsLetterCheckbox() {
        getReceiveNewsLetterCheckbox().click();
        return this;
    }

    public AbstractSignUpPage tapDateInput() {
        getDateOfBirthInput().click();
        return this;
    }

    public AbstractSignUpPage tapPasswordInput() {
        getPasswordInput().click();
        return this;
    }

    public AbstractSignUpPage tapOkButtonOnThePasswordAlert() {
        wait.withMessage("Password alert isn't displayed").until(ExpectedConditions.visibilityOf(getPasswordAlert()));
        getOkButtonOnThePasswordAlert().click();
        return this;
    }

    public AbstractSignUpPage tapOkButtonOnTheDatePicker() {
        wait.withMessage("Date picker isn't displayed").until(ExpectedConditions.visibilityOf(getDatePicker()));
        getDatePickerOkButton().click();
        return this;
    }

    public AbstractSignUpPage tapConfirmPasswordInput() {
        getConfirmPasswordInput().click();
        return this;
    }


    public void tapSingUpButton() {
//       action.moveTo(new PointOption().withCoordinates(607,1885)).perform();
        driver.hideKeyboard();
        getSignUpButton().click();
    }

    public boolean isFirstNameErrorMessageDisplayed() {
        return getFirstNameErrorMessage().isDisplayed();
    }

    public boolean isLastNameErrorMessageDisplayed() {
        return getLastNameErrorMessage().isDisplayed();
    }

    public boolean isEmailErrorMessageDisplayed() {
        return getEmailErrorMessage().isDisplayed();
    }

    public boolean isDateOfBirthErrorMessageDisplayed() {
        return getDateOfBirthErrorMessage().isDisplayed();
    }

    public boolean isDateAlertDisplayed() {
        return getDatePicker().isDisplayed();
    }

    public boolean isPasswordErrorMessageDisplayed() {
        return getPasswordErrorMessage().isDisplayed();
    }

    public boolean isConfirmPasswordErrorMessageDisplayed() {
        return getConfirmPasswordErrorMessage().isDisplayed();
    }

    public boolean isPasswordAlertDisplayed() {
        return wait.withMessage("Password alert isn't displayed").until(ExpectedConditions.visibilityOf(getPasswordAlert()))
                .isDisplayed();
    }

    public String getPassword() {
        return getPasswordInput().getText();
    }

    public AbstractSignUpPage tapHideButtonOnThePasswordInput() {
        getPasswordCheckbox().click();
        return this;
    }

    public AbstractSignUpPage tapHideButtonOnTheConfirmPasswordInput() {
        getConfirmPasswordCheckbox().click();
        return this;
    }

    public String getConfirmPassword() {
        return getConfirmPasswordInput().getText();
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

