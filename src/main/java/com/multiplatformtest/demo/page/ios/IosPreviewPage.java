package com.multiplatformtest.demo.page.ios;/* Created by user on 29.10.20 */

import com.multiplatformtest.demo.page.AbstractPreviewPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class IosPreviewPage extends AbstractPreviewPage {
    public IosPreviewPage(AppiumDriver driver) {
        super(driver);
    }

    @Override
    protected WebElement loginButton() {
        return null;
    }

    @Override
    protected WebElement signUpButton() {
        return null;
    }
}
