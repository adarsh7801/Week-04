package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorCode {

    public static void main(String[] args) {

        System.out.println(validateHexColorCode("#aBd675"));

    }

    //method to validate hex color
    public static boolean validateHexColorCode(String hexColor){

        //regex to find validate color
        String regex = "^#[0-9A-Fa-f]{6}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(hexColor);

        if (matcher.matches()){
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        return matcher.matches();

    }

}
