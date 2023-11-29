package org.example.PersonalTrainingArray;

import java.util.Arrays;

public class C05_ShiftElementsRight_1 {

    public static void main(String[] args) {
        // Create a method that will shift all the elements of a given array to the right,
        // move the last element to the beginning, and save the array in its new form.

        System.out.println(shiftRight());

    }

    public static String shiftRight(){

        int [] array = {1,2,3,4,5,11,14,23};

        int [] newArray = new int[array.length];

        newArray[0]=array[array.length-1];

        for (int i=1; i<=array.length-1; i++){
            newArray[i]=array[i-1];
        }
        return Arrays.toString(newArray);

    }


}
