import java.util.Objects;

public class ProxyManager implements SoldierManager {
    private RealSoldierManager realSoldierManager;

    @Override
    public void fight(Soldier soldier) {
        realSoldierManager = new RealSoldierManager();
        realSoldierManager.fight(soldier);
    }

    @Override
    public void command(Soldier soldier) {
        if (Objects.equals(soldier.getRank(), "General")) {
            realSoldierManager = new RealSoldierManager();
            realSoldierManager.command(soldier);
        } else {
            System.out.println("Soldier " + soldier.getName() + " is not allowed to command.");
        }
    }
}
