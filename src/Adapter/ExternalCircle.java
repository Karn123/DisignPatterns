package Adapter;

/**
 * Created by Karn on 2016/12/15.
 *
 * ------------------------------------------------------------------------
 * Note that although the methods' names are different from the base class's,
 * their functions are same.In other words, this class is not compatible with
 * the base class Shae.
 * In order to use this class,we introduce an adapter Circle Class to use
 * interfaces this class has offered so that we needn't modify this class or
 * the base class. And this class may be reused in other situations.
 * ------------------------------------------------------------------------
 */
public class ExternalCircle {
    private int color;
    private int location;

    public void setItsColor(int color) {
        System.out.println("The color is " + color);
        this.color = color;
    }

    public int getItsColor() {
        return this.color;
    }

    public void setItsLocation(int location) {
        System.out.println("The location is " + location);
        this.location = location;
    }

    public int getItsLocation() {
        return this.location;
    }

    public void fillItself() {
        System.out.println("Circle is filling itself...");
    }

    public void displayItself() {
        System.out.println("Circle is displaying itself...");
    }

    public void unDisplayItself() {
        System.out.println("Circle display has been cancelled :)");
    }
}