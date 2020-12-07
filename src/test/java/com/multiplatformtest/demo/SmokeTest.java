package com.multiplatformtest.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest extends TestBase {

    @Test
    public void should_ShowErrorMessageOnTheEmptyEmailAndPasswordField_When_UserHasNotFilledTheFieldsAndTapLogInButton() {
        previewPage.tapTheLogInButton();
        loginPage.tapLoginInButton();
        Assert.assertTrue(loginPage.isEmailErrorMessageDisplayed() && loginPage.isPasswordErrorMessageDisplayed());
    }

    @Test
    public void should_ShowErrorMessageOnTheEmailField_When_UserHasNotFilledTheEmailFieldAndTapLogInButton() {
        String password = "Zaqwsx21.";
        previewPage.tapTheLogInButton();
        loginPage.fillPasswordInput(password)
                .tapLoginInButton();
        Assert.assertTrue(loginPage.isEmailErrorMessageDisplayed());
    }

    @Test
    public void should_ShowErrorMessageOnThePasswordField_When_UserHasNotFilledPasswordFieldAndTapLogInButton() {
        String email = "test@email.io";
        previewPage.tapTheLogInButton();
        loginPage.fillEmailInput(email)
                .tapLoginInButton();
        Assert.assertTrue(loginPage.isPasswordErrorMessageDisplayed());
    }

    @Test
    public void should_TakeBackAUserToPreviewScreen_When_UserTapsTheBackButtonOnTheLogInScreen() {
        previewPage.tapTheLogInButton();
        loginPage.tapBackButton();
        Assert.assertTrue(previewPage.isPreviewScreen());
    }

    @Test
    public void should_ShowPassword_When_UserTapsTheShowPasswordButton() {
        String password = "Zaqwsx21.";
        previewPage.tapTheLogInButton();
        loginPage.fillPasswordInput(password)
                .tapTogglePasswordButton();
        Assert.assertEquals(loginPage.getPassword(), password);
    }

    @Test
    public void should_ShowAlertMessage_When_UserEntersNonRegisteredCredentialsOnTheLoginScreen() {
        previewPage.tapTheLogInButton();
        String email = "unknown@fyioemail.io";
        String password = "Zaqwsx21.";
        loginPage.fillEmailInput(email)
                .fillPasswordInput(password)
                .tapLoginInButton();
        Assert.assertTrue(loginPage.isInvalidLoginAlertMessageDisplayed());
    }

    @Test
    public void should_TransferUserToResetPasswordScreen_When_UserTapsTheForgotPasswordLink() {
        previewPage.tapTheLogInButton();
        loginPage.tapForgotPasswordButton();
        Assert.assertTrue(resetPasswordPage.isResetPasswordScreen());
    }

    @Test
    public void should_TakeBackUserToLoginScreen_When_UserTapsBackButtonOnTheResetPasswordScreen() {
        previewPage.tapTheLogInButton();
        loginPage.tapForgotPasswordButton();
        resetPasswordPage.tapBackButton();
        Assert.assertTrue(loginPage.isLogInScreen());
    }

    @Test
    public void should_ShowErrorMessageOnTheEmptyEmailField_When_UserHasNotFilledTheEmailFieldAndTapConfirmButton() {
        previewPage.tapTheLogInButton();
        loginPage.tapForgotPasswordButton();
        resetPasswordPage.fillEmailInput("");
        resetPasswordPage.tapConfirmButton();
        Assert.assertTrue(resetPasswordPage.isEmailErrorMessageDisplayed());
    }

    @Test
    public void should_ShowInvalidAlertMessage_When_UserResetPasswordOfNonExistAccount() {
        previewPage.tapTheLogInButton();
        loginPage.tapForgotPasswordButton();
        String email = "unknown@fyioemail.com";
        resetPasswordPage.fillEmailInput(email)
                .tapConfirmButton();
        Assert.assertTrue(resetPasswordPage.isInvalidAlertMessageDisplayed());
    }

    @Test
    public void should_LogIn_When_UserEntersValidCredentialAndTapsTheLogInButton() {
        previewPage.tapTheLogInButton();
        String email = "devs@jelvix.com";
        String pass = "Qwerty_123";
        loginPage.fillEmailInput(email)
                .fillEmailInput(pass)
                .tapLoginInButton();
    }


}
