package org.example.PersonalTrainingArray;

import java.util.Arrays;

public class C10_AddingNewElement {

    public static void main(String[] args) {
        // Adding a new element to the first index a given array

        System.out.println(addNew());

    }

    public static String addNew(){

        int[] arr= {1,0,-3,7};
        int[] newArr= new int[5];

        newArr[0]= 5;

        for (int i = 1; i < newArr.length; i++) {
            newArr[i]= arr[i-1];
        }
      return Arrays.toString(newArr);
    }

}
