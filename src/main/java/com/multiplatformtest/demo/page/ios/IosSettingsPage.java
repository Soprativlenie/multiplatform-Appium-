package com.multiplatformtest.demo.page.ios;/* Created by user on 08.12.20 */

import com.multiplatformtest.demo.page.AbstractSettingsPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class IosSettingsPage extends AbstractSettingsPage {
    public IosSettingsPage(AppiumDriver driver) {
        super(driver);
    }

    @Override
    protected WebElement geTitleOfTheScreen() {
        return null;
    }

    @Override
    protected WebElement getSearchButton() {
        return null;
    }

    @Override
    protected WebElement getMyProfileButton() {
        return null;
    }

    @Override
    protected WebElement getNotificationsButton() {
        return null;
    }

    @Override
    protected WebElement getMySettingsButton() {
        return null;
    }

    @Override
    protected WebElement getFaqButton() {
        return null;
    }

    @Override
    protected WebElement getFyioWebSiteButton() {
        return null;
    }

    @Override
    protected WebElement getTermsAndConditionsButton() {
        return null;
    }

    @Override
    protected WebElement getPrivacyPolicyButton() {
        return null;
    }

    @Override
    protected WebElement getUpgradeButton() {
        return null;
    }

    @Override
    protected WebElement getFacebookButton() {
        return null;
    }

    @Override
    protected WebElement getInstagramButton() {
        return null;
    }

    @Override
    protected WebElement getTwitterButton() {
        return null;
    }
}
