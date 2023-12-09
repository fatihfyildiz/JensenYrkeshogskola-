package org.example.JUnit_Lektioner9_11.Lektion10_15_11_23;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChatBotTest {

    @Test
    public void testReply(){
        ChatBot chatBot= new ChatBot();
        String reply= chatBot.reply("Hello!");

        assertEquals("Hi!", reply);
        assertEquals("Hi!", chatBot.reply("Hello!"));
    }

}
