package org.example.Lektion3_while_doWhile;

public class KollatzKonjektur_KollatzsConjecture {

    public static void main(String[] args) {

        int n = 7;
        int temp= n;
        int counter=0;

        while (temp != 1) {
            counter++;

            if (temp %2 == 0) {
                temp /=2;

            } else {
                temp = temp*3 + 1;
            }
        }

        System.out.println(counter);
    }
}
