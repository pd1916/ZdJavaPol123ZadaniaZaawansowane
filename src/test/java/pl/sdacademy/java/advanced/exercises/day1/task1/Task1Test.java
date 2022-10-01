package pl.sdacademy.java.advanced.exercises.day1.task1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    private final static List<String> UNSORTED = List.of("A", "B", "Z", "D", "C");
    private final static List<String> EXPECTED_RESULT = List.of("Z", "D", "C", "B", "A");

    @Test
    void shouldReverseListOfString_usingAnonymousClass() {
        //when
        List<String> result = Task1.sortUsingAnonymousClass(UNSORTED);
        //then
        assertEquals(EXPECTED_RESULT, result); //Junit
        assertThat(result).isEqualTo(EXPECTED_RESULT); //assertJ
    }

    @Test
    void shouldReverseListOfString_usingLambda() {
        //when
        List<String> result = Task1.sortUsingLambda(UNSORTED);
        //then
        assertEquals(EXPECTED_RESULT, result); //Junit
        assertThat(result).isEqualTo(EXPECTED_RESULT); //assertJ
    }

    @Test
    void shouldReverseListOfString_usingOwnComparator() {
        //when
        List<String> result = Task1.sortUsingOwnComparator(UNSORTED);
        //then
        assertEquals(EXPECTED_RESULT, result); //Junit
        assertThat(result).isEqualTo(EXPECTED_RESULT); //assertJ
    }

    @Test
    void shouldReverseListOfString_usingStream() {
        //when
        List<String> result = Task1.sortUsingStream(UNSORTED);
        //then
        assertEquals(EXPECTED_RESULT, result); //Junit
        assertThat(result).isEqualTo(EXPECTED_RESULT); //assertJ
    }

    @Test
    void shouldReverseListOfString_usingList() {
        //when
        List<String> result = Task1.sortUsingList(UNSORTED);
        //then
        assertEquals(EXPECTED_RESULT, result); //Junit
        assertThat(result).isEqualTo(EXPECTED_RESULT); //assertJ
    }

}