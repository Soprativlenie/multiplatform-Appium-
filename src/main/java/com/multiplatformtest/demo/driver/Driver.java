package com.multiplatformtest.demo.driver;/* Created by user on 28.10.20 */

import com.multiplatformtest.demo.config.Capability;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
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
                ? new AndroidDriver(appiumUrl, capability.getCapabilities())
                : new IOSDriver(appiumUrl, capability.getCapabilities());
    }

}
