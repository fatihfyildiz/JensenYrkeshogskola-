package org.example.JUnit_Lektioner9_11.Lektion9_14_11_23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class StackTest {

    @Test
    public void TestStack(){
        Stack stack = new Stack();

        stack.push("Jakob");

        assertEquals("Jakob",stack.pop());

        stack.push("Kalle");
        stack.push("Lisa");

        assertEquals("Lisa",stack.pop());

        assertEquals("Kalle",stack.pop());

        assertEquals(null,stack.pop());
        
    }

}
