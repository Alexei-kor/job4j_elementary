package ru.job4j.loop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        Assertions.assertTrue(result);
    }

    @Test
    public void when4() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        Assertions.assertFalse(result);
    }

    @Test
    public void when1() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        Assertions.assertFalse(result);
    }
}