package org.example.JUnit_Lektioner9_11.Lektion11_27_11_23;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

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

    @Test
    public void testAddFunctionLogsCorrectly(){
        // Create a mock for the LoggingService
        LoggingService mockLoggingService= mock(LoggingService.class);

        // Create an instance of CalculatorService using the mock
        CalculatorService calculatorService= new CalculatorService(mockLoggingService);

        // Perform the operation
        int expected= 5;
        int actual= calculatorService.add(2,3);

        // Verify that the result is correct
        assertEquals(expected,actual);

        // Verify that the log method was called once with the expected message
        verify(mockLoggingService).log("Adding 2 and 3: 5");
    }

    @Test
    public void testSubstractFunctionLogsCorrectly(){ // Övning 2: Utöka CalculatorService (Extend CalculatorService)

        // Create a mock for the LoggingService
        LoggingService mockLoggingService= mock(LoggingService.class);

        // Create an instance of CalculatorService using the mock
        CalculatorService calculatorService= new CalculatorService(mockLoggingService);

        // Perform the operation
        int expected= 1;
        int actual= calculatorService.substract(7,6);

        // Verify that the result is correct
        assertEquals(expected,actual);

        // Verify that the log method was called once with the expected message
        verify(mockLoggingService).log("Substracting 6 from 7: 1");
    }

    @Test
    public void testDivideFunctionLogsCorrectly(){ // Övning 4: Division ***
        // Create a mock for the LoggingService
        LoggingService mockLoggingService= mock(LoggingService.class);

        // Create an instance of CalculatorService using the mock
        CalculatorService calculatorService= new CalculatorService(mockLoggingService);

        // Perform the operation
        double expected= 2;
        double actual= calculatorService.divide(8,4);

        // Verify that the result is correct
        assertEquals(expected,actual,0);

        // Verify that the log method was called once with the expected message
        verify(mockLoggingService).log("Dividing 8.0 by 4.0: 2.0");

    }

    @Test
    public void testDivideByZeroFunctionLogsCorrectly(){ // Övning 4: Hantera Fel (Handling Errors)
        // Create a mock for the LoggingService
        LoggingService mockLoggingService= mock(LoggingService.class);

        // Create an instance of CalculatorService using the mock
        CalculatorService calculatorService= new CalculatorService(mockLoggingService);

        // Verify that the log method was called once with the expected message
        assertThrows(ArithmeticException.class, () -> calculatorService.divide(10, 0));

        verify(mockLoggingService).log("Error");

        // verify(mockLoggingService).log(anyString()); ==> this verifies everytime since it accepts any String
        // anyString() ==> it's Argument Matcher

        // verify(mockLoggingService).logError(anyString()); ==> this also works
        // logError(...) ==> Övning 8:  Flera Metoder i Mock (Several Methods in Mock)

    }

    @Test
    public void testAddMethodLogsCorrectly2() { // Övning 7:  Verifiera Loggning med Mock (Verify Logging with Mock)
        // Create a mock for the LoggingService
        LoggingService mockLoggingService= Mockito.mock(LoggingService.class);

        // Create an instance of CalculatorService using the mock
        CalculatorService calculatorService = new CalculatorService(mockLoggingService);

        // Call the add method
        int result = calculatorService.add(2,6);

        // Verify that LoggingService.log is called with the correct arguments
        verify(mockLoggingService).log("Adding 2 and 6: 8");

        // You can also verify that the add method returns the correct value
        assertEquals(8, result);

    }


}
