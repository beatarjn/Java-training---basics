package shape_interface_exercise;

public interface Shape {

    double PI = 3.14;

    public double calculateArea();
    public double calculatePerimeter();

    int RECTANGLE = 1;
    int CIRCLE = 2;
    int TRIANGLE = 3;

}
