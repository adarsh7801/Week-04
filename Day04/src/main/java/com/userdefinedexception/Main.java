//package
package com.userdefinedexception;

//import
import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //scanner object
        Scanner sc = new Scanner(System.in);

        //input
        System.out.println("Please enter the age");
        int age = sc.nextInt();

        //calling method
        Validation.validateAge(age);

    }

}
