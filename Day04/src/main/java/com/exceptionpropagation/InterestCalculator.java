//package
package com.exceptionpropagation;

//class
public class InterestCalculator {

    //method
    public static void validateInput(double amount, double rate) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive.");
        }
    }

    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {

        // Validate input using the validateInput method
        validateInput(amount, rate);

        // Calculate and return the simple interest
        return amount * rate * years / 100;
    }
}