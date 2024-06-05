package com.edu.sedc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTests extends BaseTest{

    @Test
    public void testFrames(){
        frames.navigateToFramePage();
        frames.switchToIframe();
        Assert.assertEquals(frames.getHeadingText(), "This is a sample page");
        frames.switchToMainPage();
    }

}
