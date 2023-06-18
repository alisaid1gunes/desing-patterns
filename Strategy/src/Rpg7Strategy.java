public class Rpg7Strategy implements FireStrategy {
    private String name;
    private int ammo;

    public Rpg7Strategy(String name, int ammo) {
        this.name = name;
        this.ammo = ammo;
    }
    public void fire() {
        System.out.println("RPG-7 fired");
    }

}
