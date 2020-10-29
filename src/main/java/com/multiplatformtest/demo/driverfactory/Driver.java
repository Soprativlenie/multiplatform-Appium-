package com.multiplatformtest.demo.driverfactory;/* Created by user on 28.10.20 */

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public interface Driver {
    AppiumDriver setupDriver() throws MalformedURLException;
}
