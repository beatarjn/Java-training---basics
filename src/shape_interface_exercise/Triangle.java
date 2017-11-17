package shape_interface_exercise;

public class Triangle implements Shape {

        private double a =0;
        private double b = 0;
        private double c=0;
        private double h=0;

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

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

    public Triangle(double a, double b, double c, double h) {
        setA(a);
        setB(b);
        setC(c);
        setH(h);
    }

    @Override
    public String toString() {
        return "Triangle area: " + calculateArea() + " Triangle Perimeter: " + calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return a*h/2;
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }
}
