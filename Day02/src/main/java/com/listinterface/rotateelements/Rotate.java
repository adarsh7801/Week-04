//package
package com.listinterface.rotateelements;

//import
import java.util.List;

//class
public class Rotate {

    //method to rotate
    public static List<Integer> rotate(List<Integer> num , int r){

        //rotating
        for (int i=0; i<r; i++){
            int temp = num.remove(0);

            num.add(temp);
        }

        //return
        return num;
    }

}
