package shape_interface_exercise;

public class Circle implements Shape {

    private double r;

    public Circle(double r) {
        setR(r);
    }

    public double getR() {

        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle area: " + calculateArea() + " Circle Perimeter: " + calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return r * r * Shape.PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * r * Shape.PI;
    }
}
