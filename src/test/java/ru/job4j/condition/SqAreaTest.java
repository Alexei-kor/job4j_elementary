package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SqAreaTest {

    @Test
    public void whenP7K2Then273() {
        double p = 7;
        double k = 2;
        double expected = 2.73;
        double out = SqArea.square(p, k);
        double diff = 0.01;
        Assertions.assertEquals(expected, out, diff);
    }

    @Test
    public void whenP9K3Then38() {
        double p = 9;
        double k = 3;
        double expected = 3.80;
        double out = SqArea.square(p, k);
        double diff = 0.01;
        Assertions.assertEquals(expected, out, diff);
    }
}