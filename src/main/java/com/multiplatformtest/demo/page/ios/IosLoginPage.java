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


    @iOSBy( id= "14000000-0000-0000-1F09-000000000000")
    private IOSElement backButton;

    @iOSBy()
    private IOSElement loginButton;

    @iOSBy()
    private IOSElement forgotPasswordButton;

    @iOSBy()
    private IOSElement contactUsLink;

    @iOSBy(id = "//XCUIElementTypeApplication[@name=\\\"FYIO\\\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private IOSElement emailInput;

    @iOSBy(id = "1E000000-0000-0000-1F09-000000000000")
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

    @Override
    protected WebElement emailErrorMessage() {
        return null;
    }

    @Override
    protected WebElement passwordErrorMessage() {
        return null;
    }

}
