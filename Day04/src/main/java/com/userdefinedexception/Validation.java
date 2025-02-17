//package
package com.userdefinedexception;

//class
public class Validation {

    //method
    public static void validateAge(int age){

        //try block
        try {
            if (age<18){
                throw new InvalidAgeException();
            }
            else {
                System.out.println("Valid age");
            }
        }

        //catch block
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

}
