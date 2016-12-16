package Factory.SimpleFactory;

/**
 * Created by Karn on 2016/12/14.
 */
public class CheesePizza extends Pizza {
    public CheesePizza() {
        System.out.println("Cheese Pizza is creating...");
    }

    @Override
    public void prepare() {
        System.out.println("Cheese Pizza is preparing...");
    }

    @Override
    public void bake() {
        System.out.println("Cheese Pizza is baking...");
    }

    @Override
    public void cut() {
        System.out.println("Cheese Pizza is cutting...");
    }

    @Override
    public void box() {
        System.out.println("Cheese Pizza is boxing...");
        System.out.println("Cheese Pizza-making process has successfully finished！Enjoy yourself with the delicious pizza :)");
        System.out.println();
    }
}