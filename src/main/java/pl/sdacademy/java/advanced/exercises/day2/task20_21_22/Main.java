package pl.sdacademy.java.advanced.exercises.day2.task20_21_22;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(2, 3, 4);
        int trianglePerimeter = triangle.calculatePerimeter();
        System.out.println("Triangle: " + trianglePerimeter);

        Shape rectangle = new Rectangle(2, 3);
        int rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println("Rectangle: " + rectanglePerimeter);

        Shape hexagon = new Hexagon(2);
        int hexagonPerimeter = hexagon.calculatePerimeter();
        System.out.println("Hexagon: " + hexagonPerimeter);

        Shape cube = new Cube(3);
        int cubePerimeter = cube.calculatePerimeter();
        double cubeVolume = ((Cube) cube).calculateVolume();
        System.out.println("Cube perimeter: " + cubePerimeter);
        System.out.println("Cube volume: " + cubeVolume);
    }
}
