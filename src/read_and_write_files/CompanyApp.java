package read_and_write_files;

import java.io.*;
import java.util.Scanner;

public class CompanyApp {



    public static final String FILE_NAME = "Employees.txt";
    public static final int INFO_FROM_USER = 1;
    public static final int INFO_FROM_FILE = 2;


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        CompanyApp companyApp = new CompanyApp();
        Company company = new Company();


        System.out.println("Information from user - 1");
        System.out.println("Information from file - 2");
        System.out.println("Choose option:");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        if (option == INFO_FROM_USER) {
            companyApp.writeDataUser(company);

        } else if (option == INFO_FROM_FILE) {
            companyApp.readDataFile(company);

        }
        scanner.close();

    }

    private static void writeDataUser(Company company) throws IOException {

        Scanner scanner = new Scanner(System.in);

        FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        for (int i = 0; i < Company.EMPLOYEES; i++) {
            System.out.println("Enter name: ");
            String name = scanner.nextLine();

            System.out.println("Enter lastname: ");
            String lastName = scanner.nextLine();

            System.out.println("Enter salary: ");
            int salary = scanner.nextInt();

            Employee employee = new Employee(name, lastName, salary);
            company.add(employee, i);

        }

        objectOutputStream.writeObject(company);

    }


    private void readDataFile(Company company) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        company = (Company) objectInputStream.readObject();

        for (int i = 0; i < Company.EMPLOYEES; i++) {
            System.out.println(company.getEmployees()[i]);


        }
    }
}
