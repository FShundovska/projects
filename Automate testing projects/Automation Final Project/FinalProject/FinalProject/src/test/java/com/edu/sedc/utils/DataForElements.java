package com.edu.sedc.utils;

import org.testng.annotations.DataProvider;

public class DataForElements {
    public static void configureBrowser() {
        // Set up browser options (e.g., headless mode, timeouts)
    }

    @DataProvider(name = "data-for-createAnAccount")
    public Object[][] dataTextBoxObject() {
        return new Object[][]{{"Marry120", "Moop", "Moop120@mail.com", "P@ssw0rd123@", "P@ssw0rd123@"},
              //  {"John4", "Doe", "john4@mail.com", "password12345!", "password12345!"},
              //  {"Betty4", "Boop", "betty4@mail.com", "Boop123@", "Boop123@"}
        };
    }

    @DataProvider(name = "data-for-signIn")
    public Object[][] dataForSignIn() {
        return new Object[][]{{"Moop120@mail.com", "P@ssw0rd123@"},
              //  {"john1@mail.com", "password12345!"},
              //  {"betty1@mail.com", "Boop123@"}
        };
    }
}