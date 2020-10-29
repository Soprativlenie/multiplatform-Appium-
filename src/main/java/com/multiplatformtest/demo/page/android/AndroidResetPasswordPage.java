package com.multiplatformtest.demo.page.android;/* Created by user on 29.10.20 */

import com.multiplatformtest.demo.page.AbstractResetPasswordPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class AndroidResetPasswordPage extends AbstractResetPasswordPage {
    public AndroidResetPasswordPage(AppiumDriver driver) {
        super(driver);
    }
    @AndroidFindBy(id = "com.fileforlife.app:id/backImageView")
    private AndroidElement backButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/emailEditText")
    private AndroidElement emailInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/confirmButton")
    private AndroidElement confirmButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/termsConditionsTextView")
    private AndroidElement termsButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/invalidEmailTextView")
    private AndroidElement invalidMessageText;

    @AndroidFindBy(className = "android.widget.TextView")
    private List<AndroidElement> textViews;

    @AndroidFindBy(className = "android.widget.IamgeView")
    private List<AndroidElement> imageViews;

    @AndroidFindBy(className = "android.widget.EditText")
    private List<AndroidElement> inputs;
}
