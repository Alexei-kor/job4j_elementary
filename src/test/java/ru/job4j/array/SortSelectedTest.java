package ru.job4j.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortSelectedTest {

    @Test
    public void when34125Then12345() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void when998877Then778899() {
        int[] data = new int[] {99, 88, 77};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {77, 88, 99};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void whenManyNumbersThenSortManyNumbers() {
        int[] data = new int[] {3, 4, 1, 15, 73, 54, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4, 5, 15, 54, 73};
        Assertions.assertArrayEquals(expected, result);
    }
}