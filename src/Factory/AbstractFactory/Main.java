package Factory.AbstractFactory;

import java.util.Scanner;

/**
 * CopyRight(c)
 * Created by Karn on 2016/12/14.
 * Software Engineering Institute,ECNU.
 *
 * -----------------------------------------------------------------------------
 * This Abstract Factory Design Pattern demonstrates that we can order a pizza
 * from different cities' stores with different tastes in client main().Without
 * changing any code in main(except for the printed info),when a new pizza store
 * is created, we just need to create a new pizza store class,let it extend the
 * abstract class PizzaStore and implement the method createPizza.This makes our
 * program much more robust and open for extension but closed for modification.
 * ------------------------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        while (true) {
            //create a pizza store factory
            PizzaStoreFactory pizzaStoreFactory = new PizzaStoreFactory();

            System.out.println("Please input a city name that the pizza you want to order" +
                    " comes from(\"N\" for \"NewYork\" or \"C\" for \"Chicago\" or \"E\" for \"Exit\"):");
            Scanner in = new Scanner(System.in);
            String storeType = in.next();
            if (storeType.toUpperCase().equals("E")) {
                System.out.println("Bye~ Hope to see you next time :)");
                break;
            }
            //create a pizza store according to the chosen storeType
            PizzaStore pizzaStore = pizzaStoreFactory.createPizzaStore(storeType);
            if (pizzaStore == null) {
                System.out.println("Please input a valid type of pizza store!");
                System.out.println();
                continue;
            }
            System.out.println("Please choose the kind(taste) of pizza you would like to order" +
                    "(\"C\" for \"Cheese Pizza\" or \"G\" for \"Greek Pizza\" or \"E\" for \"Exit\"):");

            String taste = in.next();
            if (taste.toUpperCase().equals("E")) {
                System.out.println("Bye~ Hope to see you next time :)");
                break;
            }
            try {
                //make pizza now.
                pizzaStore.orderPizza(taste);
            } catch (NullPointerException e) {
                System.out.println("Please input a valid type!");
            }
        }
    }
}