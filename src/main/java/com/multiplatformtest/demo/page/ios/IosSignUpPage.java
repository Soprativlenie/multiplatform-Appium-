package com.multiplatformtest.demo.page.ios;/* Created by user on 29.10.20 */

import com.multiplatformtest.demo.page.AbstractSignUpPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class IosSignUpPage extends AbstractSignUpPage {
    public IosSignUpPage(AppiumDriver driver) {
        super(driver);
    }

    @Override
    protected WebElement firstNameInput() {
        return null;
    }

    @Override
    protected WebElement lastNameInput() {
        return null;
    }

    @Override
    protected WebElement emailInput() {
        return null;
    }

    @Override
    protected WebElement dateOfBirthInput() {
        return null;
    }

    @Override
    protected WebElement passwordInput() {
        return null;
    }

    @Override
    protected WebElement confirmPasswordInput() {
        return null;
    }

    @Override
    protected WebElement signUpButton() {
        return null;
    }

    @Override
    protected WebElement receiveNewsLetterCheckbox() {
        return null;
    }

    @Override
    protected WebElement passwordCheckbox() {
        return null;
    }

    @Override
    protected WebElement confirmPasswordCheckbox() {
        return null;
    }

    @Override
    protected WebElement backButton() {
        return null;
    }

    @Override
    protected WebElement signUpTextView() {
        return null;
    }

    @Override
    protected WebElement datePicker() {
        return null;
    }

    @Override
    protected WebElement datePickerOkButton() {
        return null;
    }

    @Override
    protected WebElement passwordAlert() {
        return null;
    }

    @Override
    protected WebElement okButtonOnThePassworAlert() {
        return null;
    }

    @Override
    protected WebElement firstNameErrorMessage() {
        return null;
    }

    @Override
    protected WebElement lastNameErrorMessage() {
        return null;
    }

    @Override
    protected WebElement emailErrorMessage() {
        return null;
    }

    @Override
    protected WebElement dateOfBirthErrorMessage() {
        return null;
    }

    @Override
    protected WebElement passwordErrorMessage() {
        return null;
    }

    @Override
    protected WebElement confirmPasswordErrorMessage() {
        return null;
    }

    @Override
    protected WebElement privacyLink() {
        return null;
    }

    @Override
    protected WebElement closeButtonOnTheWebView() {
        return null;
    }
}
