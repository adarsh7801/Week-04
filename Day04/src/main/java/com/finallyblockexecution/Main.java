//package
package com.finallyblockexecution;

//import
import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //scanner object
        Scanner sc = new Scanner(System.in);

        //try block
        try {
            System.out.println("Enter the numerator");
            int numerator = sc.nextInt();

            System.out.println("Enter the denominator");
            int denominator = sc.nextInt();

            System.out.println(DivisionOperation.divide(numerator, denominator));
        }

        //catching if it shows exception
        catch (ArithmeticException e) {
            System.out.println("Exception "+e.getMessage());
        }

        //finally block
        finally {

            sc.close();
            System.out.println("Executed");
        }
    }

}
