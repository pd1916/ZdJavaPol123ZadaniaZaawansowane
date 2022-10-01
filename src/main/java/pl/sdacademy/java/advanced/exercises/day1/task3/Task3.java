package pl.sdacademy.java.advanced.exercises.day1.task3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> input = new LinkedHashMap<>();
        input.put("Java", 18);
        input.put("Python", 1);
        input.put("C#", 25);
        input.put("JavaScript", 3);
        input.put("Scala", 5);
        input.put("PHP", 0);
        printWithStream(input);
    }

    private static void print(Map<String, Integer> input) {
        int counter = 0;
        for(Map.Entry<String, Integer> entry : input.entrySet()) {
            counter++;
            if(counter == input.size()) {
                System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ".");
            } else {
                System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ",");
            }
        }
    }

    private static void printWithStream(Map<String, Integer> input) {
        String collect = input
                .entrySet()
                .stream()
                .map(entry -> "Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue())
                .collect(Collectors.joining(",\n", "", "."));
        System.out.println(collect);
    }
}
