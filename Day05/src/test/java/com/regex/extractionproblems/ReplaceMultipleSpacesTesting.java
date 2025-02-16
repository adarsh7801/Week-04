package com.regex.extractionproblems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReplaceMultipleSpacesTesting {

    @Test
    void testReplaceMultipleSpaces() {
        String input = "This   is  an   example    with multiple     spaces.";
        String expected = "This is an example with multiple spaces.";
        assertEquals(expected, ReplaceMultipleSpaces.replaceMultipleSpaces(input));
    }

    @Test
    void testNoExtraSpaces() {
        String input = "NoExtraSpacesHere";
        String expected = "NoExtraSpacesHere";
        assertEquals(expected, ReplaceMultipleSpaces.replaceMultipleSpaces(input));
    }

    @Test
    void testOnlySpaces() {
        String input = "      ";
        String expected = "";
        assertEquals(expected, ReplaceMultipleSpaces.replaceMultipleSpaces(input));
    }

    @Test
    void testLeadingAndTrailingSpaces() {
        String input = "   Leading and trailing    ";
        String expected = "Leading and trailing";
        assertEquals(expected, ReplaceMultipleSpaces.replaceMultipleSpaces(input));
    }
}
