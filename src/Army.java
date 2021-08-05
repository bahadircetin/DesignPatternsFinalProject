import java.util.ArrayList;
import java.util.Iterator;

public class Army implements Attackable{
    ArrayList attackers = new ArrayList();

    void add(Attackable attacker){
        attackers.add(attacker);
    }
    @Override
    public void attack() {
        Iterator iterator =  attackers.iterator();
        while(iterator.hasNext()){
            Attackable attacker = (Attackable) iterator.next();
            attacker.attack();
        }

    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = attackers.iterator();
        while (iterator.hasNext()){
            Attackable soldier = (Attackable) iterator.next();
            soldier.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
