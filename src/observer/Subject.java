package observer;

/**
 * Created by Karn on 2016/12/6.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
