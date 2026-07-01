package Day8;

class Shape {

    void displayShape() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {

    void drawCircle() {
        System.out.println("Drawing Circle");
    }
}

public class ShapeCircle {

    public static void main(String[] args) {

        Circle c = new Circle();

        c.displayShape();
        c.drawCircle();
    }
}
