package Factory.AbstractFactory;

/**
 * CopyRight(c)
 * Created by Karn on 2016/12/14.
 * Software Engineering Institute,ECNU.
 *
 * ----------------------------------------------------------------------------
 * In order to make client main() closed for modification, we need to use a
 * simple pizza store factory to encapsulate the pizza stores so that we can
 * create stores from different cities.When there is a new store to add in,
 * we just need to create a new pizza store class and simply modify this file
 * with a new 'case'.
 * ----------------------------------------------------------------------------
 */
public class PizzaStoreFactory {
    public PizzaStoreFactory() {
        System.out.println("The pizza store factory has been created successfully！");
        System.out.println();
    }

    private PizzaStore pizzaStore;

    public PizzaStore createPizzaStore(String type) {
        switch (type.toUpperCase()) {
            case "N":
                pizzaStore = new NYPizzaStore();
                break;
            case "C":
                pizzaStore = new ChicagoPizzaStore();
                break;
            default:
                break;
        }
        return pizzaStore;
    }
}