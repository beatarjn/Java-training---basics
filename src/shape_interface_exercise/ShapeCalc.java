package shape_interface_exercise;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalc {

    Scanner scanner = new Scanner(System.in);

    public Rectangle rectangleleData() throws InputMismatchException {
        System.out.println("Podaj informacje o prostokącie.");
        System.out.println("Podaj długość boku A: ");
        double a = 0;
        double b = 0;
        try {
            a = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Podaj długość boku B: ");
            b = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw e;
        }

        return new Rectangle(a, b);
    }

    public Circle circleData() throws InputMismatchException {
        System.out.println("Podaj informacje o kole.");
        System.out.println("Podaj długość promienia r: ");
        double r = 0;

        try {
            r = scanner.nextDouble();
            scanner.nextLine();

        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw e;
        }

        return new Circle(r);
    }

    public Triangle triangleData() throws InputMismatchException {
        System.out.println("Podaj informacje o trójkacie.");
        System.out.println("Podaj długość boku A: ");
        double a = 0;
        double b = 0;
        double c =0;
        double h =0;
        try {
            a = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Podaj długość boku B: ");
            b = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Podaj długość boku C: ");
            c = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Podaj wysokość H: ");
            h = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw e;
        }

        return new Triangle(a,b,c,h);
    }

    public Shape createShape() throws NoSuchElementException {
        try {
            int shapeType = scanner.nextInt();
            scanner.nextLine();
            switch (shapeType) {
                case Shape.RECTANGLE:
                    return rectangleleData();
                case Shape.CIRCLE:
                    return circleData();
                case Shape.TRIANGLE:
                    return triangleData();
                default:
                    throw new NoSuchElementException();
            }
        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw e;
        }
    }


}
