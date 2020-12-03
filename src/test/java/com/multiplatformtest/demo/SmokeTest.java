package com.multiplatformtest.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest extends TestBase {


    @Test()
    public void should_ReturnUserToPreviewScreen_When_UserTapOnTheBacKButtonOnTheLoginScreen() {

        previewPage.tapTheLogInButton();
        loginPage.fillEmailInput("bla@bla.com");
        loginPage.fillPasswordInput("Zaqwsx21.");
        System.out.println(loginPage.getText());
//        loginPage.fillEmailInput("testig@mailinator.com");
//        loginPage.tapBackButton();

    }

    @Test(enabled = false, description = "")
    public void should_RegisterUser_When_TheUserFillFormAndTapTheSignUpButton() {
        previewPage.tapTheSignUpButton();
        signUpPage
                .enterName("Igor")
                .enterLastName("Gabelya")
                .enterEmail(signUpPage.getRandomEmail())
                .tapDateInput()
                .tapOkButtonOnTheDatePicker()
                .tapOkButtonOnThePasswordAlert()
                .enterPassword("Zaqwsx21.")
                .enterConfirmPassword("Zaqwsx21.")
                .tapSingUpButton();
//        Assert.assertTrue(verificationPage.isThisVerificationScreen());
    }

    @Test(enabled = false)
    public void should_showErrorMessage_When_UserLeavesTheFirstNameFieldEmpty() {
        previewPage.tapTheSignUpButton();
        signUpPage
                .enterLastName("Bla")
                .enterEmail("poqw@mailinator.com")
                .tapDateInput()
                .tapOkButtonOnTheDatePicker()
                .tapOkButtonOnThePasswordAlert()
                .enterPassword("Zaqwsx21.")
                .enterConfirmPassword("Zaqwsx21.")
                .tapSingUpButton();
        Assert.assertTrue(signUpPage.isFirstNameErrorMessageDisplayed());
    }

    @Test
    public void should_VerifyThatPasswordAlertIsDisplayed_When_UserTapThePasswordField() {
        previewPage.tapTheSignUpButton();
        signUpPage
                .tapPasswordInput();
        Assert.assertTrue(signUpPage.isPasswordAlertDisplayed());
    }

    @Test
    public void should_ShowTheErrorMessage_When_UserLeavesTheLastNameInputEmpty() {
        previewPage.tapTheSignUpButton();
        signUpPage
                .enterName("Igor")
                .enterEmail("poqw@mailinator.com")
                .tapDateInput()
                .tapOkButtonOnTheDatePicker()
                .tapOkButtonOnThePasswordAlert()
                .enterPassword("Zaqwsx21.")
                .enterConfirmPassword("Zaqwsx21.")
                .tapSingUpButton();
        Assert.assertTrue(signUpPage.isLastNameErrorMessageDisplayed());
    }

    @Test
    public void should_ShowTheDatePicker_When_UserTapsTheDateOfBirthInput() {
        previewPage.tapTheSignUpButton();
        signUpPage
                .tapDateInput();
        Assert.assertTrue(signUpPage.isDateAlertDisplayed());
    }

    @Test
    public void should_ShowErrorMessage_When_UserDifferentPasswordToThePasswordFields() {
        previewPage.tapTheSignUpButton();
        signUpPage
                .enterName("Igor")
                .enterLastName("Gabelya")
                .enterEmail("poqw@mailinator.com")
                .tapDateInput()
                .tapOkButtonOnTheDatePicker()
                .tapOkButtonOnThePasswordAlert()
                .enterPassword("Zaqwsx21.")
                .enterConfirmPassword("Zaqwsx21.1")
                .tapSingUpButton();
        Assert.assertTrue(signUpPage.isConfirmPasswordErrorMessageDisplayed());
    }

    @Test
    public void should_ShowThePassword_When_UserTapsTheHidePasswordButton() {
        String password = "Zaqwsx21.";
        previewPage.tapTheSignUpButton();
        signUpPage
                .tapPasswordInput()
                .tapOkButtonOnThePasswordAlert()
                .enterPassword(password)
                .tapHideButtonOnThePasswordInput();
        Assert.assertEquals(password, signUpPage.getPassword());
    }

    @Test
    public void should_ShowTheConfirmPassword_When_UserTapsTheHideButton() {
        String password = "Zaqwsx21.";
        previewPage.tapTheSignUpButton();
        signUpPage
                .tapConfirmPasswordInput()
//                .tapOkButtonOnThePasswordAlert()
                .enterConfirmPassword(password)
                .tapHideButtonOnTheConfirmPasswordInput();
        Assert.assertEquals(password, signUpPage.getConfirmPassword());
    }

    @Test
    public void should_HideThePassword_When_HideButtonIsEnabledOnTheSignUpScreen() {
        String password = "Zaqwsx21.";
        previewPage.tapTheSignUpButton();
        signUpPage
                .tapPasswordInput()
                .tapOkButtonOnThePasswordAlert()
                .enterPassword(password)
                .tapHideButtonOnThePasswordInput()
                .tapHideButtonOnThePasswordInput();
        Assert.assertNotEquals(password, signUpPage.getPassword());
    }

    @Test
    public void should_HideTheConfirmPassword_When_HideButtonIsEnabledOnTheSignUpScreen() {
        String password = "Zaqwsx21.";
        previewPage.tapTheSignUpButton();
        signUpPage
                .tapConfirmPasswordInput()
                .enterConfirmPassword(password)
                .tapHideButtonOnTheConfirmPasswordInput()
                .tapHideButtonOnTheConfirmPasswordInput();
        Assert.assertNotEquals(password, signUpPage.getConfirmPassword());
    }

}
