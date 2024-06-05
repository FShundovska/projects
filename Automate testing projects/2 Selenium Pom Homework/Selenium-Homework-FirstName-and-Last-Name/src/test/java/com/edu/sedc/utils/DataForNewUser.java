package com.edu.sedc.utils;

import org.testng.annotations.DataProvider;

public class DataForNewUser {

    @DataProvider(name = "data-for-new-user")
    public Object [][] dataNewUserObject(){
        return new Object[][]{{"Darko", "Ivanovski", "DarkoIvan", "Darko123*"},
                {"Marko", "Ivanovski", "MarkoIvan", "Marko123*"},
                {"Ivan", "Ivanovski", "IvanIvan", "Ivan123*"},
                {"Andrej", "Petrovski", "AndrejPetrovski", "Andrej321*"},
                {"Petar", "Petrovic", "PetrovicP", "PetarSRB"}
        };
    }
}
