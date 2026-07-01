package Day8;

class Student1 {

    Student1() {
        this(101);
        System.out.println("Default Constructor");
    }

    Student1(int id) {
        System.out.println("ID = " + id);
    }
}

public class Student2{
    public static void main(String[] args) {

        Student1 s = new Student1();
    }
}