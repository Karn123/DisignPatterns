package Factory.AbstractFactory;

/**
 * CopyRight(c)
 * Created by Karn on 2016/12/14.
 * Software Engineering Institute,ECNU.
 */
public class ChicagoGreekPizza extends Pizza {
    public ChicagoGreekPizza() {
        System.out.println("Chicago Greek Pizza is creating...");
    }

    @Override
    public void prepare() {
        System.out.println("Chicago Greek Pizza is preparing...");
    }

    @Override
    public void bake() {
        System.out.println("Chicago Greek Pizza is baking...");
    }

    @Override
    public void cut() {
        System.out.println("Chicago Greek Pizza is cutting...");
    }

    @Override
    public void box() {
        System.out.println("Chicago Greek Pizza is boxing...");
        System.out.println("Chicago Greek Pizza-making process has successfully finished！Enjoy yourself with the delicious pizza :)");
        System.out.println();
    }
}