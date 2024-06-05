package com.edu.sedc.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.awt.*;
import java.time.Duration;

public class BaseTestEndToEnd {

    public WebDriver driver;
    public WebDriverWait wait;
    public JavascriptExecutor js;
    //JavascriptExecutor js = (JavascriptExecutor) driver;
    public Frame frames;
    final String BASE_URL = "https://www.saucedemo.com/";

    public int duration = 10;

    /*public Object firstName;
    public Object lastName;
    public Object zipName;*/


    @BeforeMethod
    public void setUp() {
        // Set up Chrome WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fani\\Desktop\\page-object-model-g1\\page-object-model-g1\\page-object-model-g1\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions(); // Starting a Chrome session with basic defined options
        options.addArguments("--start-maximized", "--incognito"); //The args parameter is for a list of command line switches to be used when starting the browser

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        frames = new Frame ();
        /*LoginPage loginPage = new LoginPage(driver, wait);
        ProductPage productPage = new ProductPage(driver, wait);
        CartPage cartPage = new CartPage(driver, wait);
        CheckOutPage checkOutPage = new CheckOutPage(driver, wait);
        FinishPage finishPage = new FinishPage(driver, wait);
        ThankYouPage thankYouPage = new ThankYouPage(driver, wait);*/

        driver.get(BASE_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Initializing JavascriptExecutor
        js = (JavascriptExecutor) driver;

        // Scroll on application using Selenium
        js.executeScript("window.scrollBy(0,-350)", "");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
