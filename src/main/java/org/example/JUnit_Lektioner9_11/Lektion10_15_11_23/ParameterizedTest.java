package org.example.JUnit_Lektioner9_11.Lektion10_15_11_23;

import org.junit.Test;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class ParameterizedTest {

    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(ints = {2,4,6,8})
    public void testEvenNumbers (int number){
        assertTrue(number%2==0);
    }

    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(strings = {"Jakob", "Kalle", "Lisa","Fatih"})
    public void containsLetterA(String str){
        assertTrue(str.contains("a"));
    }

    @Test
    public void testExpectedException(){
        assertThrows(ArithmeticException.class,()->{
            int result= 10/0;
        });
    }


}
