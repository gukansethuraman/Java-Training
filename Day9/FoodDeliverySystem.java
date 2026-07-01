package Day9;

class Restaurant {

    void prepareFood() {
        System.out.println("Preparing Food");
    }
}

class Pizza extends Restaurant {

    void prepareFood() {
        System.out.println("Preparing Pizza");
    }
}

class Burger extends Restaurant {

    void prepareFood() {
        System.out.println("Preparing Burger");
    }
}

class DeliveryBoy {

    void deliver() {
        System.out.println("Food Delivered");
    }
}

class Order {

    DeliveryBoy boy = new DeliveryBoy();

    void placeOrder(Restaurant food) {
        food.prepareFood();
        boy.deliver();
    }
}

public class FoodDeliverySystem {

    public static void main(String[] args) {

        Order order = new Order();

        Restaurant r;

        r = new Pizza();
        order.placeOrder(r);

        r = new Burger();
        order.placeOrder(r);
    }
}