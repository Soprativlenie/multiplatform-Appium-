package com.multiplatformtest.demo.page;/* Created by user on 29.07.20 */

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.regex.Pattern;

public abstract class Page {

    protected AppiumDriver driver;
    protected static WebDriverWait wait;
    protected static TouchAction action;
    private Duration defaultLook = Duration.ofSeconds(20); //default look for elements
    private Duration fastLook = Duration.ofSeconds(7); // wait for 7 sec


    public Page(AppiumDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 7);
        this.setDefaultTiming();
        action = new TouchAction(driver);
    }

    protected void setDefaultTiming() {
        PageFactory.initElements(new AppiumFieldDecorator(driver, defaultLook), this);
    }

    protected void setFastLookTiming() {
        PageFactory.initElements(new AppiumFieldDecorator(driver, fastLook), this);
    }

    protected By getLocatorByString(String sourceLocatorWithType) throws IllegalAccessException {
        String[] locatorWithType = sourceLocatorWithType.split(Pattern.quote(":"), 2);
        String locatorType = locatorWithType[0];
        String locator = locatorWithType[1];
        switch (locatorType) {
            case "id":
                return By.id(locator);
            case "xpath":
                return By.xpath(locator);
            default:
                throw new IllegalAccessException("There is no such locator " + locator);

        }
    }
}
