package com.edu.sedc.tests;

import com.edu.sedc.pages.LoginPage;
import com.edu.sedc.pages.TextBoxPage;
import com.edu.sedc.utils.DataForElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;




public class LoginTest extends BaseTest{

    @Test
    public void VerifyTitle() {
        LoginPage lp = new LoginPage(driver, wait);
        lp.verifyTitle();
    }
    @Test
    public void LoginTest(){
        LoginPage lp = new LoginPage(driver, wait);
        WebElement element = driver.findElement(By.id("login"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        lp.userName("John1 Doe1");
        lp.Password("P@ssw0rd");
        lp.LoginSuccess();
    }

    @Test(dataProvider = "data-for-login", dataProviderClass = DataForElements.class)
    public void testLoginDataProvider(String username, String password) {
        LoginPage lp = new LoginPage(driver, wait);
        lp.userName(username);
        lp.Password(password);
        lp.LoginSuccess();

    }
}
