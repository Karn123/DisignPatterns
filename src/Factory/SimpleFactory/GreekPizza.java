package Factory.SimpleFactory;

/**
 * Created by Karn on 2016/12/14.
 */
public class GreekPizza extends Pizza {

    public GreekPizza() {
        System.out.println("Greek Pizza is creating...");
    }

    @Override
    public void prepare() {
        System.out.println("Greek Pizza is preparing...");
    }

    @Override
    public void bake() {
        System.out.println("Greek Pizza is baking...");
    }

    @Override
    public void cut() {
        System.out.println("Greek Pizza is cutting...");
    }

    @Override
    public void box() {
        System.out.println("Greek Pizza is boxing...");
        System.out.println("Greek Pizza-making process has successfully finished！Enjoy yourself with the delicious pizza :)");
        System.out.println();
    }
}