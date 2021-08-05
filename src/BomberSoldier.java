
public class BomberSoldier implements Attackable{
    Observable observable;

    public BomberSoldier() {
        observable = new Observable(this);
    }

    @Override
    public void attack() {
        System.out.println("I'm bombing with catapult");
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
