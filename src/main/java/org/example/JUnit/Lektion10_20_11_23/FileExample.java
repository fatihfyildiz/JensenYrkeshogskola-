package org.example.JUnit.Lektion10_20_11_23;

import java.io.File;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) {

        try {
            File myFile= new File("example.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());

            } else {

            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}
