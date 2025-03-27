class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getEmployeeDetails() {
        return "Employee ID: " + id + ", Name: " + name;
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Hourly Rate: " + hourlyRate + ", Hours Worked: " + hoursWorked;
    }
}

class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Salary: " + salary;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee emp1 = new HourlyEmployee("Alice", 101, 20.5, 40);
        Employee emp2 = new SalariedEmployee("Bob", 102, 60000);
        Employee emp3 = new HourlyEmployee("Charlie", 103, 18.0, 35);

        System.out.println(emp1.getEmployeeDetails());
        System.out.println(emp2.getEmployeeDetails());
        System.out.println(emp3.getEmployeeDetails());
    }
}
