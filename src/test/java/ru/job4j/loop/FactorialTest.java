package ru.job4j.loop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int expected = 120;
        int actual = Factorial.calc(n);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int expected = 1;
        int actual = Factorial.calc(n);
        Assertions.assertEquals(expected, actual);
    }
}