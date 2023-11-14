package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

        @Test
        public void TestAdd(){

            Calculator calculator = new Calculator();
            int result = calculator.add(2, 3);
            assertEquals(4,result);

        }

        @Test
    public void TestMultiply(){

            Calculator calculator= new Calculator();
            int result= calculator.multiply(3,5);
            assertEquals(15, result);
        }
}
