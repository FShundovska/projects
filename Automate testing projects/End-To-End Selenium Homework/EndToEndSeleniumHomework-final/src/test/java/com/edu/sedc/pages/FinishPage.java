package com.edu.sedc.pages;

import com.edu.sedc.test.BaseTestEndToEnd;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FinishPage extends BaseTestEndToEnd {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;

    By finishBtn = By.id("finish");

    public FinishPage (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    // Method to click on the finish button
    public void clickFinishButton() {
        driver.findElement(By.className("cart_button")).click();
    }

    // Method to finish the checkout process
    public void finishCheckout() {
        // Assuming there is some additional logic here to complete the checkout process
        // This method can be expanded to perform any necessary actions after clicking the finish button
    }

    public void clickFinishBtn () {
        wait.until(ExpectedConditions.visibilityOfElementLocated(finishBtn)).click();
    }

}
