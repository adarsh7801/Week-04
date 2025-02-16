package com.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateLicensePlateNumberTesting {

    //test the validate numberplate
    @Test
    void validateNumberTesting(){

        assertTrue(ValidateLicensePlateNumber.validateNumber("AE0275"));
        assertTrue(ValidateLicensePlateNumber.validateNumber("MG6999"));
        assertTrue(ValidateLicensePlateNumber.validateNumber("LF3456"));
        assertTrue(ValidateLicensePlateNumber.validateNumber("AX8364"));
        assertTrue(ValidateLicensePlateNumber.validateNumber("VF4365"));
        assertTrue(ValidateLicensePlateNumber.validateNumber("FV3674"));

    }

}
