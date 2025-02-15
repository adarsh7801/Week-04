//package
package com.junit.basic;

//import
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//testing class
public class StringUtilityTesting {

    //testing reverse method
    @Test
    void testReverse(){

        StringBuilder sb = new StringBuilder("Hello");

        assertEquals(sb.reverse(), StringUtility.reverse(sb));
    }

    //testing palindrome method
    @Test
    void testPalindrome(){

        StringBuilder sb = new StringBuilder("Hello");

        assertFalse(StringUtility.ispalindrome(sb));

    }


    //testing to uppercase method
    @Test
    void toUppercase(){

        String str = "Hello";

        assertEquals(str.toUpperCase(), StringUtility.toUppercase(str));

    }


}
