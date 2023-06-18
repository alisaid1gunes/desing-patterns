public class Ak47Strategy implements FireStrategy {
    private String name;
    private int ammo;

    public Ak47Strategy(String name, int ammo) {
        this.name = name;
        this.ammo = ammo;
    }

    public void fire() {
        System.out.println("Ak47 fired");
    }
}
