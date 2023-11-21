package org.example.JUnit_Lektioner9_10.Lektion9_14_11_23;

public class Person {

    public String getFullName (String firstname, String surname){

        if (firstname==null || surname==null){
            throw new IllegalArgumentException("Input name / surname cannot be null");
        }
            return firstname + " " + surname;
    }

    public static int StringLength(String str){
        if (str== null){
            throw new IllegalArgumentException("Input name / surname cannot be null");
        }
        return str.length();
    }
}
