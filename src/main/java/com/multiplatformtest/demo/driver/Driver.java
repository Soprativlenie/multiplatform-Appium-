package com.multiplatformtest.demo.driver;/* Created by user on 28.10.20 */

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

@Component("driver")
public class Driver {

    @Value("${platform}")
    private PlatformType platformType;

    @Autowired
    private Capability capability;

    @Value("${appium.url}")
    private URL appiumUrl;


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
        capabilities.setCapability(MobileCapabilityType.APP, capability.getApp());
        capabilities.setCapability(MobileCapabilityType.AUTO_ACCEPT_ALERTS, true);
        capabilities.setCapability(MobileCapabilityType.UDID, capability.getUdid());
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        return capabilities;
    }
    public boolean isIosDriverInstalled(){
        return platformType == PlatformType.IOS;
    }
    public boolean isAndroidDriverInstalled(){
        return platformType == PlatformType.ANDROID;
    }
}
