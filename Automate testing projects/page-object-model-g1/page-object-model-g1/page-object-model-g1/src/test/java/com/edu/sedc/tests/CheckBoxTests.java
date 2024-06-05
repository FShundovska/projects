//package com.edu.sedc.tests;
//
//import com.edu.sedc.pages.CheckBoxPage;
//import com.edu.sedc.pages.TextBoxPage;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class CheckBoxTests  extends BaseTest {
//
//    @Test
//    public void testCheckboxes() throws InterruptedException {
//        checkBoxPage.navigateToCheckBoxPage();
//        checkBoxPage.clickHomeCheckBox();
//
//        /*checkBoxPage.clickHomeButton();
//        Assert.assertEquals(checkBoxPage.getTextForPermanentAddress(), "Permananet Address :Address old");*/
//
//        boolean isHomePageChecked = checkBoxPage.isHomeCheckBoxSelected().contains("check");
//        Assert.assertTrue(isHomePageChecked, "Checking if home page is selected");
//
//        //Asserting with isSelected
//        Assert.assertTrue(checkBoxPage.isHomeCheckBoxSelectedUsingBool(),"Checking if HomePage checkbox is selected with boolean");
//        Thread.sleep(3000);
//
//
//
//    }
//
//}
