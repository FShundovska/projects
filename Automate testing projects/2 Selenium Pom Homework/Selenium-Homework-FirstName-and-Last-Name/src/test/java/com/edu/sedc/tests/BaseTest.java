package com.edu.sedc.tests;

import com.edu.sedc.pages.LinksPage;
import com.edu.sedc.pages.LoginPage;
import com.edu.sedc.pages.NewUserPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.jar.JarEntry;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;

    final String BASE_URL = "https://demoqa.com/";
    public LinksPage linksPage;
    public LoginPage loginPage;
    public NewUserPage newUserPage;

    JavascriptExecutor js;

    private int duration = 10;

    @BeforeMethod
    public void setUp (){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        js = (JavascriptExecutor) driver;
        linksPage = new LinksPage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        newUserPage = new NewUserPage(driver, wait);
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
