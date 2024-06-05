package com.edu.sedc.pages;

import com.edu.sedc.test.BaseTestEndToEnd;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThankYouPage extends BaseTestEndToEnd {
    WebDriver driver;
    WebDriverWait wait;


    public ThankYouPage (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public boolean isOrderPlaced() {
        return driver.findElement(By.tagName("complete-header")).isDisplayed();
    }
    public boolean isThankYouTextDisplayed() {
        return wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h2"), "Thank you for your order!"));
    }
    public String getThankYouMsg () {
        return driver.findElement(By.className("complete-header")).getText();
    }
}
