package com.edu.sedc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    private String loginUrl = "https://demoqa.com/login";

    private By insertUserName = By.id("userName");
    private By insertPassword = By.id("password");

    private By loginButton = By.id("login");

    private By invalidMessage = By.xpath("//p[@id='name']");

    public LoginPage (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToLoginPage () {
        driver.navigate().to(loginUrl);
    }

    public void enterUsername (String userName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(insertUserName)).sendKeys(userName);
    }

    public void enterPassword (String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(insertPassword)).sendKeys(password);
    }

    public void clickOnLoginButton (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton)).click();
    }


    public String getInvalidUsernameOrPasswordMessage (){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(invalidMessage)).getText();
    }

}
