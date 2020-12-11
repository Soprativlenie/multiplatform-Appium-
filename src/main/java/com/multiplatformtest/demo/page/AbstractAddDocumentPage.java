package com.multiplatformtest.demo.page;/* Created by user on 11.12.20 */

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractAddDocumentPage extends Page {

    public AbstractAddDocumentPage(AppiumDriver driver) {
        super(driver);
    }

    protected abstract WebElement getTitleOfTheScreen();
    protected abstract WebElement getSearchButton();
    protected abstract WebElement getUploadButton();
    protected abstract WebElement getDocumentTitleInput();
    protected abstract WebElement getCategorySelect();
    protected abstract WebElement getSubCategorySelect();
    protected abstract WebElement getFamilyCategory();
}
