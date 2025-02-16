package com.regex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllDates {

    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        extractDates(text);
    }

    //method to extract date
    public static void extractDates(String text) {

        //regex to extract dates
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
