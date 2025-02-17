//package
package com.multiplecatchblock;

//class
public class ArrayOperations {

    // Method
    public static int getValueAtIndex(int[] array, int index) throws ArrayIndexOutOfBoundsException, NullPointerException {

        if (array == null) {
            throw new NullPointerException("Array is not initialized!");
        }
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid index!");
        }
        return array[index];
    }
}