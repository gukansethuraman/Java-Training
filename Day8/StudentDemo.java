package Day8;

class Demo1 {

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

}

public class StudentDemo {

    public static void main(String[] args) {

        Demo1 d = new Demo1();
        d.add(10,20);

    }

}