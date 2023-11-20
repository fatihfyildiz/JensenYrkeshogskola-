package org.example.JUnit.Lektion10_20_11_23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Uppgift5_ExtendedFileManagement {
    public static void main(String[] args) {

    try {
        FileReader reader= new FileReader("practice.txt");
        BufferedReader bufferedReader= new BufferedReader(reader);

        String line;
        int count=0;

        while ((line = bufferedReader.readLine()) != null){
            count++;
            System.out.println(line);

        }
        System.out.println(count);

    } catch (IOException e) {
        System.out.println("An error occurred");
        e.printStackTrace();
    }

    }
}
