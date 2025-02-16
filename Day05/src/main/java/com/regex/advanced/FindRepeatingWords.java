package com.regex.advanced;

import java.util.regex.*;
import java.util.*;

public class FindRepeatingWords {

    public static Set<String> findRepeatingWords(String text) {
        Set<String> repeatingWords = new HashSet<>();
        Pattern pattern = Pattern.compile("\\b(\\w+)\\b(?:.*\\b\\1\\b)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }

        return repeatingWords;
    }

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        Set<String> repeatedWords = findRepeatingWords(text);
        System.out.println(repeatedWords);
    }
}
