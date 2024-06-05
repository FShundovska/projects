package com.edu.sedc.pages;

import com.edu.sedc.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

public class CreateAnAccountPage extends BaseTest {

        WebDriver driver;
        WebDriverWait wait;
        JavascriptExecutor js;

        // Locators
        public By clickOnCreateAnAccountLink = By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']");
        public By pageTitle = By.xpath("//span[contains(text(),'Create New Customer Account')]");
        public By firstName = By.xpath("//*[@id='firstname']");
        public By lastName = By.xpath("//input[@id='lastname']");
        public By emailAddress = By.xpath("//input[@id='email_address']");
        public By password = By.id("password");
        public By confirmPassword = By.id("password-confirmation");
        public By createAnAccountButton1 = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]");
        public By dropDownSignOut = By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/span[1]/button[1]");
        public By signOutButton = By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[3]/a[1]");

       // Constructor to initialize the WebDriver
        public CreateAnAccountPage (WebDriver driver, WebDriverWait wait) {
                this.driver = driver;
                this.wait = wait;
                this.js = (JavascriptExecutor) driver;
        }


    // Navigate to the Magento website
    public void navigateToCreateAnAccountUrl() {
        String navigateToCreateAnAccountUrl = ("https://magento.softwaretestingboard.com/customer/account/create/");
        driver.navigate().to(navigateToCreateAnAccountUrl);
        assertEquals(navigateToCreateAnAccountUrl, driver.getCurrentUrl());

    }
    public void clickOnCreateAnAccountLink() {
        driver.findElement(clickOnCreateAnAccountLink).click();
    }

    //Fill the needed credentials
    public void enterFirstName(String firstNameInput) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(firstNameInput);
    }

    public void enterLastName(String lastNameInput) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName)).sendKeys(lastNameInput);
    }

    public void enterEmail(String emailInput) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailAddress)).sendKeys(emailInput);
    }

    public void enterPassword(String passwordInput) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(passwordInput);
    }

    public void reEnterPassword(String passwordReInput) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmPassword)).sendKeys(passwordReInput);
    }

    public void clickCreateAnAccountButton1() {
        wait.until(ExpectedConditions.elementToBeClickable(createAnAccountButton1)).click();
    }
    public void ddSignOut() {
        wait.until(ExpectedConditions.elementToBeClickable(dropDownSignOut)).click();
    }
    public void signOutButton() {
        wait.until(ExpectedConditions.elementToBeClickable(signOutButton)).click();
    }
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
    public String getFirstName(){
            return wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).getText();
    }
    public String getLastName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(lastName)).getText();
    }
    public String getEmail() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(emailAddress)).getText();
    }
    public String getPassword() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(password)).getText();
    }
    public String getConfirmationPassword() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(confirmPassword)).getText();
    }

    // Close the browser
    public void closeBrowser() {
        driver.quit();
    }
}