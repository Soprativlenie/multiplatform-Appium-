package com.multiplatformtest.demo.driverfactory;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public interface Driver {
    AppiumDriver setupDriver();
}
