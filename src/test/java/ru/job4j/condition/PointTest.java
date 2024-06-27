package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    @Test
    public void when5678Then283() {

        int x1 = 5;
        int y1 = 6;
        int x2 = 7;
        int y2 = 8;
        double expected = 2.83;
        double out = Point.distance(x1, y1, x2, y2);
        double diff = 0.01;
        Assertions.assertEquals(expected, out, diff);

    }

    @Test
    public void when9111112Then224() {

        int x1 = 9;
        int y1 = 11;
        int x2 = 11;
        int y2 = 12;
        double expected = 2.24;
        double out = Point.distance(x1, y1, x2, y2);
        double diff = 0.01;
        Assertions.assertEquals(expected, out, diff);

    }

    @Test
    public void when15162122Then849() {

        int x1 = 15;
        int y1 = 16;
        int x2 = 21;
        int y2 = 22;
        double expected = 8.49;
        double out = Point.distance(x1, y1, x2, y2);
        double diff = 0.01;
        Assertions.assertEquals(expected, out, diff);

    }

}