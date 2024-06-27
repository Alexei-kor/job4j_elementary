package ru.job4j.converter;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {

        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assertions.assertEquals(expected, out, eps);

    }

    @Test
    public void whenConvert140RblThen233Dollars() {

        float in = 140;
        float expected = 2.3334f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assertions.assertEquals(expected, out, eps);

    }

    @Test
    void  whenConvert150RblThen2Euro() {
        float input = 150;
        float expected = 2.5f;
        float res = Converter.rubleToDollar(input);
        Assertions.assertEquals(expected, res);
    }
}