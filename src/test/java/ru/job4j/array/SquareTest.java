package ru.job4j.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] expected = new int[] {0, 1, 4, 9, 16};
        int[] actual = Square.calculate(bound);
        Assertions.assertArrayEquals(expected, actual);
    }
}