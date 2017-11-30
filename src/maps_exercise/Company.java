package maps_exercise;

import java.util.HashMap;
import java.util.Map;

public class Company {

    static Map<String, Employee> employees = new HashMap();

    public Company() {
        employees = new HashMap<>();
    }

    public static boolean addEmployee(Employee employee) {
        String key = employee.getName() + " " + employee.getLastName();

        if (employees.get(key) != null) {
            return false;
        } else {
            employees.put(key, employee);
            return true;
        }

    }

    public static Employee searchEmployee(String name, String lastName) {
        System.out.println("Found employee: ");
        String key = name + " " + lastName;
        return employees.get(key);

    }

}
