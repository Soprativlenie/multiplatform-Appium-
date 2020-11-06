package com.multiplatformtest.demo.page.android;/* Created by user on 29.10.20 */

import com.multiplatformtest.demo.page.AbstractResetPasswordPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AndroidResetPasswordPage extends AbstractResetPasswordPage {
    public AndroidResetPasswordPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.fileforlife.app:id/backImageView")
    private AndroidElement backButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/emailEditText")
    private AndroidElement emailInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/confirmButton")
    private AndroidElement confirmButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/invalidEmailTextView")
    private AndroidElement invalidMessageText;

    @AndroidFindBy(id = "android:id/message")
    private AndroidElement popUpWithNoExistEmailMessage;

    @AndroidFindBy(id = "android:id/button1")
    private AndroidElement okButtonOnTheNoExistEmailPopup;

    @Override
    protected WebElement backButton() {
        return backButton;
    }

    @Override
    protected WebElement emailInput() {
        return emailInput;
    }

    @Override
    protected WebElement confirmButton() {
        return confirmButton;
    }

    @Override
    protected WebElement invalidMessageText() {
        return invalidMessageText;
    }

    @Override
    protected WebElement popUpWithNoExistEmailMessage() {
        return popUpWithNoExistEmailMessage;
    }

    @Override
    protected WebElement okButtonOnTheNoExistEmailPopup() {
        return okButtonOnTheNoExistEmailPopup;
    }

}
