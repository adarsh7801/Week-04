package com.junit.advanced;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTesting {

    @Test
    void testRegisterUser_ValidInput() {
        // Test valid user registration
        assertDoesNotThrow(() -> {
            UserRegistration.registerUser("john_doe", "john.doe@example.com", "password123");
        });
    }

    @Test
    void testRegisterUser_InvalidUsername() {
        // Test empty username
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("", "john.doe@example.com", "password123");
        });
        assertEquals("Username cannot be empty.", exception.getMessage());

        // Test null username
        exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser(null, "john.doe@example.com", "password123");
        });
        assertEquals("Username cannot be empty.", exception.getMessage());
    }

    @Test
    void testRegisterUser_InvalidEmail() {
        // Test invalid email format
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("john_doe", "invalid-email", "password123");
        });
        assertEquals("Invalid email address.", exception.getMessage());

        // Test null email
        exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("john_doe", null, "password123");
        });
        assertEquals("Invalid email address.", exception.getMessage());
    }

    @Test
    void testRegisterUser_InvalidPassword() {
        // Test short password
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("john_doe", "john.doe@example.com", "pass");
        });
        assertEquals("Password must be at least 8 characters long.", exception.getMessage());

        // Test null password
        exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("john_doe", "john.doe@example.com", null);
        });
        assertEquals("Password must be at least 8 characters long.", exception.getMessage());
    }
}