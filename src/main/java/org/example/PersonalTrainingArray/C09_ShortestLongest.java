package org.example.PersonalTrainingArray;

import java.util.Arrays;

public class C09_ShortestLongest {
    public static void main(String[] args) {
        // Create a method that prints the longest and shortest words in a given String array.

        System.out.println(shortestLongest());

    }

    public static String shortestLongest(){

        String arr[]= {"Ali", "Veli", "Kalle", "Ol", "Ursula"};

        String shortest= arr[0];
        String longest= arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i].length()<shortest.length()){
                shortest = arr[i];
            }

            if (arr[i].length()>longest.length()){
                longest = arr[i];
            }
        }

        System.out.println("Shortest element in the array is " + shortest);
        System.out.println("Longest element in the array is " + longest);

        return Arrays.toString(arr);
    }


}
