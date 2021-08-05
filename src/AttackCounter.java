public class AttackCounter implements Attackable{
    Attackable soldier;
    static int numberOfAttacks;

    public AttackCounter(Attackable soldier) {
        this.soldier = soldier;
    }

    @Override
    public void attack() {
        soldier.attack();
        numberOfAttacks++;
    }

    public static int getNumberOfAttacks() {
        return numberOfAttacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        soldier.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        soldier.notifyObservers();
    }
}
