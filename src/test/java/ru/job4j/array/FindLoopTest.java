package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenFind777ThenMinus1() {
        int[] data = new int[] {1, 5, 6, 8, 23};
        int el = 777;
        int expected = -1;
        int actual = FindLoop.indexOf(data, el);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenFind6Then3() {
        int[] data = new int[] {1, 5, 6, 8, 23};
        int el = 6;
        int expected = 2;
        int actual = FindLoop.indexOf(data, el);
        Assert.assertEquals(expected, actual);
    }
}