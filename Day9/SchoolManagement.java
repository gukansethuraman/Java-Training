package Day9;

class Person {

    void display() {
        System.out.println("Person Details");
    }
}

class Student extends Person {

    void study() {
        System.out.println("Student is Studying");
    }
}

class Teacher extends Person {

    void teach() {
        System.out.println("Teacher is Teaching");
    }
}

public class SchoolManagement {

    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();

        s.display();
        s.study();

        t.display();
        t.teach();
    }
}
