//package
package com.listinterface.reverselist;

//importing
import java.util.LinkedList;

//class
public class LinkedList1 {

    //reverse method
    public static LinkedList<Integer> reverse(LinkedList<Integer> ll){

        //initializing variables
        int left = 0;
        int right = ll.size() -1;

        //reverse the list using swapping the left and right elements
        while (left<right){
            int temp = ll.get(left);
            ll.set(left, ll.get(right));
            ll.set(right, temp);
            left++;
            right--;
        }

        //returning the list
        return ll;
    }

}
