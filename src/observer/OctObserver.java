package observer;

/**
 * Created by Karn on 2016/12/6.
 */
public class OctObserver implements Observer{
    private int value;
    Subject subject;
    public OctObserver(Subject sub){
        this.subject = sub;
        sub.registerObserver(this);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void update(int value) {
        setValue(value);
        String s = Integer.toOctalString(value);
        System.out.println("Octal String------>"+s);
    }
}
