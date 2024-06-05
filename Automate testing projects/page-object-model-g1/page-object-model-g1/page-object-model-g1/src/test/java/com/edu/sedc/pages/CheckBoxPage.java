package com.edu.sedc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private String checkBoxUrl = "https://demoqa.com/checkbox";

    private By homeButton = By.id("Home");

    private String homeBoxSelected = String.valueOf(By.xpath("//*[contains(@class,'icon-check')]"));

    public CheckBoxPage(WebDriver driver, WebDriverWait wait) {

        this.driver = driver;
        this.wait = wait;

    }

    public void navigateToCheckBoxPage() {
        driver.navigate().to(checkBoxUrl);
    }

    public void clickHomeCheckBox() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeButton)).click();
    }

    public String isHomeCheckBoxSelected() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(homeBoxSelected))).getAttribute("class");

    }

    public boolean isHomeCheckBoxSelectedUsingBool() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(homeButton)).isSelected();
    }

}

