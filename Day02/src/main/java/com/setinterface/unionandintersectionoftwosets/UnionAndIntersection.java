//package
package com.setinterface.unionandintersectionoftwosets;

//import
import java.util.HashSet;
import java.util.Set;

//class
public class UnionAndIntersection {

    //method to find union
    public static Set<Integer> union(HashSet<Integer> set1, HashSet<Integer> set2){

        set1.addAll(set2);

        return set1;

    }

    //method to find intersection
    public static Set<Integer> intersection(HashSet<Integer> set1, HashSet<Integer> set2){

        set1.retainAll(set2);

        return set1;

    }

}
