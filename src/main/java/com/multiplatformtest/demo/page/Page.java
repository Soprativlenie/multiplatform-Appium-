package com.multiplatformtest.demo.page;/* Created by user on 29.07.20 */

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public abstract class Page implements Swipeable {

    protected static AppiumDriver driver;
    protected static WebDriverWait wait;
    static TouchAction action;
    private Duration defaultLook = Duration.ofSeconds(20); //default look for elements
    private Duration fastLook = Duration.ofSeconds(7); // wait for 7 sec


    public Page(AppiumDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 7);
        this.setDefaultTiming();
        action = new TouchAction(driver);
    }

    protected void setDefaultTiming() {
        initElements(defaultLook);
    }

    protected void setFastLookTiming() {
        initElements(fastLook);
    }


    protected void waitForElementBecomesVisible(WebElement element) {
        wait.withMessage("Can't see the element " + element).until(ExpectedConditions.visibilityOf(element));
    }

    private void initElements(Duration duration) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, duration), this);
    }



}
