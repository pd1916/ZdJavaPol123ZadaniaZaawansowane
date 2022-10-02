package pl.sdacademy.java.advanced.exercises.day2.task17;

public class Main {

    public static void main(String[] args) {
        MeasurementConverter converter = new MeasurementConverter();
        float result = converter.convert(5f, ConversionTypeWithFunction.INCHES_TO_CENTIMETER);
        System.out.println(result);
    }
}
