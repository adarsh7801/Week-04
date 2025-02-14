package com.setinterface.symmetricdifference;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        //sets
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Add elements to the sets
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Call the symmetricDifference method
        HashSet<Integer> result = SetOperations.symmetricDifference(set1, set2);

        // Display the result
        System.out.println("Symmetric Difference: " + result);
    }
}

