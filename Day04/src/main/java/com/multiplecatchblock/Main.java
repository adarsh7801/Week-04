//package
package com.multiplecatchblock;

//import
import java.util.Scanner;

//main
public class Main {

    //main method
    public static void main(String[] args) {

        //scanner object
        Scanner sc = new Scanner(System.in);

        try {
            //array input
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] array = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            //input the index to get data
            System.out.print("Enter the index to retrieve the value: ");
            int index = sc.nextInt();

            //retrive the data
            int value = ArrayOperations.getValueAtIndex(array, index);
            System.out.println("Value at index " + index + ": " + value);
        }

        //catching the array index out of bound exception if it throw
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }

        //catching the array null pointer exception if it throw
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }

        //finally block
        finally {
            //releasing the resources
            sc.close();
        }
    }
}