package pl.sdacademy.java.advanced.exercises.day1.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static List<String> sortUsingAnonymousClass(final List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // -1 gdy o2 jest większe od o1 -> o1 jest przed o2
                // +1 gdy o1 jest większe od o2 -> o1 jest po o2
                //return o2.compareTo(o1); // #option1
                return -o1.compareTo(o2); // #option2
            }
        });
        return sorted;
    }

    public static List<String> sortUsingLambda(final List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, (o1, o2) -> o2.compareTo(o1));
        return sorted;
    }

    public static List<String> sortUsingOwnComparator(final List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new MyOwnComparator());
        return sorted;
    }

    public static List<String> sortUsingStream(final List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        return sorted.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static List<String> sortUsingList(final List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        sorted.sort(Comparator.reverseOrder());
        //sorted.sort(new MyOwnComparator());
        //sorted.sort((o1, o2) -> o2.compareTo(o1));
        return sorted;
    }

}
