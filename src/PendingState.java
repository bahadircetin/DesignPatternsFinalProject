public class PendingState implements State{
    Castle castle;


    public PendingState(Castle castle) {
        this.castle = castle;
    }

    @Override
    public void castleAttack(Army a) {
        System.out.println("Castle is now changes its state pending from attack state get ready battle!!!");
        castle.setState(new AttackState(castle));
    }

    @Override
    public void castlePending() {
        System.out.println("Soldiers are waiting for the orders!!!");
        castle.setState(castle.getPendingState());
    }
}
