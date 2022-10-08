package pl.sdacademy.java.advanced.exercises.day3.task28;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SkipArrayList<String> skipArrayList = new SkipArrayList<>();
        skipArrayList.addAll(List.of("a", "b", "c", "d", "e", "f", "g"));

        skipArrayList.getEveryNthElement(10, 3);
    }
}
