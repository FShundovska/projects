package com.edu.sedc.tests;

import com.edu.sedc.pages.LinksPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksTest extends BaseTest {

    @Test
    public void testLinksOption () {
        linksPage.navigateToLinksPage();
        linksPage.clickOnCreatedOption();
        linksPage.clickOnNoContentOption();
        js.executeScript("window.scrollBy(0, 500)", "");
        linksPage.clickOnMovedOption();
        linksPage.clickOnBadRequestOption();
        linksPage.clickOnUnauthorizedOption();
        linksPage.clickOnForbiddenOption();
        linksPage.clickOnNotFoundOption();

        Assert.assertEquals(linksPage.isClickedOnCratedOption(), "Created");
        Assert.assertEquals(linksPage.isClickedOnNoContentOption(),"No Content");
        Assert.assertEquals(linksPage.isClickedOnMovedOption(),"Moved");
        Assert.assertEquals(linksPage.isClickedOnBadRequestOption(),"Bad Request");
        Assert.assertEquals(linksPage.isClickedOnUnauthorizedOption(),"Unauthorized");
        Assert.assertEquals(linksPage.isClickedOnForbiddenOption(), "Forbidden");
        Assert.assertEquals(linksPage.isClickedOnNotFoundOption(), "Not Found");
    }
}
