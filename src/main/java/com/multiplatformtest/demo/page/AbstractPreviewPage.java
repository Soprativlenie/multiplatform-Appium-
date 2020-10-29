package com.multiplatformtest.demo.page;/* Created by user on 29.10.20 */

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractPreviewPage extends Page {
    public AbstractPreviewPage(AppiumDriver driver) {
        super(driver);
    }

    protected abstract WebElement loginButton();
    protected abstract WebElement signUpButton();


    public void tapTheLogInButton() {
        waitForElementBecomesVisible(loginButton());
        loginButton().click();
    }

    public void tapTheSignUpButton(){
        waitForElementBecomesVisible(signUpButton());
        signUpButton().click();
    }
}
