package pl.sdacademy.java.advanced.exercises.day1.task9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle circle;

    @BeforeEach
    void setUp() {
        Point2D center = new Point2D(1.0, 2.0);
        Point2D point = new Point2D(3.0, 0.0);
        circle = new Circle(center, point);
    }

    /*
    Testy do zadania 9
     */

    @Test
    void shouldReturnCorrectRadius() {
        //given
        double expectedResult = 2.83;
        //when
        double result = circle.getRadius();
        //then
        assertThat(result).isCloseTo(expectedResult, within(0.01D));
    }

    @Test
    void shouldReturnCorrectPerimeter() {
        //given
        double expectedResult = 17.78;
        //when
        double result = circle.getPerimeter();
        //then
        assertThat(result).isCloseTo(expectedResult, within(0.01D));
    }

    @Test
    void shouldReturnCorrectArea() {
        //given
        double expectedResult = 25.13;
        //when
        double result = circle.getArea();
        //then
        assertThat(result).isCloseTo(expectedResult, within(0.01D));
    }

    /*
    Testy do zadania 10
     */
    @Test
    void shouldReturnCorrectRadiusAfterMove() {
        //given
        circle.move(new MoveDirection(-1, -2));
        double expectedResult = 2.83;
        //when
        double result = circle.getRadius();
        //then
        assertThat(result).isCloseTo(expectedResult, within(0.01D));
    }

    @Test
    void shouldReturnCorrectPerimeterAfterMove() {
        //given
        circle.move(new MoveDirection(-1, -2));
        double expectedResult = 17.78;
        //when
        double result = circle.getPerimeter();
        //then
        assertThat(result).isCloseTo(expectedResult, within(0.01D));
    }

    @Test
    void shouldReturnCorrectAreaAfterMove() {
        //given
        circle.move(new MoveDirection(-1, -2));
        double expectedResult = 25.13;
        //when
        double result = circle.getArea();
        //then
        assertThat(result).isCloseTo(expectedResult, within(0.01D));
    }

}