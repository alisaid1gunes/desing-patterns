public class Soldier {
    private FireStrategy fireStrategy;

    public Soldier(FireStrategy fireStrategy) {
        this.fireStrategy = fireStrategy;
    }

    public void fire() {
        fireStrategy.fire();
    }
}
