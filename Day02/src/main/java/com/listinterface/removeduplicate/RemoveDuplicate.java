//package
package com.listinterface.removeduplicate;

//import
import java.util.ArrayList;
import java.util.List;

//class
public class RemoveDuplicate {

    //creating method to remove duplicate
    public  static List<Integer> remove(List<Integer> list){

        //creating new arraylist
        List<Integer> temp = new ArrayList<>();

        //taking the elements from the list and then checking if the element is available in the new list or not
        for (int i=0; i<list.size(); i++){

            if (!temp.contains(list.get(i))){
                temp.add(list.get(i));
            }
        }

        //returning
        return temp;

    }

}
