package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddedTask1Test {

    @Test
    public void selectActionAdded() {
        String action = AddedTask1.selectAction(5, 10, 15);
        Assert.assertEquals(action, "added");
    }

    @Test
    public void selectActionSubtracted() {
        String action = AddedTask1.selectAction(10, 5, 5);
        Assert.assertEquals(action, "subtracted");
    }

    @Test
    public void selectActionMultiplied() {
        String action = AddedTask1.selectAction(3, 5, 15);
        Assert.assertEquals(action, "multiplied");
    }

    @Test
    public void selectActionDivided() {
        String action = AddedTask1.selectAction(15, 5, 3);
        Assert.assertEquals(action, "divided");
    }

    @Test
    public void selectActionNone() {
        String action = AddedTask1.selectAction(1, 10, 100);
        Assert.assertEquals(action, "none");
    }
}