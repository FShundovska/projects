package com.edu.sedc.utils;

import org.testng.annotations.DataProvider;

public class DataForLogin {

    @DataProvider(name = "data-for-login")
    public Object[][] dataLoginObject() {
        return new Object[][]{{"DarkoMKD", "darko123*"},
                {"DarkoIvan", "DarkoMKD"},
                {"IvanovskiDarko", "DARKOIV"},
                {"DarkoI", "darko91*"},
                {"IvanovskiDarko", "divan91"}
        };
    }
}
