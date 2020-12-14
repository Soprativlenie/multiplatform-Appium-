package com.multiplatformtest.demo.page.android;/* Created by user on 08.12.20 */

import com.multiplatformtest.demo.page.AbstractNavigationTabBar;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AndroidNavigationTabBar extends AbstractNavigationTabBar {
    @AndroidFindBy(id = "com.fileforlife.app:id/bottomNavigation")
    private AndroidElement navigationTabBar;

    @AndroidFindBy(id = "com.fileforlife.app:id/homeFragment")
    private AndroidElement homeButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/myDocumentsFragment")
    private AndroidElement myDocumentsButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/addDocumentFragment")
    private AndroidElement addButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/myContactsFragment")
    private AndroidElement contactsButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/settingsFragment")
    private AndroidElement settingsButton;

    @Override
    protected WebElement getHomeButton() {
        return homeButton;
    }

    @Override
    protected WebElement getMyDocumentsButton() {
        return myDocumentsButton;
    }

    @Override
    protected WebElement getAddDocumentButton() {
        return addButton;
    }

    @Override
    protected WebElement getContactsButton() {
        return contactsButton;
    }

    @Override
    protected WebElement getSettingsButton() {
        return settingsButton;
    }

    public AndroidNavigationTabBar(AppiumDriver driver) {
        super(driver);
    }
}
