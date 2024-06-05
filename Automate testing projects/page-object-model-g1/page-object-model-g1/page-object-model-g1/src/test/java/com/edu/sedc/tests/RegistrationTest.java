package com.edu.sedc.tests;

import com.edu.sedc.pages.LoginPage;
import com.edu.sedc.pages.RegistrationPage;
import com.edu.sedc.utils.DataForElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test
    public void clickNewUserButtonFromLoginTest() {
        LoginPage lp = new LoginPage(driver, wait); //navigate to login page
        WebElement element = driver.findElement(By.id("login"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        RegistrationPage registrationPage = new RegistrationPage(driver, wait);
        registrationPage.clickNewUserButtonFromLogin();
    }

    @Test
    public void verifyTitleOnRegistrationPageIsVisibleTest() {
        RegistrationPage registrationPage = new RegistrationPage(driver, wait);
        registrationPage.verifyTitleOnRegistrationPageIsVisible();
    }

    @Test
    public void RegisterUser() {
        LoginPage lp = new LoginPage(driver, wait);// prvo se otvara login toa e base URL
        WebElement element = driver.findElement(By.id("login"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);//SCROLA
        RegistrationPage registrationPage = new RegistrationPage(driver, wait); //ja otvara registration page

        registrationPage.clickNewUserButtonFromLogin(); // od login klika na newUser
        registrationPage.EnterFirstName("SSSS");
        registrationPage.EnterLastName("SSSS");
        registrationPage.EnterUserName("SSSS");
        registrationPage.EnterPassword("Sanja!@123..");
        registrationPage.clickReCaptcha();
        registrationPage.clickRegisterButton();
    }


//    @Test(dataProvider = "data-for-register", dataProviderClass = DataForElements.class)
//    public void testRegisterDataProvider(String FirstName, String lastName, String userNameRegistration, String PassRegister) {
//        RegistrationPage registrationPage = new RegistrationPage(driver, wait);
//
//        registrationPage.clickNewUserButtonFromLogin();
//        registrationPage.EnterFirstName(FirstName);
//        registrationPage.EnterLastName(lastName);
//        registrationPage.EnterUserName(userNameRegistration);
//        registrationPage.EnterPassword(PassRegister);
//        registrationPage.clickReCaptcha();
//        registrationPage.clickRegisterButton();
//    }
}
