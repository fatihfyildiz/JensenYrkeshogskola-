package org.example.JUnit.Lektion10_20_11_23;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {

        try {
            FileWriter writer= new FileWriter("example.txt");
            BufferedWriter bufferedWriter= new BufferedWriter(writer);

            bufferedWriter.write("Hello World!");
            bufferedWriter.newLine();
            bufferedWriter.write("Welcome to Java file handling.");

            bufferedWriter.close(); // If we don't close, it doesn't write. So, not to forget close

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}
