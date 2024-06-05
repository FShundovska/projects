package com.edu.sedc.tests;

import com.edu.sedc.pages.*;
import com.edu.sedc.tests.BaseTest;
import com.edu.sedc.utils.DataForElements;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.time.Duration;

public class EndToEndTest extends BaseTest {


    @Test(dataProvider = "data-for-createAnAccount", dataProviderClass = DataForElements.class)
    public void completeEndToEndFlow(String firstName, String lastName, String email, String password, String reEnteredPassword) {
        CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage(driver, wait);

        // Step 1: CreateAnAccount
        createAnAccountPage.navigateToCreateAnAccountUrl();
        createAnAccountPage.clickOnCreateAnAccountLink();
        createAnAccountPage.enterFirstName(firstName);
        createAnAccountPage.enterLastName(lastName);
        createAnAccountPage.enterEmail(email);
        createAnAccountPage.enterPassword(password);
        createAnAccountPage.reEnterPassword(reEnteredPassword);
        createAnAccountPage.clickCreateAnAccountButton1();

        createAnAccountPage.ddSignOut();
        createAnAccountPage.signOutButton();
        createAnAccountPage.closeBrowser();

    }

    @Test(dataProvider = "data-for-signIn", dataProviderClass = DataForElements.class)
    public void completeEndToEndFlow1(String email, String password) throws InterruptedException {

        SignInPage signInPage = new SignInPage(driver, wait);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver, wait);
        ShippingCartPage shippingCartPage = new ShippingCartPage(driver, wait);

        //Step 2: SignIn

        signInPage.navigateToSignInUrl();
        Thread.sleep(4000);
        //signInPage.getTextFromSignInMsg();
        Thread.sleep(4000);
        signInPage.clickSignInLink();
        signInPage.enterEmail(email);
        signInPage.enterPassword(password);
        signInPage.clickSignInButton();

        //Assert.assertEquals(signInPage.getTextFromSignInMsg(), "If you have an account, sign in with your email address.");


        // Step 3: ShoppingCart
        shoppingCartPage.navigateToShoppingCartUrl();
        shoppingCartPage.navigateToWomenTees();
        shoppingCartPage.clickWomenTShirt();
        //scroll
        WebElement element = driver.findElement(shoppingCartPage.addProductToCart);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        shoppingCartPage.size();
        shoppingCartPage.colour();
        shoppingCartPage.clickAddToCart();
        Thread.sleep(2000);

        shoppingCartPage.navigateToMenHoodies();
        shoppingCartPage.menHoodie();
        //scroll
        WebElement element1 = driver.findElement(shoppingCartPage.addProductToCart1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);

        shoppingCartPage.size1();
        shoppingCartPage.colour1();
        shoppingCartPage.clickAddToCart1();
        Thread.sleep(2000);

        shoppingCartPage.numberOfItemsInCart();

        Thread.sleep(1000);
        shoppingCartPage.viewAndEditCart();
        Thread.sleep(1000);

        shoppingCartPage.proceedToCheckOut();
        shoppingCartPage.navigateToShoppingCart();




        // Step 4: ShippingPage
        shippingCartPage.navigateToShippingCartUrl();
        Thread.sleep(4000);
////        shippingCartPage.getFirstName();
//        Thread.sleep(4000);
////        shippingCartPage.getLastName();
//        Thread.sleep(4000);
        shippingCartPage.companyInput("NSA");
        Thread.sleep(4000);
        shippingCartPage.streetAddressInput("Address1");
        Thread.sleep(4000);
        shippingCartPage.cityInput("Anchorage");
        Thread.sleep(4000);
        shippingCartPage.ddProvince();
        Thread.sleep(4000);
        shippingCartPage.nameOfProvince("Alaska");
        Thread.sleep(4000);
        shippingCartPage.zipPostalCodeInput("99540");
        Thread.sleep(4000);
        shippingCartPage.countryInput("United States");
        Thread.sleep(4000);
        shippingCartPage.phoneNumberInput("123456789");
        Thread.sleep(4000);
        shippingCartPage.clickOnShippingMethod();
        Thread.sleep(4000);
        shippingCartPage.clickNextButton();
        Thread.sleep(4000);

        //WebElement element2 = driver.findElement(shippingCartPage.nextButton);
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);

        ///////////////
        shippingCartPage.ddProvince();
        Thread.sleep(4000);
        shippingCartPage.nameOfProvince("Alaska");
        /////////////////

        Thread.sleep(4000);
        shippingCartPage.clickNextButton();
        Thread.sleep(4000);

        shippingCartPage.navigateToCreateAnAccountUrl();


        WebElement element3 = driver.findElement(shippingCartPage.placeOrder);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element3);


        Thread.sleep(4000);

        // Place order
        shippingCartPage.placeOrder();
        Thread.sleep(4000);
        shippingCartPage.getTextFromPurchase();

        // Assert purchase confirmation
        String purchaseConfirmationText = shippingCartPage.getTextFromPurchase();
        Assert.assertEquals(purchaseConfirmationText, "Thank you for your purchase!");

        // Cleanup
        shippingCartPage.ddSignOut();
        Thread.sleep(4000);
        shippingCartPage.signOutButton();



//
//            // Step 5:
//            CheckOutPage checkOutPage = new CheckOutPage(driver, wait);
//
//            checkOutPage.navigateToCheckOutUrl();
//            checkOutPage.enterFirstName("Marry");
//            checkOutPage.enterLastName("Moop");
//            checkOutPage.enterZipCode("10500");
//            checkOutPage.clickContinue();
//
    }

}
