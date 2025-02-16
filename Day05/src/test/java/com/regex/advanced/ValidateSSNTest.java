package com.regex.advanced;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidateSSNTest {

    @Test
    void testValidSSN() {
        assertTrue(ValidateSSN.isValidSSN("123-45-6789"));
        assertTrue(ValidateSSN.isValidSSN("987-65-4321"));
    }

    @Test
    void testInvalidSSN() {
        assertFalse(ValidateSSN.isValidSSN("123456789"));  // Missing hyphens
        assertFalse(ValidateSSN.isValidSSN("12-345-6789")); // Incorrect format
        assertFalse(ValidateSSN.isValidSSN("123-456-789")); // Incorrect middle part
        assertFalse(ValidateSSN.isValidSSN("123-45-678"));  // Incomplete SSN
    }
}
