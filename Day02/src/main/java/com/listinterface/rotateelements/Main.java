//package
package com.listinterface.rotateelements;

//import
import java.util.ArrayList;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //initializing arraylist
        ArrayList<Integer> num = new ArrayList<>();

        //adding elements in the arraylist
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);

        //calling the rotate method in the rotate class and printing the Return value
        System.out.println(Rotate.rotate(num , 3));

    }
}
