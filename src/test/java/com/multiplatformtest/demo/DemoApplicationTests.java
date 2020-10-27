package com.multiplatformtest.demo;

import com.multiplatformtest.demo.enums.Platform;
import com.multiplatformtest.demo.page.AbstractLoginPage;
import com.multiplatformtest.demo.page.AndroidLoginPage;
import com.multiplatformtest.demo.page.IosLoginPage;
import io.appium.java_client.AppiumDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;

import javax.inject.Named;

@SpringBootTest
class DemoApplicationTests extends AbstractTestNGSpringContextTests {

	@Named(value = "platform")
	Platform platform;

	private AppiumDriver driver;
	protected AbstractLoginPage loginPage;

	@BeforeClass
	public void setup() {
		driver = platform.getDriver();//implement DriverFactory.getDriver(platform)
		loginPage = platform.isAndroidPlatform() ? new AndroidLoginPage(driver) : new IosLoginPage(driver);
	}

}
