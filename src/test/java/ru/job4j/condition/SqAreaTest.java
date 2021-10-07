package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP7K2() {
        double p = 7;
        double k = 2;
        double expected = 2.73;
        double out = SqArea.square(p, k);
        double diff = 0.01;
        Assert.assertEquals(expected, out, diff);
    }

    @Test
    public void whenP9K3() {
        double p = 9;
        double k = 3;
        double expected = 3.80;
        double out = SqArea.square(p, k);
        double diff = 0.01;
        Assert.assertEquals(expected, out, diff);
    }
}