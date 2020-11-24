package com.multiplatformtest.demo.driverfactory;/* Created by user on 28.10.20 */

import com.multiplatformtest.demo.config.Capability;
import com.multiplatformtest.demo.config.MobileCapabilityType;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

import java.net.URL;

@Component("androidDriver")
public class AndroidPlatform implements Driver {

    @Value("${platform}")
    private PlatformType platformType;

    @Autowired
    private Capability capability;

    @Value("${appium.url}")
    private URL appiumUrl;

    @Override
    public AppiumDriver setupDriver() {
        return platformType == PlatformType.ANDROID
                ? new AndroidDriver(appiumUrl, getAndroidCapabilities())
                : new IOSDriver(appiumUrl, getAndroidCapabilities());
    }

    private DesiredCapabilities getAndroidCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, capability.getPlatformName());
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, capability.getDeviceName());
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, capability.getPlatformVersion());
        capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, capability.getAppPackage());
        capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, capability.getAppActivity());
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, capability.getAutomationName());
        capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, (String) null);
//        capabilities.setCapability(MobileCapabilityType.APP, "/home/user/Downloads/androidAPKs/app-devServer-debug.apk");
        capabilities.setCapability(MobileCapabilityType.APP, capability.getApp());
        return capabilities;
    }
}
