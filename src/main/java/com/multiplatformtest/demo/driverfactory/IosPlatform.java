package com.multiplatformtest.demo.driverfactory;/* Created by user on 28.10.20 */

import com.multiplatformtest.demo.model.MobileCapabilityType;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IosPlatform implements Driver {

    private static final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";

    @Override
    public AppiumDriver setupDriver() throws MalformedURLException {
        return new IOSDriver(new URL(APPIUM_URL), getIosCapabilities());
    }

    private DesiredCapabilities getIosCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Jelvix's iPad");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.4");
        capabilities.setCapability(MobileCapabilityType.APP, "/home/user/Downloads/app-devServer-debug.apk");
        return capabilities;
    }
}
