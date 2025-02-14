//package
package com.setinterface.checkiftwosetsareequal;

//import
import java.util.HashSet;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //initializing hashsets
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        //adding elements
        set1.add(12);
        set1.add(14);

        set2.add(14);
        set2.add(12);

        //calling the method and printing the result
        System.out.println("Set 1 "+set1+" Set 2 "+set2+" and the result is "+Sets.compare(set1, set2));


    }

}
