package com.regex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllLinks {

    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        extractLinks(text);
    }

    //method to find link
    public static void extractLinks(String text) {

        //regex to extract link
        String regex = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
