package com.edu.sedc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.List;

public class LinksPages {
    WebDriver driver;
    WebDriverWait wait;

    private String linksUrl = "https://demoqa.com/links";

    private By createdOption = By.id("created");
    private By noContentOption = By.id("no-content");
    private By movedOption = By.id("moved");
    private By badRequestOption = By.id("bad-request");
    private By unauthorizedOption = By.id("unauthorized");
    private By forbiddenOption = By.id("forbidden");
    private By notFoundOption = By.id("invalid-url");

    private By isCreatedOptionSelected = By.partialLinkText("Created");
    private By isNoContentOptionSelected = By.partialLinkText("No Content");
    private By isMovedOptionSelected = By.partialLinkText("Moved");
    private By isBadRequestOptionSelected = By.partialLinkText("Bad Request");
    private By isUnauthorizedOptionSelected = By.partialLinkText("Unauthorized");
    private By isForbiddenOptionSelected = By.partialLinkText("Forbidden");
    private By isNotFoundOptionSelected = By.partialLinkText("Not Found");

    public LinksPages(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToLinksPage () {
        driver.navigate().to(linksUrl);
    }

    public void clickOnCreatedOption () {
        wait.until(ExpectedConditions.visibilityOfElementLocated(createdOption)).click();
    }
    public void clickOnNoContentOption(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(noContentOption)).click();
    }
    public void clickOnMovedOption(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(movedOption)).click();
    }

    public void clickOnBadRequestOption(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(badRequestOption)).click();
    }
    public void clickOnUnauthorizedOption(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(unauthorizedOption)).click();
    }
    public void clickOnForbiddenOption(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(forbiddenOption)).click();
    }
    public void clickOnNotFoundOption(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(notFoundOption)).click();
    }
    public String isClickedOnCreatedOption() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(isCreatedOptionSelected)).getText();
    }

    public String isClickedOnNoContentOption(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(isNoContentOptionSelected)).getText();
    }

    public String isClickedOnMovedOption(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(isMovedOptionSelected)).getText();
    }

    public String isClickedOnBadRequestOption(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(isBadRequestOptionSelected)).getText();
    }

    public String isClickedOnUnauthorizedOption(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(isUnauthorizedOptionSelected)).getText();
    }

    public String isClickedOnForbiddenOption(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(isForbiddenOptionSelected)).getText();
    }

    public String isClickedOnNotFoundOption(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(isNotFoundOptionSelected)).getText();
    }

}