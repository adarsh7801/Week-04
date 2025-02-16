package com.regex.advanced;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;
import java.util.HashSet;

public class FindRepeatingWordsTest {

    @Test
    void testFindRepeatingWords() {
        String text = "This is is a repeated repeated word test.";
        Set<String> expected = new HashSet<>();
        expected.add("is");
        expected.add("repeated");

        Set<String> result = FindRepeatingWords.findRepeatingWords(text);
        assertEquals(expected, result);
    }

    @Test
    void testNoRepeatingWords() {
        String text = "Every word is unique in this sentence.";
        Set<String> result = FindRepeatingWords.findRepeatingWords(text);
        assertTrue(result.isEmpty());
    }

    @Test
    void testCaseInsensitiveRepeatingWords() {
        String text = "Hello hello world World world.";
        Set<String> expected = new HashSet<>();
        expected.add("world");

        Set<String> result = FindRepeatingWords.findRepeatingWords(text.toLowerCase());
        assertEquals(expected, result);
    }
}
