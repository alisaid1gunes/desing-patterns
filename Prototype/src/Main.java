public class Main {
    /// Prototype pattern is used to create a duplicate object or clone of the current object
    /// It is a creational pattern that allows an object to create a copy of itself.
    public static void main(String[] args) {
        Bird bird1 = new Bird("bird1", 1);
        Bird bird2 = (Bird) bird1.clone();
        System.out.println("bird1 == bird2 : " + (bird1 == bird2));
        System.out.println("bird1.equals(bird2) : " + bird1.equals(bird2));
        System.out.println("bird1 : " + bird1);
        System.out.println("bird2 : " + bird2);
    }
}