package com.edu.sedc.tests;

import com.edu.sedc.utils.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "data-for-login", dataProviderClass = Data.class)
    public void testLoginPage(String userName, String password) {
        loginPage.navigateToLoginPage();
        loginPage.userNameInput(userName);
        loginPage.passwordInput(password);
        js.executeScript("window.scrollBy(0, 500)", "");
        loginPage.loginButtonClick();

        WebElement iframe = driver.findElement(By.tagName("iframe"));
        new Actions(driver).scrollToElement(iframe).perform();

        Assert.assertEquals(loginPage.getErrorMessage(), "Invalid username or password!");


    }
}









