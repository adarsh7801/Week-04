//package
package com.setinterface.sortedlist;

//import
import java.util.*;

//class
public class SetConverter {

    // Method to convert a Set to a sorted List
    public static List<Integer> convertAndSortSet(Set<Integer> set) {

        // Convert Set to List
        List<Integer> sortedList = new ArrayList<>(set);

        // Sort in ascending order
        Collections.sort(sortedList);

        //return
        return sortedList;
    }
}
