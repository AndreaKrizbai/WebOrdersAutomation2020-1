package com.weborders.tests;

import com.weborders.pages.LoginPage;

import static org.testng.Assert.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SmokeTest extends AbstractBaseTest {

    @Test(dataProvider = "smokeTestData")
    public void smokeTest(String component, String expectedPageSubTitle) {
        extentTest = extentReports.createTest("Verify " + component);

        LoginPage loginPage = new LoginPage();
        loginPage.login();
        loginPage.navigateTo(component);
        assertEquals(loginPage.getPageSubtitleText(), expectedPageSubTitle);

        extentTest.pass(component + " verified!");
    }

<<<<<<< HEAD
    @DataProvider(parallel = true)
=======
    @DataProvider
>>>>>>> 185e3a7c5f52bdbdba0c89af3d934813a28a894f
    public Object[][] smokeTestData() {
        return new Object[][]{
                {"View all orders", "List of All Orders"},
                {"View all products", "List of Products"},
                {"Order", "Order"}
        };
    }
}
