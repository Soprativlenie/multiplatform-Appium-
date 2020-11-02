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

    @iOSBy()
    private IOSElement loginButton;

    @iOSBy()
    private IOSElement signUpButton;

    @Override
    protected WebElement loginButton() {
        return loginButton;
    }

    @Override
    protected WebElement signUpButton() {
        return signUpButton;
    }
}
