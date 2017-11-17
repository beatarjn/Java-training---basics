package loops_exercise;

import java.util.Scanner;

public class HospitalApp {

    private static final int EXIT = 0;
    private static final int ADD = 1;
    private static final int PRINT = 2;

    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int option = -1;

        Hospital hospital = new Hospital();

        while (option != EXIT) {
            System.out.println("Dostępne opcje: ");
            System.out.println("0 - wyjście z programu");
            System.out.println("1 - dodanie pacjenta");
            System.out.println("2 - wyświetlenie listy pacjentów");

            System.out.println("Wybierz opcję: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case ADD:
                    Patient patient = new Patient();
                    System.out.println("Imię: ");
                    patient.setName(input.nextLine());
                    System.out.println("Nazwisko: ");
                    patient.setSurname(input.nextLine());
                    System.out.println("PESEL: ");
                    patient.setPesel(input.nextInt());
                    hospital.addPatient(patient);
                    break;
                case PRINT:
                    hospital.printPatient();
                    break;
                case EXIT:
                    System.out.println("Zamykam program!");
                    break;
                default:
                    System.out.println("Nie znaleziono takiej opcji");
            }
        }

        input.close();
    }
}
