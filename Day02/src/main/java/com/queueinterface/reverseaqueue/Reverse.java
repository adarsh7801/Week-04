//package
package com.queueinterface.reverseaqueue;

//import
import java.util.Queue;

//class
public class Reverse {

    //method to reverse queue
    public static Queue<Integer> reverseQueue(Queue queue){

        //return if queue is empty
        if (queue.isEmpty()){
            return queue;
        }

        //removing element from queue and storing it in front variable
        int front = (int) queue.remove();

        //calling recursive function
        queue = reverseQueue(queue);

        //adding it in front
        queue.add(front);

        //return
        return queue;

    }

}
