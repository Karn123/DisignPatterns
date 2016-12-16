package Adapter;

/**
 * Created by Karn on 2016/12/15.
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.setColor(10);
        shape.setLocation(100);
        shape.fill();
        shape.display();
        shape.unDisplay();

        shape = new Square();
        shape.setColor(20);
        shape.setLocation(200);
        shape.fill();
        shape.display();
        shape.unDisplay();
    }
}
