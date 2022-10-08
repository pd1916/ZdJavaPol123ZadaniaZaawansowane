package pl.sdacademy.java.advanced.exercises.day3.task28;

import java.util.ArrayList;
import java.util.List;

public class SkipArrayList<T> extends ArrayList<T> {
    public SkipArrayList() {
    }

    public List<T> gerEveryNthElement(int startIndex, int skip) {
        // todo
        return null; //zwracamy nową listę z wybranymi elementami
    }
}

/*
SkipArrayList<String> skipArrayList = new SkipArrayList<>(List.of("a", "b", "c", "d", "e", "f", "g"));

SkipArrayList<String> skipArrayList = new SkipArrayList<>();
skipArrayList.addAll(List.of("a", "b", "c", "d", "e", "f", "g"));

SkipArrayList<String> = skipArrayList.gerEveryNthElement(2, 3);
 */
