package com.multiplatformtest.demo.page;/* Created by user on 08.12.20 */

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public abstract class AbstractCategoryPage extends Page {

    protected abstract WebElement getSearchButton();

    protected abstract WebElement getMainImage();

    protected abstract List<WebElement> categories();

    protected abstract WebElement getBackButton();

    protected abstract WebElement getCategoryImage();

    public AbstractCategoryPage(AppiumDriver driver) {
        super(driver);
    }

    public boolean isMainImagesDisplayInsideEachCategoryScreen() {
        for (WebElement category : categories()) {
            category.click();
            System.out.println("I'm in");
            waitForElementBecomesVisible(getCategoryImage());
            System.out.println("I'm waiting");
            getBackButton().click();
            waitForElementBecomesVisible(getMainImage());
            System.out.println("Get back to the previous screen");
        }
        return true;
    }

}
