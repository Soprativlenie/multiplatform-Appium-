package com.multiplatformtest.demo.page.ios;/* Created by user on 08.12.20 */

import com.multiplatformtest.demo.page.AbstractNavigationTabBar;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class IosNavigationTabBar extends AbstractNavigationTabBar {

    public IosNavigationTabBar(AppiumDriver driver) {
        super(driver);
    }

    @Override
    protected WebElement getHomeButton() {
        return null;
    }

    @Override
    protected WebElement getMyDocumentsButton() {
        return null;
    }

    @Override
    protected WebElement getAddDocumentButton() {
        return null;
    }

    @Override
    protected WebElement getContactsButton() {
        return null;
    }

    @Override
    protected WebElement getSettingsButton() {
        return null;
    }
}
