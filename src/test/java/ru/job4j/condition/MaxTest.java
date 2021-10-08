package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when10And5Then10() {

        int first = 10;
        int second = 5;
        int expected = 10;
        int out = Max.maximum(first, second);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void when5And10Then10() {

        int first = 5;
        int second = 10;
        int expected = 10;
        int out = Max.maximum(first, second);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void when10And10Then10() {

        int first = 10;
        int second = 10;
        int expected = 10;
        int out = Max.maximum(first, second);
        Assert.assertEquals(expected, out);

    }

}