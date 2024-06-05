package com.edu.sedc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectMenuPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private By oldStyleSelect = By.id("oldSelectMenu");
    private String selectPageUrl = "https://demoqa.com/select-menu";
    private By selectOneDropDown = By.id("react-select-3-input");

    private By selectMultiselectDropDown = By.id("react-select-4-input");


    public SelectMenuPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToSelectPage() {
        driver.navigate().to(selectPageUrl);
    }

    public void selectOptionsByText(String text) {
        WebElement element = driver.findElement(oldStyleSelect);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectOptionByValue(String value) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(oldStyleSelect));
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void selectOptionByIndex(int index) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(oldStyleSelect));
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void selectReactDropDown(String text) throws InterruptedException {
        //se raboti za dropDown Select one
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectOneDropDown)).sendKeys(text);
        Thread.sleep(500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectOneDropDown)).sendKeys(Keys.ENTER);
    }

    public void selectMultiselectDropDown(String text) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectMultiselectDropDown)).sendKeys(text);
        Thread.sleep(500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectMultiselectDropDown)).sendKeys(Keys.ENTER);
    }

    public void populateMultiSelectInput(String[] inputs) throws InterruptedException {
        for (int i = 0; i < inputs.length; i++) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(selectMultiselectDropDown)).sendKeys(inputs[i]);
            Thread.sleep(500);
            wait.until(ExpectedConditions.visibilityOfElementLocated(selectMultiselectDropDown)).sendKeys(Keys.ENTER);
        }
    }
}

