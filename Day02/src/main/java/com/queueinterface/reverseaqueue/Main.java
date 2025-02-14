//package
package com.queueinterface.reverseaqueue;

//import

import java.util.LinkedList;
import java.util.Queue;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //making queue and adding elements
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        //printing the original queue
        System.out.println("Original queue "+queue);

        //calling the reverse queue function and printing the result
        System.out.println("Reversed queue "+ Reverse.reverseQueue(queue));

    }
}
