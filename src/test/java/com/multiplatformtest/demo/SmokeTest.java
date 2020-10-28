package com.multiplatformtest.demo;

import org.testng.annotations.Test;

public class SmokeTest extends TestBase {

    @Test
    public void testFillEmailInput(){
        loginPage.fillEmailInput("email");
    }

}
