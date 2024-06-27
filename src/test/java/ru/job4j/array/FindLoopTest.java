package ru.job4j.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindLoopTest {

    @Test
    public void whenFind777ThenMinus1() {
        int[] data = new int[] {1, 5, 6, 8, 23};
        int el = 777;
        int expected = -1;
        int actual = FindLoop.indexOf(data, el);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenFind6Then3() {
        int[] data = new int[] {1, 5, 6, 8, 23};
        int el = 6;
        int expected = 2;
        int actual = FindLoop.indexOf(data, el);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void whenFindMinus2() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = -2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assertions.assertEquals(expected, result);
    }
}