//package
package com.finallyblockexecution;

//class
public class DivisionOperation {

    //method
    public static int divide (int numerator, int denominator) throws ArithmeticException{

        //throwing exception if the denominator is 0
        if (denominator ==0){
            throw new ArithmeticException("The denominator can  ot be 0");
        }

        //return
        return numerator/denominator;

    }

}
