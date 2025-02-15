//package
package com.junit.basic;

//class
public class Calculator {

    //addition method
    public static int add(int a, int b){
        return a+b;
    }

    //subtraction method
    public static int subtract(int a, int b){
        return a-b;
    }

    //multiplication method
    public static int multiply(int a, int b){
        return a*b;
    }

    //division method
    public static double divide(int a, int b){

        double answer = 0;

        try {
            answer = a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Division by 0 not allow");
            System.out.println(e.getMessage());
        }
        return answer ;
    }

}
