package pl.sdacademy.java.advanced.exercises.day1.task8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.sdacademy.java.advanced.exercises.day1.task8.ParcelValidator;

import static org.assertj.core.api.Assertions.assertThat;

class ParcelValidatorTest {
    private Validator validator;

    @BeforeEach
    void setUp() {
        validator = new ParcelValidator();
    }

    @Test
    void shouldBePossibleToAddNonExpressParcel() {
        //given
        //suma wymiarów: 120, waga:29, normalna przesyłka
        Parcel parcel = new Parcel(35, 40, 45, 29, false);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void shouldNotBePossibleToAddNonExpressParcelWhenSumOfLengthsIsTooHigh() {
        //given
        //suma wymiarów: 301, waga:29, normalna przesyłka
        Parcel parcel = new Parcel(100, 100, 101, 29, false);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldNotBePossibleToAddNonExpressParcelWhenXDimensionIsTooLow() {
        //given
        //suma wymiarów: 94 ale jeden wymiarów ma 29, waga:29, normalna przesyłka
        Parcel parcel = new Parcel(29, 30, 35, 29, false);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldNotBePossibleToAddNonExpressParcelWhenYDimensionIsTooLow() {
        //given
        //suma wymiarów: 94 ale drugi z wymiarów ma 29, waga:29, normalna przesyłka
        Parcel parcel = new Parcel(30, 29, 35, 29, false);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldNotBePossibleToAddNonExpressParcelWhenZDimensionIsTooLow() {
        //given
        //suma wymiarów: 94 ale drugi z wymiarów ma 29, waga:29, normalna przesyłka
        Parcel parcel = new Parcel(30, 35, 29, 29, false);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldNotBePossibleToAddNonExpressParcelWhenWeightIsTooHigh() {
        //given
        //suma wymiarów: 105, waga:31, normalna przesyłka
        Parcel parcel = new Parcel(30, 35, 40, 31, false);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldBePossibleToAddExpressParcel() {
        //given
        //suma wymiarów: 120, waga:14, przesyłka express
        Parcel parcel = new Parcel(35, 40, 45, 14, true);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void shouldNotBePossibleToAddExpressParcelWhenSumOfLengthsIsTooHigh() {
        //given
        //suma wymiarów: 301, waga:14, przesyłka express
        Parcel parcel = new Parcel(100, 100, 101, 14, true);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldNotBePossibleToAddExpressParcelWhenXDimensionIsTooLow() {
        //given
        //suma wymiarów: 94 ale jeden z wymiarów ma 29, waga:14, przesyłka express
        Parcel parcel = new Parcel(29, 30, 35, 14, true);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldNotBePossibleToAddExpressParcelWhenYDimensionIsTooLow() {
        //given
        //suma wymiarów: 94 ale drugi z wymiarów ma 29, waga:14, przesyłka express
        Parcel parcel = new Parcel(30, 29, 35, 14, true);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldNotBePossibleToAddExpressParcelWhenZDimensionIsTooLow() {
        //given
        //suma wymiarów: 94 ale trzeci z wymiarów ma 29, waga:14, przesyłka express
        Parcel parcel = new Parcel(30, 35, 29, 14, true);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldNotBePossibleToAddExpressParcelWhenWeightIsTooHigh() {
        //given
        //suma wymiarów: 105, waga:16, przesyłka express
        Parcel parcel = new Parcel(30, 35, 40, 16, true);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isFalse();
    }

}