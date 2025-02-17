//package
package com;

//import
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//class
public class CheckedException {

    //main method
    public static void main(String[] args) {

        //saving path in string
        String path = "data.txt";

        //handelling exception if occured
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){

            int character;

            //printing text in the console
            while ((character= reader.read())!= 0-1){
                System.out.println((char) character);
            }


            //catching the exception
        } catch (IOException e) {

            //printing message if exception occured
            System.out.println("IOException occured");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());


        }

    }

}
