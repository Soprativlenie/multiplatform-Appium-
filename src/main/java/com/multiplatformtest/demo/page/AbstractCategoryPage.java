package com.multiplatformtest.demo.page;/* Created by user on 08.12.20 */

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public abstract class AbstractCategoryPage extends Page {

    public AbstractCategoryPage(AppiumDriver driver) {
        super(driver);
    }

    public void swipeUp() {
        final int PRESS_TIME = 200; //ms
        final int ANIMATION_TIME = 200; //ms
        Dimension size = driver.manage().window().getSize();
        int centerByX = size.width / 2;
        int topByY = (int) (size.height * 0.7);
        int BottomByY = (int) (size.height * 0.3);

        WaitOptions options = new WaitOptions();

        try {

            new TouchAction(driver).press(PointOption.point(centerByX, topByY))
                    .waitAction(options.withDuration(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(PointOption.point(centerByX, BottomByY)).release().perform();
        } catch (Exception ex) {
            System.err.println("swipeUp(): TouchAction FAILED" + ex.getMessage());
        }

//        waitForElementBecomesVisible(getFacebookButton());
//        try {
//            Thread.sleep(ANIMATION_TIME);
//        } catch (InterruptedException e) {
//            // ignore
//        }
    }
}
