//package
package com.setinterface.unionandintersectionoftwosets;

//import
import java.util.HashSet;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //hash set
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        //adding value
        set1.add(12);
        set1.add(13);
        set1.add(14);
        set1.add(15);
        set1.add(16);
        set1.add(17);
        set1.add(18);
        set1.add(19);
        set1.add(20);
        set1.add(21);
        set1.add(22);

        set2.add(20);
        set2.add(21);
        set2.add(22);
        set2.add(23);
        set2.add(24);
        set2.add(25);
        set2.add(26);
        set2.add(27);
        set2.add(28);
        set2.add(29);
        set2.add(30);


        //calling method and printing output
        System.out.println(UnionAndIntersection.union(set1, set2));
        System.out.println(UnionAndIntersection.intersection(set1, set2));

    }

}
