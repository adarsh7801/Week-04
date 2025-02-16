package com.junit.advanced;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTesting {

    @Test
    void degreeToFahrenheitTesting() {

        assertEquals(32.0, TemperatureConverter.degreeToFahrenheit(0));

        assertEquals(212.0, TemperatureConverter.degreeToFahrenheit(100));

        assertEquals(-40.0, TemperatureConverter.degreeToFahrenheit(-40));
    }

    @Test
    void fahrenheitToDegreeTesting() {

        assertEquals(0.0, TemperatureConverter.fahrenheitToDegree(32));

        assertEquals(100.0, TemperatureConverter.fahrenheitToDegree(212));

        assertEquals(-40.0, TemperatureConverter.fahrenheitToDegree(-40));

        assertEquals(1.67, TemperatureConverter.fahrenheitToDegree(35));

        assertEquals(8.33, TemperatureConverter.fahrenheitToDegree(47));

        assertEquals(-11.11, TemperatureConverter.fahrenheitToDegree(12));
    }
}