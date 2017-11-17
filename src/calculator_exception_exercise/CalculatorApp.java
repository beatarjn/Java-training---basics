package calculator_exception_exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) throws UnkownOperatorException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        boolean input = true;
        double number1 = 0;
        double number2 = 0;
        char mathOperation = 0;

        while (input) {
            try {
                System.out.println("First number: ");
                number1 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Second number: ");
                number2 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Mathematical operation: ");
                mathOperation = scanner.next().charAt(0);
                input = false;
            } catch (InputMismatchException ex) {
                System.out.println("That's not correct number, please try again");
                scanner.nextLine();
            }
        }
        scanner.close();

        Calc calc = new Calc();
        System.out.println("Result: " + calc.calculation(number1, number2, mathOperation));


    }
}

