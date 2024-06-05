//package com.edu.sedc.tests;
//
//import org.testng.annotations.Test;
//
//public class SelectDropDownsTests extends BaseTest {
//
//    private String [] colors = {"Green", "Blue", "Black", "Red"};
//
//    @Test
//    public void selectOldStyleDropdowns() throws InterruptedException {
//        selectMenuPage.navigateToSelectPage();
//        selectMenuPage.selectOptionsByText("Black");
//        Thread.sleep(3000);
//        selectMenuPage.selectOptionByValue("6");
//        Thread.sleep(2000);
//        selectMenuPage.selectOptionByIndex(3);
//        Thread.sleep(2000);
//    }
//
//
//
//    @Test
//    public void selectMultiselectDropDowns() throws InterruptedException {
//        selectMenuPage.navigateToSelectPage();
//        selectMenuPage.selectMultiselectDropDown("Green");
//        Thread.sleep(3000);
//        selectMenuPage.selectMultiselectDropDown("Blue");
//        Thread.sleep(3000);
//        selectMenuPage.selectMultiselectDropDown("Black");
//        Thread.sleep(3000);
//        selectMenuPage.selectMultiselectDropDown("Red");
//        Thread.sleep(3000);
//        selectMenuPage.populateMultiSelectInput(colors);
//        Thread.sleep(3000);
//    }
//
//
//
//}
