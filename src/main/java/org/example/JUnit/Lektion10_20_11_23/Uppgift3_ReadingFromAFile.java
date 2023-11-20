package org.example.JUnit.Lektion10_20_11_23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Uppgift3_ReadingFromAFile {

    public static void main(String[] args) {

        try {
            FileReader reader= new FileReader("practice.txt");
            BufferedReader bufferedReader= new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

    }
}
