import java.util.Scanner;

public class CombatSimulator {
    public static void main(String[] args){
        Army wholeArmy = new Army(); //composite
        CombatSimulator combatSimulator = new CombatSimulator();
        AbstractSoldierFactory soldierFactory = new CountingSoldierFactory();
        Castle castle = new Castle();


        System.out.println("\n***************Combat Simulator***************\n");

        combatSimulator.generateArmy(soldierFactory, wholeArmy);
        castle.castlePending(); //Pending State's castlePending() is called

        castle.castleAttack(wholeArmy); // Pending state's castleAttack() is called. Changes castle's state to attack.

        castle.castleAttack(wholeArmy); // Attack state's castleAttack() is called.

        System.out.println("The soldiers attacked "+ AttackCounter.getNumberOfAttacks()+" times in the combat");
    }
    public void generateArmy(AbstractSoldierFactory soldierFactory, Army wholeArmy){

        Scanner sc = new Scanner(System.in);

        Attackable gaziMustafaKemal = new CommanderAdapter(new Commander());
        wholeArmy.add(gaziMustafaKemal);

        System.out.println("How many knights do you want in your army: ");
        int knights=sc.nextInt();
        Army knightUnit = new Army();
        for (int i=0;i<knights;i++) {
            Attackable knight = soldierFactory.createKnightSoldier();
            knightUnit.add(knight);
        }

        System.out.println("How many archers do you want in your army: ");
        int archers=sc.nextInt();
        Army archerUnit = new Army();
        for (int i=0;i<archers;i++) {
            Attackable archer = soldierFactory.createArcherSoldier();
            archerUnit.add(archer);
        }

        System.out.println("How many bombers do you want in your army: ");
        int bombers=sc.nextInt();
        Army bomberUnit = new Army();
        for (int i=0;i<bombers;i++) {
            Attackable bomber = soldierFactory.createBomberSoldier();
            archerUnit.add(bomber);
        }

        wholeArmy.add(knightUnit);
        wholeArmy.add(archerUnit);
        wholeArmy.add(bomberUnit);

        CombatStrategist combatStrategist = new CombatStrategist();
        wholeArmy.registerObserver(combatStrategist);

    }
}
