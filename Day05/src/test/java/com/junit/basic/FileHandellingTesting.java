//package
package com.junit.basic;

//import
import org.junit.jupiter.api.Test;
import java.lang.Exception;
import static org.junit.jupiter.api.Assertions.assertEquals;

//testing class
public class FileHandellingTesting {

    //string path
    String path = "C:\\Users\\Adarsh Gupta\\Desktop\\new\\repo\\Week-04\\Day05\\src\\main\\java\\com\\junit\\basic\\file.txt";
    String content = "Hello World";

    //testing
    @Test
    void writeToFileTesting() throws Exception {

        FileHandelling.writeToFile(path, content);

        assertEquals(content, FileHandelling.readFromFile(path));

    }

}
