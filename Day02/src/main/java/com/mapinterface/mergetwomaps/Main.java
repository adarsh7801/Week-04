//package
package com.mapinterface.mergetwomaps;

//importing
import java.util.*;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //HashMap
        Map<String, Integer> map1 = new HashMap<>();

        //putting key and value
        map1.put("A", 1);
        map1.put("B", 2);

        //HashMap
        Map<String, Integer> map2 = new HashMap<>();

        //putting key and value
        map2.put("B", 3);
        map2.put("C", 4);

        //printing both maps
        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);

        //calling method to merge both maps
        Map<String, Integer> mergedMap = MapMerger.mergeMaps(map1, map2);

        //printing the result
        System.out.println("Merged Map: " + mergedMap);
    }
}
