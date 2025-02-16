package com.junit.advanced;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordStrengthValidatorTesting {

    @Test
    void testValidPasswords() {
        // Valid passwords
        assertTrue(PasswordStrengthValidator.isValid("Password1"));
        assertTrue(PasswordStrengthValidator.isValid("Secure123"));
        assertTrue(PasswordStrengthValidator.isValid("StrongPass9"));
    }

    @Test
    void testInvalidPasswords() {
        // Invalid passwords (less than 8 characters)
        assertFalse(PasswordStrengthValidator.isValid("Pass1"));
        assertFalse(PasswordStrengthValidator.isValid("1234"));

        // Invalid passwords (no uppercase letter)
        assertFalse(PasswordStrengthValidator.isValid("password1"));
        assertFalse(PasswordStrengthValidator.isValid("12345678"));

        // Invalid passwords (no digit)
        assertFalse(PasswordStrengthValidator.isValid("Password"));
        assertFalse(PasswordStrengthValidator.isValid("SecurePass"));

        // Invalid passwords (no uppercase and no digit)
        assertFalse(PasswordStrengthValidator.isValid("password"));
        assertFalse(PasswordStrengthValidator.isValid("weakpass"));
    }

}
