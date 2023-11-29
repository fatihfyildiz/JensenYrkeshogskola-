package org.example.PersonalTrainingArray;

import java.util.Arrays;

public class C02_AddingtoEachElement_2 {

    public static void main(String[] args) {

        // Create a method that increases all elements of a given int array by 2 and returns it to us.
        // Save the old array with the new elements.

        int[] arr= {2,4,6,8};
        int increaseAmount= 3;

        int[] newArray= addingElements(arr, increaseAmount);

        System.out.println("New array: " + Arrays.toString(newArray));

        arr=newArray;

        System.out.println("The old array now becomes: " + Arrays.toString(newArray));

    }

    public static int[] addingElements(int[] arr, int increaseAmount){

        for (int i = 0; i < arr.length; i++) {

            arr [i] = arr [i] + increaseAmount; // arr [i] += increaseAmount;
        }
        return arr;
    }

}
