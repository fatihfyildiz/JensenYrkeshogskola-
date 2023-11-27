package org.example.JUnit_Lektioner9_10.Lektion11_27_11_23;

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
}
