package com.junit.advanced;

public class TemperatureConverter {

    public static double degreeToFahrenheit(double degree){

        return (degree * 9/5) + 32;

    }

    public static double fahrenheitToDegree(double fahrenheit){

        return (fahrenheit - 32)* 5/9;

    }

}
