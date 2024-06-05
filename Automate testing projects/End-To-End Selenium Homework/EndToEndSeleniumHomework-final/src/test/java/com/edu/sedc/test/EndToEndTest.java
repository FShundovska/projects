package com.edu.sedc.test;

import com.edu.sedc.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndToEndTest extends BaseTestEndToEnd {

    @Test
    public void testEndToEndFlow() throws InterruptedException {

        //Initialize WebDriver and WebDriverWait
       // WebDriver driver = new ChromeDriver();
      //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // ova se mozhesh vo Basetest vo setup da go stavish i tuka samo kje gi povikash metodite
        LoginPage loginPage = new LoginPage(driver, wait);
        ProductPage productPage = new ProductPage(driver, wait);
        CartPage cartPage = new CartPage(driver, wait);
        CheckOutPage checkOutPage = new CheckOutPage(driver, wait);
        FinishPage finishPage = new FinishPage(driver, wait);
        ThankYouPage thankYouPage = new ThankYouPage(driver, wait);


        // 1. Perform Log In
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        Thread.sleep(2000);

        // 2. Add product to cart
        productPage.addBackPackToCart();
        productPage.addTShirtToCart();
        productPage.addJacketToCart();
        productPage.clickCartButton();
        Thread.sleep(2000);
        // 3. Navigate to cart and click checkout
     //   cartPage.navigateToCart();
        Thread.sleep(2000);
        cartPage.clickCheckoutButton();


        // 4. Enter checkout information
     //   CheckOutPage checkoutPage = new CheckOutPage(driver, wait);
        String firstName = "John";
        String lastName = "Doe";
        String zipCode = "12345";
        checkOutPage.enterFirstName(firstName);
        checkOutPage.enterLastName(lastName);
        checkOutPage.enterZipCode(zipCode);


        // 5. Click on Finish Button
        finishPage.clickFinishButton();
        finishPage.finishCheckout();
        finishPage.clickFinishBtn();
        Assert.assertEquals(thankYouPage.getThankYouMsg(), "Thank you for your order!");


        // Assertions
// 1. Assert for login and error message
       // Assert.assertEquals(loginPage.getUserName(), "standard_user");
       // Assert.assertEquals(loginPage.getPassword(), "secret_sauce");
     //   Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");

        // 2. Assert for login and error message
      /*  Assert.assertEquals(cartPage.getProductName(), "Sauce Labs Backpack");

        // 3.Assert for CheckOut
        Assert.assertEquals(checkOutPage.getFirstName(), "John");
        Assert.assertEquals(checkOutPage.getLastName(), "Doe");
        Assert.assertEquals(checkOutPage.getZipCode(),"12345");

        // 3. Assert "Thank you" message
        Assert.assertTrue(thankYouPage.isOrderPlaced(), "Order placement confirmation is not displayed.");*/

        // Close the browser
        driver.quit();
    }
}