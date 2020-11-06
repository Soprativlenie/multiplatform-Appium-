package com.multiplatformtest.demo.page.android;/* Created by user on 30.07.20 */

import com.multiplatformtest.demo.page.AbstractLoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;


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


    @Override
    protected AndroidElement emailInput() {
        return emailInput;
    }

    @Override
    protected WebElement passwordInput() {
        return passwordInput;
    }

    @Override
    protected WebElement passwordToggleButton() {
        return passwordToggleButton;
    }

    @Override
    protected WebElement emailErrorMessage() {
        return emailErrorMessage;
    }

    @Override
    protected WebElement passwordErrorMessage() {
        return passwordErrorMessage;
    }

    @Override
    protected WebElement backButton() {
        return backButton;
    }

    @Override
    protected WebElement loginButton() {
        return loginButton;
    }

    @Override
    protected WebElement forgotPasswordButton() {
        return forgotPasswordButton;
    }

    @Override
    protected WebElement contactUsLink() {
        return contactUsLink;
    }

}
