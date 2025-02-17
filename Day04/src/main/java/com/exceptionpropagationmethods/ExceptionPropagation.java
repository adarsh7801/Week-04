package com.exceptionpropagationmethods;

public class ExceptionPropagation {

    public static void method1() {
        int result = 10 / 0; // This will throw ArithmeticException
    }

    // Method that calls method1()
    public static void method2() {
        method1();
    }
}
