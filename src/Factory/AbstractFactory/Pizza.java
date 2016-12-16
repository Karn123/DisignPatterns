package Factory.AbstractFactory;

/**
 * CopyRight(c)
 * Created by Karn on 2016/12/14.
 * Software Engineering Institute,ECNU.
 *
 * ---------------------------------------------------------------
 * This Pizza Class demonstrates the operations in making a pizza.
 * Every time a new taste of pizza is added to the project, it must
 * extend this class so that polymorphism can work.
 * ---------------------------------------------------------------
 */
public class Pizza {
    public Pizza() {
        //do nothing
    }

    public void prepare(){
        System.out.println("Pizza is preparing...");
    }

    public void bake(){
        System.out.println("Pizza is baking...");
    }

    public void cut(){
        System.out.println("Pizza is cutting...");
    }

    public void box(){
        System.out.println("Pizza is boxing...");
        System.out.println("The pizza making process has successfully finished！");
    }
}