package com.multiplatformtest.demo.page.ios;/* Created by user on 30.07.20 */

import com.multiplatformtest.demo.page.AbstractLoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSBy;
import org.openqa.selenium.WebElement;


public class IosLoginPage extends AbstractLoginPage {

    @iOSBy(id = "")
    private IOSElement emailInput;

    public IosLoginPage(AppiumDriver driver) {
        super(driver);
    }

    @Override
    protected WebElement emailInput() {
        return null;
    }

    @Override
    protected WebElement backButton() {
        return null;
    }

    @Override
    protected WebElement loginButton() {
        return null;
    }

    @Override
    protected WebElement forgotPasswordButton() {
        return null;
    }

    @Override
    protected WebElement contactUsLink() {
        return null;
    }

    @Override
    protected WebElement passwordInput() {
        return null;
    }

    @Override
    protected WebElement passwordToggleButton() {
        return null;
    }

}
