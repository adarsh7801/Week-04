//package
package com.listinterface.frequencyofelements;

//import
import java.util.ArrayList;
import java.util.List;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //Array list of string datatype
        List<String> fruits = new ArrayList<>();


        //adding fruits in the list
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");


        //calling the count function in the count frequency class and
        // passing the list fruits in it and then printing the return value
        System.out.println(CountFrequency.count(fruits));

    }

}
