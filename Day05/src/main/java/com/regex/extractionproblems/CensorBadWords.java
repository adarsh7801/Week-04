package com.regex.extractionproblems;

import java.util.regex.Pattern;

public class CensorBadWords {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        String[] badWords = {"damn", "stupid"};
        System.out.println(censorBadWords(text, badWords));
    }

    //method to censor bad words
    public static String censorBadWords(String text, String[] badWords) {

        for (String word : badWords) {
            text = text.replaceAll("\\b" + Pattern.quote(word) + "\\b", "****");
        }
        return text;
    }
}
