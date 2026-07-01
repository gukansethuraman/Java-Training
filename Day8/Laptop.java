package Day8;

class Laptop1 {

    String brand;
    int price;

    Laptop1(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
    }
}

public class Laptop {
    public static void main(String[] args) {

        Laptop1 l1 = new Laptop1("Dell", 65000);

        l1.display();
    }
}