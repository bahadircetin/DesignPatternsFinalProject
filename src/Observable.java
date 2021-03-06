import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements AttackObservable{
    ArrayList observers = new ArrayList();
    AttackObservable soldier;

    public Observable(AttackObservable soldier) {
        this.soldier = soldier;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while(iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(soldier);
        }

    }
}
