//package
package com.junit.basic;

//import
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//testing class
public class ParameterizedTesting {


    //giving all even numbers to return true
    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10})
    void isEvenTestingTrue(int number){

        assertTrue(Parameterized.isEven(number));

    }


    //giving all odd numbers to return false
    @ParameterizedTest
    @ValueSource(ints = {1,3,5,7,9})
    void isEvenTestingFalse(int number){

        assertFalse(Parameterized.isEven(number));

    }

}
