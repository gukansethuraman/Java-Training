package Day9;

class Employee {

    void calculateSalary() {
        System.out.println("Employee Salary");
    }
}

class Manager extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Manager Salary = Rs. 80,000");
    }
}

class Developer extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Developer Salary = Rs. 50,000");
    }
}

public class EmployeeSalary {

    public static void main(String[] args) {

        Employee e;

        e = new Manager();
        e.calculateSalary();

        e = new Developer();
        e.calculateSalary();
    }
}
