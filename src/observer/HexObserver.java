package observer;

/**
 * Created by Karn on 2016/12/6.
 */
public class HexObserver implements Observer{
    private int value;
    Subject subject;
    public HexObserver(Subject sub){
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
        String s = Integer.toHexString(value);
        System.out.println("Hex String---->"+s);
    }
}