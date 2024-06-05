package com.edu.sedc.pages;

import com.edu.sedc.test.BaseTestEndToEnd;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage extends BaseTestEndToEnd {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;

    // Locators
    private By firstNameInput = By.id("first-name");
    private By lastNameInput = By.id("last-name");
    private By zipPostalCodeInput = By.id("postal-code");
    private By continueButton = By.className("cart_button");

    // Constructor to initialize the WebDriver
    public CheckOutPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.js = (JavascriptExecutor) driver;
    }

    // Method to enter checkout information
    public void enterFirstName(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void enterZipCode(String zipCode) {
        driver.findElement(zipPostalCodeInput).sendKeys(zipCode);
    }

    // Methods to get entered checkout information
    public String getFirstName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInput)).getAttribute("value");
    }

    public String getLastName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameInput)).getAttribute("value");
    }

    public String getZipCode() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(zipPostalCodeInput)).getAttribute("value");
    }
}

