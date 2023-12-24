package org.example.Lektion5_returnMethods;

public class ex5_letterCheck {
    public static void main(String[] args) {
        //  Create a method that takes in a letter and returns true if it is vowel, otherwise false

        System.out.println(isVowel("l"));
    }

    public static boolean isVowel(String letter){
        String vowels = "AEUIO";

        if (vowels.contains(letter.toUpperCase())){
            return true;

        } else
            return false;
    }
}
