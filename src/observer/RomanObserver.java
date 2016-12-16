package observer;

/**
 * Created by Karn on 2016/12/6.
 */
public class RomanObserver implements Observer{
    private int value;
    Subject subject;
    public RomanObserver(Subject sub)
    {
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
    public void update(int val) {
        setValue(val);
        String[][] strings = new String[][]{{"CM","D","CD","C"},{"XC","L","XL","X"},{"IX","V","IV","I"}};
        System.out.println("Roman: ");
        if(val>3999){
            System.out.println("****");
            return;
        }
        while(val >= 1000){
            System.out.println("M");
            setValue(val-1000);
        }
        for(int multiplier = 100, index = 0; multiplier >= 1;
            multiplier /= 10, index++){
            if (val >= 9 * multiplier) {
                System.out.println(strings[index][0]);
                val -= 9 * multiplier;
            } else if (val >= 5 * multiplier) {
                System.out.println(strings[index][1]);
                val -= 5 * multiplier;
            } else if (val >= 4 * multiplier) {
                System.out.println(strings[index][2]);
                val -= 4 * multiplier;
            }
            while (val >= 1 * multiplier) {
                System.out.println(strings[index][3]);
                val -= 1 * multiplier;
            }
        }
        System.out.println();
    }
}