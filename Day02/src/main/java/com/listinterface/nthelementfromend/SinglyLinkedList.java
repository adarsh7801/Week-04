//package
package com.listinterface.nthelementfromend;

//import
import java.util.Iterator;
import java.util.LinkedList;

//class
public class SinglyLinkedList {

    //method
    public static int fromEnd(LinkedList<Integer> ll, int indexFromEnd) {

        //iterator object
        Iterator<Integer> itr = ll.iterator();
        Iterator<Integer> itr2 = ll.iterator();

        //moving iterator
        for (int i=0; i<indexFromEnd; i++){
            itr.next();
        }

        //moving both iterator
        while (itr.hasNext()){
            itr.next();
            itr2.next();
        }

        //returning
        return itr2.next();


    }
}
