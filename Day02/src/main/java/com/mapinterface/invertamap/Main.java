//package
package com.mapinterface.invertamap;

//import
import java.util.*;

//main class
public class Main {

    //main method
    public static void main(String[] args) {
        //hashmap
        Map<String, Integer> inputMap = new HashMap<>();

        //putting values
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        //printing original map
        System.out.println("Original Map: " + inputMap);

        //inverting map
        Map<Integer, List<String>> invertedMap = MapInverter.invertMap(inputMap);

        //printing inverted map
        System.out.println("Inverted Map: " + invertedMap);
    }
}
