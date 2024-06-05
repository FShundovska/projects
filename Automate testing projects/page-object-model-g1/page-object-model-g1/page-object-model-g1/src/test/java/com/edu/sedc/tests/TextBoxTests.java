package com.edu.sedc.tests;

import com.edu.sedc.pages.TextBoxPage;
import com.edu.sedc.utils.DataForElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTests extends BaseTest {

    @Test
    public void testTextBox() {
        TextBoxPage textBoxPage = new TextBoxPage(driver, wait);
        textBoxPage.navigateToTextBoxUrl();
        textBoxPage.enterFullName("Ime Prezime");
        textBoxPage.enterEmailInput("test@mail.com");
        textBoxPage.enterCurrentAddress("Address new");
        js.executeScript("window.scrollBy(0,500)","");
        textBoxPage.permanentAddress("Address old");
        textBoxPage.clickSubmitButton();
        //so minus se scrola nagore
        js.executeScript("window.scrollBy(0,-500)","");

        //Assertions
        Assert.assertEquals(textBoxPage.getTextForFullName(), "Name:Ime Prezime");
        Assert.assertEquals(textBoxPage.getTextForEmail(), "Email:test@mail.com");
        Assert.assertEquals(textBoxPage.getTextForCurrentAddress(), "Current Address :Address new");
        Assert.assertEquals(textBoxPage.getTextForPermanentAddress(), "Permananet Address :Address old");

    }

    /*//Assertions
        Assert.assertEquals(textBoxPage.verifyTextOutput(0),"Name:Dimitar Stojanovski");
        Assert.assertEquals(textBoxPage.verifyTextOutput(1),"Email:nmail@mail.com");
        Assert.assertEquals(textBoxPage.verifyTextOutput(2),"Current Address :Address 1");
        Assert.assertEquals(textBoxPage.verifyTextOutput(3),"Permananet Address :Address 2");
        has context menu*/

    @Test(dataProvider = "data-for-textbox", dataProviderClass = DataForElements.class)
    public void testTextBoxWithDataProvider(String fullName, String email, String currentAddress, String permanentAddress) {
        TextBoxPage textBoxPage = new TextBoxPage(driver, wait);
        textBoxPage.navigateToTextBoxUrl();
        textBoxPage.enterFullName(fullName);
        textBoxPage.enterEmailInput(email);
        textBoxPage.enterCurrentAddress(currentAddress);
        textBoxPage.permanentAddress(permanentAddress);
        textBoxPage.clickSubmitButton();
    }
}


