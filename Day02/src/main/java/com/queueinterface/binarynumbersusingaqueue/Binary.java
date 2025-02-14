//package
package com.queueinterface.binarynumbersusingaqueue;

//import
import java.util.LinkedList;
import java.util.Queue;

//class
public class Binary {

    //method
    public String[] generateBinaryNumbers(int n) {

        //queue of String
        Queue<String> queue = new LinkedList<>();
        String[] result = new String[n];

        //adding
        queue.add("1");

        for (int i = 0; i < n; i++) {

            // Remove from queue
            String current = queue.poll();

            // Store in result array
            result[i] = current;

            // Generate next two binary numbers
            queue.add(current + "0");
            queue.add(current + "1");
        }

        //return
        return result;
    }

}
