//package
package com.queueinterface.binarynumbersusingaqueue;

//import
import java.util.Arrays;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //object of binary class
        Binary generator = new Binary();

        // Number of binary numbers to generate
        int N = 5;

        //calling the method and saving its return value in array of string
        String[] binaryNumbers = generator.generateBinaryNumbers(N);

        //printing the result
        System.out.println(Arrays.toString(binaryNumbers));
    }
}
