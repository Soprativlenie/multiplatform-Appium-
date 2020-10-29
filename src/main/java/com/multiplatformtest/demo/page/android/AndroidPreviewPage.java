package com.multiplatformtest.demo.page.android;/* Created by user on 29.10.20 */

import com.multiplatformtest.demo.page.AbstractPreviewPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class AndroidPreviewPage extends AbstractPreviewPage {
    public AndroidPreviewPage(AppiumDriver driver) {
        super(driver);
    }
    @AndroidFindBy(id = "com.fileforlife.app:id/logInButton")
    private AndroidElement loginButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/signUpButton")
    private AndroidElement signUpButton;

    @AndroidFindBy(className = "android.widget.LinearLayout")
    private List<AndroidElement> mainContent;
}
