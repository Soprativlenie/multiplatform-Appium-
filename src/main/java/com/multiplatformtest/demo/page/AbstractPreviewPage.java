package com.multiplatformtest.demo.page;/* Created by user on 29.10.20 */

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractPreviewPage extends Page {
    public AbstractPreviewPage(AppiumDriver driver) {
        super(driver);
    }

    protected abstract WebElement getLoginButton();
    protected abstract WebElement getSignUpButton();

    public void tapTheLogInButton() {
        getLoginButton().click();
    }

    public void tapTheSignUpButton(){
        waitForElementBecomesVisible(getSignUpButton());
        getSignUpButton().click();
    }

    public boolean isPreviewScreen(){
        return getLoginButton().isDisplayed();
    }

}
