package com.regex.extractionproblems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ExtractAllDatesTesting {
    @Test
    void testExtractDates() {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ExtractAllDates.extractDates(text);
        System.setOut(System.out);
        String output = outContent.toString().trim();
        String[] dates = output.split("\n");
        assertEquals(3, dates.length);
        assertArrayEquals(new String[]{"12/05/2023", "15/08/2024", "29/02/2020"}, dates);
    }

    @Test
    void testNoDatesInText() {
        String text = "There are no valid dates here.";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ExtractAllDates.extractDates(text);
        System.setOut(System.out);
        String output = outContent.toString().trim();
        assertEquals("", output);
    }
}
