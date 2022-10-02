package pl.sdacademy.java.advanced.exercises.day2.task17;

public class MeasurementConverter {
    // convert(5, INCHES_TO_CENTIMETER)
    public float convert(float value, ConversionType conversionType) {
        return value * conversionType.getValue();
    }

    public float convert(float value, ConversionTypeWithFunction conversionType) {
        return conversionType.getConversionFunction().apply(value);
    }
}
