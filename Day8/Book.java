package Day8;

class Book1 {

    Book1() {
        this("Java Programming");
        System.out.println("Default Constructor");
    }

    Book1(String name) {
        this(name, 500);
        System.out.println("Book1 Name : " + name);
    }

    Book1(String name, int price) {
        System.out.println("Book1 Name : " + name);
        System.out.println("Price : " + price);
    }
}

public class Book {
    public static void main(String[] args) {

        Book1 b = new Book1();

    }
}