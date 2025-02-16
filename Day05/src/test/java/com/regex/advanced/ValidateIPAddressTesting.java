package com.regex.advanced;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidateIPAddressTesting {

    @Test
    void testValidIPAddresses() {
        assertTrue(ValidateIPAddress.isValidIP("192.168.1.1"));
        assertTrue(ValidateIPAddress.isValidIP("255.255.255.255"));
        assertTrue(ValidateIPAddress.isValidIP("0.0.0.0"));
    }

    @Test
    void testInvalidIPAddresses() {
        assertFalse(ValidateIPAddress.isValidIP("256.256.256.256"));
        assertFalse(ValidateIPAddress.isValidIP("192.168.1."));
        assertFalse(ValidateIPAddress.isValidIP("192.168.1.1.1"));
        assertFalse(ValidateIPAddress.isValidIP("abc.def.ghi.jkl"));
    }

    @Test
    void testLeadingZeros() {
        assertFalse(ValidateIPAddress.isValidIP("192.168.01.1"));
        assertFalse(ValidateIPAddress.isValidIP("01.1.1.1"));
    }
}
