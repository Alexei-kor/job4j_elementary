package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogicNotTest {

    @Test
    public void when3ThenFalse() {
        int in = 3;
        boolean actual = LogicNot.isEven(in);
        Assert.assertFalse(actual);
    }

    @Test
    public void when4ThenTrue() {
        int in = 4;
        boolean actual = LogicNot.isEven(in);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenPlus4ThenTrue() {
        int in = 4;
        boolean actual = LogicNot.isPositive(in);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenMinus4ThenFalse() {
        int in = -4;
        boolean actual = LogicNot.isPositive(in);
        Assert.assertFalse(actual);
    }

    @Test
    public void when3ThenTrue() {
        int in = 3;
        boolean actual = LogicNot.notEven(in);
        Assert.assertTrue(actual);
    }

    @Test
    public void when4ThenFalse() {
        int in = 4;
        boolean actual = LogicNot.notEven(in);
        Assert.assertFalse(actual);
    }

    @Test
    public void whenPlus4ThenFalse() {
        int in = 4;
        boolean actual = LogicNot.notPositive(in);
        Assert.assertFalse(actual);
    }

    @Test
    public void whenMinus4ThenTrue() {
        int in = -4;
        boolean actual = LogicNot.notPositive(in);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenPlus4ThenFalse1() {
        int in = 4;
        boolean actual = LogicNot.notEvenAndPositive(in);
        Assert.assertFalse(actual);
    }

    @Test
    public void whenPlus3ThenTrue1() {
        int in = 3;
        boolean actual = LogicNot.notEvenAndPositive(in);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenMinus4ThenFalse1() {
        int in = -4;
        boolean actual = LogicNot.notEvenAndPositive(in);
        Assert.assertFalse(actual);
    }

    @Test
    public void whenMinus3ThenFalse1() {
        int in = -3;
        boolean actual = LogicNot.notEvenAndPositive(in);
        Assert.assertFalse(actual);
    }

    @Test
    public void whenPlus4ThenTrue2() {
        int in = 4;
        boolean actual = LogicNot.evenOrNotPositive(in);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenPlus3ThenFalse2() {
        int in = 3;
        boolean actual = LogicNot.evenOrNotPositive(in);
        Assert.assertFalse(actual);
    }

    @Test
    public void whenMinus4ThenTrue2() {
        int in = -4;
        boolean actual = LogicNot.evenOrNotPositive(in);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenMinus3ThenTrue2() {
        int in = -3;
        boolean actual = LogicNot.evenOrNotPositive(in);
        Assert.assertTrue(actual);
    }

}