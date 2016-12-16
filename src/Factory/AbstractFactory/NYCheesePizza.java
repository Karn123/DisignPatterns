package Factory.AbstractFactory;

/**
 * CopyRight(c)
 * Created by Karn on 2016/12/14.
 * Software Engineering Institute,ECNU.
 */
public class NYCheesePizza extends Pizza {
    public NYCheesePizza() {
        System.out.println("NewYork Cheese Pizza is creating...");
    }

    @Override
    public void prepare() {
        System.out.println("NewYork Cheese Pizza is preparing...");
    }

    @Override
    public void bake() {
        System.out.println("NewYork Cheese Pizza is baking...");
    }

    @Override
    public void cut() {
        System.out.println("NewYork Cheese Pizza is cutting...");
    }

    @Override
    public void box() {
        System.out.println("NewYork Cheese Pizza is boxing...");
        System.out.println("NewYork Cheese Pizza-making process has successfully finished！Enjoy yourself with the delicious pizza :)");
        System.out.println();
    }
}