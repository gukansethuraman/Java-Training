package Day9;

class Teacher {

    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Department {

    String deptName;
    Teacher teacher;

    Department(String deptName, Teacher teacher) {
        this.deptName = deptName;
        this.teacher = teacher;
    }

    void display() {
        System.out.println("Department : " + deptName);
        System.out.println("Teacher : " + teacher.name);
    }
}

public class Aggregation {

    public static void main(String[] args) {

        Teacher t = new Teacher("Priya");

        Department d = new Department("Computer Science", t);

        d.display();
    }
}