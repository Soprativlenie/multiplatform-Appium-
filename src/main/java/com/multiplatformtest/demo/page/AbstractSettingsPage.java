package com.multiplatformtest.demo.page;/* Created by user on 08.12.20 */

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.HashMap;

public abstract class AbstractSettingsPage extends Page {

    public AbstractSettingsPage(AppiumDriver driver) {
        super(driver);
    }

    protected abstract WebElement getSearchButton();

    protected abstract WebElement getMyProfileButton();

    protected abstract WebElement getNotificationsButton();

    protected abstract WebElement getMySettingsButton();

    protected abstract WebElement getFaqButton();

    protected abstract WebElement getFyioWebSiteButton();

    protected abstract WebElement getTermsAndConditionsButton();

    protected abstract WebElement getPrivacyPolicyButton();

    protected abstract WebElement getUpgradeButton();

    public boolean isFreeUser() {

        waitForElementBecomesVisible(getUpgradeButton());
        return getUpgradeButton().isDisplayed();
    }

    private boolean scrollToDirection(WebElement el, String direction) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            HashMap<String, String> scrollObject = new HashMap<>();
            switch (direction) {
                case "d":
                    scrollObject.put("direction", "down");
                    break;
                case "u":
                    scrollObject.put("direction", "up");
                    break;
                case "l":
                    scrollObject.put("direction", "left");
                    break;
                case "r":
                    scrollObject.put("direction", "right");
                    break;
            }
            scrollObject.put("element", el);
            scrollObject.put("toVisible", "true");
            js.executeScript("mobile:scroll", scrollObject);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
