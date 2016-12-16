package Factory.SimpleFactory;

import java.util.Scanner;

/**
 * CopyRight
 * Created by Karn on 2016/12/14.
 * Software Engineering Institute,ECNU.
 *
 * ----------------------------------------------------------------------------------
 * This Simple Factory example demonstrates that there's exactly only one factory,
 * here we call it local factory which can produce different kinds of pizzas.It now
 * works perfect.
 * However, if we want to eat pizzas from different cities means we have to add a
 * new factory such as NewYorkPizza Factory, ChicagoPizzaStore. What's worse is
 * that we have to new different object of factories if we want to eat pizza from
 * different cities.
 *
 * For example:
 * NewYorkPizzaFactory nyPizzaFactory = new NewYorkPizzaFactory();
 * Pizza pizza = nyPizzaFactory.createPizza(pizzaType);
 * ChicagoPizzaStore chicagoPizzaFactory = new ChicagoPizzaStore();
 * Pizza chicagoPizza = chicagoPizzaFactory.createPizza(pizzaType);
 *
 * Every time we want to eat a pizza from a new city, we have to add a factory and
 * create it in the main(), which means we have to modify the creation part of factory
 * in main(), and that violates the OCP(Open for extension but closed for modification).
 * So we should use the Abstract Factory Design Pattern to make the factory creation
 * without modify the creation of the factory every time we want to eat pizza made in a
 * new factory or a new city.
 * -------------------------------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args){
        while (true) {
            SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
            System.out.println("Please input the pizza type " +
                    "that you wanna order(\"G/g(GreekPizza)\" or \"C/c(CheesePizza)\" or e/E(\"Exit\")):");
            Scanner in = new Scanner(System.in);
            String pizzaType = in.next();
            if(pizzaType.toLowerCase().equals("e") ){
                System.out.println("Thanks for your coming, hope to see u next time, BYE~");
                break;
            }
            Pizza pizza = simplePizzaFactory.createPizza(pizzaType);
            try {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } catch (NullPointerException e) {
                System.out.println("Please input a legal pizza type！");
            }
        }
    }
}