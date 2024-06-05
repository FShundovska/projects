//package com.edu.sedc.tests;
//
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class RadioButtonTests {
//
//    @Test
//    public void selectRadioButtons() throws InterruptedException {
//        RadioButtonsPage.navigateToRadioButtonPage();
//        radioButtonsPage.clickRadioButtons(0);
//        Assert.assertEquals(radioButtonsPage.getSuccessMessage(),"You have selected Yes");
//        Assert.assertTrue(radioButtonsPage.getSuccessMessage().equals("You have selected Yes"));
//        Thread.sleep(3000);
//        radioButtonsPage.clickRadioButtons(1);
//        Assert.assertEquals(radioButtonsPage.getSuccessMessage(),"You have selected Impressive");
//        Assert.assertTrue(radioButtonsPage.getSuccessMessage().equals("You have selected Impressive"));
//        Thread.sleep(3000);
//
//
//       }
//}
