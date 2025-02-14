//package
package com.queueinterface.implementastackusingqueues;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //object
        StackUsingQueues stack = new StackUsingQueues();

        //pushing elements
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //printing the result
        System.out.println("Top element: " + stack.top()); // Output: 3
        System.out.println("Popped: " + stack.pop());      // Output: 3
        System.out.println("Popped: " + stack.pop());      // Output: 2
        System.out.println("Stack empty? " + stack.isEmpty()); // Output: false
    }
}
