package com.multiplatformtest.demo.page;/* Created by user on 08.12.20 */

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractSettingsPage extends Page {

    public AbstractSettingsPage(AppiumDriver driver) {
        super(driver);
    }

    protected abstract WebElement geTitleOfTheScreen();

    protected abstract WebElement getSearchButton();

    protected abstract WebElement getMyProfileButton();

    protected abstract WebElement getNotificationsButton();

    protected abstract WebElement getMySettingsButton();

    protected abstract WebElement getFaqButton();

    protected abstract WebElement getFyioWebSiteButton();

    protected abstract WebElement getTermsAndConditionsButton();

    protected abstract WebElement getPrivacyPolicyButton();

    protected abstract WebElement getUpgradeButton();

    protected abstract WebElement getFacebookButton();

    protected abstract WebElement getInstagramButton();

    protected abstract WebElement getTwitterButton();


    public boolean isFreeUser() {

        waitForElementBecomesVisible(getUpgradeButton());
        return getUpgradeButton().isDisplayed();
    }

    public void tapFacebookButton() {
        getFacebookButton().click();
    }

    public void tapInstagramButton() {
        getInstagramButton().click();
    }

    public void tapTwitterButton() {
        getTwitterButton().click();
    }


}
