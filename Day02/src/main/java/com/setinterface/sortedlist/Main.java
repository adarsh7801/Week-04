//package
package com.setinterface.sortedlist;

//import
import java.util.*;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        // Create a HashSet and add elements
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);

        // Call the conversion and sorting method
        List<Integer> sortedList = SetConverter.convertAndSortSet(numbers);

        // Print the sorted list
        System.out.println("Sorted List: " + sortedList);
    }
}
