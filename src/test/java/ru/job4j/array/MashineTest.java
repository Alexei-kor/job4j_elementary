package ru.job4j.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MashineTest {

    @Test
    public void whenEquals() {
        int money = 100;
        int price = 100;
        int[] result = Mashine.change(money, price);
        int[] expected = {};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void when50by35() {
        int money = 50;
        int price = 35;
        int[] result = Mashine.change(money, price);
        int[] expected = {10, 5};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void when50by21() {
        int money = 50;
        int price = 21;
        int[] result = Mashine.change(money, price);
        int[] expected = {10, 10, 5, 2, 2};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void when50by32() {
        int money = 50;
        int price = 32;
        int[] result = Mashine.change(money, price);
        int[] expected = {10, 5, 2, 1};
        Assertions.assertArrayEquals(expected, result);
    }
}