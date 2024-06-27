package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddedTask1Test {

    @Test
    public void selectActionAdded() {
        String action = AddedTask1.selectAction(5, 10, 15);
        Assertions.assertEquals(action, "added");
    }

    @Test
    public void selectActionSubtracted() {
        String action = AddedTask1.selectAction(10, 5, 5);
        Assertions.assertEquals(action, "subtracted");
    }

    @Test
    public void selectActionMultiplied() {
        String action = AddedTask1.selectAction(3, 5, 15);
        Assertions.assertEquals(action, "multiplied");
    }

    @Test
    public void selectActionDivided() {
        String action = AddedTask1.selectAction(15, 5, 3);
        Assertions.assertEquals(action, "divided");
    }

    @Test
    public void selectActionNone() {
        String action = AddedTask1.selectAction(1, 10, 100);
        Assertions.assertEquals(action, "none");
    }
}