package org.example.JUnit_Lektioner9_10.Lektion11_27_11_23;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorServiceIntegrationTest {
    @Test
    public void testAddFunction() {
        LoggingService loggingService = new LoggingService() {
            @Override
            public void log(String message) {
                System.out.println("Log: " + message);
            }
        };
        CalculatorService calculatorService = new CalculatorService(loggingService);
        int result = calculatorService.add(2, 3);
        assertEquals("Summan ska vara 5", 5, result);
    }

}
