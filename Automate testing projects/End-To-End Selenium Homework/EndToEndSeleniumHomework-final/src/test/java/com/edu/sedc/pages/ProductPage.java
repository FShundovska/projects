package com.edu.sedc.pages;

import com.edu.sedc.test.BaseTestEndToEnd;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BaseTestEndToEnd {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;


    private final By addBackPackToCart = By.id("item_4_title_link");
    private final By addTShirtToCart = By.id("item_4_title_link");
    private final By addJacketToCart = By.id("item_5_title_link");
    private final By clickCartButton = By.id("shopping_cart_container");


    // Constructor to initialize the WebDriver
    public ProductPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToProductUrl() {
        String productUrl = "https://www.saucedemo.com/inventory.html";
        driver.navigate().to(productUrl);
    }

    // Add a product to the cart - Locate the product by its name and click the "Add to Cart" button
    public void addToCart(String productName) {
        driver.findElement(By.xpath("//div[text()='" + productName + "']/following-sibling::button")).click();
    }

    public void addBackPackToCart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    public void addTShirtToCart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
    }

    public void addJacketToCart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
    }

    public void clickCartButton() {
        driver.findElement(By.id("shopping_cart_container")).click();
    }


    // Navigate to the cart -  Locate the cart icon and click it
    public void navigateToCart() {
        driver.findElement(By.id("shopping_cart_container")).click();
    }

}
