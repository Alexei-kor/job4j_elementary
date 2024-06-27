package ru.job4j.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FitTest {

    @Test
    public void whenManHeight187Then100() {

        short in = 187;
        double expected = 100.04;
        double out = Fit.manWeight(in);
        double diff = 0.01;
        Assertions.assertEquals(expected, out, diff);

    }

    @Test
    public void whenWomanHeight187Then88() {

        short in = 187;
        double expected = 88.54;
        double out = Fit.womanWeight(in);
        double diff = 0.01;
        Assertions.assertEquals(expected, out, diff);

    }
}