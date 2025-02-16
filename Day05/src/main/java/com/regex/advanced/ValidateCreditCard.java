package com.regex.advanced;

import java.util.regex.Pattern;

public class ValidateCreditCard {

    public static boolean isValidCard(String cardNumber) {
        String visaRegex = "^4\\d{15}$";
        String masterCardRegex = "^5\\d{15}$";
        return Pattern.matches(visaRegex, cardNumber) || Pattern.matches(masterCardRegex, cardNumber);
    }

    public static void main(String[] args) {
        System.out.println(isValidCard("4111111111111111"));
        System.out.println(isValidCard("5111111111111111"));
        System.out.println(isValidCard("6111111111111111"));
    }
}
