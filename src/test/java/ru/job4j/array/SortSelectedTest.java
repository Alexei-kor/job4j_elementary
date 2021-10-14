package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void when34125Then12345() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when998877Then778899() {
        int[] data = new int[] {99, 88, 77};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {77, 88, 99};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenManyNumbersThenSortManyNumbers() {
        int[] data = new int[] {3, 4, 1, 15, 73, 54, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4, 5, 15, 54, 73};
        Assert.assertArrayEquals(expected, result);
    }
}