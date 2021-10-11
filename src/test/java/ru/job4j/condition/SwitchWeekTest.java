package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void When1ThenMonday() {

        int day = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void When2ThenTuesday() {

        int day = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void When3ThenWednesday() {

        int day = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void When4ThenThursday() {

        int day = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void When5ThenFriday() {

        int day = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void When6ThenSaturday() {

        int day = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void When7ThenSunday() {

        int day = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void When0ThenError() {

        int day = 0;
        String expected = "Ошибка";
        String actual = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, actual);

    }
}