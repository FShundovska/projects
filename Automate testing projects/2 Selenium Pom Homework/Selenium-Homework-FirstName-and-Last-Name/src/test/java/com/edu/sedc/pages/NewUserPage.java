package com.edu.sedc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewUserPage {

    WebDriver driver;
    WebDriverWait wait;

    private String loginUrl = "https://demoqa.com/login";

    private By newUserButton = By.id("newUser");

    private By firstNameField = By.id("firstname");
    private By lastNameField = By.id("lastname");
    private By userNameField = By.xpath("//input[@id='userName']");
    private By passwordField = By.xpath("//input[@id='password']");

    private By registerButton = By.xpath("//button[@id='register']");

    private By verifyReCaptchaMessage = By.xpath("//p[@id='name']");

    public NewUserPage (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToLoginPage () {
        driver.navigate().to(loginUrl);
    }

    public void clickOnNewUserButton (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(newUserButton)).click();
    }

    public void enterFirstNameData(String firstName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField)).sendKeys(firstName);
    }

    public void enterLastNameData(String lastName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField)).sendKeys(lastName);
    }

    public void enterUserNameData (String userNameNewUser){
        wait.until(ExpectedConditions.visibilityOfElementLocated(userNameField)).sendKeys(userNameNewUser);
    }

    public void enterPasswordData (String passwordNewUser){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(passwordNewUser);
    }

    public void clickOnRegisterButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerButton)).click();
    }

    public String getPleaseVerifyReCaptchaMessage (){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(verifyReCaptchaMessage)).getText();
    }
}
