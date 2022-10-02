package pl.sdacademy.java.advanced.exercises.day2.task20_21_22;

public class Cube extends Shape3D implements Fillable {
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

    @Override
    public int fill(double value) {
        double maxVolume = calculateVolume();
        //Option#1
//        if(value > maxVolume) {
//            return 1;
//        } else if(value == maxVolume) {
//            return 0;
//        }
//        return -1;
        //Option#2
        return Double.compare(value, maxVolume);
    }
}
