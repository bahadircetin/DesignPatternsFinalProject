
public interface AttackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
