package com.edu.sedc.pages;

import com.edu.sedc.test.BaseTestEndToEnd;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BaseTestEndToEnd {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;

    // Locators
    private final By productName = By.className("inventory_item_name");
    private final By checkoutButton = By.id("checkout");
    private final By checkCartLink = By.linkText("i18n: 'View and Edit Cart'");

    // Constructor to initialize the WebDriver
    public CartPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.js = (JavascriptExecutor) driver;
    }

    // Method to navigate to the cart page
    public void navigateToCart() {
        driver.navigate().to("https://www.saucedemo.com/cart.html");
    }

    // Method to get product name
    public String getProductName() {
        return driver.findElement(productName).getText();
    }

    // Method to check if cart is displayed
    public boolean isCartDisplayed() {
        return !driver.findElements(checkCartLink).isEmpty();
    }

    // Method to click on the checkout button
    public void clickCheckoutButton() {
        driver.findElement(checkoutButton).click();
    }
}