//package
package com.junit.basic;

//class
public class StringUtility {

    //reverse method
    public static StringBuilder reverse(StringBuilder str){

        return str.reverse();

    }

    //is palindrome method
    public static Boolean ispalindrome(StringBuilder sb){

        StringBuilder sb1 = new StringBuilder(sb);

        if (sb.equals(sb1.reverse())){
            return true;
        }
        return false;
    }
    //to uppercase method
    public static String toUppercase(String str){

        return str.toUpperCase();

    }

}
