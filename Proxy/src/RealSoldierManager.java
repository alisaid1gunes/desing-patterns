public class RealSoldierManager implements SoldierManager{
    @Override
    public void fight(Soldier soldier) {
        System.out.println("Soldier " + soldier.getName() + " is fighting.");
    }

    @Override
    public void command(Soldier soldier) {
        System.out.println("Soldier " + soldier.getName() + " is commanded.");

    }
}
