public class AttackState implements State{
    Castle castle;


    public AttackState(Castle castle) {
        this.castle = castle;
    }

    @Override
    public void castleAttack(Army a) {
        System.out.println("Soldiers now Attacking!!");
        castle.setState(castle.getAttackState());
        attackScenario(a);
    }

    @Override
    public void castlePending() {
        System.out.println("Soldiers and Castle is now attack state changing state to pending state!!! ");
        castle.setState(new PendingState(castle));
    }


    public static void attackScenario(Attackable soldier){
        System.out.println("\n***Combat Simulator: Army simulation***\n");
        soldier.attack();
    }
}
