package org.example.JUnit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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

        @Test
        public void TestDivision(){
            Calculator calculator= new Calculator();
            int result= calculator.division(10,2);
            assertEquals(5,result);
            // assertThrows(ArithmeticException.class, () -> Calculator.division(10, 0));
        }

        @Test
        public void TestSubstruction(){
            Calculator calculator= new Calculator();
            int result= calculator.division(3,8);
            assertEquals(-5,result);
        }
}
