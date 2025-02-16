package com.regex.advanced;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExtractCurrencyValuesTest {

    @Test
    void testExtractCurrencyValues() {
        String text = "The price is $45.99, and the discount is 10.50.";
        List<String> values = ExtractCurrencyValues.extractValues(text);
        assertEquals(2, values.size());
        assertEquals("$45.99", values.get(0));
        assertEquals("10.50", values.get(1));
    }

    @Test
    void testNoCurrencyValues() {
        String text = "There are no prices mentioned here.";
        List<String> values = ExtractCurrencyValues.extractValues(text);
        assertTrue(values.isEmpty());
    }

    @Test
    void testMultipleCurrencyValues() {
        String text = "$5.00, 20.99, and $100.75 are the prices.";
        List<String> values = ExtractCurrencyValues.extractValues(text);
        assertEquals(3, values.size());
        assertEquals("$5.00", values.get(0));
        assertEquals("20.99", values.get(1));
        assertEquals("$100.75", values.get(2));
    }
}
