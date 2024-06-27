package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxTest {

    @Test
    public void when10And5Then10() {

        int first = 10;
        int second = 5;
        int expected = 10;
        int out = Max.maximum(first, second);
        Assertions.assertEquals(expected, out);

    }

    @Test
    public void when5And10Then10() {

        int first = 5;
        int second = 10;
        int expected = 10;
        int out = Max.maximum(first, second);
        Assertions.assertEquals(expected, out);

    }

    @Test
    public void when10And10Then10() {

        int first = 10;
        int second = 10;
        int expected = 10;
        int out = Max.maximum(first, second);
        Assertions.assertEquals(expected, out);

    }

}