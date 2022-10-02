package pl.sdacademy.java.advanced.exercises.day2.task12_13;

import java.util.*;
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

    public List<Car> getCarsProducedBefore1999() {
        return cars
                .stream()
                .filter(car -> car.getProductionYear() < 1999)
                .collect(Collectors.toList());
    }

    public Optional<Car> getMostExpensiveCar() {
        return cars.stream()
                //.max(Comparator.comparingDouble(i -> i.getPrice()))
                .max(Comparator.comparingDouble(Car::getPrice));
    }

    public List<Car> getCarsSortedByName(boolean ascending) {
        if(ascending) {
            return cars.stream()
                    .sorted(Comparator.comparing(Car::getName))
                    .collect(Collectors.toList());
        }
        return cars.stream()
                .sorted(Comparator.comparing(Car::getName).reversed())
                .collect(Collectors.toList());
    }

    public Optional<Car> getCheapestCar() {
        return cars.stream()
                .min(Comparator.comparingDouble(Car::getPrice));
    }

    public List<Car> getCarsHavingAtLeast2Manufacturers() {
        return cars.stream()
                .filter(car -> car.getManufacturers().size() >= 2)
                .collect(Collectors.toList());
    }

    public boolean contains(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCarsProducedBy(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsFoundedInAndProducedBy(int foundedYear, Operation operation) {
        switch(operation) {
            case GREATER_THAN:
                return cars.stream()
                        .filter(car -> car.getManufacturers().stream()
                                .anyMatch(m -> m.getFoundedYear() > foundedYear))
                        .collect(Collectors.toList());
            case LESS_THAN:
                return cars.stream()
                        .filter(car -> car.getManufacturers().stream()
                                .anyMatch(m -> m.getFoundedYear() < foundedYear))
                        .collect(Collectors.toList());
            case EQUAL:
                return cars.stream()
                        .filter(car -> car.getManufacturers().stream()
                                .anyMatch(m -> m.getFoundedYear() == foundedYear))
                        .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }
}
