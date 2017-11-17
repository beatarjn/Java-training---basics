package loops_exercise;

import java.util.Scanner;

public class Numbers {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers: ");

        int numbers = scanner.nextInt();

        int sum=0;

        for (int i = 0; i < numbers; i++) {

            System.out.println("Podaj liczbę");

            sum += scanner.nextInt();


        }

        System.out.println("SUma = " + sum);







    }

}
