package com.edu.sedc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public WebDriver driver;
    public WebDriverWait wait;
    JavascriptExecutor js ;

    public By title = By.id("//h1[contains(text(),'Login')]");
    public By userName = By.id ("userName");
    public By password = By.id ("password");

    public By loginButton = By.id("login");
    public By newUser = By.xpath ("//button[@id='newUser']");


    public LoginPage (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }



    //Check if the title exist
    public String verifyTitle(){
        return driver.getTitle();
    }



    public void userName (String UserName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName)).sendKeys(UserName);
    }
    public void Password (String Password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(Password);
    }
    public void LoginSuccess(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton)).click();
    }

    public void ClickNewUserButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(newUser)).click();
    }


}
