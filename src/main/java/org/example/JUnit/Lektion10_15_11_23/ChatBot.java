package org.example.JUnit.Lektion10_15_11_23;

import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        ChatBot chatBot= new ChatBot();
        Scanner scanner= new Scanner(System.in);
        String prompt= scanner.nextLine();
        System.out.println(chatBot.reply(prompt));

    }

    public String reply(String prompt){

        if (prompt.equals("Hello!")){
            return "Hi!";
        } else if (prompt.equals("Goodbye")) {
            return "Don't go!";
        }
        return "I don't understand";
    }
}
