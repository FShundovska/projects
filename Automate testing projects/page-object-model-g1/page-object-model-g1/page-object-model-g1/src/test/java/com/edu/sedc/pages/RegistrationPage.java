package com.edu.sedc.pages;

import com.edu.sedc.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;

public class RegistrationPage extends BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    JavascriptExecutor js ;

    public By NewUserButton = By.id("newUser"); //Click on New User
    public By registerTitle = By.xpath("//h1[contains(text(),'Register')]");
    public By firstName = By.id("firstname");
    public By lastName = By.id("lastname");
    public By userNameRegistration = By.id("userName");
    public By passwordRegistration = By.id("password");

    //iFrame title = "reCaptcha"
    public By reCaptchaCheckBox = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[6]/div[1]/div[1]/div[1]/iframe[1]");

    public By registerButton = By.id("register");

   // public By popupOK = By.

//Constructor

    public RegistrationPage (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void clickNewUserButtonFromLogin() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NewUserButton)).click();
    }

    public String verifyTitleOnRegistrationPageIsVisible(){
        return driver.getTitle();
    }

    public void EnterFirstName(String FirstName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(FirstName);
    }

    public void EnterLastName(String LastName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName)).sendKeys(LastName);
    }

    public void EnterUserName(String UserNameRegister){
        wait.until(ExpectedConditions.visibilityOfElementLocated(userNameRegistration)).sendKeys(UserNameRegister);
    }

    public void EnterPassword(String PassRegister){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordRegistration)).sendKeys(PassRegister);
    }

  //select reCapctha
  public void clickReCaptcha() {
      wait.until(ExpectedConditions.visibilityOfElementLocated(reCaptchaCheckBox)).click();
  }
    public void clickRegisterButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerButton)).click();
    }

}
