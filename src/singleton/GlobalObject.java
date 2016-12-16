package singleton;

/**
 * Created by Karn on 2016/12/6.
 */
public class GlobalObject {
    private static GlobalObject globalObject;
    private static int value;
    private GlobalObject(){
        value = 0;
    }
    public static GlobalObject getInstance(){
        if(globalObject ==null){
            globalObject =new GlobalObject();
        }
        return globalObject;
    }
    public void foo(){
        System.out.println("foo: The global object's value is -------->"+getValue());
    }

    public void bar(){
        setValue(10);
        System.out.println("bar: The global object's value is -------->"+getValue());
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}