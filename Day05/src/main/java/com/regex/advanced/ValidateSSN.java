package com.regex.advanced;

import java.util.regex.*;

public class ValidateSSN {

    public static boolean isValidSSN(String ssn) {
        Pattern pattern = Pattern.compile("^\\d{3}-\\d{2}-\\d{4}$");
        Matcher matcher = pattern.matcher(ssn);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testSSNs = {"123-45-6789", "123456789", "987-65-4321", "12-345-6789"};

        for (String ssn : testSSNs) {
            if (isValidSSN(ssn)) {
                System.out.println(ssn + "\" is valid");
            } else {
                System.out.println(ssn + "\" is invalid");
            }
        }
    }
}
