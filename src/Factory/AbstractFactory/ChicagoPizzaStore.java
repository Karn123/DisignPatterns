package Factory.AbstractFactory;

/**
 * CopyRight(c)
 * Created by Karn on 2016/12/14.
 * Software Engineering Institute,ECNU.
 *
 * --------------------------------------------------------
 * This class is responsible for creating pizzas in Chicago
 * pizza store.
 * --------------------------------------------------------
 */
public class ChicagoPizzaStore extends PizzaStore {
    public ChicagoPizzaStore() {
        System.out.println("Chicago Pizza Store has been created.");
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type.toUpperCase()) {
            case "C":
                pizza = new ChicagoCheesePizza();
                break;
            case "G":
                pizza = new ChicagoGreekPizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}