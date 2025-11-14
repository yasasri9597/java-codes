import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void increaseSalary(double percent) {
        salary += salary * percent / 100;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + salary;
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Anil", 45000));
        employees.add(new Employee(102, "Riya", 51000));
        employees.add(new Employee(103, "Manoj", 38000));

        System.out.println("--- All Employees ---");
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("\nIncreasing salary of ID 102 by 10%...");
        for (Employee e : employees) {
            if (e.getId() == 102) {
                e.increaseSalary(10);
            }
        }

        System.out.println("\n--- Updated Employees ---");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
