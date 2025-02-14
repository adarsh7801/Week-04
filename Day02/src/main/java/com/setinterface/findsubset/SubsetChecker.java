//package
package com.setinterface.findsubset;

//import
import java.util.Set;

//class
public class SubsetChecker {

    // Method
    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {

        // Check if set2 contains all elements of set1
        return set2.containsAll(set1);
    }
}
