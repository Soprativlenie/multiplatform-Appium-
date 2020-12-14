package com.multiplatformtest.demo.page.ios;/* Created by user on 29.10.20 */

import com.multiplatformtest.demo.page.AbstractResetPasswordPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class IosResetPasswordPage extends AbstractResetPasswordPage {
    public IosResetPasswordPage(AppiumDriver driver) {
        super(driver);
    }

    @Override
    protected WebElement getBackButton() {
        return null;
    }

    @Override
    protected WebElement getEmailInput() {
        return null;
    }

    @Override
    protected WebElement getConfirmButton() {
        return null;
    }

    @Override
    protected WebElement getInvalidMessageText() {
        return null;
    }

    @Override
    protected WebElement getPopUpWithNoExistEmailMessage() {
        return null;
    }

    @Override
    protected WebElement getOkButtonOnTheNoExistEmailPopup() {
        return null;
    }
}
