package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondayThen1() {

        String day = "Понедельник";
        int expected = 1;
        int actual = MultipleSwitchWeek.numberOfDay(day);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void whenTuesdayThen2() {

        String day = "Вторник";
        int expected = 2;
        int actual = MultipleSwitchWeek.numberOfDay(day);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void whenWednesdayThen3() {

        String day = "Среда";
        int expected = 3;
        int actual = MultipleSwitchWeek.numberOfDay(day);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void whenThursdayThen4() {

        String day = "Четверг";
        int expected = 4;
        int actual = MultipleSwitchWeek.numberOfDay(day);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void whenFridayThen5() {

        String day = "Пятница";
        int expected = 5;
        int actual = MultipleSwitchWeek.numberOfDay(day);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void whenSaturdayThen6() {

        String day = "Суббота";
        int expected = 6;
        int actual = MultipleSwitchWeek.numberOfDay(day);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void whenSundayThen7() {

        String day = "Воскресенье";
        int expected = 7;
        int actual = MultipleSwitchWeek.numberOfDay(day);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void whenErrorThenZero() {

        String day = "НеВторникНеСреда";
        int expected = 0;
        int actual = MultipleSwitchWeek.numberOfDay(day);
        Assertions.assertEquals(expected, actual);

    }

}