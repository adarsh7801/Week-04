package com.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateUsernameTesting {

    //test method
    @Test
    void ValidateUsernameTesting(){

        assertTrue(ValidateUsername.username("hello_123"));
        assertTrue(ValidateUsername.username("shivam_rathore050"));
        assertTrue(ValidateUsername.username("bhopal_College"));
        assertTrue(ValidateUsername.username("fann_movie"));
        assertTrue(ValidateUsername.username("sajantumsepyaarkiladaimain"));

    }

}
