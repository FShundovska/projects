package com.edu.sedc.utils;

import org.testng.annotations.DataProvider;

public class DataForElements {

    @DataProvider(name = "data-for-login")
    public Object[][] dataForLogin () {
        return new Object[][]{{"standard_user", "secret_sauce"},
                {"error_user", "Boop123@"}
        };
    }
    @DataProvider(name = "data-for-checkOut")
    public Object[][] dataForCheckOut() {
        return new Object[][]{{"Betty", "Boop", "postal code 1000"},
                {"Meggie", "Moop", "posal code 2000"},
                {"Alice", "Smith", "postal code 3000"}
        };
    }
    @DataProvider(name = "data-for-addToCart")
    public Object[][] dataForAddToCart() {
        return new Object[][]{{"add-to-cart-sauce-labs-backpack"},
                {"add-to-cart-sauce-labs-bike-light"},
                {"add-to-cart-sauce-labs-bolt-t-shirt"},
                {"add-to-cart-sauce-labs-fleece-jacket"}
        };
    }
}


