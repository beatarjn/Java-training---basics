package read_and_write_files;

public class Employee extends Person {


    private static final long serialVersionUID = -4222433449177439675L;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String lastName, int salary) {
        super(name, lastName);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return super.toString() + " wypłata " + salary;
    }
}
