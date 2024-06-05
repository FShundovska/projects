package com.edu.sedc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {
    private WebDriver driver;
    private WebDriverWait wait;

    private By headerTextInFrame = By.id("samleHeading");

    private String frameId = "frame1";
    public Frames(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    public void navigateToFramePage(){
        driver.navigate().to("https://demoqa.com/frames");
    }

    public String getHeadingText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(headerTextInFrame)).getText();
    }

    public void switchToIframe(){
        driver.switchTo().frame(frameId);
        //driver.switchTo().frame(0); //prefrluvanje preku index
        //driver.switchTo().frame(webelement);

        //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id(frameId));
    }

    public void switchToMainPage(){
        driver.switchTo().defaultContent(); //izleguvanje od Iframe
                                            // - vrakjanje na glavniot HTML
    }

}

