public class SoldierFactory extends AbstractSoldierFactory{

    @Override
    public Attackable createKnightSoldier() {
        return new KnightSoldier();
    }

    @Override
    public Attackable createArcherSoldier() {
        return new ArcherSoldier();
    }

    @Override
    public Attackable createBomberSoldier() {
        return new BomberSoldier();
    }
}
