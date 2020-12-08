package com.multiplatformtest.demo;

import com.multiplatformtest.demo.driver.Driver;
import com.multiplatformtest.demo.driver.PlatformType;
import com.multiplatformtest.demo.page.*;
import com.multiplatformtest.demo.page.android.*;
import com.multiplatformtest.demo.page.ios.*;
import io.appium.java_client.AppiumDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;

import java.net.MalformedURLException;

@SpringBootTest
class TestBase extends AbstractTestNGSpringContextTests {

    @Value("${platform}")
    private PlatformType platformType;

    private AppiumDriver appiumDriver;

    @Autowired
    @Qualifier("driver")
    private Driver driver;
    protected AbstractLoginPage loginPage;
    protected AbstractPreviewPage previewPage;
    protected AbstractSignUpPage signUpPage;
    protected AbstractResetPasswordPage resetPasswordPage;
    protected AbstractNavigationTabBar navigationTabBar;
    protected AbstractSettingsPage settingsPage;

    @BeforeClass
    public void setup() throws MalformedURLException {
        appiumDriver = driver.setupDriver();

        previewPage = platformType == PlatformType.ANDROID ? new AndroidPreviewPage(appiumDriver) : new IosPreviewPage(appiumDriver);
        loginPage = platformType == PlatformType.ANDROID ? new AndroidLoginPage(appiumDriver) : new IosLoginPage(appiumDriver);
        resetPasswordPage = platformType == PlatformType.ANDROID ? new AndroidResetPasswordPage(appiumDriver) : new IosResetPasswordPage(appiumDriver);
        navigationTabBar = platformType == PlatformType.ANDROID ? new AndroidNavigationTabBar(appiumDriver) : new IosNavigationTabBar(appiumDriver);
        settingsPage = platformType == PlatformType.ANDROID ? new AndroidSettingsPage(appiumDriver) : new IosSettingsPage(appiumDriver);

    }

    @BeforeMethod
    public void launchApp() {
        appiumDriver.launchApp();
    }

    @AfterMethod
    public void closeApp() {
        appiumDriver.closeApp();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            appiumDriver.quit();
        }
    }

}
