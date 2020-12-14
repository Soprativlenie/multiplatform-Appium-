package com.multiplatformtest.demo.page.ios;/* Created by user on 29.10.20 */

import com.multiplatformtest.demo.page.AbstractSignUpPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class IosSignUpPage extends AbstractSignUpPage {
    public IosSignUpPage(AppiumDriver driver) {
        super(driver);
    }

    @Override
    protected WebElement getFirstNameInput() {
        return null;
    }

    @Override
    protected WebElement getLastNameInput() {
        return null;
    }

    @Override
    protected WebElement getEmailInput() {
        return null;
    }

    @Override
    protected WebElement getDateOfBirthInput() {
        return null;
    }

    @Override
    protected WebElement getPasswordInput() {
        return null;
    }

    @Override
    protected WebElement getConfirmPasswordInput() {
        return null;
    }

    @Override
    protected WebElement getSignUpButton() {
        return null;
    }

    @Override
    protected WebElement getReceiveNewsLetterCheckbox() {
        return null;
    }

    @Override
    protected WebElement getPasswordCheckbox() {
        return null;
    }

    @Override
    protected WebElement getConfirmPasswordCheckbox() {
        return null;
    }

    @Override
    protected WebElement getBackButton() {
        return null;
    }

    @Override
    protected WebElement getSignUpTextView() {
        return null;
    }

    @Override
    protected WebElement getDatePicker() {
        return null;
    }

    @Override
    protected WebElement getDatePickerOkButton() {
        return null;
    }

    @Override
    protected WebElement getPasswordAlert() {
        return null;
    }

    @Override
    protected WebElement getOkButtonOnThePasswordAlert() {
        return null;
    }

    @Override
    protected WebElement getFirstNameErrorMessage() {
        return null;
    }

    @Override
    protected WebElement getLastNameErrorMessage() {
        return null;
    }

    @Override
    protected WebElement getEmailErrorMessage() {
        return null;
    }

    @Override
    protected WebElement getDateOfBirthErrorMessage() {
        return null;
    }

    @Override
    protected WebElement getPasswordErrorMessage() {
        return null;
    }

    @Override
    protected WebElement getConfirmPasswordErrorMessage() {
        return null;
    }

    @Override
    protected WebElement getPrivacyLink() {
        return null;
    }

    @Override
    protected WebElement getCloseButtonOnTheWebView() {
        return null;
    }
}
