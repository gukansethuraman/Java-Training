package Day9;

class Furniture {

    void displayFurniture() {
        System.out.println("Sofa and Table");
    }
}

class Room {

    Furniture furniture = new Furniture();

    void displayRoom() {
        System.out.println("Living Room");
        furniture.displayFurniture();
    }
}

class House {

    Room room = new Room();

    void displayHouse() {
        System.out.println("My House");
        room.displayRoom();
    }
}

public class HouseComposition {

    public static void main(String[] args) {

        House h = new House();
        h.displayHouse();
    }
}