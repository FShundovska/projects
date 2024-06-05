package com.edu.sedc.pages;

import com.edu.sedc.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartPage extends BaseTest {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    WebElement element;
    public By clickWomenTShirtFrame = By.cssSelector(".products-grid ol li:nth-child(2)");
    public By size = By.xpath("//div[@id='option-label-size-143-item-169']");
    public By colour = By.xpath("//div[@id='option-label-color-93-item-49']");
    public By addProductToCart = By.xpath("//button[@title='Add to Cart']//span");
    public By menHoodieFrame = By.cssSelector(".products-grid ol li:nth-child(3)");
    public By size1 = By.xpath("//div[@id='option-label-size-143-item-169']");
    public By colour1 = By.xpath("//div[@id='option-label-color-93-item-59']");
    public By addProductToCart1 = By.xpath("//span[contains(text(),'Add to Cart')]");
    public By numberOfItemsInCart = By.xpath("//header/div[2]/div[1]/a[1]");
    public By viewAndEditCart = By.xpath("//a[@data-bind='attr: {href: shoppingCartUrl}']//span");
   // public By additionItems = By.xpath("//body/div[2]/main[1]/div[1]/h1[1]/span[1]");
    public By proceedToCheckOut = By.xpath("//span[contains(text(),'Proceed to Checkout')]");

    public By dropDownSignOut = By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/span[1]/button[1]");
    public By signOutButton = By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[3]/a[1]");


    // Constructor to initialize the WebDriver
    public ShoppingCartPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.js = (JavascriptExecutor) driver;
    }

    public void navigateToShoppingCartUrl() {
        driver.navigate().to("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");

    }
    public void navigateToWomenTees (){
        driver.navigate().to("https://magento.softwaretestingboard.com/women/tops-women/tees-women.html");
    }
    public void clickWomenTShirt() {
        driver.findElement(clickWomenTShirtFrame).click();
    }
    public void size() {
        driver.findElement(size).click();
    }
    public void colour () {
        driver.findElement(colour).click();
    }

    public void clickAddToCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addProductToCart)).click();

    }
    public void navigateToMenHoodies(){
        driver.navigate().to("https://magento.softwaretestingboard.com/men/tops-men/hoodies-and-sweatshirts-men.html");
    }
    public void menHoodie() {
        driver.findElement(menHoodieFrame).click();
    }
    public void size1() {
        driver.findElement(size1).click();
    }
    public void colour1() {
        driver.findElement(colour1).click();
    }
    public void clickAddToCart1() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addProductToCart1)).click();
    }
    public void numberOfItemsInCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfItemsInCart)).click();
    }
    public void viewAndEditCart () {
        wait.until(ExpectedConditions.visibilityOfElementLocated(viewAndEditCart)).click();
    }
    public void proceedToCheckOut () {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckOut)).click();
    }
    public void navigateToShoppingCart() {
        driver.navigate().to("https://magento.softwaretestingboard.com/checkout/cart/");
    }
    public void ddSignOut() {
        wait.until(ExpectedConditions.elementToBeClickable(dropDownSignOut)).click();
    }

    public void signOutButton() {
        wait.until(ExpectedConditions.elementToBeClickable(signOutButton)).click();
    }
    public void closeBrowser() {
        driver.quit();
    }

}