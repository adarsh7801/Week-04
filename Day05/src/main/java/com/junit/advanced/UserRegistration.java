package com.junit.advanced;

public class UserRegistration {

    public static void registerUser(String username, String email, String password) throws IllegalArgumentException {
        // Validate username
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty.");
        }

        // Validate email
        if (email == null || !email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Invalid email address.");
        }

        // Validate password
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long.");
        }

        // If all validations pass, register the user (simulated here)
        System.out.println("User registered successfully: " + username);
    }
}