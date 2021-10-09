package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointEqTest {

    @Test
    public void whenXAndYNotEqualThenFalse() {

        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 4;
        boolean actual = PointEq.eq(x1, y1, x2, y2);
        Assert.assertFalse(actual);

    }

    @Test
    public void whenXAndYEqualThenTrue() {

        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        boolean actual = PointEq.eq(x1, y1, x2, y2);
        Assert.assertTrue(actual);

    }
}