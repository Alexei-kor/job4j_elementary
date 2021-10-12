package ru.job4j.condition;

public class AddedTask1 {

    public static String selectAction(int left, int right, int rsl) {
        int added = left + right;
        int subtracted = left - right;
        int multiplied = left * right;
        int divided = right == 0 ? 0 : left / right;

        if (added == rsl) {
            return "added";
        } else if (subtracted == rsl) {
            return "subtracted";
        } else if (multiplied == rsl) {
            return "multiplied";
        } else if (divided == rsl) {
            return "divided";
        } else {
            return "none";
        }
    }


}
