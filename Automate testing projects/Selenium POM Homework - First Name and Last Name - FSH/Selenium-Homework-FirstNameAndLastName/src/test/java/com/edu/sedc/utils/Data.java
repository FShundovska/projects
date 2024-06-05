/*package com.edu.sedc.utils;

import org.testng.annotations.DataProvider;

public class Data {

    @DataProvider(name="data-for-textbox")
    public Object[][] dataTextBoxObject(){
        return new Object[][] {{"Fani Shundovska", "mail@mail.com", "Address1","Address2"},
                {"John Doe", "john@mail.com", "Address3","Address4"},
                {"Max Musterman", "max@mail.com","Address 5", "Address6"}
        };
    }

    @DataProvider(name = "userCredentials")
    public Object[][] userCredentials() {
        // Return arrays of username and password combinations
        return new Object[][] {
                {"user1", "password1"},
                {"user2", "password2"},
                {"user3", "password3"},
                {"user4", "password4"},
                {"user5", "password5"}
        };
    }

    @DataProvider(name = "registrationData")
    public Object[][] registrationData() {
        // Return arrays of firstname, lastname, username, and password
        return new Object[][] {
                {"John", "Doe", "john.doe1", "pass123"},
                {"Jane", "Smith", "jane.smith2", "securepwd"},
                /*{"Alice", "Johnson", "alice.j", "p@ssw0rd"},
                {"Bob", "Brown", "bobby", "123456"},
                {"Eva", "Garcia", "eva_g", "qwerty"}*/
        /*};
    }
}*/

package com.edu.sedc.utils;

import org.testng.annotations.DataProvider;

public class Data{

    @DataProvider(name = "data-for-login")
    public Object[][] dataLoginObject() {
        return new Object[][]{{"SSTest", "Sanja!123"},
                {"john123", "Password123"},
                {"alice789", "P@ssw0rd"},

        };
    }

    @DataProvider(name = "data-for-newUser")
    public Object[][] dataForNewUser() {
        return new Object[][]{{"Fani", "Shundovska", "FaniSH", "FSHP@ssw0rd123"},
                {"John", "Doe", "JohnDoe", "JDP@ssw0rd123"},
                {"Max", "Musterman", "MaxM", "MMP@ssw0rd123"},
                {"SS", "SS", "SSTest", "Sanja!123"},

        };
    }
}