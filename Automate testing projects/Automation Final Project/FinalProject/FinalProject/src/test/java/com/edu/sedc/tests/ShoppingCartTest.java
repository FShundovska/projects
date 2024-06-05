package com.edu.sedc.tests;

import com.edu.sedc.pages.ShippingCartPage;
import com.edu.sedc.pages.ShoppingCartPage;
import com.edu.sedc.pages.SignInPage;
import com.edu.sedc.utils.DataForElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseTest {

    @Test(dataProvider = "data-for-signIn", dataProviderClass = DataForElements.class)
    public void completeEndToEndFlow1 (String email, String password) throws InterruptedException {

        SignInPage signInPage = new SignInPage(driver, wait);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver, wait);
        ShippingCartPage shippingCartPage = new ShippingCartPage(driver, wait);

        //Step 2: SignIn

        signInPage.navigateToSignInUrl();
        signInPage.clickSignInLink();
        signInPage.enterEmail(email);
        signInPage.enterPassword(password);
        Thread.sleep(1000);
        signInPage.clickSignInButton();


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
        Thread.sleep(4000);

        shoppingCartPage.numberOfItemsInCart();

        Thread.sleep(4000);
        shoppingCartPage.viewAndEditCart();
        Thread.sleep(4000);

        shoppingCartPage.proceedToCheckOut();
        shoppingCartPage.navigateToShoppingCart();

    }
}

