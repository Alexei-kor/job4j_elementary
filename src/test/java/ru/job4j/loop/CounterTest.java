package ru.job4j.loop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    @Test
    public void whenFrom0To5Then15() {

        int start = 0;
        int finish = 5;
        int expected = 15;
        int actual = Counter.sum(start, finish);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void whenFrom0To10OnlyEvenThen30() {

        int start = 0;
        int finish = 10;
        int expected = 30;
        int actual = Counter.sumByEven(start, finish);
        Assertions.assertEquals(expected, actual);

    }

}