package pl.sdacademy.java.advanced.exercises.day2.task12_13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("aaa", "bbb", 1000, 2000, null, EngineType.V8);
        Car car2 = new Car("ccc", "ddd", 1000, 2000, null, EngineType.V12);

        CarService carService = new CarService();
        carService.add(car1);
        carService.add(car2);

        List<Car> carsWithV12Engine = carService.getCarsWithV12Engine();
        System.out.println(carsWithV12Engine);
    }
}
