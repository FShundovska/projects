//package com.edu.sedc.pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class RadioButtonPage {
//        WebDriver driver;
//        WebDriverWait wait;
//        public RadioButtonPage(WebDriver driver, WebDriverWait wait){
//            this.driver = driver;
//            this.wait = wait;
//        }
//
//        private String radioButtonUrl = "https://demoqa.com/radio-button";
//
//        private By yesButton = By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/label/text()");
//
//        private By getYesButton = By.cssSelector("label[for = yesRadio]");
//
//        private By impressiveButton = By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/label");
//
//        /*private By impressiveButton = By.cssSelector("label[for = impressiveRadio]");*/
//
//
//    public void navigateToSelectRadioButtonPage() {
//        driver.navigate().to(radioButtonUrl);
//    }
//
//
//    public void selectRadioButton(String text) throws InterruptedException {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(selectRadioButtonPage)).sendKeys(text);
//        wait.until((ExpectedConditions.visibilityOfElementLocated(By.id("yesRadio"))));
//        wait.until((ExpectedConditions.visibilityOfElementLocated(By.id("impressiveRadio"))));
//        Thread.sleep(500);
//    }
//
//}
