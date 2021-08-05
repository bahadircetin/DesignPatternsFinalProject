public class CountingSoldierFactory extends AbstractSoldierFactory{
    @Override
    public Attackable createKnightSoldier() {
        return new AttackCounter(new KnightSoldier());
    }

    @Override
    public Attackable createArcherSoldier() {
        return  new AttackCounter(new ArcherSoldier());
    }

    @Override
    public Attackable createBomberSoldier() {
        return  new AttackCounter(new BomberSoldier());
    }
}
