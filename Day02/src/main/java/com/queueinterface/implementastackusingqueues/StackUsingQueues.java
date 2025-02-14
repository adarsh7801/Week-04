//package
package com.queueinterface.implementastackusingqueues;

//import
import java.util.LinkedList;
import java.util.Queue;

//class
public class StackUsingQueues {

    //making queue
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public StackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push element to stack
    public void push(int x) {
        q1.add(x);
    }

    // Pop element from stack
    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }

        // Move all elements except last to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        // Last element is the one to be popped
        int topElement = q1.poll();

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Get top element
    public int top() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }

        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        int topElement = q1.peek(); // Peek the last element

        q2.add(q1.poll()); // Move last element to q2

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
