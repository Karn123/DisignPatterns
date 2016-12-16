package singleton;

/**
 * Created by Karn on 2016/12/6.
 */
public class Main {
    public static void main(String[] args){
        GlobalObject globalObject = GlobalObject.getInstance();
        globalObject.foo();
        globalObject.bar();

        GlobalObject globalObject1 = GlobalObject.getInstance();
        System.out.println(globalObject==globalObject1);
        globalObject1.foo();
    }
}