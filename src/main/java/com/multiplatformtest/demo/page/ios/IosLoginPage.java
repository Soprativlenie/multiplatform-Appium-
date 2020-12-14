package com.multiplatformtest.demo.page.ios;/* Created by user on 30.07.20 */

import com.multiplatformtest.demo.page.AbstractLoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;


public class IosLoginPage extends AbstractLoginPage {

    public IosLoginPage(AppiumDriver driver) {
        super(driver);
    }


    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar[`name == 'FYIO.LogInView'`]/XCUIElementTypeButton")
    private IOSElement backButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeButton' AND name = 'LOG IN'")
    private IOSElement loginButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name = 'Forgot password?'")
    private IOSElement forgotPasswordButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeStaticText' AND name = 'Contact us'")
    private IOSElement contactUsLink;

    @iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeTextField' AND value == 'Email'")
    private IOSElement emailInput;

    @iOSXCUITFindBy(iOSNsPredicate = "value == 'Password'")
    private IOSElement passwordInput;

    @iOSXCUITFindBy(accessibility = "visibile")
    private IOSElement passwordToggleButton;
    //TODO: Should be done
    @iOSXCUITFindBy(id = "Please enter the email you used to register")
    private IOSElement emailErrorMessageEmptyField;

    @iOSXCUITFindBy(id = "Please enter the email you used to register")


    //contains two message(when the password empty/doesn't match the requirement)
    @iOSXCUITFindBy(id = "Please enter the email you used to register")
    private IOSElement passwordErrorMessage;


    @Override
    protected WebElement getEmailInput() {
        return emailInput;
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
        return null;
    }

    @Override
    protected WebElement getPasswordErrorMessage() {
        return null;
    }

    @Override
    protected WebElement getInvalidAlertMessage() {
        return null;
    }

}
