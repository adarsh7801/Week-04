package com.regex.extractionproblems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class ExtractAllLinksTesting {
    @Test
    void testExtractLinks() {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ExtractAllLinks.extractLinks(text);
        System.setOut(System.out);
        String output = outContent.toString().trim();
        List<String> links = Arrays.stream(output.split("\\n"))
                .map(String::trim)
                .collect(Collectors.toList());
        assertEquals(2, links.size());
        assertTrue(links.contains("https://www.google.com"));
        assertTrue(links.contains("http://example.org"));
    }

    @Test
    void testNoLinksInText() {
        String text = "This text has no links.";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ExtractAllLinks.extractLinks(text);
        System.setOut(System.out);
        String output = outContent.toString().trim();
        assertEquals("", output);
    }
}