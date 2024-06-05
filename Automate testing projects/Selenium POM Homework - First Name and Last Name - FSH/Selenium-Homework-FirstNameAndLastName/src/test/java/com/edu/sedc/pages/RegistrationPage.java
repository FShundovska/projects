/*package com.edu.sedc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
    WebDriver driver;
    WebDriverWait wait;

    /*WebDriverWait wait = new WebDriverWait(driver, 10);*/
    /*WebElement newUserButton;
   
    public RegistrationPage (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public By newUserInput = By.xpath("//div//div//div//div//div//div//div[2]//button[1]");
    final private By firstNameField = By.id("firstname");
    final private By lastNameField = By.id("lastname");
    final private By usernameField = By.id("userName");
    final private By passwordField = By.id("password");
    final private By registerButton = By.id("register");
    final private By recaptchaMessage = By.id("recaptchaMessage");


    public void clickNewUser() {
        driver.findElement(newUserInput).click();
    }

    public void populateRegistrationFields(String firstname, String lastname, String username, String password) {
        driver.findElement(firstNameField).sendKeys(firstname);
        driver.findElement(lastNameField).sendKeys(lastname);
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newUser")));
        newUserButton.click();

    }

    public void clickRegister() {

        driver.findElement(registerButton).click();
    }

    public String getRecaptchaMessage() {

        return driver.findElement(recaptchaMessage).getText();
    }
}*/

package com.edu.sedc.pages;

import com.edu.sedc.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js ;
    private String registerUrl = "https://demoqa.com/login";
    private By newUserButton = By.id("newUser");
    private By firstName = By.id("firstname");
    private By lastName = By.id("lastname");
    private By userNameRegistration = By.xpath("//input[@id='userName']");
    private By passwordRegistration = By.xpath("//input[@id='password']");
    private By registerButton = By.xpath("//button[@id='register']");

    //iFrame title = "reCaptcha"
    private By getRecaptchaCheckBox = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[6]/div[1]/div[1]/div[1]/iframe[1]");

    private By getRecaptchaMessage = By.xpath("//p[@id='name']");

    //Constructor
    public RegistrationPage (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    public void navigateToRegisterPage () {
        driver.navigate().to(registerUrl);
    }
    public void clickNewUserButton() { wait.until(ExpectedConditions.visibilityOfElementLocated(newUserButton)).click(); }
    public void enterFirstName(String FirstName){wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(FirstName);}
    public void enterLastName(String LastName){ wait.until(ExpectedConditions.visibilityOfElementLocated(lastName)).sendKeys(LastName);}
    public void enterUserName(String UserNameRegister){
        wait.until(ExpectedConditions.visibilityOfElementLocated(userNameRegistration)).sendKeys(UserNameRegister);}
    public void enterPassword(String PassRegister){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordRegistration)).sendKeys(PassRegister);}
    //select reCaptcha
    public void getRecaptchaCheckBox() {wait.until(ExpectedConditions.visibilityOfElementLocated(getRecaptchaCheckBox)).click();}

    // Method to click the ReCaptcha checkbox
    public void clickReCaptcha() {
        // Wait for the ReCaptcha checkbox to be clickable
        WebElement recaptchaCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.className("recaptcha-checkbox-checkmark")));
        recaptchaCheckbox.click();
    }
    public String getRecaptchaMessage(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(getRecaptchaMessage)).getText();
    }
    public void clickRegisterButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerButton)).click();
    }
}


