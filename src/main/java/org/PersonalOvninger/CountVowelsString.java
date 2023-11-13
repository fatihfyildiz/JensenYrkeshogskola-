package org.PersonalOvninger;

import java.util.Scanner;

public class CountVowelsString {
    public static void main(String[] args) {

        // Write a program that counts the number of vowels in a string

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter a word: ");

        String word= scanner.nextLine();

        int vowelCount= countVowels(word);

        System.out.println("Number of vowels in the word are: " + vowelCount);

        scanner.close();

    }

    public static int countVowels(String str){
        int count= 0;

        str= str.toLowerCase(); // Converting the string to lowercase in order to handle both uppercase and lowercase vowels

        for (int i = 0; i < str.length(); i++) {

            char character= str.charAt(i);

            // Let's check if the character is a vowel Not: Vowels in Swedish are "aeouiöäåy"
            if (character=='a' || character=='e' || character=='o' || character=='u' || character=='i' || character=='ö'
                || character=='ä' || character=='å' || character=='y')

                count++;
        }

        return count;
    }

}
