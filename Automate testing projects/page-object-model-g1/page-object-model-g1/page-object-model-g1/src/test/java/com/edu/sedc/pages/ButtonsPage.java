package com.edu.sedc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    public By doubleClickButton = By.id("doubleClickBtn");
    public By rightClickButton = By.id("rightClickBtn");


    public ButtonsPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    public void navigateToButtonsPage(){
        driver.navigate().to("https://demoqa.com/buttons");
    }
    public void clickDoubleButton(){
        Actions actions = new Actions(driver);
        WebElement doubleClickBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(doubleClickButton));
        actions.moveToElement(doubleClickBtn).doubleClick().build().perform();
    }

    public void clickContextClick(){
        Actions actions = new Actions(driver);
        WebElement contextClickButton = wait.until(ExpectedConditions.visibilityOfElementLocated(rightClickButton));
        actions.moveToElement(contextClickButton).doubleClick().build().perform();
    }
}
