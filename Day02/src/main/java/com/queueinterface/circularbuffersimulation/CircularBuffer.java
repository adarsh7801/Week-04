//package
package com.queueinterface.circularbuffersimulation;

//class
class CircularBuffer {

    //initializing variables
    private int[] buffer;
    private int front, rear, size, capacity;

    //constructor
    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Insert element (overwrite if full)
    public void insert(int value) {
        rear = (rear + 1) % capacity;
        buffer[rear] = value;

        if (size < capacity) {
            size++;
        } else {
            front = (front + 1) % capacity; // Move front to overwrite oldest element
        }
    }

    // Display buffer contents
    public void display() {
        System.out.print("Buffer: ");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}
