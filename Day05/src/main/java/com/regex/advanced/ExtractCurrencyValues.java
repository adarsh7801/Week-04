package com.regex.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValues {

    public static List<String> extractValues(String text) {
        List<String> values = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\$?\\d+\\.\\d{2}");

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            values.add(matcher.group());
        }
        return values;
    }

    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";
        List<String> values = extractValues(text);
        for (String value : values) {
            System.out.println(value);
        }
    }
}
