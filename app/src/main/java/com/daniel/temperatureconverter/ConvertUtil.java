package com.daniel.temperatureconverter;

/**
 * Created by otbafrica on 11/10/17.
 */

public class ConvertUtil {

    //converts to celsius
    public static float convertFahrenheitToCelsius(float fahrenheit){
        return ((fahrenheit - 32) * 5/9);
    }

    //converts to Fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius){
        return ((celsius * 9)/5) + 32;
    }
}
