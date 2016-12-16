package Adapter;

/**
 * Created by Karn on 2016/12/15.
 */
public class Square extends Shape {
    @Override
    public void fill() {
        System.out.println("Square is filling...");
    }

    @Override
    public void display() {
        System.out.println("Square is displaying...");
    }

    @Override
    public void unDisplay() {
        System.out.println("Square display has been cancelled :)");
    }

    @Override
    public void setLocation(int location) {
        this.location = location;
        System.out.println("Square location is " + location);
    }

    @Override
    public void setColor(int color) {
        this.color = color;
        System.out.println("Square color is " + color);
    }
}
