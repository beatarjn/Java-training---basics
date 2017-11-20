package shape_interface_exercise;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args){

    Main main = new Main();

    ShapeCalc shapeCalc = new ShapeCalc();
    Shape shape = null;

    boolean readComplete = false;
        while (!readComplete) {
        try {
            main.printOptions();
            shape = shapeCalc.createShape();
            readComplete = true;
        } catch (InputMismatchException e) {
            System.out.println("Not correct data format, please try again");
        } catch (NoSuchElementException e) {
            System.out.println("Shape not correct, please try again");
        }
    }

        System.out.println(shape);


}

    public void printOptions() {
        System.out.println("Wybierz figurę, dla której chcesz obliczyć pole i obwód:");
        System.out.println(Shape.RECTANGLE + " - prostokąt");
        System.out.println(Shape.CIRCLE + " - koło");
        System.out.println(Shape.TRIANGLE + " - trójkąt");
    }
}
