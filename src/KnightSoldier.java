

public class KnightSoldier implements Attackable{
    Observable observable;
    public KnightSoldier() {
        observable = new Observable(this);
    }

    @Override
    public void attack() {
        System.out.println("I'm attacking with Sword!!!");
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
