package ru.job4j.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to2() {
        int[] input = {1, 2, 3, 4};
        int source = 1;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 3, 2, 4};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {1, 2, 3, 4};
        int source = 2;
        int dest = 0;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {3, 2, 1, 4};
        Assertions.assertArrayEquals(expected, result);
    }
}