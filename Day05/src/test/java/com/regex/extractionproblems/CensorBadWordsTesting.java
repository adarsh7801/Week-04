package com.regex.extractionproblems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CensorBadWordsTesting {

    @Test
    void testCensorBadWords() {
        String input = "This is a damn bad example with some stupid words.";
        String[] badWords = {"damn", "stupid"};
        String expected = "This is a **** bad example with some **** words.";
        assertEquals(expected, CensorBadWords.censorBadWords(input, badWords));
    }

    @Test
    void testNoBadWords() {
        String input = "This is a clean sentence.";
        String[] badWords = {"damn", "stupid"};
        String expected = "This is a clean sentence.";
        assertEquals(expected, CensorBadWords.censorBadWords(input, badWords));
    }

    @Test
    void testPartialMatchNotCensored() {
        String input = "This is damning evidence.";
        String[] badWords = {"damn"};
        String expected = "This is damning evidence.";
        assertEquals(expected, CensorBadWords.censorBadWords(input, badWords));
    }

    @Test
    void testMultipleOccurrences() {
        String input = "Damn, that was stupid! Damn, I forgot again!";
        String[] badWords = {"damn", "stupid"};
        String expected = "****, that was ****! ****, I forgot again!";
        assertEquals(expected, CensorBadWords.censorBadWords(input, badWords));
    }
}
