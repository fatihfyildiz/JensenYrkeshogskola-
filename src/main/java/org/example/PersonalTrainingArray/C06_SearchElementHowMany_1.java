package org.example.PersonalTrainingArray;

public class C06_SearchElementHowMany_1 {

    public static void main(String[] args) {

        // Create a method that prints whether a desired element exists in a given array and how many times it is used.

        System.out.println(ifExistHowManyTimes(5));

    }

    public static String ifExistHowManyTimes(int expected){

        int array[] = {1,2,3,4,5,6,7,5,5,8,9,5,0};

        int count=0;

        for (int i=0; i<array.length; i++){

            if(array[i]==expected){
                count++;
            }
        }

        String result = "Total occurance of " + expected + ": " + count + " times";

        return result;
    }
}
