package com.multiplatformtest.demo.page.android;/* Created by user on 08.12.20 */

import com.multiplatformtest.demo.page.AbstractSettingsPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AndroidSettingsPage extends AbstractSettingsPage {
    @AndroidFindBy(id = "com.fileforlife.app:id/searchImageView")
    private AndroidElement searchButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/myProfileContainer")
    private AndroidElement myProfileButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/notificationContainer")
    private AndroidElement notificationsButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/accountContainer")
    private AndroidElement mySettingsButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/faqContainer")
    private AndroidElement faqButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/websiteContainer")
    private AndroidElement fyioWebSiteButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/termsAndConditionsTextView")
    private AndroidElement termsAndConditionsButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/privacyPolicyTextView")
    private AndroidElement privacyPolicyButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/upgradeButton")
    private AndroidElement upgradeButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/facebookImageView")
    private AndroidElement facebookButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/instagramImageView")
    private AndroidElement instagramButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/twitterImageView")
    private AndroidElement twitterButton;

    @AndroidFindBy(xpath = "//*[@text='Settings']")
    private AndroidElement titleOfTheScreen;

    public AndroidSettingsPage(AppiumDriver driver) {
        super(driver);
    }

    @Override
    protected WebElement geTitleOfTheScreen() {
        return titleOfTheScreen;
    }

    @Override
    protected WebElement getSearchButton() {
        return searchButton;
    }

    @Override
    protected WebElement getMyProfileButton() {
        return myProfileButton;
    }

    @Override
    protected WebElement getNotificationsButton() {
        return notificationsButton;
    }

    @Override
    protected WebElement getMySettingsButton() {
        return mySettingsButton;
    }

    @Override
    protected WebElement getFaqButton() {
        return faqButton;
    }

    @Override
    protected WebElement getFyioWebSiteButton() {
        return fyioWebSiteButton;
    }

    @Override
    protected WebElement getTermsAndConditionsButton() {
        return termsAndConditionsButton;
    }

    @Override
    protected WebElement getPrivacyPolicyButton() {
        return privacyPolicyButton;
    }

    @Override
    protected WebElement getUpgradeButton() {
        return upgradeButton;
    }

    @Override
    protected WebElement getFacebookButton() {
        return facebookButton;
    }

    @Override
    protected WebElement getInstagramButton() {
        return instagramButton;
    }

    @Override
    protected WebElement getTwitterButton() {
        return twitterButton;
    }
}
