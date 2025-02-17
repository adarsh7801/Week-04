//package
package com;

//import
import java.util.InputMismatchException;
import java.util.Scanner;

//class
public class UncheckedException {

    //main method
    public static void main(String[] args) {

        //scanner object
        Scanner sc = new Scanner(System.in);

        //trying to execute code
        try {

            //taking input
            System.out.println("Enter the first number");
            int a = sc.nextInt();

            System.out.println("Enter the second number");
            int b = sc.nextInt();

            //dividing and printing the output
            int result = a/b;
            System.out.println("The division of both the numbers is "+result);

        }

        //catch if input mismatch exception occurs
        catch (InputMismatchException e){

            //if exception occurs then handelling the exception
            System.out.println("The value you have entered is not a integer value");
            System.out.println(e.getMessage());
        }

        //catch if input arithmetic exception occurs
        catch (ArithmeticException e) {

            //if exception occurs then handelling the exception
            System.out.println("Can not divide by 0");
            System.out.println(e.getMessage());

        }

        //finally block that will definately execute
        finally {

            //releasing the resources
            sc.close();
        }



    }

}
