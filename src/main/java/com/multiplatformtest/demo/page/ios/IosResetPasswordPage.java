package com.multiplatformtest.demo.page.ios;/* Created by user on 29.10.20 */

import com.multiplatformtest.demo.page.AbstractResetPasswordPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class IosResetPasswordPage extends AbstractResetPasswordPage {
    public IosResetPasswordPage(AppiumDriver driver) {
        super(driver);
    }

    @Override
    protected WebElement backButton() {
        return null;
    }

    @Override
    protected WebElement emailInput() {
        return null;
    }

    @Override
    protected WebElement confirmButton() {
        return null;
    }

    @Override
    protected WebElement invalidMessageText() {
        return null;
    }

    @Override
    protected WebElement popUpWithNoExistEmailMessage() {
        return null;
    }

    @Override
    protected WebElement okButtonOnTheNoExistEmailPopup() {
        return null;
    }
}
