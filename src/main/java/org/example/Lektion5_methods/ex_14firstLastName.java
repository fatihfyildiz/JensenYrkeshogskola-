package org.example.Lektion5_methods;

import java.util.Scanner;

public class ex_14firstLastName {
    public static void main(String[] args) {

        // Create a method that takes first name and last name,
        // and returns the name in the format "Last Name, First Name".

        System.out.println(nameFormat("Fatih"," Yildiz"));
    }

    public static String nameFormat (String firstname, String lastname){ // void yerine String yazinca mutlaka return olmali

        String name= lastname + ", " + firstname;

        return name;
    }
}
