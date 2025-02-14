//package
package com.setinterface.findsubset;

//import
import java.util.HashSet;
import java.util.Set;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        // Define two sets and add elements
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Check if set1 is a subset of set2
        boolean result = SubsetChecker.isSubset(set1, set2);

        // Print the result
        System.out.println("Is Set1 a subset of Set2? " + result);
    }
}
