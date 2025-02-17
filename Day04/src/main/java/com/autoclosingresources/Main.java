//package
package com.autoclosingresources;

//import
import java.io.IOException;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Adarsh Gupta\\Desktop\\new\\repo\\Week-04\\Day04\\src\\main\\java\\com\\autoclosingresources\\info.txt";

        try {
            //calling the function
            String firstLine = FileHandler.readFirstLine(filePath);

            //checking if the file is empty
            if (firstLine != null) {
                System.out.println("First line of the file: " + firstLine);
            } else {
                System.out.println("The file is empty.");
            }

        } catch (IOException e) {

            //handling the exception if it throws
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}