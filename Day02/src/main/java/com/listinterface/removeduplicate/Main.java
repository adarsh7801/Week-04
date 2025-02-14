//package
package com.listinterface.removeduplicate;

//import
import java.util.ArrayList;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //arraylist
        ArrayList<Integer> list = new ArrayList<>();

        //adding elements
        list.add(12);
        list.add(23);
        list.add(12);
        list.add(17);
        list.add(13);

        //calling the remove method from remove duplicate class and printing the result
        System.out.println(RemoveDuplicate.remove(list));

    }

}
