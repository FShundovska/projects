package com.edu.sedc.tests;

import com.edu.sedc.pages.CreateAnAccountPage;
import com.edu.sedc.utils.DataForElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAnAccountTest extends BaseTest{

    @Test(dataProvider = "data-for-createAnAccount", dataProviderClass = DataForElements.class)
    public void completeEndToEndFlow(String firstName, String lastName, String email, String password, String reEnteredPassword){
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

}
