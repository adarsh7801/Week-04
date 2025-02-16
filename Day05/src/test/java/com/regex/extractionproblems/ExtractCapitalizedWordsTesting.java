package com.regex.extractionproblems;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtractCapitalizedWordsTesting {

    @Test
    void testExtractCapitalizedWords() {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ExtractCapitalizedWords.extractWords(text);
        System.setOut(System.out);
        String output = outContent.toString().trim();
        String[] words = output.split("\n");
        assertEquals(7, words.length);
        assertArrayEquals(new String[]{"Eiffel", "Tower", "Paris", "Statue", "Liberty", "New", "York"}, words);
    }

    @Test
    void testNoCapitalizedWords() {
        String text = "this is a sentence with no capitalized words.";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ExtractCapitalizedWords.extractWords(text);
        System.setOut(System.out);
        String output = outContent.toString().trim();
        assertEquals("", output);
    }

}
