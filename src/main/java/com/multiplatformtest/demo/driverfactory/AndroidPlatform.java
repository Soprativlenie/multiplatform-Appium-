package com.multiplatformtest.demo.driverfactory;/* Created by user on 28.10.20 */

import com.multiplatformtest.demo.model.Capability;
import com.multiplatformtest.demo.model.MobileCapabilityType;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


import java.net.MalformedURLException;
import java.net.URL;


public class AndroidPlatform implements Driver {

//    @Autowired
//    private Capability capability;

//    @Value("${appium}")
//    private String appium;

    private static final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";

    @Override
    public AppiumDriver setupDriver() throws MalformedURLException {
//        return new AndroidDriver(new URL(APPIUM_URL), getAndroidCapabilities());
        return null;
    }

//    private DesiredCapabilities getAndroidCapabilities() {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, capability.getPlatformName());
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, capability.getDeviceName());
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, capability.getPlatformVersion());
//        capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, capability.getAppPackage());
//        capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, capability.getAppActivity());
//        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, capability.getAutomationName());
////        capabilities.setCapability(MobileCapabilityType.APP, "/home/user/Downloads/androidAPKs/app-devServer-debug.apk");
//        capabilities.setCapability(MobileCapabilityType.APP, capability.getApp());
//        return capabilities;
//    }
}
