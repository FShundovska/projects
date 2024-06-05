package com.edu.sedc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {
    WebDriver driver;
    WebDriverWait wait;

    private By fullNameInput = By.id("userName");
    private By emailInput = By.id("userEmail");
    private By currentAddressInput = By.id("currentAddress");
    private By permanentAddressInput = By.id("permanentAddress");
    private By submitButton = By.id("submit");
    private By fullNameText = By.id("name");
    private By emailText = By.id("email");
    private By addressText = By.xpath("*//p[@id='currentAddress']");
    private By permanentAddressText = By.xpath("*//p[@id='permanentAddress']");


    /*private By textOutputs = By.cssSelector("#output>div>p");*/

    public TextBoxPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToTextBoxUrl(){
        driver.navigate().to("https://demoqa.com/text-box");
    }
    public void enterFullName(String fullName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(fullNameInput)).sendKeys(fullName);
    }
    public void enterEmailInput (String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput)).sendKeys(email);
    }
    public void enterCurrentAddress (String address){
        wait.until(ExpectedConditions.visibilityOfElementLocated(currentAddressInput)).sendKeys(address);
    }
    public void permanentAddress (String perAddress){
        wait.until(ExpectedConditions.visibilityOfElementLocated(permanentAddressInput)).sendKeys(perAddress);
    }
    public void clickSubmitButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(submitButton)).click();
    }

    /*public void submitButton (){
        driver.findElement(By.id("submit"));
    }*/
    public String getTextForFullName(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(fullNameText)).getText();
    }

    public String getTextForEmail(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(emailText)).getText();
    }

    public String getTextForCurrentAddress(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(addressText)).getText();
    }

    public String getTextForPermanentAddress (){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(permanentAddressText)).getText();
    }

    /*public String verifyTextOutputs(int index){
        return  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(textOutputs)).get(index).getText();
    }*/


}
