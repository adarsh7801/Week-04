//package
package com.listinterface.reverselist;

//import
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //making object of arraylist1 class
        ArrayList1 al = new ArrayList1();

        //initializing arraylist
        List<Integer> list = new ArrayList<>();

        //adding elements in the list
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);

        //calling the reverse method in the ArrayList1 class and printing the result
        System.out.println(al.reverse(list));

        //initializing linked list
        LinkedList<Integer> ll = new LinkedList<>();

        //adding elements in the linked list
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        // calling the reverse method in the linked list 1 class and printing the result
        System.out.println(LinkedList1.reverse(ll));


    }

}
