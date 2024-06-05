/*package com.edu.sedc.tests;

import com.edu.sedc.pages.LoginPage;
import com.edu.sedc.pages.RegistrationPage;
import com.edu.sedc.utils.Data;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Element;

public class RegistrationTests extends BaseTests {

    @Test
            (dataProvider = "registrationData", dataProviderClass = Data.class)
    public void registrationTest(String firstname, String lastname, String username, String password) {

        RegistrationPage registrationPage = new RegistrationPage(driver, wait);
        js.executeScript("arguments[0].scrollIntoView();", Element);
        registrationPage.clickNewUser();
        registrationPage.populateRegistrationFields(firstname, lastname, username, password);

        registrationPage.clickRegister();

        // Assert "Please Verify Recaptcha to register" message
        String expectedRecaptchaMessage = "Please Verify Recaptcha to register";
        String actualRecaptchaMessage = registrationPage.getRecaptchaMessage();
        Assert.assertEquals(actualRecaptchaMessage, expectedRecaptchaMessage,
                "Unexpected message for Recaptcha validation");
    }
}*/

package com.edu.sedc.tests;

import com.edu.sedc.pages.LoginPage;
import com.edu.sedc.pages.RegistrationPage;
import com.edu.sedc.utils.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test(dataProvider = "data-for-newUser", dataProviderClass = Data.class)
    public void testNewUser(String firstName, String lastName, String userName, String password) {
        registrationPage.navigateToRegisterPage();
        js.executeScript("window.scrollBy(0, 500)", "");
        registrationPage.clickNewUserButton();
        registrationPage.enterFirstName(firstName);
        registrationPage.enterLastName(lastName);
        registrationPage.enterUserName(userName);
        registrationPage.enterPassword(password);
        js.executeScript("window.scrollBy(0, 500)", "");
        registrationPage.clickRegisterButton();

        js.executeScript("window.scrollBy(0, 500)", "");

        Assert.assertEquals(registrationPage.getRecaptchaMessage(),"Please verify reCaptcha to register!");

    }
}

