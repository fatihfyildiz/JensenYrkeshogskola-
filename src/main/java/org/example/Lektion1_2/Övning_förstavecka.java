package org.example.Lektion1_2;

import java.util.Arrays;
import java.util.Scanner;

public class Övning_förstavecka {

    public static void main(String[] args) {

        // 1. Skriv ett program som skriver ut “Hello, World!” på konsolen.

        System.out.println("Hello, World!");

        // 2.  Skapa en variabel av typen int och tilldela den ett värde. Skriv sedan ut värdet på konsolen.
        // Create a variable of type int and assign it a value. Then print the value to the
        //console.

        int a = 5;
        System.out.println(a);

        // 3. Skapa två variabler av typen int och addera dem tillsammans. Skriv sedan ut resultatet på konsolen.
        // Create two variables of type int and add them together. Then print the result on the console.

        int b = 3;
        int c = 4;
        System.out.println(b + c);

        // 4. Skriv ett program där användaren kan mata in två heltal och programmet skriver ut summan av dessa tal.
        // Write a program where the user can enter two integers and the program prints the sum of these numbers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ange ett tal / Enter an integer number");
        int tal1 = scanner.nextInt();
        System.out.println("Ange ett andra tal / Enter another integer number");
        int tal2 = scanner.nextInt();
        int result = tal1 + tal2;

        System.out.println("Summan av dessa tal är / Sum of those to numbers are " + result);

        // 5. Skapa två variabler av typen double och multiplicera dem med varandra. Skriv sedan ut resultatet på konsolen.
        // Create two variables of type double and multiply them with each other. Then print the result on the console.

        System.out.println("Ange ett tal / Enter a double number");
        double tal3 = scanner.nextDouble();
        System.out.println("Ange andra tal / Enter another double number");
        double tal4 = scanner.nextDouble();
        double multiple = tal3 * tal4;

        System.out.println("Multiplikation av dessa är / Multiplication of those are " + multiple);

        // 6. Skapa en variabel av typen String och tilldela den ett namn. Skriv sedan ut “Hej, [namn]!” på konsolen.
        // Create a variable of type String and assign it a name. Then type “Hello, [name]!” on the console.

        String namn = "Fatih";

        System.out.println("Hej, " + namn);

        // 7.  Skriv ett program som kontrollerar om ett tal är jämnt eller udda.
        //  Write a program that checks whether a number is even or odd.

        int nummer = scanner.nextInt();

        if (nummer % 2 == 0 || nummer == 0) {
            System.out.println("Angivet nummer är jämnt");
        } else {
            System.out.println("Angivet nummer är udda");
        }

        // 8. Skapa en array med fem heltal och skriv ut dem i konsolen.
        //  Create an array of five integers and print them to the console.

        int minArray[] = {1, 2, 36, 81, 130};

        System.out.println(Arrays.toString(minArray));

        // 9.  Skriv ett program som beräknar medelvärdet av de fem talen i en array.
        // Write a program that calculates the average of the five numbers in an array.

        int mittArray[] = {1, 2, 3, 6, 8};

        int summa = 0;

        for (int i = 0; i < mittArray.length; i++) {
            summa += mittArray[i];
        }

        int genomsitt = summa / minArray.length;

        System.out.println("Medelvärdet av de fem talen i denna array är " + genomsitt);

        // 10.Skriv ett program som läser in en textsträng och räknar antalet tecken.
        // Write a program that reads in a text string and counts the number of characters.

        String text = "Hejsan";

        System.out.println("Antalet tecken i texten är " + text.length());

        // 11.  Skapa en for-loop som skriver ut talen 1 till 10 på konsolen.
        //  Create a for loop that prints the numbers 1 to 10 on the console.

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 12. Skapa en while-loop som skriver ut talen 10 till 1 på konsolen.
        // Create a while loop that prints the numbers 10 to 1 on the console.

        for (int i = 10; i <= 1; i--) {
            System.out.println(i);
        }

        // 13. Skapa en metod som tar emot två tal som parametrar och returnerar deras summa.
        // Create a method that receives two numbers as parameters and returns their sum.

        System.out.println("Ange det första talet / Enter the first number");
        int taletFörsta = scanner.nextInt();
        System.out.println("Ange det andra talet / Enter the second number");
        int taletAndra = scanner.nextInt();

        int resultat = summa(taletFörsta, taletAndra);

        System.out.println("Summa av de två parameters som " + resultat);

        // 14. Skapa en metod som tar emot en array som parameter och returnerar det största talet i arrayen
        // Create a method that receives an array as a parameter and returns the largest number in the array.
        // Första lösningen / First solution:

        int[] arr = {1, 0, -3, 5, 77, 28};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(arr.length);

        System.out.println("Max number is : " +arr[arr.length - 1]);

        // Andra lösningen med en metod / Second solution with a method:

        int[] myArray = {1, 66, 6, 11, 26, 34, 55, 32};
        System.out.println("Input array is : " + Arrays.toString(myArray));
        System.out.println("Max number is : " + findMax(myArray));

        // 15. Skapa en metod som tar emot en sträng som parameter och returnerar strängen baklänges.
        // Create a method that receives a string as a parameter and returns the string backwards.

        int[] mayArray = {1, 66, 6, 11, 26, 34, 55, 32};
        System.out.println("Input array is : " + Arrays.toString(mayArray));
        System.out.println("Max number is : " + findMax(mayArray));




    }

    public static int summa(int a, int b) {

        return a + b;
    }

    public static int findMax(int[] mayArray) {
        int maxVal = 0;
        for (int i = 0; i < mayArray.length; i++) {
            if (mayArray[i] > maxVal) {
                maxVal = mayArray[i];
            }
        }
        return maxVal;
    }
}
