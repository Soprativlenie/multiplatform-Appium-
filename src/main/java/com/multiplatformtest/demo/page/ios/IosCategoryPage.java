package com.multiplatformtest.demo.page.ios;/* Created by user on 08.12.20 */

import com.multiplatformtest.demo.page.AbstractCategoryPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IosCategoryPage extends AbstractCategoryPage {
    @Override
    protected WebElement getSearchButton() {
        return null;
    }

    @Override
    protected WebElement getMainImage() {
        return null;
    }

    @Override
    protected List<WebElement> getCategories() {
        return null;
    }

    @Override
    protected WebElement getBackButton() {
        return null;
    }

    @Override
    protected WebElement getCategoryImage() {
        return null;
    }

    public IosCategoryPage(AppiumDriver driver) {
        super(driver);
    }
}
