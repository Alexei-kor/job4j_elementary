package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenHyTheyHy() {
        String in = "Привет, Бот.";
        String expected = "Привет, умник.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenByeThenBye() {
        String in = "Пока.";
        String expected = "До скорой встречи.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenOtherThenProblem() {
        String in = "Как пройти в театры.";
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }
}