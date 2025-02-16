package com.junit.advanced;

import org.junit.jupiter.api.Test;

import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTesting {

    @Test
    void testFormatDate_ValidDate() {
        // Test valid date format conversion
        assertEquals("25-12-2023", DateFormatter.formatDate("2023-12-25"));
        assertEquals("01-01-2020", DateFormatter.formatDate("2020-01-01"));
        assertEquals("31-07-1999", DateFormatter.formatDate("1999-07-31"));
    }

    @Test
    void testFormatDate_InvalidDate() {
        // Test invalid date format
        DateTimeParseException exception = assertThrows(DateTimeParseException.class, () -> {
            DateFormatter.formatDate("2023-13-25"); // Invalid month
        });
        assertTrue(exception.getMessage().contains("Invalid value for MonthOfYear"));

        // Test invalid date format (wrong separator)
        exception = assertThrows(DateTimeParseException.class, () -> {
            DateFormatter.formatDate("2023/12/25"); // Invalid separator
        });
        assertTrue(exception.getMessage().contains("could not be parsed"));

        // Test invalid date format (invalid day)
        exception = assertThrows(DateTimeParseException.class, () -> {
            DateFormatter.formatDate("2023-02-30"); // Invalid day for February
        });
        assertTrue(exception.getMessage().contains("Invalid date 'February 30'"));
    }


}
