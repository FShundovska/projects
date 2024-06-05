/*package com.edu.sedc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    final private By usernameField = By.id("username");
    /*@FindBy(id = "username")
    private WebElement usernameField;*/

    /*final private By passwordField = By.id("password");
    /*@FindBy(id = "password")
    private WebElement passwordField;*/
    /*final private By loginButton = By.id("login");
    /*@FindBy(id = "login")
    private WebElement loginButton;*/
/*final private By errorMessage = By.id("error");*/

    /*public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void enterCredentials(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

}*/

package com.edu.sedc.pages;

import com.edu.sedc.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    private String loginUrl = "https://demoqa.com/login";
    private By userNameInput = By.id("userName");
    private By passwordInput = By.id("password");
    private By loginButtonClick = By.id("login");
    private By errorMessage = By.xpath("//p[@id='name']");


    //Constructor or dependency injection for the WebDriver
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void navigateToLoginPage() {driver.navigate().to(loginUrl);
    }

    //Check if the title exist
    public void userNameInput(String userName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(userNameInput)).sendKeys(userName);
    }

    public void passwordInput (String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput)).sendKeys(password);
    }
    public void waitForAdsToDisappear() {
        /*wait = new WebDriverWait(driver, 20);*/
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0__container__")));
    }
    public void loginButtonClick () {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButtonClick)).click();
    }

    public String getErrorMessage(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage)).getText();
    }

}





