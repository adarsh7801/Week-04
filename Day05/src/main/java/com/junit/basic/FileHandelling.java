//package
package com.junit.basic;

//import
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//class
public class FileHandelling {

    //method to write in file
    public static void writeToFile(String filename, String content) throws IOException {

        Path path = Paths.get(filename);

        Files.write(path, content.getBytes(StandardCharsets.UTF_8));

    }

    //method to read from file
    public static String readFromFile(String fileName) throws IOException {

        Path path = Paths.get(fileName);

        String str = Files.readString(path);

        return str;

    }

}