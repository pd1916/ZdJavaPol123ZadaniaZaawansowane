package pl.sdacademy.java.advanced.exercises.day3.task28;

import java.util.ArrayList;
import java.util.List;

public class SkipArrayList<T> extends ArrayList<T> {
    public SkipArrayList() {
    }

    public List<T> getEveryNthElement(int startIndex, int skip) {
        List<T> everyNthElements = new ArrayList<>();
        for(int i = startIndex; i < size(); i += skip + 1) {
            everyNthElements.add(get(i));
        }
        return everyNthElements; //zwracamy nową listę z wybranymi elementami
    }
}
