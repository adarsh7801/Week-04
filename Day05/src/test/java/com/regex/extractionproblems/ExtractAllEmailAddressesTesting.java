package com.regex.extractionproblems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ExtractAllEmailAddressesTesting {
    @Test
    void testExtractValidEmails() {
        String text = "Emails: user1@domain.com, user2@sub.domain.org, valid@example.co.uk";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ExtractAllEmailAddresses.extractEmail(text);
        System.setOut(System.out);
        String output = outContent.toString().trim();
        String[] emails = output.split("\n");
        assertEquals(3, emails.length);
        assertArrayEquals(new String[]{"user1@domain.com", "user2@sub.domain.org", "valid@example.co.uk"}, emails);
    }

    @Test
    void testNoEmailsInText() {
        String text = "This text has no email addresses.";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ExtractAllEmailAddresses.extractEmail(text);
        System.setOut(System.out);
        String output = outContent.toString().trim();
        assertEquals("", output);
    }

    @Test
    void testInvalidEmailsNotExtracted() {
        String text = "Emails: user1@domain.com, invalid-email@, valid@example.co.uk";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ExtractAllEmailAddresses.extractEmail(text);
        System.setOut(System.out);
        String output = outContent.toString().trim();
        String[] emails = output.split("\n");
        assertEquals(2, emails.length);
        assertArrayEquals(new String[]{"user1@domain.com", "valid@example.co.uk"}, emails);
    }
}
