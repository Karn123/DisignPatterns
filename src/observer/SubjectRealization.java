package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karn on 2016/12/6.
 */
public class SubjectRealization implements Subject {
    private List<Observer> observers;
    private int value;
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SubjectRealization(){
        observers = new ArrayList<>();
        value = 5;
    }
    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(value);
        }
    }

    public void setState(int value) {
        setValue(value);
        notifyObservers();
    }
}