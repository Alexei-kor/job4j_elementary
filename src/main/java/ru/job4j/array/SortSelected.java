package ru.job4j.array;
import static ru.job4j.array.MinDiapason.*;
import static ru.job4j.array.FindLoop.*;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            int min = MinDiapason.findMin(data, index, data.length - 1);
            int indexFind = FindLoop.indexOf(data, min, index, data.length - 1);
            data = SwitchArray.swap(data, indexFind, index);
        }
        return data;
    }
}
