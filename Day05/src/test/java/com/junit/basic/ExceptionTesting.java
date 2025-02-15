//package
package com.junit.basic;

//import
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//class
public class ExceptionTesting {

    //test divide method
    @Test
    void testDivide(){

        //getting arithmetic exception in exception e
        ArithmeticException e = assertThrows(ArithmeticException.class,()->{
            Exception.divide(10, 0);
        });

        //matching testcase
        assertEquals(" You Can not divide by 0", e.getMessage());

    }

    //testing divide method again but with no 0 at denomirator
    @Test
    void testDivide2(){

        //matching testcase
        assertEquals(6, Exception.divide(12, 2));


    }

}
