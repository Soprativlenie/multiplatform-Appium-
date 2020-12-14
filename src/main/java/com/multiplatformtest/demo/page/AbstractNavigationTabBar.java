package com.multiplatformtest.demo.page;/* Created by user on 08.12.20 */

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractNavigationTabBar extends Page {

    protected abstract WebElement getHomeButton();

    protected abstract WebElement getMyDocumentsButton();

    protected abstract WebElement getAddDocumentButton();

    protected abstract WebElement getContactsButton();

    protected abstract WebElement getSettingsButton();

    public AbstractNavigationTabBar(AppiumDriver driver) {
        super(driver);
    }

    public boolean isCategoryScreen() {
        return getHomeButton().isSelected();
    }

    public void tapCategoryButton() {
    }

    public void tapMyDocumentButton() {
        getMyDocumentsButton().click();
    }

    public void tapAddButton() {
        getAddDocumentButton().click();
    }

    public void tapContactsButton() {
        getContactsButton().click();
    }

    public void tapSettingsButton() {
        getSettingsButton().click();
    }

}
