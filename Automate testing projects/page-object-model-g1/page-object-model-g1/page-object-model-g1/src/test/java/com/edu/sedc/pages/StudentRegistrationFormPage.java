//package com.edu.sedc.pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class StudentRegistrationFormPage {
//    WebDriver driver;
//    WebDriverWait wait;
//
//    private By studentNameInput = By.id("Fanka Shundovska");
//    private By studentEmailInput = By.id("fanishund@gmail.com");
//    private By studentGenderInput = By.id("female");
//    private By studentMobileInput = By.cssSelector("body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(4) > td:nth-child(2)");
//    private By studentAddressInput = By.id("Ul. Skoevska br.2");
//
//    private By subjectForStudiesInput = By.id("Computer science");
//    private By studentHobbiesInput = By.id("music");
//    private By stateAndCityInput = By.id("NCR Gurgaon");
//
//    private By selectOneDropDown = By.id("react-select-4-input");
//
//    private By submitButton = By.id("submit");
//
//
//
//    public StudentRegistrationFormPage(WebDriver driver, WebDriverWait wait) {
//        this.driver = driver;
//        this.wait = wait;
//    }
//
//    public void navigateToRegistrationFormUrl() {
//        driver.navigate().to("https://demoqa.com/automation-practice-form");
//    }
//
//    public void enterStudentName(String studentName) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(studentName).sendKeys(studentName));
//    }
//
//    public void enterStudentEmail(String studentEmail) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(studentEmail).sendKeys(studentEmail));
//    }
//
//    public void enterStudentAddress(String studentAddress) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(studentAddress).sendKeys(studentAddress));
//    }
//
//    public void subjectForStudies(String subjectForStudies) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(subjectForStudies).sendKeys(subjectForStudies));
//    }
//
//    public void studentHobbies(String studentHobbies) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(studentHobbies).sendKeys(studentHobbies));
//    }
//
//    public void stateAndCity(String stateAndCity) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(stateAndCity).sendKeys(stateAndCity));
//    }
//    public void selectOptionsByText(String text) {
//        WebElement element = driver.findElement(stateAndCity);
//        Select select = new Select(element);
//        select.selectByVisibleText(text);
//    }
//    public void selectStateAndCity(String text) throws InterruptedException {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(selectOneDropDown)).sendKeys(text);
//        Thread.sleep(500);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(selectOneDropDown)).sendKeys(Keys.ENTER);
//    }
//    public void clickSubmitButton(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(submitButton)).click();
//    }
//    public String getTextForStudentName(){
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(studentName)).getText();
//    }
//    public String getTextForStudentEmail(){
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(studentEmail)).getText();
//    }
//    public String getTextForStudentAddress(){
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(studentAddress)).getText();
//    }
//    public String getTextForSubjectForStudies(){
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(subjectForStudies)).getText();
//    }
//    public String getTextForStudentGender(){
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(studentGender)).getText();
//    }
//    public String getTextForStudentHobbies(){
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(studentHobbies)).getText();
//    }
//    public String getTextForStateAndCity(){
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(stateAndCity)).getText();
//    }
//
//
//}
//
