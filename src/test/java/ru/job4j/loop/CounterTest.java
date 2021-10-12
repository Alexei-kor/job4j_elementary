package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void WhenFrom0To5Then15() {

        int start = 0;
        int finish = 5;
        int expected = 15;
        int actual = Counter.sum(start, finish);
        Assert.assertEquals(expected, actual);

    }
}