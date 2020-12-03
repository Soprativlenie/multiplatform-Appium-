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


}
