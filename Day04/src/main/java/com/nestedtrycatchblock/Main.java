package com.nestedtrycatchblock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //taking size of an array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];


        System.out.println("Enter " + size + " elements:");

        //Enter array element
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        //index input
        System.out.print("Enter index to access: ");
        int index = scanner.nextInt();

        //divisor inout
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        //handling the exception with nested try catch
        try {
            try {
                int element = array[index];
                try {
                    int result = element / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            scanner.close();
        }
    }
}
