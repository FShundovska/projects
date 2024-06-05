package com.edu.sedc.tests;

import com.beust.ah.A;
import com.edu.sedc.utils.DataForNewUser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewUserTest extends BaseTest {

    @Test(dataProvider = "data-for-new-user", dataProviderClass = DataForNewUser.class)
    public void testCreateNewUser (String firstName, String lastName, String userName, String password){
        newUserPage.navigateToLoginPage();
        js.executeScript("window.scrollBy(0, 500)", "");
        newUserPage.clickOnNewUserButton();
        newUserPage.enterFirstNameData(firstName);
        newUserPage.enterLastNameData(lastName);
        newUserPage.enterUserNameData(userName);
        newUserPage.enterPasswordData(password);
        js.executeScript("window.scrollBy(0, 500)", "");
        newUserPage.clickOnRegisterButton();

        js.executeScript("window.scrollBy(0, 500)", "");
        Assert.assertEquals(newUserPage.getPleaseVerifyReCaptchaMessage(), "Please verify reCaptcha to register!");
    }
}
