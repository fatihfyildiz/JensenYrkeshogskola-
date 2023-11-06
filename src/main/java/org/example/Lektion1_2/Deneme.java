package org.example.Lektion1_2;

import java.util.Arrays;

public class Deneme {

    public static void main(String[] args) {

        // Create a method that receives an array as a parameter and returns the largest number in the array.

        int[] mayArray = {1, 66, 6, 11, 26, 34, 55, 32};
        System.out.println("Input array is : " + Arrays.toString(mayArray));
        System.out.println("Max number is : " + findMax(mayArray));

    }

    public static int findMax(int[] myArray) {
        int maxVal = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > maxVal) {
                maxVal = myArray[i];
            }
        }
        return maxVal;
    }

}