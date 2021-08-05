

public class ArcherSoldier implements Attackable{
    Observable observable;

    public ArcherSoldier() {
        observable = new Observable(this);
    }

    @Override
    public void attack() {
        System.out.println("I'm attacking with the Bow from a range!!!");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);

    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
