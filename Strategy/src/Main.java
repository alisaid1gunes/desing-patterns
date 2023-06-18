public class Main {
    public static void main(String[] args) {
        // Strategy pattern is used to encapsulate a family of algorithms
        // and make them interchangeable.
        // The strategy pattern lets the algorithm vary independently from
        // clients that use it.
        // The strategy pattern is a behavioral design pattern.
        Soldier soldier = new Soldier(new Ak47Strategy("Ak47", 30));
        soldier.fire();
        Soldier soldier2 = new Soldier(new Rpg7Strategy("Rpg7", 1));
        soldier2.fire();
    }
}