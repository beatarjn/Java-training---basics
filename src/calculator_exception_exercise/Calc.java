package calculator_exception_exercise;

public class Calc {

    static double result = 0;
    private static final char ADD = '+';
    private static final char SUBSTRACT = '-';
    private static final char MULTIPLY = '*';
    private static final char DIVIDE = '/';

    public static double calculation(double num1, double num2, char mathOperation) throws UnkownOperatorException {

        switch (mathOperation){
            case ADD:
            result= num1 + num2;
            break;
            case SUBSTRACT:
                result=num1-num2;
                break;
            case MULTIPLY:
                result= num1 * num2;
                break;
            case DIVIDE:
                if (num2==0){
                    throw new ArithmeticException("You cannot divide with 0");
                }
                result=num1/num2;
                break;
                default:
                    throw new UnkownOperatorException("Incorrect mathematical operation");


        }
        return result;
    }



//    public static void add(double num1, double num2) throws UnkownOperatorException {
//        if (mathOperation != ADD) {
//            throw new UnkownOperatorException("Wrong operation");
//        } else {
//            result = number1 + number2;
//            System.out.println(result);
//        }
//    }
//
//    public static void substract(double num1, double num2) throws UnkownOperatorException {
//        if (mathOperation != SUBSTRACT) {
//            throw new UnkownOperatorException("Wrong operation");
//        } else {
//            result = number1 - number2;
//            System.out.println(result);
//
//        }
//    }
//
//    public static void multiply(double num1, double num2) throws UnkownOperatorException {
//        if (mathOperation != SUBSTRACT) {
//            throw new UnkownOperatorException("Wrong operation");
//        } else {
//            result = number1 * number2;
//            System.out.println(result);
//        }
//    }
//
//    public static void divide(double num1, double num2) throws UnkownOperatorException  {
//        if (mathOperation != SUBSTRACT) {
//            throw new UnkownOperatorException("Wrong operation");
//        } else {
//            if (number1 ==0 || number2==0){
//                throw new ArithmeticException("You cannot divide with 0");
//            }
//            result = number1 / number2;
//            System.out.println(result);
//
//        }
//    }
}
