package com.edu.sedc.pages;

import com.edu.sedc.tests.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;


public class ShippingCartPage extends BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;


    // Locators for registration form elements
    //  private final By shippingAddressText = By.xpath("//[@data-role='title']");
    public By firstNameInput = By.xpath("//input[@id='QKGVSFS']"); //[@name='firstname']
    public By lastNameInput = By.xpath("//[@name='lastname']");
    public By companyInput = By.xpath("//*[@name='company']");
    public By streetAddressInput = By.xpath("//*[@name='street[0]']");
    public By cityInput = By.xpath("//*[@name='city']");
    public By paymentMethodText = By.xpath("//div[contains(text(),'Payment Method')]");

    public By ddProvince = By.xpath("//body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[4]/ol[1]/li[1]/div[2]/form[1]/div[1]/div[5]/div[1]/select[1]");

    public By nameProvince = By.xpath("//select[@name='region_id']/option[@value='2']");
    //By.xpath("//div[5]//div[1]//select[1]/..//select[contains(@data-bind,'attr: {')]/option[3]");
    ////div[5]//div[1]//select[1]/..//select[contains(@data-bind,'attr: {')]/option[3]

    //By.xpath("//*[@id=\"shipping-new-address-form\"]/div[5]/div/option[3]");
    //select[@name='region_id' and @value='2']

    public By zipPostalCodeInput = By.xpath("//*[@name='postcode']");
    public By countryInput = By.xpath("//*[@name='country_id']");
    public By phoneNumberInput = By.xpath("//*[@name='telephone']");
    public By clickOnShippingMethod = By.xpath("//input[@value='flatrate_flatrate']");
    public By nextButton = By.xpath("//span[contains(text(),'Next')]");
    // By.xpath("//body/div[3]/main[1]/div[2]/div[1]/div[3]/div[4]/ol[1]/li[2]/div[1]/div[3]/form[1]/div[3]/div[1]/button[1]\n");
            //By.xpath("//span[contains(text(),'Next')]");
            //By.xpath("//[@data-role='opc-continue']");

    //By.xpath("//body/div[2]/main[1]/div[2]/div[1]/div[3]/div[4]/ol[1]/li[2]/div[1]/div[3]/form[1]/div[3]/div[1]/button[1]");

    public By placeOrder = By.xpath("//*[@title='Place Order']");
            //By.cssSelector("span[data-bind=\"i18n: 'Place Order'\"]");
    //
//    public By urlPaymentMethod = By.xpath("//div[contains(text(),'Payment Method')]");
//    public By shippingDetails = By.xpath("//body/div[2]/main[1]/div[2]/div[1]/div[3]/div[4]/ol[1]/li[1]/div[2]/div[1]/div[1]/div[1]/div[1]");

    public By thankYouForYourPurchaseText = By.xpath("//span[contains(text(),'Thank you for your purchase!')]");
    public By continueShoppingButton = By.xpath("//span[contains(text(),'Continue Shopping')]");
    public By dropDownSignOut = By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/span[1]/button[1]");
    public By signOutButton = By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[3]/a[1]");
    public final String shippingUrl = "https://magento.softwaretestingboard.com/checkout/#shipping";


    // Constructor to initialize the WebDriver
    public ShippingCartPage (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.js = (JavascriptExecutor) driver;
    }

    public void navigateToShippingCartUrl () {
        driver.navigate().to(shippingUrl);
        assertEquals(shippingUrl, driver.getCurrentUrl());
    }
    public void firstNameInput(String firstName) {driver.findElement(firstNameInput).sendKeys(firstName);}
    public void lastNameInput(String lastName) {driver.findElement(lastNameInput).sendKeys(lastName);}
    public void companyInput(String company) {
        driver.findElement(companyInput).sendKeys(company);}

    public void streetAddressInput(String streetAddress) {driver.findElement(streetAddressInput).sendKeys(streetAddress);}
    public void cityInput(String city) {
        driver.findElement(cityInput).sendKeys(city);}

    public void ddProvince() {
        wait.until(ExpectedConditions.elementToBeClickable(ddProvince)).click();
    }


    //visibility of province i dropdown list
    public void nameOfProvince(String text) {
//        WebElement element = driver.findElement(nameProvince);
//        Select objSelect = new Select(element);
//       objSelect.selectByVisibleText(text);
//        //objSelect.selectByIndex(2);
//        //objSelect.selectByValue(text);
//        element.click();
//    }
        // Find and click on the dropdown to reveal the options
        WebElement dropdown = driver.findElement(ddProvince); // Replace "div.dropdown" with the appropriate CSS selector for your dropdown
        dropdown.click();

        // Now that the options are visible, locate and click on the desired option
        WebElement option = driver.findElement(nameProvince); // Replace "div.dropdown-menu option[data-title='Alabama']" with the appropriate CSS selector for your option
        option.click();
    }

    public void zipPostalCodeInput(String zipPostalCode) {
        driver.findElement(zipPostalCodeInput).sendKeys(zipPostalCode);}
    public void countryInput(String country) {
        driver.findElement(countryInput).sendKeys(country);}
    public void phoneNumberInput (String phoneNumber){
        driver.findElement(phoneNumberInput).sendKeys(phoneNumber);}
    public void  clickOnShippingMethod (){
        driver.findElement(clickOnShippingMethod).click();}
    public void clickNextButton(){
        driver.findElement(nextButton).click();}

    public void placeOrder(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(placeOrder)).click();
        //driver.findElement(placeOrder).click();
    }
    public void navigateToCreateAnAccountUrl() {
        driver.navigate().to("https://magento.softwaretestingboard.com/checkout/#payment");
    }
    public String getTextFromPurchase(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(thankYouForYourPurchaseText)).getText();
    }
    public void ddSignOut() {
        wait.until(ExpectedConditions.elementToBeClickable(dropDownSignOut)).click();
    }
    public void signOutButton () {
        wait.until(ExpectedConditions.elementToBeClickable(signOutButton)).click();
    }

    public String getFirstName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInput)).getAttribute("value");
    }
    public String getLastName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameInput)).getAttribute("value");
    }
    public void companyInput(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(companyInput)).getText();
    }
    public void streetAddressInput(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(streetAddressInput)).getText();
    }
    public void cityInput(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityInput)).getText();
    }
    public void zipPostalCodeInput(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipPostalCodeInput)).getText();
    }
    public void selectCountryOption(String text) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(countryInput)).sendKeys(text);
        Thread.sleep(500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(countryInput)).sendKeys(Keys.ENTER);
    }
    public void clickOnShippingMethod (String shoppingMethod1){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnShippingMethod)).click();
    }
    public void clickPlaceOrderButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(placeOrder)).click();
    }
    public void clickContinueShoppingButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueShoppingButton)).click();
    }
    public String paymentMethodTitle () {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(paymentMethodText)).getText();
    }
}
