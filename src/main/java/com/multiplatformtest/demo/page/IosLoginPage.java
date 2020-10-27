package com.multiplatformtest.demo.page;/* Created by user on 30.07.20 */

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSBy;
import org.openqa.selenium.WebElement;


public class IosLoginPage extends AbstractLoginPage {

    @iOSBy(id = "")
    private IOSElement emailInput;

    public IosLoginPage(AppiumDriver driver) {
        super(driver);
    }

    @Override
    protected WebElement getEmailInput() {
        return emailInput;
    }
}
