package com.multiplatformtest.demo;

import org.testng.annotations.Test;

@Test
public class SmokeTest extends DemoApplicationTests {

    @Test
    public void testFillEmailInput(){
        loginPage.fillEmailInput("email@em.com");
    }

}
