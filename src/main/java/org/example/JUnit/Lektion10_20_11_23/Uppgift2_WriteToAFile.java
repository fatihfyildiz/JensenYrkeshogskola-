package org.example.JUnit.Lektion10_20_11_23;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Uppgift2_WriteToAFile {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("practice.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("Java är roligt!");
            bufferedWriter.newLine();
            bufferedWriter.write("Jag lär mig filhantering.");
            bufferedWriter.newLine();
            bufferedWriter.write("Snart kan jag spara data lokalt.");

            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
