//package
package com.junit.basic;

//import
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//class
public class ListManagerTesting {

    //object of the class
    ListManager listManager = new ListManager();

    //testing add element method
    @Test
    void testAddElement(){
        int addedValue = listManager.addElement(10);

        assertEquals(10, addedValue);
    }

    //testing remove element method
    @Test
    void testRemoveElement(){

        listManager.addElement(13);
        boolean removed = listManager.removeElement(13);

        assertTrue(removed);

    }
    //testing get size
    @Test
    void testGetSize(){

        listManager.addElement(12);
        listManager.addElement(34);
        listManager.addElement(23);

        assertEquals(3, listManager.getSize());

    }


}
