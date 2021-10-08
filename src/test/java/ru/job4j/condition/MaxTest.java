package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when10And5Then5() {

        int first = 10;
        int second = 5;
        int expected = 10;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);

    }
}