package com.edu.sedc.tests;

import com.edu.sedc.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.awt.*;
import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public JavascriptExecutor js;
    //JavascriptExecutor js = (JavascriptExecutor) driver;

    public SignInPage signInPage;
    public CreateAnAccountPage createAnAccountPage;
    public ShoppingCartPage shoppingCartPage;
    public ShippingCartPage shippingCartPage;
    public CheckOutPage checkOutPage;
    public SelectMenuPage selectMenuPage;

    public Frame frames;
    final String BASE_URL = "https://magento.softwaretestingboard.com/";
    public int duration = 10;


    @BeforeMethod
    public void setUp() {
        // Set up Chrome WebDriver
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fani\\Desktop\\Final Project Fani SH\\FinalProject\\FinalProject\\chromedriver.exe");


        ChromeOptions options = new ChromeOptions(); // Starting a Chrome session with basic defined options
        options.addArguments("--start-maximized", "--incognito"); //The args parameter is for a list of command line switches to be used when starting the browser

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        frames = new Frame ();

        selectMenuPage = new SelectMenuPage(driver, wait);
        driver.get(BASE_URL);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Initializing JavascriptExecutor
        js = (JavascriptExecutor) driver;

        // Scroll on application using Selenium
        js.executeScript("window.scrollBy(0,-350)", "");

        WebElement iframe = driver.findElement(By.tagName("iframe"));
        new Actions(driver).scrollToElement(iframe).perform();

        // Initialize page objects
//        SignInPage signInPage = new SignInPage(driver, wait);
//        CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage(driver, wait);
//        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver, wait);
//        ShippingCartPage shippingCartPage = new ShippingCartPage(driver, wait);
//        CheckOutPage checkOutPage = new CheckOutPage(driver, wait);

        // Wait for the element to be present
        //WebElement signInButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/span[1]/button[1]")));
    }


    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

