package pl.sdacademy.java.advanced.exercises.day1.task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StorageTest {
    Storage storage;

    @BeforeEach
    void setUp() {
        storage = new Storage();
        storage.addToStorage("0", "value0_1");
        storage.addToStorage("0", "value0_2");
        storage.addToStorage("1", "value1_1");
        storage.addToStorage("2", "value1_1");
    }

    @Test
    void shouldAddNewPosition() {
        //when
        storage.addToStorage("99", "value99_1");
        //then
        List<String> values = storage.getValues("99");
        assertEquals(values, List.of("value99_1")); //Junit
        assertThat(values).containsExactly("value99_1"); //assertJ
        assertThat(values).hasSize(1);
    }

    @Test
    void shouldAddNewValuesToExistingKey() {
        //when
        storage.addToStorage("1", "value1_2");
        //then
        List<String> values = storage.getValues("1");
        assertEquals(values, List.of("value1_1", "value1_2")); //Junit
        assertThat(values).containsExactly("value1_1", "value1_2"); //assertj
    }

    @Test
    void shouldReturnKeysForExistingValues() {
        //given
        List<String> expectedResult = List.of("1", "2");
        //when
        List<String> result = storage.findValues("value1_1");
        //then
        assertEquals(expectedResult, result); //Junit
        assertThat(result).isEqualTo(expectedResult); //assertj
    }

    @Test
    void shouldReturnEmptyListForNotExistingValues() {
        //when
        List<String> result = storage.findValues("value");
        //then
        assertEquals(0, result.size()); //Junit
        assertThat(result).hasSize(0); //assertj
    }

}