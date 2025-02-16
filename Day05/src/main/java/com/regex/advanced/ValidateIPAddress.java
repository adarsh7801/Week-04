package com.regex.advanced;

import java.util.regex.Pattern;

public class ValidateIPAddress {

    //method to validate ip
    public static boolean isValidIP(String ip) {

        //regex to find ip address
        String ipRegex = "^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";

        return Pattern.matches(ipRegex, ip);
    }

    public static void main(String[] args) {
        String testIP1 = "192.168.1.1";
        String testIP2 = "256.256.256.256";
        System.out.println(testIP1 + " is valid: " + isValidIP(testIP1));
        System.out.println(testIP2 + " is valid: " + isValidIP(testIP2));
    }
}