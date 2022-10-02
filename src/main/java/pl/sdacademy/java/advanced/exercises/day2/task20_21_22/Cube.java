package pl.sdacademy.java.advanced.exercises.day2.task20_21_22;

public class Cube extends Shape3D{
    private final int a;

    public Cube(int a) {
        this.a = a;
    }

    @Override
    public int calculatePerimeter() {
        return 12 * a;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(a, 3);
    }
}
