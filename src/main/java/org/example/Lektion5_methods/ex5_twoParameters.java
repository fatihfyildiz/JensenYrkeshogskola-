package org.example.Lektion5_methods;

public class ex5_twoParameters {
    public static void main(String[] args) {
    // Create a method that takes in two strings: firstname and lastname. The method should then return the full name.
        nameSurname("Fatih", "Yildiz");
    }

    public static void nameSurname(String förnamn, String efternamn){
        System.out.println("Your fullname is "+ förnamn + " " + efternamn);
    }


}
