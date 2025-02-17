package com.exceptionpropagationmethods;

public class Main {
    public static void main(String[] args) {

        try {
            ExceptionPropagation.method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
