package org.example.Lektion5_methods;

public class ex_10evenNumber {

    public static void main(String[] args) {
        // Return a Boolean: Create a method that checks if an integer is even and returns even, either/or false

        System.out.println(evenTrue(7));
        System.out.println(evenTrue(6));
    }

    public static boolean evenTrue(int number){ // sonucu boolean istedigimiz icin void yerine onu yaziyoruz
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
