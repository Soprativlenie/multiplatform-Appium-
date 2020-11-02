package com.multiplatformtest.demo.page.ios;/* Created by user on 30.07.20 */

import com.multiplatformtest.demo.page.AbstractLoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSBy;
import org.openqa.selenium.WebElement;


public class IosLoginPage extends AbstractLoginPage {

    public IosLoginPage(AppiumDriver driver) {
        super(driver);
    }


    @iOSBy()
    private IOSElement backButton;

    @iOSBy()
    private IOSElement loginButton;

    @iOSBy()
    private IOSElement forgotPasswordButton;

    @iOSBy()
    private IOSElement contactUsLink;

    @iOSBy()
    private IOSElement emailInput;

    @iOSBy()
    private IOSElement passwordInput;

    @iOSBy()
    private IOSElement passwordToggleButton;


    @Override
    protected WebElement emailInput() {
        return emailInput;
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

    @Override
    protected WebElement passwordInput() {
        return passwordInput;
    }

    @Override
    protected WebElement passwordToggleButton() {
        return passwordToggleButton;
    }

}
