package com.multiplatformtest.demo.page.ios;/* Created by user on 29.10.20 */

import com.multiplatformtest.demo.page.AbstractPreviewPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSBy;
import org.openqa.selenium.WebElement;

public class IosPreviewPage extends AbstractPreviewPage {
    public IosPreviewPage(AppiumDriver driver) {
        super(driver);
    }

    @iOSBy(xpath = "//*[@text='Log in']")
    private IOSElement loginButton;

    @iOSBy()
    private IOSElement signUpButton;

    @iOSBy(xpath = "//XCUIElementTypeAlert[@name=“FYIO” Would Like to Send You Notifications]")
    private IOSElement alertAllow;

    @Override
    protected WebElement loginButton() {
        return loginButton;
    }

    @Override
    protected WebElement signUpButton() {
        return signUpButton;
    }

    @Override
    protected WebElement alert() {
        return alertAllow;
    }
}
