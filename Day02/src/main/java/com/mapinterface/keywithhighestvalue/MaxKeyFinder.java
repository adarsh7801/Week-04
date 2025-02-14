//package
package com.mapinterface.keywithhighestvalue;

//import
import java.util.Map;

//class
public class MaxKeyFinder {

    //method
    public static String findMaxKey(Map<String, Integer> map) {

        // Return null if the map is empty
        if (map.isEmpty()) {
            return null;
        }

        //initializing variables
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        //finding the max value
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        //returning
        return maxKey;
    }
}
