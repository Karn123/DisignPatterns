package Factory.AbstractFactory;

/**
 * CopyRight(c)
 * Created by Karn on 2016/12/14.
 * Software Engineering Institute,ECNU.
 *
 * -------------------------------------------------------------
 * This is the abstract PizzaStore class, every time a new store
 * is added in the project, the new store must extend this class
 * and implement the method createPizza to create the pizza made
 * in its own pizza store. The Client simply needs to call the
 * orderPizza method to get a pizza.The Client has no clue about
 * how the pizza is created.
 * -------------------------------------------------------------
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    public abstract Pizza createPizza(String type);
}