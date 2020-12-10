package com.multiplatformtest.demo.page;/* Created by user on 29.10.20 */

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.HashMap;

public abstract class AbstractSignUpPage extends Page {
    public AbstractSignUpPage(AppiumDriver driver) {
        super(driver);
    }

    protected abstract WebElement firstNameInput();

    protected abstract WebElement lastNameInput();

    protected abstract WebElement emailInput();

    protected abstract WebElement dateOfBirthInput();

    protected abstract WebElement passwordInput();

    protected abstract WebElement confirmPasswordInput();

    protected abstract WebElement signUpButton();

    protected abstract WebElement receiveNewsLetterCheckbox();

    protected abstract WebElement passwordCheckbox();

    protected abstract WebElement confirmPasswordCheckbox();

    protected abstract WebElement backButton();

    protected abstract WebElement signUpTextView();

    protected abstract WebElement datePicker();

    protected abstract WebElement datePickerOkButton();

    protected abstract WebElement passwordAlert();

    protected abstract WebElement okButtonOnThePasswordAlert();

    protected abstract WebElement firstNameErrorMessage();

    protected abstract WebElement lastNameErrorMessage();

    protected abstract WebElement emailErrorMessage();

    protected abstract WebElement dateOfBirthErrorMessage();

    protected abstract WebElement passwordErrorMessage();

    protected abstract WebElement confirmPasswordErrorMessage();

    protected abstract WebElement privacyLink();

    protected abstract WebElement closeButtonOnTheWebView();

    public AbstractSignUpPage enterName(String name) {
        firstNameInput().sendKeys(name);
        return this;
    }

    public AbstractSignUpPage enterLastName(String lastName) {
        lastNameInput().sendKeys(lastName);
        return this;
    }

    public AbstractSignUpPage enterEmail(String email) {
        emailInput().sendKeys(email);
        return this;
    }

    public AbstractSignUpPage enterPassword(String password) {
        passwordInput().sendKeys(password);
        return this;
    }

    public AbstractSignUpPage enterConfirmPassword(String confirmPassword) {
        confirmPasswordInput().sendKeys(confirmPassword);
        return this;
    }

    public AbstractSignUpPage checkTheReceiveNewsLetterCheckbox() {
        receiveNewsLetterCheckbox().click();
        return this;
    }

    public AbstractSignUpPage tapDateInput() {
        dateOfBirthInput().click();
        return this;
    }

    public AbstractSignUpPage tapPasswordInput() {
        passwordInput().click();
        return this;
    }

    public AbstractSignUpPage tapOkButtonOnThePasswordAlert() {
        wait.withMessage("Password alert isn't displayed").until(ExpectedConditions.visibilityOf(passwordAlert()));
        okButtonOnThePasswordAlert().click();
        return this;
    }

    public AbstractSignUpPage tapOkButtonOnTheDatePicker() {
        wait.withMessage("Date picker isn't displayed").until(ExpectedConditions.visibilityOf(datePicker()));
        datePickerOkButton().click();
        return this;
    }

    public AbstractSignUpPage tapConfirmPasswordInput() {
        confirmPasswordInput().click();
        return this;
    }


    public void tapSingUpButton() {
//       action.moveTo(new PointOption().withCoordinates(607,1885)).perform();
        driver.hideKeyboard();
        signUpButton().click();
    }

    public boolean isFirstNameErrorMessageDisplayed() {
        return firstNameErrorMessage().isDisplayed();
    }

    public boolean isLastNameErrorMessageDisplayed() {
        return lastNameErrorMessage().isDisplayed();
    }

    public boolean isEmailErrorMessageDisplayed() {
        return emailErrorMessage().isDisplayed();
    }

    public boolean isDateOfBirthErrorMessageDisplayed() {
        return dateOfBirthErrorMessage().isDisplayed();
    }

    public boolean isDateAlertDisplayed() {
        return datePicker().isDisplayed();
    }

    public boolean isPasswordErrorMessageDisplayed() {
        return passwordErrorMessage().isDisplayed();
    }

    public boolean isConfirmPasswordErrorMessageDisplayed() {
        return confirmPasswordErrorMessage().isDisplayed();
    }

    public boolean isPasswordAlertDisplayed() {
        return wait.withMessage("Password alert isn't displayed").until(ExpectedConditions.visibilityOf(passwordAlert()))
                .isDisplayed();
    }

    public String getPassword() {
        return passwordInput().getText();
    }

    public AbstractSignUpPage tapHideButtonOnThePasswordInput() {
        passwordCheckbox().click();
        return this;
    }

    public AbstractSignUpPage tapHideButtonOnTheConfirmPasswordInput() {
        confirmPasswordCheckbox().click();
        return this;
    }

    public String getConfirmPassword() {
        return confirmPasswordInput().getText();
    }

    public String getRandomEmail() {
        String alphaNumericString = "abcdefghijklmnopqrstuvwxyz0123456789";
        String domain = "test@mailinator.com";
        StringBuilder builder = new StringBuilder();
        int emailLength = (int) (1 + Math.random() * 60);
        while (emailLength-- != 0) {
            int character = (int) (Math.random() * alphaNumericString.length());
            builder.append(alphaNumericString.charAt(character));
        }
        return builder.append(domain).toString();

    }

    public void swipeUp() {
        Dimension size = driver.manage().window().getSize();
        int centerByX = size.width / 2;
        int topByY = (int) (size.height * 0.8);
        int BottomByY = (int) (size.height * 0.2);

        WaitOptions options = new WaitOptions();

        try {
            action.press(PointOption.point(centerByX, topByY)).waitAction(options.withDuration(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(centerByX, BottomByY)).release().perform();
        } catch (Exception ex) {
            System.err.println("swipeUp(): TouchAction FAILED" + ex.getMessage());
        }

    }

    public void scroll() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            HashMap<String, String> scrollObject = new HashMap<>();
            scrollObject.put("direction", "up");
            js.executeScript("mobile:scroll", scrollObject);
            System.out.println("Swipe up was Successfully done.");
        } catch (Exception e) {
            System.out.println("swipe up was not successfully");
        }
    }

    public void appiumSwipe(String direction) {
        System.out.println("swipeScreen(): direction: '" + direction + "'"); // log actions

        final int ANIMATION_TIME = 200; //ms
        final int PRESS_TIME = 200; //ms

        int edgeBorder = 10; //avoid edges
        PointOption pointOptionStart;
        PointOption pointOptionEnd;

        Dimension dimension = driver.manage().window().getSize(); //getting screen size

        pointOptionStart = PointOption.point(dimension.width / 2, dimension.height / 2); //center of the screen

        switch (direction) {
            case "DOWN": //center of footer
                pointOptionEnd = PointOption.point(dimension.width / 2, dimension.height / 2 - edgeBorder);
                break;
            case "UP": //center of header
                pointOptionEnd = PointOption.point(dimension.width / 2, edgeBorder);
                break;
            default:
                throw new IllegalArgumentException("swipeScreen(): dir: '" + direction + "' NOT supported");
        }

        //swipe using TouchAction
        try {
            new TouchAction(driver)
                    .press(pointOptionStart)
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception ex) {
            System.err.println("swipeScreen(): TouchAction FAILED" + ex.getMessage());
            return;
        }
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            // ignore
        }
    }
}

