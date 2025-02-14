//package
package com.listinterface.reverselist;

//import
import java.util.List;

//class
public class ArrayList1 {

    //method to reverse the arraylist
    public List<Integer> reverse(List<Integer> list){

        //initializing variables
        int left =0;
        int right = list.size() -1;

        //reversing the list using swapping left and right elements
        while(left<right){
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            right--;
            left++;
        }

        //returning the list
        return  list;

    }

}