//package
package com.mapinterface.wordfrequencycounter;

//import
import java.util.Map;

//main class
public class Main {

    //main method
    public static void main(String[] args) {


        String filePath = "C:\\Users\\Adarsh Gupta\\Desktop\\Capgemini\\Week04\\Day02\\src\\main\\java\\com\\mapinterface\\wordfrequencycounter\\sample.txt\\";

        Map<String, Integer> wordFrequency = WordFrequencyCounter.countWordFrequency(filePath);

        // Display word frequencies
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
