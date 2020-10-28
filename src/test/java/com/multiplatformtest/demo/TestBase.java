package com.multiplatformtest.demo;

import com.multiplatformtest.demo.driverfactory.Driver;
import com.multiplatformtest.demo.driverfactory.DriverFactory;
import com.multiplatformtest.demo.driverfactory.PlatformType;
import com.multiplatformtest.demo.page.AbstractLoginPage;
import com.multiplatformtest.demo.page.android.AndroidLoginPage;
import com.multiplatformtest.demo.page.ios.IosLoginPage;
import io.appium.java_client.AppiumDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;

@SpringBootTest
class TestBase extends AbstractTestNGSpringContextTests {

    @Value("${platform}")
    private PlatformType platformType;

    private AppiumDriver appiumDriver;
    private DriverFactory driverFactory;
    private Driver driver;
    protected AbstractLoginPage loginPage;

    @BeforeClass
    public void setup() throws MalformedURLException {
        driverFactory = new DriverFactory();
        driver = driverFactory.getDriver(platformType);
        appiumDriver = driver.setupDriver();
        loginPage = driverFactory.
				isAndroidPlatform(platformType) ? new AndroidLoginPage(appiumDriver) : new IosLoginPage(appiumDriver);
    }

}
