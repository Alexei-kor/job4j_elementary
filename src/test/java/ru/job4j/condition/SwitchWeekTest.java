package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void when1ThenMonday() {

        int day = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void when2ThenTuesday() {

        int day = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void when3ThenWednesday() {

        int day = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void when4ThenThursday() {

        int day = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void when5ThenFriday() {

        int day = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void when6ThenSaturday() {

        int day = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void when7ThenSunday() {

        int day = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void when0ThenError() {

        int day = 0;
        String expected = "Ошибка";
        String actual = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, actual);

    }
}