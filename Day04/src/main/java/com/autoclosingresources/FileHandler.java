//package
package com.autoclosingresources;

//import
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//FileHandler class
public class FileHandler {

    //method
    public static String readFirstLine(String filePath) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Read and return the first line of the file
            return br.readLine();
        }
    }
}