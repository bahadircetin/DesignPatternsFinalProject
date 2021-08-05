public class Castle {
    State attackState;
    State pendingState;

    State state;

    public Castle() {
        attackState = new AttackState(this);
        pendingState = new PendingState(this);
        state = pendingState;
    }

    public void castleAttack(Army a){
        state.castleAttack(a);
    }
    public void castlePending(){
        state.castlePending();
    }

    public State getAttackState() {
        return attackState;
    }

    public State getPendingState() {
        return pendingState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Castle{" +
                "state:" + state +
                '}';
    }
}
