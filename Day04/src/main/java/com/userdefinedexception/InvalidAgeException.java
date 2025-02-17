//package
package com.userdefinedexception;

//class extending runtime exception class
public class InvalidAgeException extends Exception{

    //constructor
    InvalidAgeException(){
        super("Exception: Age must be 18 or above");
    }

}
