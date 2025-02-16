package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {

    //method to take username as input and check its validation
    public static boolean username(String userName){

        //regex to validate username according to condition
        String regex = "^\\D+\\w*${5,15}";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(userName);

        return matcher.matches();

    }

}
