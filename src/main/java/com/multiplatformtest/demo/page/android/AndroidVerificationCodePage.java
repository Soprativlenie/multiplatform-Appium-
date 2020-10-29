package com.multiplatformtest.demo.page.android;/* Created by user on 29.10.20 */

import com.multiplatformtest.demo.page.AbstractVerificationCodePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AndroidVerificationCodePage extends AbstractVerificationCodePage {
    public AndroidVerificationCodePage(AppiumDriver driver) {
        super(driver);
    }
    @AndroidFindBy(id = "com.fileforlife.app:id/verificationCodeEditText")
    private AndroidElement verificationInput;
}
