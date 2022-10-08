package pl.sdacademy.java.advanced.exercises.day3.task28;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SkipArrayListTest {

    @Test
    void shouldReturnCorrectListOfStrings() {
        //given
        SkipArrayList<String> strings = new SkipArrayList<>();
        strings.addAll(List.of("a", "b", "c", "d", "e", "f", "g"));
        //when
        List<String> result = strings.getEveryNthElement(2, 3);
        //then
        assertThat(result).containsExactly("c", "g");
    }

    @Test
    void shouldReturnCorrectListOfIntegers() {
        //given
        SkipArrayList<Integer> integers = new SkipArrayList<>();
        integers.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        //when
        List<Integer> result = integers.getEveryNthElement(5, 2);
        //then
        assertThat(result).containsExactly(6, 9);
    }

}