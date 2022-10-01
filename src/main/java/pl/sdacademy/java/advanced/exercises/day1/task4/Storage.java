package pl.sdacademy.java.advanced.exercises.day1.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {
    private final Map<String, List<String>> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        if(storage.containsKey(key)) {
            // robimy update wartości
//            List<String> values = storage.get(key);
//            values.add(value);
            storage.get(key).add(value);
        } else {
            // dodajemy nową pozycje
            List<String> values = new ArrayList<>();
            values.add(value);
            storage.put(key, values);
        }
    }

    public List<String> findValues(String searchedValue) {
        return storage
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(searchedValue))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public List<String> getValues(String key) {
        return storage.get(key);
    }

    public void print(String key) {
        System.out.println(storage.get(key));
    }
}
