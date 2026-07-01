package Day8;

class Calculator1 {

    void add(int a,int b){
        System.out.println("Add = " + (a+b));
    }

    void sub(int a,int b){
        System.out.println("Sub = " + (a-b));
    }

    void mul(int a,int b){
        System.out.println("Mul = " + (a*b));
    }

}

public class Calculator {

    public static void main(String[] args) {

        Calculator1 c = new Calculator1();

        c.add(10,5);
        c.sub(10,5);
        c.mul(10,5);

    }

}