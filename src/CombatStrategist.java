public class CombatStrategist implements Observer{

    public void update(AttackObservable soldier)
    {
        System.out.println("Combat Strategist: "+ soldier.getClass() + " attacked now.");
    }
}
