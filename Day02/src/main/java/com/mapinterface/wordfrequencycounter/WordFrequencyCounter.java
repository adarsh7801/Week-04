//package
package com.mapinterface.wordfrequencycounter;

//import
import java.io.*;
import java.util.*;

//class
public class WordFrequencyCounter {

    //method
    public static Map<String, Integer> countWordFrequency(String filePath) {

        //map
        Map<String, Integer> wordCountMap = new HashMap<>();

        //handelling exception
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z\\s]", "");

                // Split into words
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        //return
        return wordCountMap;
    }
}
