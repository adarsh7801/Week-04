package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlateNumber {

    //method to validate numberplate according to regex
    public static boolean validateNumber(String number){

        //regex to validate the condition
        String regex = "^[A-Z]{2}[0-9]{4}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(number);

        return matcher.matches();

    }

}