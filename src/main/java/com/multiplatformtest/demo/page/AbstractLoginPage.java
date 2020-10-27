package com.multiplatformtest.demo.page;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractLoginPage extends Page {

    public AbstractLoginPage(AppiumDriver driver) {
        super(driver);
    }

    public void step(String email) {
        getEmailInput().sendKeys(email);
    }

    protected abstract WebElement getEmailInput();
}
