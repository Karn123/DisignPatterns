package observer;

/**
 * Created by Karn on 2016/12/6.
 */
public class Main {
    public static void main(String[] args) {

        SubjectRealization sub = new SubjectRealization();
        OctObserver octObserver = new OctObserver(sub);
        RomanObserver romanObserver = new RomanObserver(sub);
        HexObserver hexObserver = new HexObserver(sub);
        System.out.println("observer size------->" + sub.getObservers().size());

        sub.setState(50);
        System.out.println("=====================Change========================");
        sub.setState(100);
        sub.unregisterObserver(octObserver);
        sub.unregisterObserver(romanObserver);
        sub.unregisterObserver(hexObserver);

        System.out.println("observer size------->" + sub.getObservers().size());
    }
}