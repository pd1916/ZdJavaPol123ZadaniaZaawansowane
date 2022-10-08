package pl.sdacademy.java.advanced.exercises.day3.task32;

import java.io.*;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Task32 {

    public static void main(String[] args) {
        Path dirPath = Path.of("src/main/java/pl/sdacademy/java/advanced/exercises/day3/task32");
        Path inputFile = dirPath.resolve("cars.txt");
        List<Car> cars = List.of(
                new Car("Volvo", 300_000, true),
                new Car("BMW", 200_000, false)
        );
        saveFile(inputFile, cars);
        List<Car> returnedCars = loadFile(inputFile);
        System.out.println(returnedCars);
    }

    private static void saveFile(Path outputFile, List<Car> content) {
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(outputFile.toFile()))) {
            ous.writeObject(content);
        } catch(IOException e) {
            System.out.println("Exception: " + e);
        }
    }

    private static List<Car> loadFile(Path inputFile) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(inputFile.toFile()))) {
            return (List<Car>) ois.readObject();
        } catch(IOException | ClassNotFoundException e) {
            System.out.println("Exception: " + e);
        }
        return Collections.emptyList();
    }
}
