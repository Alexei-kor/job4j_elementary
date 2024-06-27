package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointEqTest {

    @Test
    public void whenXAndYNotEqualThenFalse() {

        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 4;
        boolean actual = PointEq.eq(x1, y1, x2, y2);
        Assertions.assertFalse(actual);

    }

    @Test
    public void whenXAndYEqualThenTrue() {

        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        boolean actual = PointEq.eq(x1, y1, x2, y2);
        Assertions.assertTrue(actual);

    }
}