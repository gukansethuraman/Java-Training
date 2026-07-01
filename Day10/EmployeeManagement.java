package Day10;

class Employee {

    private int id;
    private String name;
    private double salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {

        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary");
        }
    }

    public void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.setId(101);
        e.setName("Kaviya");
        e.setSalary(30000);

        e.display();
    }
}