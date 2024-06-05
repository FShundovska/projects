package com.edu.sedc.tests;

import com.edu.sedc.pages.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
        import java.time.Duration;

//Ova e super clasa vo koja site clasii vo pages ke nasleduvaat
public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    JavascriptExecutor js;
    //JavascriptExecutor js = (JavascriptExecutor) driver;
    final String BASE_URL = "https://demoqa.com/";
    public Frame frames;
    public LoginPage loginPage;
    public LinksPages linksPages;
    public RegistrationPage registrationPage;

    public int duration = 10;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fani\\Desktop\\page-object-model-g1\\page-object-model-g1\\page-object-model-g1\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions(); // Starting a Chrome session with basic defined options
        //  options.addArguments("--headless");
        options.addArguments("--start-maximized", "--incognito"); //The args parameter is for a list of command line switches to be used when starting the browser

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        js = (JavascriptExecutor) driver;
        linksPages = new LinksPages(driver, wait);
        loginPage = new LoginPage(driver, wait);
        registrationPage = new RegistrationPage(driver, wait);

        frames = new Frame ();

        driver.get(BASE_URL);
        driver.manage().window().maximize();

        // Scroll on application using Selenium
        js.executeScript("window.scrollBy(0,-350)", "");
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
