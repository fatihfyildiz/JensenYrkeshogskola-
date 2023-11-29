package org.example.PersonalTrainingArray;

import java.util.Arrays;

public class C01_AddingToEachElement_1 {

    public static void main(String[] args) {

        // Create a method that increases all elements of a given int array by 2 and returns it to us.
        // Save the old array with the new elements.

        int[] arr= {2,4,6,8};
        int increaseAmount= 3;

        arr= addingElements(arr, increaseAmount);

        System.out.println("The old array now becomes: " + Arrays.toString(arr));

    }

    public static int[] addingElements(int[] arr, int increaseAmount){

        for (int i = 0; i < arr.length; i++) {

            arr [i] += increaseAmount; // or  arr [i] = arr [i] + increaseAmount
        }
        return arr;
    }



}
