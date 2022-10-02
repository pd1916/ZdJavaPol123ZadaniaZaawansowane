package pl.sdacademy.java.advanced.exercises.day2.task17;

import java.util.function.Function;

public enum ConversionTypeWithFunction {
    METERS_TO_YARDS(v -> v * 1.09f),
    YARDS_TO_METERS(v -> v / 1.09f),
    CENTIMETERS_TO_INCHES(v -> v * 0.39f),
    INCHES_TO_CENTIMETER(v -> v / 0.39f),
    KILOMETERS_TO_MILES(v -> v * 0.62f),
    MILES_TO_KILOMETERS(v -> v / 0.62f);

    private final Function<Float,Float> conversionFunction;

    ConversionTypeWithFunction(Function<Float, Float> conversionFunction) {
        this.conversionFunction = conversionFunction;
    }

    public Function<Float, Float> getConversionFunction() {
        return conversionFunction;
    }
}
