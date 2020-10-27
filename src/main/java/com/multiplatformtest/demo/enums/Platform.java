package com.multiplatformtest.demo.enums;

import com.multiplatformtest.demo.model.MobileCapabilityType;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public enum Platform {

    PLATFORM_ANDROID("android"),
    PLATFORM_IOS("ios");

    private String name;

    Platform (String name) {
        this.name = name;
    }

    private static final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";

    public AppiumDriver getDriver() {
        switch (this) {
            case PLATFORM_ANDROID:
                return new AndroidDriver(new URL(APPIUM_URL), getAndroidCapabilities());
            case PLATFORM_IOS:
                return new IOSDriver(new URL(APPIUM_URL), getIosCapabilities());
            default:
                throw new RuntimeException("Set the correct environment variable. Can't get run platform " + this.name);
        }
    }

    private DesiredCapabilities getAndroidCapabilities() {
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

    private DesiredCapabilities getIosCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Jelvix's iPad");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.4");
        capabilities.setCapability(MobileCapabilityType.APP, "/home/user/Downloads/app-devServer-debug.apk");
        return capabilities;
    }

    public boolean isAndroidPlatform() {
        return this == PLATFORM_ANDROID;
    }

    public boolean isIosPlatform() {
        return this == PLATFORM_IOS;
    }
}
