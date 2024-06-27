package ru.job4j.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurnTest {

    @Test
    public void when1234567Then7654321() {
        int[] in = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] actual = Turn.back(in);
        int[] expected = new int[] {7, 6, 5, 4, 3, 2, 1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void when1234Then4321() {
        int[] in = new int[] {1, 2, 3, 4};
        int[] actual = Turn.back(in);
        int[] expected = new int[] {4, 3, 2, 1};
        Assertions.assertArrayEquals(expected, actual);
    }

}