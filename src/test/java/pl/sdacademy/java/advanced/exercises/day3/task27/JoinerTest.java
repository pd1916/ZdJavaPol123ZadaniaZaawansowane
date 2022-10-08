package pl.sdacademy.java.advanced.exercises.day3.task27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JoinerTest {

    @Test
    void shouldReturnCorrectStringFromStrings() {
        //given
        Joiner<String> joiner = new Joiner<>("*");
        String expectedResult = "a*b*c*d";
        //when
        String result = joiner.join("a", "b", "c", "d");
        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnCorrectStringFromIntegers() {
        //given
        Joiner<Integer> joiner = new Joiner<>("-");
        String expectedResult = "1-2-3-4-5";
        //when
        String result = joiner.join(1, 2, 3, 4, 5);
        //then
        assertEquals(expectedResult, result);
    }

}