//package
package com.queueinterface.circularbuffersimulation;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //object
        CircularBuffer buffer = new CircularBuffer(3);

        //inserting elements
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.display();

        // Overwrites the oldest element
        buffer.insert(4);
        buffer.display();

        // Overwrites the oldest element
        buffer.insert(5);
        buffer.display();
    }
}
