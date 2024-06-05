package com.edu.sedc.pages;

import com.edu.sedc.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

public class SignInPage extends BaseTest {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;


    // Locators for registration form elements
    public By signInLink = By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/a[1]");
    //public By signInMsg = By.xpath("//div[contains(text(),'If you have an account, sign in with your email ad')]");
    public By emailInput = By.id("email");
    public By passwordInput = By.id("pass");
    public By signInButton = By.id("send2");



    // Constructor to initialize the WebDriver
    public SignInPage (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.js = (JavascriptExecutor) driver;
    }

    public void navigateToSignInUrl () {
        String signInUrl = "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/";
        driver.navigate().to(signInUrl);
        assertEquals(signInUrl, driver.getCurrentUrl());
    }
//
//    public String getTextFromSignInMsg() {
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(signInMsg)).getText();
//    }
    public void clickSignInLink() {
        driver.findElement(signInLink).click();
        // No need for assertion, it's an action
    }
    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
        // No need for assertion, it's an action
    }
    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
        // No need for assertion, it's an action
    }
    public void clickSignInButton() {
        driver.findElement(signInButton).click();
        // No need for assertion, it's an action
    }

}