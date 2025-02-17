//package
package com.exceptionpropagation;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //initializing variables
        double amount = 1000;
        double rate = 5;
        int years = -2;

        try {
            // Call the method to calculate interest
            double interest = InterestCalculator.calculateInterest(amount, rate, years);
            System.out.println("Calculated interest: " + interest);

        } catch (IllegalArgumentException e) {
            // Handle the exception
            System.out.println(e.getMessage());
        }
    }
}