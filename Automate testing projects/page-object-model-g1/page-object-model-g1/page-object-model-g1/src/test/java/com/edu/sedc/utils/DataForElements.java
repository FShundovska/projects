package com.edu.sedc.utils;

import org.testng.annotations.DataProvider;

public class DataForElements {

    @DataProvider(name = "data-for-textbox")
    public Object[][] dataTextBoxObject() {
        return new Object[][]{{"Fani Shundovska", "mail@mail.com", "Address1", "Address2"},
                {"John Doe", "john@mail.com", "Address3", "Address4"},
                {"Max Musterman", "max@mail.com", "Address 5", "Address6"}
        };
    }

    @DataProvider(name = "data-for-login")
    public Object[][] dataForLogin() {
        return new Object[][]{{"John1 Doe1", "P@ssw0rd"}
                               //...............
        };

    }

    @DataProvider(name = "data-for-register")
    public Object[][] dataForRegister() {
        return new Object[][]{{"SS", "SS", "SSTest", "Sanja!123.."},
                {"John2", "Doe2", "john123", "Password123"},
                {"Alice2", "Smith2", "alice789", "P@ssw0rd"},
                //...............
        };
    }
}
