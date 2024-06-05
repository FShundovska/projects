package com.edu.sedc.tests;


import com.edu.sedc.pages.LinksPages;
import com.edu.sedc.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LinksTests extends BaseTest {

    @Test
    public void testLinksPages (){

        linksPages.navigateToLinksPage();
        linksPages.clickOnCreatedOption();
        linksPages.clickOnNoContentOption();
        js.executeScript("window.scrollBy(0, 500)", "");
        linksPages.clickOnMovedOption();
        linksPages.clickOnBadRequestOption();
        linksPages.clickOnUnauthorizedOption();
        linksPages.clickOnForbiddenOption();
        linksPages.clickOnNotFoundOption();

        Assert.assertEquals(linksPages.isClickedOnCreatedOption(), "Created");
        Assert.assertEquals(linksPages.isClickedOnNoContentOption(),"No Content");
        Assert.assertEquals(linksPages.isClickedOnMovedOption(),"Moved");
        Assert.assertEquals(linksPages.isClickedOnBadRequestOption(),"Bad Request");
        Assert.assertEquals(linksPages.isClickedOnUnauthorizedOption(),"Unauthorized");
        Assert.assertEquals(linksPages.isClickedOnForbiddenOption(), "Forbidden");
        Assert.assertEquals(linksPages.isClickedOnNotFoundOption(), "Not Found");


    }
}