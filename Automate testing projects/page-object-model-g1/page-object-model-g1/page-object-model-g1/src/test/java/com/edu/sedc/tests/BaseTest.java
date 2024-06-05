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

import java.time.Duration;

//Ova e super clasa vo koja site clasii vo pages ke nasleduvaat
public class BaseTest {
// dva objekti gi deklarirame so access modifier PUBLIC se povikuvaat vo site mozni klasi i objekti
    public WebDriver driver;
    public WebDriverWait wait;
    public JavascriptExecutor js;
    //JavascriptExecutor js = (JavascriptExecutor) driver;
   // public CheckBoxPage checkBoxPage;
   // public SelectMenuPage selectMenuPage;
  //  public RadioButtonPage radioButtonPage;
    public RegistrationPage RegistrationPage;
    public Frames frames;
//    public ButtonsPage buttonsPage;
 //   JavascriptExecutor js;
    final String BASE_URL = "https://demoqa.com/login";
  //  final String RadioButtonUrl = "https://demoqa.com/radio-button";

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


        RegistrationPage = new RegistrationPage(driver, wait);
      //  checkBoxPage = new CheckBoxPage(driver, wait);
        /*selectRadioButton = new SelectRadioButton(driver, wait);*/
     //   selectMenuPage = new SelectMenuPage(driver, wait);
      //  radioButtonPage = new RadioButtonPage(driver, wait);
      //  buttonsPage = new ButtonsPage(driver, wait);

        frames = new Frames(driver, wait);

        driver.get(BASE_URL);
        driver.manage().window().maximize();

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
