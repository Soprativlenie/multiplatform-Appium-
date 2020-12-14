package com.multiplatformtest.demo.page;/* Created by user on 29.10.20 */

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractResetPasswordPage extends Page {
    public AbstractResetPasswordPage(AppiumDriver driver) {
        super(driver);
    }

    protected abstract WebElement getBackButton();

    protected abstract WebElement getEmailInput();

    protected abstract WebElement getConfirmButton();

    protected abstract WebElement getInvalidMessageText();

    protected abstract WebElement getPopUpWithNoExistEmailMessage();

    protected abstract WebElement getOkButtonOnTheNoExistEmailPopup();

    public boolean isResetPasswordScreen() {
        return getConfirmButton().isDisplayed();
    }

    public void tapBackButton() {
        getBackButton().click();
    }

    public AbstractResetPasswordPage fillEmailInput(String email) {
        waitForElementBecomesVisible(getEmailInput());
        getEmailInput().sendKeys(email);
        return this;
    }

    public boolean isEmailErrorMessageDisplayed() {
        waitForElementBecomesVisible(getInvalidMessageText());
        return getInvalidMessageText().isDisplayed();
    }

    public void tapConfirmButton() {
        getConfirmButton().click();
    }

    public boolean isInvalidAlertMessageDisplayed() {
        return getPopUpWithNoExistEmailMessage().isDisplayed();
    }


}
