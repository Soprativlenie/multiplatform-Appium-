package com.multiplatformtest.demo.page.android;/* Created by user on 08.12.20 */

import com.multiplatformtest.demo.page.AbstractCategoryPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AndroidCategoryPage extends AbstractCategoryPage {

    @AndroidFindBy( xpath= "//*[@resource-id='com.fileforlife.app:id/swipeContainer']//android.view.ViewGroup")
    private AndroidElement mainImage;

    @AndroidFindBy(id = "com.fileforlife.app:id/categoryImageView")
    private AndroidElement categoryImage;

    @AndroidFindBy (id = "com.fileforlife.app:id/nameCategoriesTextView")
    private List<WebElement> categories;

    @AndroidFindBy(id = "com.fileforlife.app:id/backImageView")
    private AndroidElement backButton; //using only on the SingleCategory screen
    @Override
    protected WebElement getSearchButton() {
        return null;
    }

    @Override
    protected WebElement getMainImage() {
        return mainImage;
    }

    @Override
    protected List<WebElement> categories() {
        return categories;
    }

    @Override
    protected WebElement getBackButton() {
        return backButton;
    }

    @Override
    protected WebElement getCategoryImage() {
        return categoryImage;
    }

    public AndroidCategoryPage(AppiumDriver driver) {
        super(driver);
    }
}
