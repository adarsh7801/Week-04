package com.setinterface.symmetricdifference;

import java.util.HashSet;

public class SetOperations {

    // Method
    public static <T> HashSet<T> symmetricDifference(HashSet<T> set1, HashSet<T> set2) {

        //copy sets
        HashSet<T> result = new HashSet<>(set1);
        HashSet<T> temp = new HashSet<>(set2);

        result.removeAll(set2);
        temp.removeAll(set1);

        result.addAll(temp);

        //return
        return result;
    }
}
