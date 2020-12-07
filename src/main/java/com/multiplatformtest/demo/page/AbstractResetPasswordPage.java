package com.multiplatformtest.demo.page;/* Created by user on 29.10.20 */

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractResetPasswordPage extends Page {
    public AbstractResetPasswordPage(AppiumDriver driver) {
        super(driver);
    }

    protected abstract WebElement backButton();

    protected abstract WebElement emailInput();

    protected abstract WebElement confirmButton();

    protected abstract WebElement invalidMessageText();

    protected abstract WebElement popUpWithNoExistEmailMessage();

    protected abstract WebElement okButtonOnTheNoExistEmailPopup();

    public boolean isResetPasswordScreen() {
        return confirmButton().isDisplayed();
    }

    public void tapBackButton() {
        backButton().click();
    }

    public AbstractResetPasswordPage fillEmailInput(String email) {
        waitForElementBecomesVisible(emailInput());
        emailInput().sendKeys(email);
        return this;
    }

    public boolean isEmailErrorMessageDisplayed() {
        waitForElementBecomesVisible(invalidMessageText());
        return invalidMessageText().isDisplayed();
    }

    public void tapConfirmButton(){
        confirmButton().click();
    }
    public boolean isInvalidAlertMessageDisplayed(){
        return popUpWithNoExistEmailMessage().isDisplayed();
    }


}
