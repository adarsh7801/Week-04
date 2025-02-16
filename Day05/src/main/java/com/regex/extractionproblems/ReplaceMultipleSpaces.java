package com.regex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceMultipleSpaces {

    public static void main(String[] args) {
        String text = "This   is  an   example    with multiple     spaces.";
        System.out.println(replaceMultipleSpaces(text));
    }

    public static String replaceMultipleSpaces(String text) {
        return text.replaceAll("\\s+", " ").trim();
    }
}
