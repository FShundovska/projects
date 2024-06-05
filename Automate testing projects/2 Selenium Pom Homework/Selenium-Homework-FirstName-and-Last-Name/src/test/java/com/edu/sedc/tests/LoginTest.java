package com.edu.sedc.tests;

import com.edu.sedc.utils.DataForLogin;
import com.edu.sedc.utils.DataForNewUser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test (dataProvider = "data-for-login", dataProviderClass = DataForLogin.class)
    public void testLoginPage (String userName, String password) {
        loginPage.navigateToLoginPage();
        loginPage.enterUsername(userName);
        loginPage.enterPassword(password);
        js.executeScript("window.scrollBy(0, 500)", "");
        loginPage.clickOnLoginButton();

        Assert.assertEquals(loginPage.getInvalidUsernameOrPasswordMessage(), "Invalid username or password!");
    }
}
