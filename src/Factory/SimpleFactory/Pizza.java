package Factory.SimpleFactory;

/**
 * Created by Karn on 2016/12/14.
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