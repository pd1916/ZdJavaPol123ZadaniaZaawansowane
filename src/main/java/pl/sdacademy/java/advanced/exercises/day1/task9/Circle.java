package pl.sdacademy.java.advanced.exercises.day1.task9;

public class Circle implements Movable{
    private final Point2D center;
    private final Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        //pierw((center_x-point_x)^2 + (center_y-point_y)^2)
        return Math.sqrt(
                Math.pow(center.getX() - point.getX(), 2) +
                Math.pow(center.getY() - point.getY(), 2)
        );
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);
    }
}
