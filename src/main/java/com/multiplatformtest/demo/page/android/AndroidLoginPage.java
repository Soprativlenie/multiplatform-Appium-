package com.multiplatformtest.demo.page.android;/* Created by user on 30.07.20 */

import com.multiplatformtest.demo.page.AbstractLoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AndroidLoginPage extends AbstractLoginPage {

    public AndroidLoginPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.fileforlife.app:id/backImageView")
    private AndroidElement backButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/proceedLogInButton")
    private AndroidElement loginButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/resendPasswordTextView")
    private AndroidElement forgotPasswordButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/contactUsTextView")
    private AndroidElement contactUsLink;

    @AndroidFindBy(id = "com.fileforlife.app:id/emailLogInEditText")
    private AndroidElement emailInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/passwordLogInEditText")
    private AndroidElement passwordInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/passwordCheckBox")
    private AndroidElement passwordToggleButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/invalidEmailTextView")
    private AndroidElement emailErrorMessage;

    //contains two message(when the password empty/doesn't match the requirement)
    @AndroidFindBy(id = "com.fileforlife.app:id/invalidPasswordTextView")
    private AndroidElement passwordErrorMessage;

    @AndroidFindBy(id = "com.fileforlife.app:id/contentPanel")
    private AndroidElement invalidAlertMesssage;

    @AndroidFindBy(id = "android:id/button1")
    private AndroidElement OkButtonOnInvalidAlertMessage;


    @Override
    protected AndroidElement getEmailInput() {
        return emailInput;
    }

    @Override
    protected WebElement getPasswordInput() {
        return passwordInput;
    }

    @Override
    protected WebElement getPasswordToggleButton() {
        return passwordToggleButton;
    }

    @Override
    protected WebElement getEmailErrorMessage() {
        return emailErrorMessage;
    }

    @Override
    protected WebElement getPasswordErrorMessage() {
        return passwordErrorMessage;
    }

    @Override
    protected WebElement getInvalidAlertMessage() {
        return invalidAlertMesssage;
    }

    @Override
    protected WebElement getBackButton() {
        return backButton;
    }

    @Override
    protected WebElement getLoginButton() {
        return loginButton;
    }

    @Override
    protected WebElement getForgotPasswordButton() {
        return forgotPasswordButton;
    }

    @Override
    protected WebElement getContactUsLink() {
        return contactUsLink;
    }

}
