package ru.job4j.condition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DivideBySixTest {

    @Test
    public void whenNumberDivideBy6() {
        int in = 24;
        String result = DivideBySix.checkNumber(in);
        String expected = "Исходное число делится на 6.";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void whenNumberDivideBy3AndNotEven() {
        int in = 9;
        String result = DivideBySix.checkNumber(in);
        String expected = "Исходное число делится на 3, но не является четным.";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void whenNumberNoDivideBy3AndEven() {
        int in = 14;
        String result = DivideBySix.checkNumber(in);
        String expected = "Исходное число не делится на 3, но является четным.";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void whenNumberNoDivideBy3AndNotEven() {
        int in = 25;
        String result = DivideBySix.checkNumber(in);
        String expected = "Исходное число не делится на 3 и не является четным.";
        Assertions.assertEquals(expected, result);
    }

}