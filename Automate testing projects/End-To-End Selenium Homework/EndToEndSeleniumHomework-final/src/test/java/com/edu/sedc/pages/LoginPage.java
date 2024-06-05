package com.edu.sedc.pages;

import com.edu.sedc.test.BaseTestEndToEnd;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseTestEndToEnd {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;

    private final By userNameInput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("login-button");


    // Constructor to initialize the WebDriver
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.js = (JavascriptExecutor) driver; // Initialize JavascriptExecutor
    }

    public void enterUserName (String userName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(userNameInput)).sendKeys(userName);
    }

    public void enterPassword (String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput)).sendKeys(password);
    }
    public void clickLoginButton (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton)).click();
    }
    public String getUserName(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(userNameInput)).getAttribute("value");
    }
    public String getPassword(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput)).getAttribute("value");
    }
    private final By errorMessage = By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3");

    public String getErrorMessage() {
        try {
            WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
            return errorMessageElement.getText();
        } catch (TimeoutException e) {
            return ""; // Return empty string if element is not found
        }
    }
}