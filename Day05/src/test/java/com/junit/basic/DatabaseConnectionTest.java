package com.junit.basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// JUnit test class for DatabaseConnection
public class DatabaseConnectionTest {
    private DatabaseConnection dbConnection;

    // Runs before each test
    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    // Runs after each test
    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
    }

    // Test if connection is established
    @Test
    void testConnectionEstablished() {
        Assertions.assertTrue(dbConnection.isConnected(), "Connection should be established");
    }

    // Test if connection is closed
    @Test
    void testConnectionClosed() {
        dbConnection.disconnect();
        Assertions.assertFalse(dbConnection.isConnected(), "Connection should be closed");
    }
}
