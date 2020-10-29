package com.multiplatformtest.demo;

import org.testng.annotations.Test;

public class SmokeTest extends TestBase {

    @Test
    public void should_ClickTheLoginButton_When_UserClicksOnIt() {
        previewPage.tapTheLogInButton();
    }

    @Test
    public void should_ClickTheSignUpButton_When_UserClicksOnIt() {
        previewPage.tapTheSignUpButton();
    }

}
