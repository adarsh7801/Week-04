//package
package com.mapinterface.keywithhighestvalue;

//import
import java.util.*;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //map
        Map<String, Integer> inputMap = new HashMap<>();

        //putting key and value
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        //printing original map
        System.out.println("Original Map: " + inputMap);

        //calling method and storing the highest value in String variable
        String maxKey = MaxKeyFinder.findMaxKey(inputMap);

        //printing the highest value
        System.out.println("Key with Highest Value: " + maxKey);
    }
}
