//package
package com.junit.basic;

//import
import java.util.ArrayList;

//class
public class ListManager {


    private final ArrayList<Object> list;

    //constructor
    public ListManager(){
        this.list = new ArrayList<>();
    }

    //add element method
    public int addElement(int element) {
        list.add(element);

        return element;
    }

    //remove element method
    public boolean removeElement(int element){

        return list.remove((Integer) element);
    }

    //get size method
    public int getSize(){
        return list.size();
    }

}
