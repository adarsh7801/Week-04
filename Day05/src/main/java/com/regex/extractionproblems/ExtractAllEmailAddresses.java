package com.regex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllEmailAddresses {

    public static void main(String[] args) {

        String text = "Emails: user1@domain.com, user2@sub.domain.org, invalid-email@, valid@example.co.uk";
        
        extractEmail(text);
        
    }

    public static void extractEmail(String text){

        String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

}
