package maps_exercise;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static javafx.application.Platform.exit;

public class CompanyApp {

    public static final int EXIT = 0;
    public static final int ADD = 1;
    public static final int SEARCH = 2;

    private Company company;

    CompanyApp() {
        company = new Company();
    }

    static int option;
    public static Scanner scanner = new Scanner(System.in);

    static CompanyApp companyApp;


    public static void main(String[] args) {

        companyApp = new CompanyApp();

        companyApp.controlLoop();


    }

    public static void controlLoop() {
        printOptions();
        try {
            option = scanner.nextInt();
            switch (option) {
                case ADD:
                    companyApp.addEmployees();
                    break;
                case SEARCH:
                    companyApp.searchEmployee();
                    break;

                case EXIT:
                    exit();
            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect data, employee was not added");
        } catch (NumberFormatException | NoSuchElementException e) {
            System.out.println("There is no option like this, please try again: ");
        }

        if (option == EXIT) {
            scanner.close();
        } else {
            controlLoop();
        }
    }

    private void searchEmployee() {
        System.out.println("Searching for employee");
        scanner.nextLine();
        System.out.println("Enter name: ");
        String firstName = scanner.nextLine();
        System.out.println("enter last name: ");
        String lastName = scanner.nextLine();

        Employee employee = company.searchEmployee(firstName, lastName);
        System.out.println(employee);
    }

    private void addEmployees() {
        Employee employee = new Employee();

        System.out.println("Adding employee: ");
        scanner.nextLine();
        System.out.println("Name: ");
        employee.setName(scanner.nextLine());
        System.out.println("Last name: ");
        employee.setLastName(scanner.nextLine());
        System.out.println("Salary: ");
        employee.setSalary(scanner.nextInt());
        scanner.nextLine();

        company.addEmployee(employee);
    }

    private static void printOptions() {
        System.out.println("Choose option: ");
        System.out.println("0 - exit program");
        System.out.println("1 - add employee");
        System.out.println("2 - search employee");
    }


}
