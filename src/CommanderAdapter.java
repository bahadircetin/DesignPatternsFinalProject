public class CommanderAdapter implements Attackable{
    Commander commander;

    public CommanderAdapter(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void attack() {
        commander.order();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
