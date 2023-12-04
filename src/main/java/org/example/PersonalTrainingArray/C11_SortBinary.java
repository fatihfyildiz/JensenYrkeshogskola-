package org.example.PersonalTrainingArray;

import java.util.Arrays;

public class C11_SortBinary {
    public static void main(String[] args) {

        // Java has its own search method which is called as binarySearch

        String[] arr = {"Fatih","Jacob","Kalle","Anna","Olle","Ursula","Yngve"};

        System.out.println(Arrays.toString(arr)); // [Fatih, Jacob, Kalle, Anna, Olle, Ursula, Yngve]

        System.out.println(Arrays.binarySearch(arr, "Ahmet")); // - 1 ==> Since Ahmet is not found, it turns with negative
        // Although it is not sorted, Java consider it as sorted and turns the place order as 1

        System.out.println(Arrays.binarySearch(arr, "Olle")); // 4 ==> index of Olle after sort is 4

        Arrays.sort(arr); // Sorting the elements due to the alphabetical/Natural Order

        System.out.println(Arrays.toString(arr)); // [Anna, Fatih, Jacob, Kalle, Olle, Ursula, Yngve]

        System.out.println(Arrays.binarySearch(arr, "Jacob")); // 1 ==> index of Fatih after sort is 1

        System.out.println(Arrays.binarySearch(arr, "Olle")); // 4 ==> index of Olle after sort is 4

        System.out.println(Arrays.binarySearch(arr, "Björn")); // -2 ==> Since Björn is not found, it turns with negative
        // 2 is the possible alphabetical/natural order of Björn, if it founds

        System.out.println(Arrays.binarySearch(arr, "Leo")); // -5 ==> Since Leo is not found, it turns with negative
        // 5 is the possible alphabetical/natural order of Leo, if it founds

        System.out.println(Arrays.binarySearch(arr, "Zeo")); // -8 ==> Since Zeo is not found, it turns with negative
        // 8 is the possible alphabetical/natural order of Zeo, if it founds


    }
}
