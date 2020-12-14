package com.multiplatformtest.demo.page.android;/* Created by user on 29.10.20 */

import com.multiplatformtest.demo.page.AbstractSignUpPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;


public class AndroidSignUpPage extends AbstractSignUpPage {
    public AndroidSignUpPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.fileforlife.app:id/firstNameSignUpEditText")
    private AndroidElement firstNameInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/lastNameSignUpEditText")
    private AndroidElement lastNameInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/emailSignUpEditText")
    private AndroidElement emailInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/birthDateSignUpEditText")
    private AndroidElement dateOfBirthInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/passwordSignUpEditText")
    private AndroidElement passwordInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/confirmPasswordSignUpEditText")
    private AndroidElement confirmPasswordInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/proceedSignUpButton")
    private AndroidElement signUpButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/notReceiveMarketingCheckBox")
    private AndroidElement receiveNewsLetterCheckbox;

    @AndroidFindBy(id = "com.fileforlife.app:id/passwordCheckBox")
    private AndroidElement passwordCheckbox;

    @AndroidFindBy(id = "com.fileforlife.app:id/confirmPasswordCheckBox")
    private AndroidElement confirmPasswordCheckbox;

    @AndroidFindBy(id = "com.fileforlife.app:id/backImageView")
    private AndroidElement backButton;

    @AndroidFindBy(xpath = "//*[contains(@text,'Sign Up')]")
    private AndroidElement signUpTextView;

    @AndroidFindBy(id = "android:id/datePicker")
    private AndroidElement datePicker;

    @AndroidFindBy(id = "android:id/button1")
    private AndroidElement datePickerOkButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/alertTitle")
    private AndroidElement passwordAlert;

    @AndroidFindBy(id = "android:id/button1")
    private AndroidElement okButtonOnThePasswordAlert;

    @AndroidFindBy(id = "com.fileforlife.app:id/invalidFirstNameTextView")
    private AndroidElement firstNameErrorMessage;

    @AndroidFindBy(id = "com.fileforlife.app:id/invalidLastNameTextView")
    private AndroidElement lastNameErrorMessage;

    @AndroidFindBy(id = "com.fileforlife.app:id/invalidEmailTextView")
    private AndroidElement emailErrorMessage;

    @AndroidFindBy(id = "com.fileforlife.app:id/invalidBirthDateTextView")
    private AndroidElement dateOfBirthErrorMessage;

    @AndroidFindBy(id = "com.fileforlife.app:id/invalidPasswordTextView")
    private AndroidElement passwordErrorMessage;

    @AndroidFindBy(id = "com.fileforlife.app:id/invalidConfirmPasswordTextView")
    private AndroidElement confirmPasswordErrorMessage;

    @AndroidFindBy(id = "com.fileforlife.app:id/privacyPolicyTextView")
    private AndroidElement privacyLink;

    @AndroidFindBy(id = "com.android.chrome:id/close_button")
    private AndroidElement closeButtonOnTheWebView;

    @AndroidFindBy(id = "com.fileforlife.app:id/receiveMarketingContainer")
    private AndroidElement marketingEmailsCheckbox;

    @Override
    protected WebElement getFirstNameInput() {
        return firstNameInput;
    }

    @Override
    protected WebElement getLastNameInput() {
        return lastNameInput;
    }

    @Override
    protected WebElement getEmailInput() {
        return emailInput;
    }

    @Override
    protected WebElement getDateOfBirthInput() {
        return dateOfBirthInput;
    }

    @Override
    protected WebElement getPasswordInput() {
        return passwordInput;
    }

    @Override
    protected WebElement getConfirmPasswordInput() {
        return confirmPasswordInput;
    }

    @Override
    protected WebElement getSignUpButton() {
        return signUpButton;
    }

    @Override
    protected WebElement getReceiveNewsLetterCheckbox() {
        return receiveNewsLetterCheckbox;
    }

    @Override
    protected WebElement getPasswordCheckbox() {
        return passwordCheckbox;
    }

    @Override
    protected WebElement getConfirmPasswordCheckbox() {
        return confirmPasswordCheckbox;
    }

    @Override
    protected WebElement getBackButton() {
        return backButton;
    }

    @Override
    protected WebElement getSignUpTextView() {
        return signUpTextView;
    }

    @Override
    protected WebElement getDatePicker() {
        return datePicker;
    }

    @Override
    protected WebElement getDatePickerOkButton() {
        return datePickerOkButton;
    }

    @Override
    protected WebElement getPasswordAlert() {
        return passwordAlert;
    }

    @Override
    protected WebElement getOkButtonOnThePasswordAlert() {
        return okButtonOnThePasswordAlert;
    }

    @Override
    protected WebElement getFirstNameErrorMessage() {
        return firstNameErrorMessage;
    }

    @Override
    protected WebElement getLastNameErrorMessage() {
        return lastNameErrorMessage;
    }

    @Override
    protected WebElement getEmailErrorMessage() {
        return emailErrorMessage;
    }

    @Override
    protected WebElement getDateOfBirthErrorMessage() {
        return dateOfBirthErrorMessage;
    }

    @Override
    protected WebElement getPasswordErrorMessage() {
        return passwordErrorMessage;
    }

    @Override
    protected WebElement getConfirmPasswordErrorMessage() {
        return confirmPasswordErrorMessage;
    }

    @Override
    protected WebElement getPrivacyLink() {
        return privacyLink;
    }

    @Override
    protected WebElement getCloseButtonOnTheWebView() {
        return closeButtonOnTheWebView;
    }


}
