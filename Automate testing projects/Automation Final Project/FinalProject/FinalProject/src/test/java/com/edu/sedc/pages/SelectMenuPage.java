package com.edu.sedc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectMenuPage {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    public By oldStyleSelect = By.id("BMEMJYM");

    private String selectPageUrl = "https://magento.softwaretestingboard.com/checkout/#shipping";

    // Constructor to initialize the WebDriver
    public SelectMenuPage (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.js = (JavascriptExecutor) driver;
    }
    public void navigateToSelectPage(){
        driver.navigate().to(selectPageUrl);
    }
    public void selectOptionsByText (String text){
        WebElement element = driver.findElement(oldStyleSelect);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }


}
