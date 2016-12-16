package Adapter;

/**
 * Created by Karn on 2016/12/15.
 */
public class Shape {
    public int location;
    public int color;

    public void setLocation(int location) {
        this.location = location;
        System.out.println("The location is " + location);
    }

    public void setColor(int color) {
        this.color = color;
        System.out.println("The color is " + color);
    }

    public void fill() {
        System.out.println("I am filling a shape...");
    }

    public void display() {
        System.out.println("The shape is displaying...");
    }

    public void unDisplay() {
        System.out.println("You have cancelled the display of the shape :)");
    }
}
