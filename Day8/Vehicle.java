package Day8;

class Vehicle1 {

    void start() {
        System.out.println("Vehicle1 Started");
    }
}

class Bike extends Vehicle1 {

    void ride() {
        System.out.println("Bike is Running");
    }
}

public class Vehicle {
    public static void main(String[] args) {

        Bike b = new Bike();

        b.start();
        b.ride();
    }
}