package Factory.AbstractFactory;

/**
 * CopyRight(c)
 * Created by Karn on 2016/12/14.
 * Software Engineering Institute,ECNU.
 *
 * --------------------------------------------------------
 * This class is responsible for creating pizzas in New York
 * pizza store.
 * --------------------------------------------------------
 */
public class NYPizzaStore extends PizzaStore {
    public NYPizzaStore() {
        System.out.println("NewYork Pizza Store has been created.");
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type.toUpperCase()) {
            case "C":
                pizza = new NYCheesePizza();
                break;
            case "G":
                pizza = new NYGreekPizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}