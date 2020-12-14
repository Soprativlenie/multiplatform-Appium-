package com.multiplatformtest.demo.page;/* Created by user on 08.12.20 */

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class AbstractCategoryPage extends Page {

    protected abstract WebElement getSearchButton();

    protected abstract WebElement getMainImage();

    protected abstract List<WebElement> getCategories();

    protected abstract WebElement getBackButton();

    protected abstract WebElement getCategoryImage();

    public AbstractCategoryPage(AppiumDriver driver) {
        super(driver);
    }

    public boolean isMainImageDisplayedOnCategoryScreen() {
        return getMainImage().isDisplayed();
    }

    public void openCategory() throws InterruptedException {
        System.out.println(getCategories());
        for (WebElement element : getCategories()){
            element.click();
            System.out.println("I am taping " + element);
            waitForElementBecomesVisible(getCategoryImage());
            System.out.println("Waiting for element");
            getBackButton().click();
            System.out.println("Back button tapped");
            Thread.sleep(3000);
        }

    }

}
