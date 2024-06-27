package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogicNotTest {

    @Test
    public void when3ThenFalse() {
        int in = 3;
        boolean actual = LogicNot.isEven(in);
        Assertions.assertFalse(actual);
    }

    @Test
    public void when4ThenTrue() {
        int in = 4;
        boolean actual = LogicNot.isEven(in);
        Assertions.assertTrue(actual);
    }

    @Test
    public void whenPlus4ThenTrue() {
        int in = 4;
        boolean actual = LogicNot.isPositive(in);
        Assertions.assertTrue(actual);
    }

    @Test
    public void whenMinus4ThenFalse() {
        int in = -4;
        boolean actual = LogicNot.isPositive(in);
        Assertions.assertFalse(actual);
    }

    @Test
    public void when3ThenTrue() {
        int in = 3;
        boolean actual = LogicNot.notEven(in);
        Assertions.assertTrue(actual);
    }

    @Test
    public void when4ThenFalse() {
        int in = 4;
        boolean actual = LogicNot.notEven(in);
        Assertions.assertFalse(actual);
    }

    @Test
    public void whenPlus4ThenFalse() {
        int in = 4;
        boolean actual = LogicNot.notPositive(in);
        Assertions.assertFalse(actual);
    }

    @Test
    public void whenMinus4ThenTrue() {
        int in = -4;
        boolean actual = LogicNot.notPositive(in);
        Assertions.assertTrue(actual);
    }

    @Test
    public void whenPlus4ThenFalse1() {
        int in = 4;
        boolean actual = LogicNot.notEvenAndPositive(in);
        Assertions.assertFalse(actual);
    }

    @Test
    public void whenPlus3ThenTrue1() {
        int in = 3;
        boolean actual = LogicNot.notEvenAndPositive(in);
        Assertions.assertTrue(actual);
    }

    @Test
    public void whenMinus4ThenFalse1() {
        int in = -4;
        boolean actual = LogicNot.notEvenAndPositive(in);
        Assertions.assertFalse(actual);
    }

    @Test
    public void whenMinus3ThenFalse1() {
        int in = -3;
        boolean actual = LogicNot.notEvenAndPositive(in);
        Assertions.assertFalse(actual);
    }

    @Test
    public void whenPlus4ThenTrue2() {
        int in = 4;
        boolean actual = LogicNot.evenOrNotPositive(in);
        Assertions.assertTrue(actual);
    }

    @Test
    public void whenPlus3ThenFalse2() {
        int in = 3;
        boolean actual = LogicNot.evenOrNotPositive(in);
        Assertions.assertFalse(actual);
    }

    @Test
    public void whenMinus4ThenTrue2() {
        int in = -4;
        boolean actual = LogicNot.evenOrNotPositive(in);
        Assertions.assertTrue(actual);
    }

    @Test
    public void whenMinus3ThenTrue2() {
        int in = -3;
        boolean actual = LogicNot.evenOrNotPositive(in);
        Assertions.assertTrue(actual);
    }

}