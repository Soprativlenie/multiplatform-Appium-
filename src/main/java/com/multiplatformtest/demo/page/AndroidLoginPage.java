package com.multiplatformtest.demo.page;/* Created by user on 30.07.20 */

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class AndroidLoginPage extends AbstractLoginPage {

    @AndroidFindBy(id = "com.fileforlife.app:id/emailLogInEditText")
    private AndroidElement emailInput;

    public AndroidLoginPage(AppiumDriver driver) {
        super(driver);
    }

    @Override
    protected AndroidElement getEmailInput() {
        return emailInput;
    }

}
