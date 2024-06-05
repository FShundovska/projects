package com.edu.sedc.pages;

import com.edu.sedc.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage extends BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;

    // Locators
    public By shippingAddressText = By.xpath(" //*[@data-role='title']");
    public By firstNameInput = By.id("first-name");
    public By lastNameInput = By.id("last-name");
    public By zipPostalCodeInput = By.id("postal-code");
    public By clickContinueButton = By.id("continue");
    public By checkOutStepShipping = By.id("checkout-step-shipping");
    public String checkOutUrl = "https://magento.softwaretestingboard.com/checkout/";

    // Constructor to initialize the WebDriver
    public CheckOutPage (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.js = (JavascriptExecutor) driver;
    }

    // Method to enter checkout information
    public void navigateToSignInUrl () {
        driver.navigate().to(checkOutUrl);
    }
    public String getTextFromShippingAddressHeader() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(shippingAddressText)).getText();
    }
    public void enterFirstName(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
    }
    public void enterZipCode(String zipCode) {
        driver.findElement(zipPostalCodeInput).sendKeys(zipCode);
    }
    public void clickContinue () {
        driver.findElement(clickContinueButton).click();
    }

    public void navigateToCheckOutUrl () {
        driver.navigate().to("https://magento.softwaretestingboard.com/checkout/#shipping");
    }
    public String getFirstName () {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInput)).getAttribute("value");
    }
    public String getLastName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameInput)).getAttribute("value");
    }
    public String getZipCode() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(zipPostalCodeInput)).getAttribute("value");
    }
    public void clickFinishButton() {driver.findElement(By.id("finish")).click();}

}


