package pl.sdacademy.java.advanced.exercises.day2.task12_13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
    }

    public void add(Car car) {
        cars.add(car);
    }

    public void remove(Car car) {
        cars.remove(car);
    }

    public List<Car> getAll() {
        //return cars; // będziemy cały czas operować na naszym cars
        //return List.copyOf(cars); //tworzy nam kopię, ale jako niemodyfikowalną listę!
        return new ArrayList<>(cars); // tworzy nową, modyfikowalną listę
    }

    public List<Car> getCarsWithV12Engine() {
        return cars
                .stream()
                .filter(car -> car.getEngineType().equals(EngineType.V12))
                .collect(Collectors.toList());
    }
}
