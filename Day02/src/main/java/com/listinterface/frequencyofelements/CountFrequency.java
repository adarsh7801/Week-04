//package
package com.listinterface.frequencyofelements;

//import
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//class
public class CountFrequency {

    //method to count frequency
    public static Map<String, Integer> count(List <String> fruits){

        //initializing hashmap
        Map<String, Integer> frequency = new HashMap<>();

        //initializing variable
        int i=0;

        //loop to iterate until it reaches to the last element
        while (i< fruits.size()){

            //if the hash already have the key then increase the value by 1
            if (frequency.containsKey(fruits.get(i))){

                frequency.put(fruits.get(i), frequency.get(fruits.get(i))+1);

            }

            //if not in hash then simply put it into hash and put the value 1
            else {
                frequency.put(fruits.get(i), 1);
            }

            //increase the index
            i++;

        }

        //returning
        return frequency;

    }

}
