package org.example.JUnit.Lektion10_15_11_23;

import org.junit.Test;

import java.io.ByteArrayInputStream;

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
