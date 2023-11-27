package org.example.JUnit_Lektioner9_10.Lektion11_27_11_23;

import java.util.logging.Logger;

public class CalculatorService {
    LoggingService loggingService;

    public CalculatorService(LoggingService loggingService) {
        this.loggingService = loggingService;
    }

    public int add(int a, int b) {
        int result = a + b;
        loggingService.log("Adding " + a + " and " + b + ": " + result);
        return result;
    }

    public int substract(int a, int b) {
        int result = a - b;
        loggingService.log("Substracting " + b + " from " + a + ": " + result);
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            loggingService.log("Error");
            throw new ArithmeticException("Cannot divide by zero");

        } else {
            double result = a / b;
            loggingService.log("Dividing " + a + " by " + b + ": " + result);
            return result;
        }
    }


}
