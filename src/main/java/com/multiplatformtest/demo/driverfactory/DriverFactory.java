package com.multiplatformtest.demo.driverfactory;/* Created by user on 28.10.20 */

import java.net.MalformedURLException;


public class DriverFactory {
    private static final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";

    public  Driver getDriver(PlatformType platform) throws MalformedURLException {
        Driver driver = null;
        switch (platform) {
            case PLATFORM_IOS:
                return new IosPlatform();
            case PLATFORM_ANDROID:
                return new AndroidPlatform();
            default:
                throw new IllegalArgumentException("Wrong platform type " + platform);
        }
    }

    public boolean isAndroidPlatform(PlatformType platformType) {
        return platformType == PlatformType.PLATFORM_ANDROID;
    }

    public boolean isIosPlatform(PlatformType platformType) {
        return platformType == PlatformType.PLATFORM_IOS;
    }
}
