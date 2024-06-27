package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SwitchWeekTest {

    @Test
    public void when1ThenMonday() {

        int day = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(day);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void when2ThenTuesday() {

        int day = 2;
        String expected = "Вторник";
        String actual = SwitchWeek.nameOfDay(day);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void when3ThenWednesday() {

        int day = 3;
        String expected = "Среда";
        String actual = SwitchWeek.nameOfDay(day);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void when4ThenThursday() {

        int day = 4;
        String expected = "Четверг";
        String actual = SwitchWeek.nameOfDay(day);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void when5ThenFriday() {

        int day = 5;
        String expected = "Пятница";
        String actual = SwitchWeek.nameOfDay(day);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void when6ThenSaturday() {

        int day = 6;
        String expected = "Суббота";
        String actual = SwitchWeek.nameOfDay(day);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void when7ThenSunday() {

        int day = 7;
        String expected = "Воскресенье";
        String actual = SwitchWeek.nameOfDay(day);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void when0ThenError() {

        int day = 0;
        String expected = "Ошибка";
        String actual = SwitchWeek.nameOfDay(day);
        Assertions.assertEquals(expected, actual);

    }
}