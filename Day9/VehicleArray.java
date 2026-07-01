package Day9;

class Vehicle {

    void start() {
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car Started");
    }
}

class Bike extends Vehicle {

    void start() {
        System.out.println("Bike Started");
    }
}

public class VehicleArray {

    public static void main(String[] args) {

        Vehicle[] v = {
                new Car(),
                new Bike()
        };

        for (Vehicle obj : v) {
            obj.start();
        }
    }
}