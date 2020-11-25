package com.multiplatformtest.demo;

import com.multiplatformtest.demo.driver.Driver;
import com.multiplatformtest.demo.driver.PlatformType;
import com.multiplatformtest.demo.page.AbstractLoginPage;
import com.multiplatformtest.demo.page.AbstractPreviewPage;
import com.multiplatformtest.demo.page.AbstractSignUpPage;
import com.multiplatformtest.demo.page.android.AndroidLoginPage;
import com.multiplatformtest.demo.page.android.AndroidPreviewPage;
import com.multiplatformtest.demo.page.ios.IosLoginPage;
import com.multiplatformtest.demo.page.ios.IosPreviewPage;
import io.appium.java_client.AppiumDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

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

    @BeforeClass
    public void setup() throws MalformedURLException {


        appiumDriver = driver.setupDriver();

        previewPage = platformType == PlatformType.ANDROID ? new AndroidPreviewPage(appiumDriver) : new IosPreviewPage(appiumDriver);
        loginPage = platformType == PlatformType.ANDROID ? new AndroidLoginPage(appiumDriver) : new IosLoginPage(appiumDriver);
//
//        previewPage = driverFactory.
//                isAndroidPlatform(platformType) ? new AndroidPreviewPage(appiumDriver) : new IosPreviewPage(appiumDriver);
//
//        signUpPage = driverFactory.
//                isAndroidPlatform(platformType) ? new AndroidSignUpPage(appiumDriver) : new IosSignUpPage(appiumDriver);
    }

    @AfterClass
    public void tearDown() {
        appiumDriver.quit();
    }

}
