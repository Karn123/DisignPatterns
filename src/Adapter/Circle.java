package Adapter;

/**
 * Created by Karn on 2016/12/15.
 *
 * ------------------------------------------------------------
 * This is an adapter class.We simply make the ExternalCircle
 * become this class's attribute and use the existed interfaces
 * ExternalCircle has provided to implement our functions.
 * ------------------------------------------------------------
 */
public class Circle extends Shape {
    private ExternalCircle circle;

    public Circle() {
        circle = new ExternalCircle();
    }

    @Override
    public void setLocation(int location) {
        circle.setItsLocation(location);
    }

    @Override
    public void setColor(int color) {
        circle.setItsColor(color);
    }

    @Override
    public void fill() {
        circle.fillItself();
    }

    @Override
    public void display() {
        circle.displayItself();
    }

    @Override
    public void unDisplay() {
        circle.unDisplayItself();
    }
}