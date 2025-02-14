//package
package com.listinterface.nthelementfromend;

//import
import java.util.LinkedList;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //linked list
        LinkedList <Integer> ll = new LinkedList<>();

        //adding element
        ll.add(12);
        ll.add(13);
        ll.add(14);
        ll.add(15);
        ll.add(16);
        ll.add(17);

        //calling the method and printing the element
        System.out.println(SinglyLinkedList.fromEnd(ll, 1));

    }
}
