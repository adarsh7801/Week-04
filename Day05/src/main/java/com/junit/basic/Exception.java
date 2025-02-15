//package
package com.junit.basic;

//class
public class Exception {

    //method
    public static double divide(int a, int b){

        //if denominator is 0 the throw exception
        if (b==0){
            throw new ArithmeticException("Can not divide by 0");
        }

        //if no exception then return
        return a/b;

    }


}
