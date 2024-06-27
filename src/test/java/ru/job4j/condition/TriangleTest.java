package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    public void when72912ThenFalse() {

        double ab = 7;
        double ac = 29;
        double bc = 12;
        boolean actual = Triangle.exist(ab, ac, bc);
        Assertions.assertFalse(actual);

    }

    @Test
    public void when7105ThenFalse() {

        double ab = 7;
        double ac = 10;
        double bc = 5;
        boolean actual = Triangle.exist(ab, ac, bc);
        Assertions.assertTrue(actual);

    }
}