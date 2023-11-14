package org.example.JUnit;

public class Person {

    public String getFullName (String firstname, String surname){

        if (firstname.equals(null) || surname.equals(null)){
            return "invalid, try again";
        } else {
            return firstname + " " + surname;
        }

    }
}
