package com.regex.advanced;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class validateCreditCardTesting {

    @Test
    void testValidVisaCard() {
        assertTrue(ValidateCreditCard.isValidCard("4111111111111111"));
        assertTrue(ValidateCreditCard.isValidCard("4000123412341234"));
    }

    @Test
    void testValidMasterCard() {
        assertTrue(ValidateCreditCard.isValidCard("5111111111111111"));
        assertTrue(ValidateCreditCard.isValidCard("5200123412341234"));
    }

    @Test
    void testInvalidCreditCards() {
        assertFalse(ValidateCreditCard.isValidCard("6111111111111111"));
        assertFalse(ValidateCreditCard.isValidCard("4111111111111"));
        assertFalse(ValidateCreditCard.isValidCard("5000123412341234"));
        assertFalse(ValidateCreditCard.isValidCard("abcd123412341234"));
    }
}
