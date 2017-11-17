package shape_interface_exercise;

public class Rectangle implements Shape {

    private double a =0;
    private double b = 0;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Rectangle(double a, double b) {
        setA(a);
        setB(b);
    }

    @Override
    public String toString() {
        return "Rectangle area: " + calculateArea() + " Rectangle Perimeter: " + calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return a*b;
    }

    @Override
    public double calculatePerimeter() {
        return 2*a + 2*b;
    }
}
