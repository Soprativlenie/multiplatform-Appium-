package com.multiplatformtest.demo.driverfactory;/* Created by user on 28.10.20 */

import com.multiplatformtest.demo.model.MobileCapabilityType;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;

public class AndroidPlatform implements Driver {

    private static final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";

    @Override
    public AppiumDriver setupDriver() throws MalformedURLException {
        return new AndroidDriver(new URL(APPIUM_URL), getAndroidCapabilities());
    }

    private static DesiredCapabilities getAndroidCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Mi A1");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.fileforlife.app");
        capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, ".presentation.ui.activity.enter.EnterActivity");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        capabilities.setCapability(MobileCapabilityType.APP, "/home/user/Downloads/app-devServer-debug.apk");
        return capabilities;
    }
}
