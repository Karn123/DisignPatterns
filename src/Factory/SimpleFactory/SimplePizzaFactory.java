package Factory.SimpleFactory;

/**
 * Created by Karn on 2016/12/14.
 */
public class SimplePizzaFactory {
    private Pizza pizza;

    public SimplePizzaFactory() {
        System.out.println("Local Pizza factory has successfully created！");
        System.out.println();
    }

    public Pizza createPizza(String type){
        switch (type.toUpperCase()){
            case "G":
                pizza = new GreekPizza();
                break;
            case "C":
                pizza = new CheesePizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}