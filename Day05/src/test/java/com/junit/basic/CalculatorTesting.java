//package
package com.junit.basic;

//import
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//class
public class CalculatorTesting {

    //testing addition
    @Test
    void testAddition(){
        assertEquals(15, Calculator.add(10, 5));
    }


    //testing subtraction
    @Test
    void testSubtraction(){
        assertEquals(5, Calculator.subtract(10, 5));
    }

    //testing multiplication
    @Test
    void testMultiplication(){
        assertEquals(500, Calculator.multiply(10, 50));
    }

    //testing division
    @Test
    void testDivision(){
        assertEquals(5, Calculator.divide(10, 2));
    }


}
