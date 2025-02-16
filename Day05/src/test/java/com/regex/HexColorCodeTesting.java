package com.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HexColorCodeTesting {

    //test the Hex Color Code
    @Test
    void validateHexColorCodeTesting(){

        assertTrue(HexColorCode.validateHexColorCode("#ABC231"));
        assertTrue(HexColorCode.validateHexColorCode("#CBa431"));
        assertTrue(HexColorCode.validateHexColorCode("#Dac563"));
        assertTrue(HexColorCode.validateHexColorCode("#bfD673"));
        assertTrue(HexColorCode.validateHexColorCode("#Cae742"));
        assertTrue(HexColorCode.validateHexColorCode("#dEa673"));

    }

}
